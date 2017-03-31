package com.zhbit.www.myact;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by hy on 2017/3/30.
 */

public class other extends Activity {
    private Intent intent;
    private Bundle bundle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.other);
        Bundle bundle=this.getIntent().getExtras();
        String ans=bundle.getString("ans");
        String sexText="";
        if(ans.equals("in")){
            sexText="正确";
        }else{
            sexText="错误";
        }

        TextView tv=(TextView)findViewById(R.id.text1);
        tv.setText("您的答案是："+sexText);

        Button bt=(Button)findViewById(R.id.button_back);
        bt.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                other.this.setResult(0,intent);
                other.this.finish();
            }
        });
    }
}
