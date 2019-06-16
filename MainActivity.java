package com.example.googlemapdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.SupportMapFragment;

public class MainActivity extends FragmentActivity implements OnMapReadyCallBack{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady (GoogleMap googlemap){
        map = googlemap;

        LatLng location = new LatLng (45.169256, 15.341605);
        map.addMarker(new MarkerOptions().position(location).title("Location"));
        map.moveCamera(CameraUpdateFactory.newLatLng(location));

    }


}
