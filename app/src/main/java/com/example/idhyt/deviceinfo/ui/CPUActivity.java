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



public class CPUActivity extends AppCompatActivity {

    public static final int UPDATE_TEXT = 1;
    public static String cpu0StatusContent = "...";
    private Handler handler = new Handler() {
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case UPDATE_TEXT:
                    TextView showText = (TextView)findViewById(R.id.cpu_status_content);
                    showText.setText(cpu0StatusContent);
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
        setContentView(R.layout.activity_cpu);
        showAllDefault();
        setOnListen();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    try {
                        cpu0StatusContent = IOHelper.getCpu0StatusContent();
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
        String curMaxCpuFreq = IOHelper.getCpu0MaxFreq();
        TextView tvMaxCpuFreq = (TextView)findViewById(R.id.max_cpu_freq_value);
        tvMaxCpuFreq.setText(curMaxCpuFreq);

        String curMinCpuFreq = IOHelper.getCpu0MinFreq();
        TextView tvMinCpuFreq = (TextView)findViewById(R.id.min_cpu_freq_value);
        tvMinCpuFreq.setText(curMinCpuFreq);

        String curCpuGov = IOHelper.getCpu0CurGov();
        TextView tvCurCpuGov = (TextView)findViewById(R.id.cpu_cur_gov);
        tvCurCpuGov.setText(curCpuGov);
    }

    private void setOnListen(){
        View vMaxCpuFreq = findViewById(R.id.max_cpu_freq_value);
        vMaxCpuFreq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showSelectCpuMaxFreqDialog();
            }
        });

        View vMinCpuFreq = findViewById(R.id.min_cpu_freq_value);
        vMinCpuFreq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showSelectCpuMinFreqDialog();
            }
        });

        View vCpuCurGov = findViewById(R.id.cpu_cur_gov);
        vCpuCurGov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showSelectCpuCurGov();
            }
        });

    }

    private void showSelectCpuMaxFreqDialog(){
        AlertDialog.Builder cpuFreqDialog = new AlertDialog.Builder(this);
        cpuFreqDialog.setTitle("Select Frequency");
        cpuFreqDialog.setNegativeButton("cancel", null);


        final String[] cpuAvailableFreq = IOHelper.getCpu0AvailableFreq();

        cpuFreqDialog.setItems(cpuAvailableFreq, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                final AlertDialog ad = new AlertDialog.Builder(CPUActivity.this).setMessage(

                        "你选择的是：" + ": " + cpuAvailableFreq[which]).show();
                IOHelper.setCpu0MaxFreq(cpuAvailableFreq[which]);
                // showAllDefault();
            }
        });
        cpuFreqDialog.create().show();
    }

    private void showSelectCpuMinFreqDialog(){
        AlertDialog.Builder cpuFreqDialog = new AlertDialog.Builder(this);
        cpuFreqDialog.setTitle("Select Frequency");
        cpuFreqDialog.setNegativeButton("cancel", null);


        final String[] cpuAvailableFreq = IOHelper.getCpu0AvailableFreq();

        cpuFreqDialog.setItems(cpuAvailableFreq, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                final AlertDialog ad = new AlertDialog.Builder(CPUActivity.this).setMessage(

                        "你选择的是：" + ": " + cpuAvailableFreq[which]).show();
                IOHelper.setCpu0MinFreq(cpuAvailableFreq[which]);
                // showAllDefault();
            }
        });
        cpuFreqDialog.create().show();
    }

    private void showSelectCpuCurGov(){
        AlertDialog.Builder cpuCurGovDialog = new AlertDialog.Builder(this);
        cpuCurGovDialog.setTitle("Select Governor");
        cpuCurGovDialog.setNegativeButton("cancel", null);


        final String[] cpuAvailableGov = IOHelper.getCpuAvailableGov();

        cpuCurGovDialog.setItems(cpuAvailableGov, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                final AlertDialog ad = new AlertDialog.Builder(CPUActivity.this).setMessage(

                        "你选择的是：" + ": " + cpuAvailableGov[which]).show();
                IOHelper.setCpu0CurGov(cpuAvailableGov[which]);
                // showAllDefault();
            }
        });
        cpuCurGovDialog.create().show();
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
