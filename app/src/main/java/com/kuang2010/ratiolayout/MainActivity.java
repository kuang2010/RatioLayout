package com.kuang2010.ratiolayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

/**
 * 图片的屏幕适配
 * desc: 在不同分辨率的手机上图片展示会变形(宽高拉伸不一致)，是由于控件ImageView的
 * 宽高比与图片本身的宽高比不一样造成的，使用该RatioLayout能使子控件ImageView等的宽高按已知图片的宽高比例进行不同手机的适配。
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
