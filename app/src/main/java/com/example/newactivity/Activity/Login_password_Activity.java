package com.example.newactivity.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.newactivity.R;

public class Login_password_Activity extends AppCompatActivity {
    private Button btnLogin;
    private EditText etAccount, etPassword;
    private String username = "183264";
    private String pass = "1832649614";
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_password);
        btnLogin = findViewById(R.id.btn_login_password_login);
        etAccount = findViewById(R.id.et_login_password_login);
        etPassword = findViewById(R.id.et_login_password_password);
        btnLogin.setOnClickListener(view -> {
            String account = etAccount.getText().toString();
            String password = etPassword.getText().toString();
            if (TextUtils.equals(account,username )){
                if (TextUtils.equals(password,pass )){
                    Toast.makeText(Login_password_Activity.this,"恭喜你登录成功",Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(Login_password_Activity.this,"密码错误，请重试",Toast.LENGTH_SHORT).show();
                }
            }else {
                Toast.makeText(Login_password_Activity.this,"用户名错误，请重试",Toast.LENGTH_SHORT).show();
            }

        });
    }
}