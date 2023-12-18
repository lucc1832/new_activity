package com.example.newactivity.Activity;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.newactivity.R;

public class TextViewActivity extends AppCompatActivity {
    TextView text_view_ellipsize;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);
        text_view_ellipsize =findViewById(R.id.text_view_ellipsize);
        //跑马灯效果获取焦点
        text_view_ellipsize.setSelected(true);
    }
}