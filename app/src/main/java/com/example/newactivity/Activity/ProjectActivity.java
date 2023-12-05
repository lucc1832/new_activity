package com.example.newactivity.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.newactivity.R;

public class ProjectActivity extends AppCompatActivity {
 private  Button btn_project_login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project);
        btn_project_login =findViewById(R.id.btn_project_login);
        btn_project_login.setOnClickListener(view -> {
            startActivity(new Intent(this, LoginActivity.class));
        });
    }
}