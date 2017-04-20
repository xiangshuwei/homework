package com.zhbit.www.datepickerdialog;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;


public class MainActivity extends Activity {
    private TextView showDate=null;
    private Button setDate=null;
    private int year;
    private int month;
    private int day;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showDate=(TextView)findViewById(R.id.showDate);
        setDate=(Button)findViewById(R.id.setDate);
        //Calendar c=Calendar.getInstance(Locale.CHINA);
        Calendar c=Calendar.getInstance();
        Date myDate=new Date();
        c.setTime(myDate);
        year=c.get(Calendar.YEAR);
        month=c.get(Calendar.MONTH);
        day=c.get(Calendar.DAY_OF_MONTH);

        showDate.setText("当前日期："+year+"-"+(month+1)+"-"+day);
        setDate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                DatePickerDialog my_dataPickerDialog=new DatePickerDialog(
                        MainActivity.this,Datelistener,year,month,day);
                

                my_dataPickerDialog.show();
            }
        });
    }
    private DatePickerDialog.OnDateSetListener Datelistener= new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker v, int y, int m, int d) {
            year=y;
            month=m;
            day=d;
            updateDate();
        }
        private void updateDate(){
            showDate.setText("当前日期："+year+"-"+(month+1)+"-"+day);
        }
    };
}
