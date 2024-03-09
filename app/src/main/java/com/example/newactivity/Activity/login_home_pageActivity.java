package com.example.newactivity.Activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.newactivity.R;

public class login_home_pageActivity extends AppCompatActivity {
    private TextView tvContent;
    private Button btn_login_home_page_button,btn_edited_data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_home_page);


        initView();
        initData();

    }



    private void initView() {
        tvContent =findViewById(R.id.tv_login_home_page_text);
        btn_edited_data =findViewById(R.id.btn_edited_data);
    }
    private void initData() {
        Intent intent = getIntent();
        String account = intent.getStringExtra("account");
        tvContent.setText("欢迎会员："+account);

        btn_edited_data.setOnClickListener(view -> {
            Intent intent1 =new Intent(login_home_pageActivity.this, Edit_login_home_pageActivity.class);
            startActivity(intent1);
        });
    }
    public void logout(View view) {
        SharedPreferences spf = getSharedPreferences("spfRecord",MODE_PRIVATE);
        SharedPreferences.Editor edit = spf.edit();
        edit.putBoolean("isLogin",false);
        edit.apply();
        Intent intent = new Intent(this, Login_password_Activity.class);
        startActivity(intent);
        this.finish();
    }
}