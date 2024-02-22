package com.example.newactivity.Activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.newactivity.R;

public class Viewactivity_Button extends AppCompatActivity implements View.OnClickListener {
    private TextView tv_xianshi;
    private Button btn_viewactivity_gaibian,btn_viewactivity_java, btn_toast_short;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewactivity);

        tv_xianshi = findViewById(R.id.tv_xianshi);
        btn_toast_short = findViewById(R.id.btn_toast_short);
        btn_viewactivity_java = findViewById(R.id.btn_viewactivity_java);
        btn_viewactivity_gaibian=findViewById(R.id.btn_viewactivity_gaibian);
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
        btn_viewactivity_gaibian.setOnClickListener(this);
//    public void viewText(View view) {
//        textView_gongxifacai.setText("恭喜发财");
//    }
//}
    }
    //点击事件button 第二种方案
        @Override
        public void onClick (View view){
            int id = view.getId();
            if (id == R.id.btn_viewactivity_java){
                tv_xianshi.setText("牛气冲天");
            }else if (id ==R.id.btn_viewactivity_gaibian){
                tv_xianshi.setText("五福临门");
            }
            else if (id == R.id.btn_toast_short){
                Toast.makeText(this,"弹出短弹窗",Toast.LENGTH_SHORT).show();
            }
        }

}