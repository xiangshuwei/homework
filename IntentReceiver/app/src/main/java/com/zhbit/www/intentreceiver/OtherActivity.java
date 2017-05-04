package com.zhbit.www.intentreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by hy on 2017/4/27.
 */

public class OtherActivity extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String value=intent.getStringExtra("testIntent");
        Log.e("MainActivity-->Test",value);

    }
}
