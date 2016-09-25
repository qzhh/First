package com.example.day5_01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getScreenInfo();
    }

    private void getScreenInfo(){
        DisplayMetrics dm=getResources().getDisplayMetrics();
        //屏幕密度比
        float density=dm.density;
        //密度
        int dpi=dm.densityDpi;
        //宽度px
        int w=dm.widthPixels;
        int h=dm.heightPixels;
        //字体在屏幕的显示比
        float sd=dm.scaledDensity;
        Log.i("123",""+density+dpi+w+h+sd);
        Log.i("456",""+density);
    }
}
