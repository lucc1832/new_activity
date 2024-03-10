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
    private TextView tvContent, tvNickName, tvAccount, tvAge, tvGender, tvCity, tvHome, tvSchool, tvSign, tvBirthdayTime;
    private Button btn_login_home_page_button, btn_edited_data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_home_page);

        initView();
        initData();
        initEvent();
    }

    private void initEvent() {

    }


    private void initView() {
        tvAccount = findViewById(R.id.tv_account_text);
        tvNickName = findViewById(R.id.tv_nick_name);
        tvAge = findViewById(R.id.tv_age);
        tvHome = findViewById(R.id.tv_home_text);
        tvSchool = findViewById(R.id.tv_school_text);
        tvSign = findViewById(R.id.tv_sign_text);
        tvBirthdayTime = findViewById(R.id.tv_birth_time_text);
        tvGender = findViewById(R.id.tv_gender);
        tvCity = findViewById(R.id.tv_city);
        btn_edited_data = findViewById(R.id.btn_edited_data);
    }

    private void initData() {
        getDataFromSpf();
        btn_edited_data.setOnClickListener(view -> {
            Intent intent = new Intent(login_home_pageActivity.this, Edit_login_home_pageActivity.class);
            startActivity(intent);
        });
    }

    private void getDataFromSpf() {
        SharedPreferences spfRecord = getSharedPreferences("spfRecord", MODE_PRIVATE);
        String account = spfRecord.getString("account", "");
        String nickName = spfRecord.getString("nick_name", "");
        String age = spfRecord.getString("age", "");
        String city = spfRecord.getString("city", "");
        String gender = spfRecord.getString("gender", "");
        String school = spfRecord.getString("school", "");
        String birthDayTime = spfRecord.getString("birth_day_time", "");
        String sign = spfRecord.getString("sign", "");
        tvAccount.setText(account);
        tvNickName.setText(nickName);
        tvAge.setText(age);
        tvCity.setText(city);
        tvGender.setText(gender);
        tvSchool.setText(school);
        tvBirthdayTime.setText(birthDayTime);
        tvSign.setText(sign);


    }




    public void logout(View view) {
        SharedPreferences spf = getSharedPreferences("spfRecord", MODE_PRIVATE);
        SharedPreferences.Editor edit = spf.edit();
        edit.putBoolean("isLogin", false);
        edit.apply();
        Intent intent = new Intent(this, Login_password_Activity.class);
        startActivity(intent);
        this.finish();
    }
}