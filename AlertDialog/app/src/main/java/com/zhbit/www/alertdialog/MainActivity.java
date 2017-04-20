package com.zhbit.www.alertdialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AlertDialog.Builder dialog =new AlertDialog.Builder(MainActivity.this);
        dialog.setIcon(android.R.drawable.ic_dialog_info);
        dialog.setTitle("欢迎");
        dialog.setMessage("欢迎使用本程序");
        dialog.setPositiveButton("确定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface a0, int a1) {

            }
        });
        dialog.setNegativeButton("否定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface a0, int a1) {

            }
        });
        dialog.create();
        dialog.show();
    }
}
