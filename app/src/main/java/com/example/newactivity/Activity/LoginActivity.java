package com.example.newactivity.Activity;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.newactivity.R;

public class LoginActivity extends AppCompatActivity {
    private Button btnLogin;
    private EditText etAccount, etPassword;
    private String username = "183264";
    private String pass = "1832649614";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btnLogin = findViewById(R.id.btn_login);
        etAccount = findViewById(R.id.et_login_phone);
        etPassword = findViewById(R.id.et_login_password);
        btnLogin.setOnClickListener(view -> {
            String account = etAccount.getText().toString();
            String password = etPassword.getText().toString();
            if (TextUtils.equals(account,username )){
                if (TextUtils.equals(password,pass )){
                    Toast.makeText(LoginActivity.this,"恭喜你登录成功",Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(LoginActivity.this,"密码错误，请重试",Toast.LENGTH_SHORT).show();
                }
            }else {
                Toast.makeText(LoginActivity.this,"用户名错误，请重试",Toast.LENGTH_SHORT).show();
            }

        });
    }
}