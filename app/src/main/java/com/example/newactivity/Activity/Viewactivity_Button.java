package com.example.newactivity.Activity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.newactivity.R;

import java.util.Random;

public class Viewactivity_Button extends AppCompatActivity implements View.OnClickListener {
    private TextView tv_xianshi;
    // 快捷TAG方法
    private static final String TAG = "Viewactivity_Button";
    private Button btn_toast_long, btn_viewactivity_java, btn_toast_short;

    //private String[] contents = {
//        "恭喜发财",
//        "五福临门",
//        "心想事成",
//        "万事如意",
//        "开心一整年",
//        "烦恼消失掉",
//        "开心常围绕"
//};
    private String[] contents;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewactivity);

        tv_xianshi = findViewById(R.id.tv_xianshi);
        btn_toast_short = findViewById(R.id.btn_toast_short);
        btn_viewactivity_java = findViewById(R.id.btn_viewactivity_java);
        btn_toast_long = findViewById(R.id.btn_toast_long);
        //点击事件button 第一种方案
//        btn_viewactivity_java.setOnClickListener(view -> {
//            textView_gongxifacai.setText("牛气冲天");
//        });
//        btn_toast_short.setOnClickListener(view -> {
//            Toast.makeText(this,"四季如春",Toast.LENGTH_SHORT).show();
//        });
//    }
        btn_viewactivity_java.setOnClickListener(this);
        btn_toast_short.setOnClickListener(this);
        btn_toast_long.setOnClickListener(this);
        //xml onclick 变量名 viewText
//    public void viewText(View view) {
//        textView_gongxifacai.setText("恭喜发财");
//    }
//}
        //获取数组长度
        contents = getResources().getStringArray(R.array.contents);
        for (int i = 0; i < contents.length; i++) {
            Log.d("tag","-----------contents--------------"+contents[i]);
        }
    }


    //点击事件button 第二种方案
    @Override
    public void onClick(View view) {
        int id = view.getId();
//            if (id == R.id.btn_viewactivity_java) {
//                tv_xianshi.setText("牛气冲天");
//            } else if (id == R.id.btn_viewactivity_gaibian) {
//                tv_xianshi.setText("五福临门");
//            } else if (id == R.id.btn_toast_short) {
//                Toast.makeText(this, "弹出短弹窗", Toast.LENGTH_SHORT).show();
//            }
        // 点击事件button 第三种方案
        switch (id) {
            case R.id.btn_viewactivity_java:
                tv_xianshi.setText("牛气冲天");
                break;
            case R.id.btn_toast_long:
                tv_xianshi.setText("五福临门");
                Toast.makeText(this, "弹出长弹窗", Toast.LENGTH_LONG).show();
                break;
            case R.id.btn_toast_short:
                tv_xianshi.setText("花开常笑");
                Toast.makeText(this, "弹出短弹窗", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }

    //xml onclick 变量名 viewText
    public void viewText(View view) {
        Log.d("tag", "-----执行了-viewText方法--------" + tv_xianshi.getText().toString());
        //Random方法 设置一个随机数
        Random random = new Random();
        //设置变量读取随机数里的长度 可以设置数字
        int index = random.nextInt(contents.length);
        String newStr = contents[index];
        tv_xianshi.setText(newStr);
        Log.d(TAG, "viewText: -----执行了-viewText方法--------" + tv_xianshi.getText().toString());
    }

    class myClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            tv_xianshi.setText("恭喜发财2");
        }
    }
}