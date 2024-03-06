package com.example.newactivity.Activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.newactivity.R;

public class Login_password_Activity extends AppCompatActivity {
    private Button btnLogin;
    private EditText etAccount, etPassword;
    private String username = "183264";
    private String pass = "1832649614";
    private CheckBox cbRemmember;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_password);
        //  统一方法xml中的id
        initView();
        //
        initData();

        btnLogin.setOnClickListener(view -> {
            String account = etAccount.getText().toString();
            String password = etPassword.getText().toString();
            if (TextUtils.equals(account, username)) {
                if (TextUtils.equals(password, pass)) {
                    Toast.makeText(Login_password_Activity.this, "恭喜你登录成功", Toast.LENGTH_SHORT).show();
                    if (cbRemmember.isChecked()) {
                        SharedPreferences spf = getSharedPreferences("spfRecorid", MODE_PRIVATE);
                        SharedPreferences.Editor edit = spf.edit();
                        edit.putString("account", account);
                        edit.putString("password", password);
                        edit.putBoolean("isRemember", true);
                        edit.apply();
                    } else {
                        SharedPreferences spf = getSharedPreferences("spfRecorid", MODE_PRIVATE);
                        SharedPreferences.Editor edit = spf.edit();
                        edit.putBoolean("isRemember", false);
                        edit.apply();
                    }
                    Intent intent = new Intent(Login_password_Activity.this, login_home_pageActivity.class);
                    intent.putExtra("account", account);
                    startActivity(intent);
                    //结束自己
                    Login_password_Activity.this.finish();

                } else {
                    Toast.makeText(Login_password_Activity.this, "密码错误，请重试", Toast.LENGTH_SHORT).show();
                }
            } else {
                Toast.makeText(Login_password_Activity.this, "用户名错误，请重试", Toast.LENGTH_SHORT).show();
            }

        });
    }

    private void initView() {
        btnLogin = findViewById(R.id.btn_login_password_login);
        etAccount = findViewById(R.id.et_login_password_login);
        etPassword = findViewById(R.id.et_login_password_password);
        cbRemmember = findViewById(R.id.checkbos_Remember_password);
    }
    private void initData() {

    }
}