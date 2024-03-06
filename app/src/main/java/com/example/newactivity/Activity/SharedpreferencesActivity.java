package com.example.newactivity.Activity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.newactivity.R;
import com.example.newactivity.util.Sputil;

public class SharedpreferencesActivity extends AppCompatActivity {
    private EditText etContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sharedpreferences);
        etContent = findViewById(R.id.et_sharedpreferencesActivity_text);
    }

    public void save(View view) {
//      下面这个代码作用是 不在同一个活动中可以写工具类引用，在同一个地方可以不用谢
        Sputil.saveData(this);
        String content = etContent.getText().toString();
        //MODE_PRIVATE 代表隐私的 只能是这个应用能访问
        // spRecord 创建一个key 和文件路径spRecord.xml
        SharedPreferences spRecord = getSharedPreferences("spRecord", MODE_PRIVATE);
        //编辑器 格式
        SharedPreferences.Editor edit = spRecord.edit();
        edit.putString("content", content);
        //读写慢 但一定会弄
        edit.commit();
        // 读写快，存到内存里，由系统决定
//        edit.apply();
        //读写完成设置文本为空
        Toast.makeText(this, "以存储" + content
                , Toast.LENGTH_SHORT).show();
        etContent.setText("");
    }

    public void get(View view) {
        SharedPreferences spRecord = getSharedPreferences("spRecord", MODE_PRIVATE);
        String content = spRecord.getString("content", "");
        etContent.setText(content);
        //光标放置位置
        etContent.setSelection(content.length());
    }
}