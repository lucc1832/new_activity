package com.example.newactivity.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.newactivity.R;

public class Return_dataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_return_data);
    }

    public void Return_data_b(View view) {
        Intent intent  =new Intent();
        intent.putExtra("userNanme","这是结果呀");
        setResult(1,intent);
        this.finish();
    }
}