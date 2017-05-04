package com.zhbit.www.intentreceiver;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn=null;
    private final String nobody="Who.care.the.name";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=(Button)findViewById(R.id.btn01);
        btn.setOnClickListener(new btnListener());
    }

    private class btnListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Intent intent =new Intent(nobody);
            intent.putExtra("testIntent","11111111111111");
            sendBroadcast(intent);
        }
    }
}
