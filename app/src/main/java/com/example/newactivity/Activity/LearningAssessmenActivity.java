package com.example.newactivity.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.newactivity.R;

public class LearningAssessmenActivity extends AppCompatActivity {
    Button btn_project_login, btn_project_TextView, btn_project_View, btn_project_menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learning);
        btn_project_login = findViewById(R.id.btn_Learning_login);
        btn_project_login.setOnClickListener(view -> {
            startActivity(new Intent(this, LoginActivity.class));
            finish();
        });
        btn_project_TextView = findViewById(R.id.btn_Learning_TextView);
        btn_project_TextView.setOnClickListener(view -> {
            startActivity(new Intent(this, TextViewActivity.class));
            finish();

        });
        btn_project_View = findViewById(R.id.btn_Learning_View);
        btn_project_View.setOnClickListener(view -> {
            startActivity(new Intent(this, Viewactivity_Button.class));
            finish();
        });
        btn_project_menu = findViewById(R.id.btn_learning_menu);
        btn_project_menu.setOnClickListener(view -> {
            startActivity(new Intent(this, MenuActivity.class));
            finish();
        });

    }

    public void toBaidu(View view) {
        Intent intent = new Intent();
        //跳转到浏览器 访问url
//        intent.setAction(Intent.ACTION_VIEW);
//        intent.setData(Uri.parse("http://www.baidu.com"));

        //打开照相机
//        intent.setAction("android.media.action.IMAGE_CAPTURE");

        //打电话
//        intent.setAction(Intent.ACTION_DIAL);
//        intent.setData(Uri.parse("tel:10086"));

        //发送短信,自定义发送短信的内容
//        intent.setAction(Intent.ACTION_SENDTO);
//        intent.setData(Uri.parse("smsto:10086"));
//        intent.putExtra("sms_body","你好这是给你的短信");

        //打开相册
        intent.setAction("android.intent.action.PICK");
        intent.setType("image/*");
        startActivity(intent);
    }
}