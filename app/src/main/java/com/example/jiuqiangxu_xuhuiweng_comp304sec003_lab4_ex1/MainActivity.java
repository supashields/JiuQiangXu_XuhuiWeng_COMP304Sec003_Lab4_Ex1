package com.example.jiuqiangxu_xuhuiweng_comp304sec003_lab4_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkStockChart(View view) {
        String type = new String();


        Intent intent0 = new Intent(MainActivity.this,RestaurantListActivity.class);
        intent0.putExtra("type",type);
        startActivity(intent0);
    }
}