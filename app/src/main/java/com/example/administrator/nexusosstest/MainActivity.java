package com.example.administrator.nexusosstest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.lib2.Lib2Util;
import com.example.nexusossarr.TestUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TestUtil.getName();
        Lib2Util.getLib2();
        TestUtil.getName();
    }
}
