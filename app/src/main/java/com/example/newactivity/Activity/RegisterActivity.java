package com.example.newactivity.Activity;

import android.os.Bundle;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

import com.example.newactivity.R;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        RadioGroup radioGroup = findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // checkedId 是被选中的 RadioButton 的 ID
                switch (checkedId) {
                    case R.id.radio_Button_man:
                        // 处理选项1被选中的情况
                        break;
                    case R.id.radio_Button_woman:
                        // 处理选项2被选中的情况
                        break;
                }
            }
        });

    }
}