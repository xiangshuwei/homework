package com.zhbit.www.myact;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

            RadioButton r1=null;
            RadioButton r2=null;
            RadioButton r3=null;
            RadioButton r4=null;
            RadioGroup radioGroup=null;
            RadioButton currentRadioButton=null;
            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);
        //获得单选按钮组
        radioGroup=(RadioGroup)findViewById(R.id.radioGroup);
        //获得单选按钮
        r1=(RadioButton)findViewById(R.id.a);
        r2=(RadioButton)findViewById(R.id.b);
        r3=(RadioButton)findViewById(R.id.c);
        r4=(RadioButton)findViewById(R.id.d);
        r1.setClickable(true);

        /*radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (checkedId == R.id.a) {
                    setTitle("你选择的答案是正确的！");
                }else{
                    setTitle("你选择的答案是错误的！");
                }
            }
        });*/
        Button btn1_sure=(Button)findViewById(R.id.sure);
        Button btn2_cancel=(Button)findViewById(R.id.cancle);
        btn1_sure.setOnClickListener(new btn1_sure());
        btn2_cancel.setOnClickListener(new btn2_cancel());

    }
    class btn1_sure implements View.OnClickListener {
        @Override
        public void onClick(View v){
           /* if(r1.getText().equals("in")){
                setTitle("你选择的答案是正确的！");
            }
            else if(r2.getText().equals("at")||r3.getText().equals("of")||r4.getText().equals("in")){
                setTitle("你选择的答案是错误的！");
            }*/
           String ans="";
            if(r1.isChecked()){
                ans="on";
            }else if(r2.isChecked()){
                ans="at";
            }else if(r3.isChecked()){
                ans="of";
            }else if(r4.isChecked()){
                ans="in";
            }
            Intent intent=new Intent();
            intent.setClass(MainActivity.this,other.class);
            Bundle bundle=new Bundle();
            bundle.putString("ans",ans);
            intent.putExtras(bundle);
            startActivityForResult(intent,0);
        }
    }

    class btn2_cancel implements View.OnClickListener{
        @Override
        public void onClick(View v){
            radioGroup.clearCheck();
           //setTitle("");
        }
    }
    protected void onActivityResult(int requestCode,int resultCode,Intent data){
        super.onActivityResult(requestCode,resultCode,data);
       /*switch (resultCode){
            case RESULT_OK:
                Bundle bundle=data.getExtras();
                String ans=bundle.getString("ans");
                break;
            default:
                break;
        }*/
       if(requestCode==0 && resultCode==0){
           Bundle bundle=data.getExtras();
           String ans=bundle.getString("ans");
       }
    }
}
