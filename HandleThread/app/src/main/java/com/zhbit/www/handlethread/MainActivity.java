package com.zhbit.www.handlethread;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    private Button startButton=null;
    private Button endButton=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startButton=(Button)findViewById(R.id.startButton);
        startButton.setOnClickListener(new startButtonListener());
        endButton=(Button)findViewById(R.id.endButton);
        endButton.setOnClickListener(new EndButtonListener());
    }
    Handler handler=new Handler();
    class startButtonListener implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            handler.post(updateThread);
        }
    }
    class EndButtonListener implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            handler.removeCallbacks(updateThread);
        }
    }

    Runnable updateThread=new Runnable() {
        @Override
        public void run() {
            System.out.println("updateThread");
            Log.v("tag","UpdateThread");
            handler.postDelayed(updateThread, 2000);
        }
    };
}
