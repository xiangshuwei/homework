package com.zhbit.www.mylogactivity2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btn2;
    static final String LIFE_TAG="LogActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v(MainActivity.LIFE_TAG,"FirstActivity ------>onCreate");
        Button btn2 =(Button)findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setClass(MainActivity.this,other.class);
                MainActivity.this.startActivity(intent);
            }
        });
    }

    @Override
    protected void onDestroy() {
        Log.v(MainActivity.LIFE_TAG,"FirstActivity ------>onDestroy");
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        Log.v(MainActivity.LIFE_TAG,"FirstActivity ------>onPause");
        super.onPause();
    }

    @Override
    protected void onRestart() {
        Log.v(MainActivity.LIFE_TAG,"FirstActivity ------>onRestart");
        super.onRestart();
    }

    @Override
    protected void onResume() {
        Log.v(MainActivity.LIFE_TAG,"FirstActivity ------>onResume");
        super.onResume();
    }

    @Override
    protected void onStart() {
        Log.v(MainActivity.LIFE_TAG,"FirstActivity ------>onStart");
        super.onStart();
    }

    @Override
    protected void onStop() {
        Log.v(MainActivity.LIFE_TAG,"FirstActivity ------>onStop");
        super.onStop();
    }
}
