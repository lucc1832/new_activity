package com.example.newactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btn_1;
    private Button btn_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //绑定一个id
        btn_1 = findViewById(R.id.btn_1_first);
        //显性试图点击跳转
        btn_1.setOnClickListener(view -> {
            Intent intent = new Intent(this, firstActivity.class);
            startActivity(intent);
            //点击按钮提示  LENGTH_SHORT短暂显示 LENGTH_LONG 长时间显示
            Toast.makeText(this, "跳转到下一页", Toast.LENGTH_SHORT).show();
        });
    }

    public boolean OnCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    public boolean OnOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.add_item:
                Toast.makeText(this, "添加组件", Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this, "删除组件", Toast.LENGTH_LONG).show();
                break;
            default:
        }
        return true;
    }
}
