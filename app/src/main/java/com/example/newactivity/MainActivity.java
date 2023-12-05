package com.example.newactivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.newactivity.Activity.firstActivity;

public class MainActivity extends AppCompatActivity {

    private Button btn_1_shouye;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_1_shouye = findViewById(R.id.btn_1_shouye);
        btn_1_shouye.setOnClickListener(view -> {
            startActivity(new Intent(this, firstActivity.class));
        });
    }
}
