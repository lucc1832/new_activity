package com.example.newactivity.Activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.newactivity.R;

public class Login_password_Activity extends AppCompatActivity {
    public static final int REQUEST_CODE_Register = 1;
    private Button btnLogin;
    private EditText etAccount, etPassword;
    private String username = "183264";
    private String pass = "1832649614";
    private CheckBox cbRemember, cb_auto_login;

    private TextView tv_nologin;

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
            Log.d("tag", "======account========" + account);
            Log.d("tag", "======password========" + password);
            if (TextUtils.isEmpty(username)) {
                Toast.makeText(Login_password_Activity.this, "账号密码为空", Toast.LENGTH_SHORT).show();
                return;
            }
            if (TextUtils.equals(account, username)) {
                if (TextUtils.equals(password, pass)) {
                    Toast.makeText(Login_password_Activity.this, "恭喜你登录成功", Toast.LENGTH_SHORT).show();
                    if (cbRemember.isChecked()) {
                        SharedPreferences spf = getSharedPreferences("spfRecord", MODE_PRIVATE);
                        SharedPreferences.Editor edit = spf.edit();
                        edit.putString("account", account);
                        edit.putString("password", password);
                        edit.putBoolean("isRemember", true);
                        if (cb_auto_login.isChecked()) {
                            edit.putBoolean("isLogin", true);
                        } else {
                            edit.putBoolean("isLogin", false);
                        }
                        edit.apply();
                    } else {
                        SharedPreferences spf = getSharedPreferences("spfRecord", MODE_PRIVATE);
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
        tv_nologin.setOnClickListener(view -> {
            Intent intent = new Intent(Login_password_Activity.this, RegisterActivity.class);
            startActivityForResult(intent, REQUEST_CODE_Register);

        });
        cb_auto_login.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    cbRemember.setChecked(true);
                }
            }
        });
        cbRemember.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (!b) {
                    cbRemember.setChecked(false);
                }
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode != REQUEST_CODE_Register && resultCode == RegisterActivity.RESULT_CODE_REGISITHE && data != null)
            ;
        {
            Bundle extras = data.getExtras();
            String account = extras.getString("account", "");
            String password = extras.getString("password", "");
            etAccount.setText(account);
            etPassword.setText(password);
            username = account;
            pass = password;
        }
    }

    private void initView() {
        btnLogin = findViewById(R.id.btn_login_password_login);
        etAccount = findViewById(R.id.et_login_password_login);
        etPassword = findViewById(R.id.et_login_password_password);
        cbRemember = findViewById(R.id.checkbos_Remember_password);
        tv_nologin = findViewById(R.id.tv_login_password_nologin);
        cb_auto_login = findViewById(R.id.checkbox_auto_login);

    }

    private void initData() {
        SharedPreferences spf = getSharedPreferences("spfRecord", MODE_PRIVATE);
        boolean isRemember = spf.getBoolean("isRemember", false);
        boolean isLogin = spf.getBoolean("isLogin", false);
        String account = spf.getString("account", "");
        String password = spf.getString("password", "");
        if (isLogin) {
            Intent intent = new Intent(Login_password_Activity.this, login_home_pageActivity.class);
            intent.putExtra("account", account);
            startActivity(intent);
            Login_password_Activity.this.finish();
        }

        // 让输入框的账号密码一样
        username = account;
        pass = password;

        if (isRemember) {
            etAccount.setText(account);
            etPassword.setText(password);
            cbRemember.setChecked(true);
        }

    }
}