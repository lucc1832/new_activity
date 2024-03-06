package com.example.newactivity.Activity;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.newactivity.R;
import com.example.newactivity.bean.User;

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
        text_view_hello = findViewById(R.id.text_view_hello);
        String text_view_helloText = text_view_hello.getText().toString();
        text_view_hello.setTextColor(Color.RED);
        text_view_hello.setTextSize(25.0F);
//        分散传递
//        Intent intent = getIntent();
//        if (intent != null) {
//            String username = intent.getStringExtra("username");
//            int age = intent.getIntExtra("age", 0);
//            boolean isLogin = intent.getBooleanExtra("isLogin", false);
//            Log.d(TAG, "onCreate: ------username--------" + username);
//            Log.d(TAG, "onCreate: -------age-------" + age);
//            Log.d(TAG, "onCreate: -------isLogin-------" + isLogin);
//        }
        //  多个打包传递
//        Intent intent = getIntent();
//        if (intent != null) {
//            Bundle bundle1 = intent.getExtras();
//            Bundle bundle2 = intent.getExtras();
//            String username = bundle1.getString("username");
//            String username2 = bundle2.getString("username");
//            Log.d(TAG, "onCreate: ------username--------" + username);
//            Log.d(TAG, "onCreate: ------username--------" + username2);
//        }
        // 接受一个类传递
        Intent intent = getIntent();
        if (intent != null) {
            User user = (User) intent.getSerializableExtra("user");
            Log.d("tag","------user------"+user);
        }
    }

}