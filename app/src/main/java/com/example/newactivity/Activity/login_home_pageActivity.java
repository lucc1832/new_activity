package com.example.newactivity.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.newactivity.R;

public class login_home_pageActivity extends AppCompatActivity {
    private TextView tvContent;
    private Button btn_login_home_page_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_home_page);
        tvContent =findViewById(R.id.tv_login_home_page_text);
        Intent intent = getIntent();
        String account = intent.getStringExtra("account");
        tvContent.setText("欢迎会员："+account);

    }

    public void login(View view) {
        Intent intent = new Intent(this, Login_password_Activity.class);
        startActivity(intent);
    }
}