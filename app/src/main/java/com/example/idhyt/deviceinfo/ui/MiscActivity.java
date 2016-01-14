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
import android.widget.EditText;
import android.widget.TextView;

import com.example.idhyt.deviceinfo.R;
import com.example.idhyt.deviceinfo.model.IOHelper;

public class MiscActivity extends AppCompatActivity {

    public static final int UPDATE_TEXT = 1;
    public static String IOSchedulerStatus = "...";
    private Handler handler = new Handler() {
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case UPDATE_TEXT:
                    TextView showText = (TextView)findViewById(R.id.io_scheduler_status_content);
                    showText.setText(IOSchedulerStatus);
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
        setContentView(R.layout.activity_misc);
        showAllDefault();
        setOnListen();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    try {
                        IOSchedulerStatus = IOHelper.getIOSchedulerStatusContent();
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
        String curIOScheduler = IOHelper.getCurScheduler();
        TextView tvIOScheduler = (TextView)findViewById(R.id.io_scheduler_value);
        tvIOScheduler.setText(curIOScheduler);

        String curReadAhead = IOHelper.getCurReadAhead();
        TextView tvCurReadAhead = (TextView)findViewById(R.id.read_ahead_value);
        tvCurReadAhead.setText(curReadAhead);
    }

    private void setOnListen(){
        View vAvailableScheduler = findViewById(R.id.io_scheduler_value);
        vAvailableScheduler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showSelectAvailableSchedulerDialog();
            }
        });

        View vReadAhead = findViewById(R.id.read_ahead_value);
        vReadAhead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showSetReadAheadDialog();
            }
        });

    }

    private void showSelectAvailableSchedulerDialog(){
        AlertDialog.Builder availableSchedulerDialog = new AlertDialog.Builder(this);
        availableSchedulerDialog.setTitle("Select Scheduler");
        availableSchedulerDialog.setNegativeButton("cancel", null);


        final String[] cpuAvailableFreq = IOHelper.getAvailableScheduler();

        availableSchedulerDialog.setItems(cpuAvailableFreq, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                final AlertDialog ad = new AlertDialog.Builder(MiscActivity.this).setMessage(

                        "你选择的是：" + ": " + cpuAvailableFreq[which]).show();
                IOHelper.setCurScheduler(cpuAvailableFreq[which]);
            }
        });
        availableSchedulerDialog.create().show();
    }

    private void showSetReadAheadDialog(){
        final EditText mEditText = new EditText(this);
        AlertDialog.Builder readAheadDialog = new AlertDialog.Builder(this);
        readAheadDialog.setTitle("Read Ahead Cache Size");
        readAheadDialog.setView(mEditText);
        readAheadDialog.setNegativeButton("cancel", null);
        readAheadDialog.setPositiveButton("set", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String setValue = mEditText.getText().toString();
                IOHelper.setCurReadAhead(setValue);
            }
        });

        readAheadDialog.create().show();
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
