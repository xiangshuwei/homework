package com.zhbit.www.myintent;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Button btn=(Button)findViewById(R.id.btn);
        btn.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                Intent I=new Intent(Intent.ACTION_DIAL, Uri.parse("tel://114"));
                startActivity(I);
            }
        });
    }
}
