package com.example.newactivity.Activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.newactivity.R;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {
    public static final int RESULT_CODE_REGISITHE = 0;
    private Button btn_login_password_login;
    private EditText et_login_password_login, et_login_password_password, et_login_password_password2;
    private CheckBox cb_rbAgree;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        btn_login_password_login = findViewById(R.id.btn_login_password_login);
        et_login_password_login = findViewById(R.id.et_login_password_login);
        et_login_password_password = findViewById(R.id.et_login_password_password);
        et_login_password_password2 = findViewById(R.id.et_login_password_password2);
        cb_rbAgree = findViewById(R.id.cb_rbAgree);
        btn_login_password_login.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String userphone = et_login_password_login.getText().toString();
        String password = et_login_password_password.getText().toString();
        String passConfirm = et_login_password_password2.getText().toString();
        // isEmpty 检查是否为空
        if (TextUtils.isEmpty(userphone)) {
            Toast.makeText(RegisterActivity.this, "用户名不能为空", Toast.LENGTH_SHORT).show();
            return;
        }
        if (TextUtils.isEmpty(password)) {
            Toast.makeText(RegisterActivity.this, "密码不能为空", Toast.LENGTH_SHORT).show();
            return;
        }
        // equals  检查password和passconfirm是否一致
        if (!TextUtils.equals(password, passConfirm)) {
            Toast.makeText(RegisterActivity.this, "再次确认密码要与密码相同且不能为空", Toast.LENGTH_SHORT).show();
            return;
        }
        //用户选项点击检查
        if (!cb_rbAgree.isChecked()) {
            Toast.makeText(RegisterActivity.this, "请同意用户协议", Toast.LENGTH_SHORT).show();
            return;
        }
//      存储注册的用户名，密码
        SharedPreferences spf = getSharedPreferences("spfRecord", MODE_PRIVATE);
        SharedPreferences.Editor edit = spf.edit();
        edit.putString("account",userphone);
        edit.putString("password",password);
        //数据回传
        Intent intent = new Intent();
        Bundle bundle =new Bundle();
        bundle.putString("account",userphone);
        bundle.putString("password",password);
        intent.putExtras(bundle);
        setResult(RESULT_CODE_REGISITHE,intent);

        Toast.makeText(RegisterActivity.this, "注册成功!", Toast.LENGTH_SHORT).show();
        this.finish();
    }
}