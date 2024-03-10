package com.example.newactivity.Activity;

import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.newactivity.R;

public class Edit_login_home_pageActivity extends AppCompatActivity {
    private EditText etNickName, etAccount, tvSchool, tvSign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_login_home_page);

        initView();
        initData();
    }

    private void initData() {

    }

    private void initView() {

    }
}