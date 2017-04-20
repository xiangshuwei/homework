package com.zhbit.www.mysubmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.SubMenu;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        SubMenu sub =menu.addSubMenu(R.string.title);
        sub.add(0,1,1,R.string.Local);
        sub.add(0,2,2,R.string.network);

        return super.onCreateOptionsMenu(menu);
    }

}
