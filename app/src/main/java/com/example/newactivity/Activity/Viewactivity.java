package com.example.newactivity.Activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.newactivity.R;

public class Viewactivity extends AppCompatActivity {
    private TextView textView_gongxifacai;
    private Button btn_viewactivity_java;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewactivity);
        textView_gongxifacai = findViewById(R.id.tv_gongxifacai);
        btn_viewactivity_java =findViewById(R.id.btn_viewactivity_java);
        btn_viewactivity_java.setOnClickListener(view -> {
            textView_gongxifacai.setText("牛气冲天");
        });
    }

    public void viewText(View view) {
        textView_gongxifacai.setText("恭喜发财");
    }
}