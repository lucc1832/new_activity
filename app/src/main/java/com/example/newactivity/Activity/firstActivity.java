package com.example.newactivity.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.newactivity.R;

public class firstActivity extends AppCompatActivity {
    private static final String TAG = "TAG" ;
    private Button btn_2_first, btn_2_xiangmu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        //绑定一个id
        btn_2_first = findViewById(R.id.btn_2_first);
        //显性试图点击跳转
        btn_2_first.setOnClickListener(view -> {
            startActivity(new Intent(this, LearningAssessmenActivity.class));
            //点击按钮提示  LENGTH_SHORT短暂显示 LENGTH_LONG 长时间显示
            Toast.makeText(this, "跳转到下一页", Toast.LENGTH_SHORT).show();
//            Log.d(TAG, "123213");
             finish();  //结束活动
        });
        btn_2_xiangmu = findViewById(R.id.btn_2_xiangmu);
        btn_2_xiangmu.setOnClickListener(view -> {
            startActivity(new Intent(this, ProjectActivity.class));
//           finish();
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