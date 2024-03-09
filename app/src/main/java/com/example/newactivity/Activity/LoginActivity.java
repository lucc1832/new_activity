package com.example.newactivity.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.newactivity.R;

public class LoginActivity extends AppCompatActivity {
    private TextView tv_Password_login,tv_Register_new_member;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        tv_Password_login = findViewById(R.id.tv_Password_login);
        tv_Register_new_member=findViewById(R.id.tv_Register_new_member);

        tv_Password_login.setOnClickListener(view -> {
            startActivity(new Intent(this, Login_password_Activity.class));
        });
        tv_Register_new_member.setOnClickListener(view -> {
            startActivity(new Intent(this,RegisterActivity.class));
        });
    }
}