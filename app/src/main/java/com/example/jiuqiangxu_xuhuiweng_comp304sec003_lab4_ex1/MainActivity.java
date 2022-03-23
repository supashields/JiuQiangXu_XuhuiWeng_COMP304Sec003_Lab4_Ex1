package com.example.jiuqiangxu_xuhuiweng_comp304sec003_lab4_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private ArrayAdapter arrayAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resources res = getResources();
        String[] cuisine = res.getStringArray(R.array.cuisine);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, cuisine);
        //create listview object
        final ListView listView = (ListView)findViewById(R.id.listviewCuisine);
        listView.setAdapter(adapter);
        //set item clicked event
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                //intent for each item on list clicked
                Intent intent0 = new Intent(MainActivity.this,RestaurantListActivity.class);
//                String[] restaurants = res.getStringArray(R.array.chinese);
                switch(position){
                    case 0:
                        intent0.putExtra("restaurants",res.getStringArray(R.array.chinese));
                        break;
                    case 1:
                        intent0.putExtra("restaurants",res.getStringArray(R.array.italian));
                        break;
                    case 2:
                        intent0.putExtra("restaurants",res.getStringArray(R.array.greek));
                        break;
                    case 3:
                        intent0.putExtra("restaurants",res.getStringArray(R.array.indian));
                        break;
                    case 4:
                        intent0.putExtra("restaurants",res.getStringArray(R.array.japanese));
                        break;
                }
                startActivity(intent0);


            }
        });
    }
}