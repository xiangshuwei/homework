package com.zhbit.www.mylogactivity2;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by hy on 2017/3/30.
 */

public class other extends Activity {
    static final String LIFE_TAG="LogActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.v(MainActivity.LIFE_TAG, "SecondActivity ------>onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.other);
    }
    @Override
    protected void onDestroy() {
        Log.v(MainActivity.LIFE_TAG,"SecondActivity ------>onDestroy");
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        Log.v(MainActivity.LIFE_TAG,"SecondActivity ------>onPause");
        super.onPause();
    }

    @Override
    protected void onRestart() {
        Log.v(MainActivity.LIFE_TAG,"SecondActivity ------>onRestart");
        super.onRestart();
    }

    @Override
    protected void onResume() {
        Log.v(MainActivity.LIFE_TAG,"SecondActivity ------>onResume");
        super.onResume();
    }

    @Override
    protected void onStart() {
        Log.v(MainActivity.LIFE_TAG,"SecondActivity ------>onStart");
        super.onStart();
    }

    @Override
    protected void onStop() {
        Log.v(MainActivity.LIFE_TAG,"SecondActivity ------>onStop");
        super.onStop();
    }
}
