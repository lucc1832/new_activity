package com.example.newactivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

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
