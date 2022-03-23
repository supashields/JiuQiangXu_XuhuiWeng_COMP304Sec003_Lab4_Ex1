package com.example.jiuqiangxu_xuhuiweng_comp304sec003_lab4_ex1;

import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.jiuqiangxu_xuhuiweng_comp304sec003_lab4_ex1.databinding.ActivityMapsBinding;
import android.util.Log;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;
    //Bundle extras = getIntent().getExtras();
    String name  = getIntent().getStringExtra("restaurantsName");

    //String[] restaurantsName = extras.getStringArray("restaurantsName");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        Log.i("###Name2", name);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        //String name = restaurantsName[0];
        // Add a marker in Sydney and move the camera
        LatLng Mandarin = new LatLng(1, 1);
        LatLng MagicNoodles = new LatLng(100, 100);

        //Mandarin</item>
        //<item>Magic Noodles</item>


//        googleMap.addMarker(new MarkerOptions()
//                .position(new LatLng(0, 0))
//                .title("Marker"));

//        switch(name){
//            case "Mandarin":
//                mMap.addMarker(new MarkerOptions().position(Mandarin).title("Marker in m"));
//                mMap.moveCamera(CameraUpdateFactory.newLatLng(Mandarin));
//                break;
//            case "Magic Noodles":
//                mMap.addMarker(new MarkerOptions().position(MagicNoodles).title("Marker in m"));
//                mMap.moveCamera(CameraUpdateFactory.newLatLng(MagicNoodles));
//                break;
//        }
        if(name == "Mandarin" ) {
            mMap.addMarker(new MarkerOptions().position(Mandarin).title("Marker in Mandarin"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(Mandarin));
        }

//        Uri gmmIntentUri = Uri.parse("geo:37,-122");
//        Intent mapIntent = new Intent(Intent.ACTION_VIEW,gmmIntentUri);
//        mapIntent.setPackage( " com.google.android.apps.maps");
//        startActivity(mapIntent);

    }
}