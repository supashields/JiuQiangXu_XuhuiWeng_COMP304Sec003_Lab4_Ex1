package com.example.jiuqiangxu_xuhuiweng_comp304sec003_lab4_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantListActivity extends AppCompatActivity {

    private ListView listView;
    private ArrayAdapter arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_list);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Bundle extras = getIntent().getExtras();
        String[] restaurants = extras.getStringArray("restaurants");

        Resources res = getResources();
//        String[] restaurantslist = res.getStringArray(R.array.cuisine);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(RestaurantListActivity.this, android.R.layout.simple_list_item_1, restaurants);
        //create listview object
        final ListView listView = (ListView)findViewById(R.id.listviewRes);
        listView.setAdapter(adapter);
        //set item clicked event
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                String name =(String) (listView.getItemAtPosition(position));
                Log.i("###Name", name);

                //System.out.println(selectedFromList);
                //Log.i("text",selectedFromList);
                //intent for each item on list clicked
                Intent intent0 = new Intent(RestaurantListActivity.this,MapsActivity.class);
                intent0.putExtra("restaurantsName",name);
                //double lat = 43.6532;
               // double lng = -79.3832;
                //double[] coordinates = new double[] {lat, lng};

//                for(int i = 0; i < restaurants.size(); i++){
//
//                }
//                switch(position){
//                    case 0:
//                        intent0.putExtra("restaurants",res.getStringArray(R.array.chinese));
//                        break;
//                    case 1:
//                        intent0.putExtra("restaurants",res.getStringArray(R.array.italian));
//                        break;
//                    case 2:
//                        intent0.putExtra("restaurants",res.getStringArray(R.array.greek));
//                        break;
//                    case 3:
//                        intent0.putExtra("restaurants",res.getStringArray(R.array.indian));
//                        break;
//                    case 4:
//                        intent0.putExtra("restaurants",res.getStringArray(R.array.japanese));
//                        break;
//                }
                startActivity(intent0);
                //intent0.putExtra("coordinates",coordinates);
            }
        });
    }
}