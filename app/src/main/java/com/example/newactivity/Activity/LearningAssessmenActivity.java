package com.example.newactivity.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.newactivity.R;

public class LearningAssessmenActivity extends AppCompatActivity {
    Button btn_project_login, btn_project_TextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learning);
        btn_project_login = findViewById(R.id.btn_Learning_login);
        btn_project_login.setOnClickListener(view -> {
            startActivity(new Intent(this, LoginActivity.class));
        });
        btn_project_TextView=findViewById(R.id.btn_Learning_TextView);
        btn_project_TextView.setOnClickListener(view -> {
            startActivity(new Intent(this, TextViewActivity.class));

        });
    }
}