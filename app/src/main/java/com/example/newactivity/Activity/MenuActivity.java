package com.example.newactivity.Activity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.newactivity.R;

public class MenuActivity extends AppCompatActivity {
private Button btn_menu;
private ImageView imageView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
imageView =findViewById(R.id.menu_imageview);
    }
    public void showPopup(View view){
        PopupMenu popupMenu =new PopupMenu(MenuActivity.this,view);
        popupMenu.getMenuInflater().inflate(R.menu.main, popupMenu.getMenu());
        popupMenu.show();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu_item1:

                Toast.makeText(MenuActivity.this,"add_item",Toast.LENGTH_SHORT).show();
                Log.d("tag","____________________111111");
                break;
            case R.id.menu_item2:
                Toast.makeText(MenuActivity.this,"Remove_item",Toast.LENGTH_SHORT).show();
                Log.d("tag","____________________122222222222222222");
                break;
//            case R.id.menu_item3:
//
//                break;
//            case R.id.menu_item4:
//                break;
//            case R.id.menu_item5:
//                break;
//            case R.id.menu_item6:
//                break;
            default:
        }
        return true;

    }
}