package com.example.idhyt.deviceinfo.ui;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.example.idhyt.deviceinfo.R;
import com.example.idhyt.deviceinfo.model.IOHelper;

public class GPUActivity extends AppCompatActivity {

    public static final int UPDATE_TEXT = 1;
    public static String gpu3DStatusContent = "...";
    private Handler handler = new Handler() {
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case UPDATE_TEXT:
                    TextView showText = (TextView)findViewById(R.id.min_cpu_freq_value);
                    showText.setText(gpu3DStatusContent);
                    showAllDefault();
                    break;
                default:
                    break;
            }
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gpu);
        showAllDefault();
        setOnListen();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    try {
                        gpu3DStatusContent = IOHelper.getGpuStatusContent();
                        Message message = new Message();
                        message.what = UPDATE_TEXT;
                        handler.sendMessage(message);
                        Thread.sleep(1000, 0);
                    }catch (Exception ep){
                        ep.printStackTrace();
                    }

                }
            }
        }).start();


    }

    private void showAllDefault(){
        String curCpu3DFreq = IOHelper.getGpu3DCruMaxFreq();
        TextView tvMaxCpuFreq = (TextView)findViewById(R.id.max_gpu_freq_value);
        tvMaxCpuFreq.setText(curCpu3DFreq);

    }

    private void setOnListen(){
        View vMaxGpu3DFreq = findViewById(R.id.max_gpu_freq_value);
        vMaxGpu3DFreq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showSelectGpu3DMaxFreqDialog();
            }
        });

    }

    private void showSelectGpu3DMaxFreqDialog(){
        AlertDialog.Builder gpu3DFreqDialog = new AlertDialog.Builder(this);
        gpu3DFreqDialog.setTitle("Select Frequency");
        gpu3DFreqDialog.setNegativeButton("cancel", null);


        final String[] gpu3DAvailableFreq = IOHelper.getGpu3DAvailableFreq();

        gpu3DFreqDialog.setItems(gpu3DAvailableFreq, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                final AlertDialog ad = new AlertDialog.Builder(GPUActivity.this).setMessage(

                        "你选择的是：" + ": " + gpu3DAvailableFreq[which]).show();
                IOHelper.setGpu3DMaxFreq(gpu3DAvailableFreq[which]);
                // showAllDefault();
            }
        });
        gpu3DFreqDialog.create().show();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_cpu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
