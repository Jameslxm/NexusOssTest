package com.example.nexusossarr;

import android.util.Log;

import com.example.lib2.Lib2Util;
import com.example.model.TestBean;

public class TestUtil {
    public static void getName(){
        Log.d("debug","getName");
        TestBean testBean = new TestBean();
        testBean.setName("===你好");
        Log.d("debug","===:"+testBean.getName());
        Lib2Util.getLib2();
    }
}
