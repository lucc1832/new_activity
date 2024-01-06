package com.example.newactivity.Activity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.newactivity.R;

public class TextViewActivity extends AppCompatActivity {
    TextView text_view_ellipsize, text_view_hello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);
        text_view_ellipsize = findViewById(R.id.text_view_ellipsize);
        //跑马灯效果获取焦点
        // text_view_ellipsize.setSelected(true);

        //getText() 获取文字。setText("hello") 设置文字
        text_view_ellipsize.setSelected(true);
        String text_view_helloText = text_view_hello.getText().toString();
        text_view_hello.setTextColor(Color.RED);
        text_view_hello.setTextSize(25.0F);
    }
}