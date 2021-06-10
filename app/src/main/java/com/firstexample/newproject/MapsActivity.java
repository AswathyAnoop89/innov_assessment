package com.firstexample.newproject;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;
import java.util.List;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    LatLng Agartala_Tripura_India = new LatLng(23.829321, 91.277847);
    LatLng Aizawl_Mizoram_India = new LatLng(23.727106, 92.717636);
    LatLng Ajmer_Rajasthan_India = new LatLng(26.449896, 74.639915);
    LatLng Akola_Maharashtra_India = new LatLng(20.707228, 77.00296);
    LatLng Akot_Maharashtra_India = new LatLng(21.1, 77.059998);
    LatLng Alipurduar_WestBengal_India = new LatLng(26.49189, 89.5271);
    LatLng Almora_Uttarakhand_India = new LatLng(29.594189, 79.653893);
    LatLng Amalner_Maharashtra_India = new LatLng(21.04241, 75.063873);
    LatLng AmbalaCity_Haryana_India = new LatLng(30.37818, 76.776695);
    LatLng Ambernath_Maharashtra_India = new LatLng(19.186354, 73.191948);

    private Marker mAgartala_Tripura_India;
    private Marker mAizawl_Mizoram_India;
    private Marker mAjmer_Rajasthan_India;
    private Marker mAkola_Maharashtra_India;
    private Marker mAkot_Maharashtra_India;
    private Marker mAlipurduar_WestBengal_India;
    private Marker mAlmora_Uttarakhand_India;
    private Marker mAmalner_Maharashtra_India;
    private Marker mAmbalaCity_Haryana_India;
    private Marker mAmbernath_Maharashtra_India;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = ( SupportMapFragment ) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;


        List<Marker> markerList=new ArrayList<>();


        mAgartala_Tripura_India=mMap.addMarker(new MarkerOptions().position(Agartala_Tripura_India).title("Agartala,Tripura,India"));
        mAgartala_Tripura_India.setTag(0);
        markerList.add(mAgartala_Tripura_India);
        mAizawl_Mizoram_India=mMap.addMarker(new MarkerOptions().position(Aizawl_Mizoram_India).title("Aizawl,Miziram,India"));
        mAizawl_Mizoram_India.setTag(0);
        markerList.add(mAizawl_Mizoram_India);
        mAjmer_Rajasthan_India=mMap.addMarker(new MarkerOptions().position(Ajmer_Rajasthan_India).title("Ajmer_Rajasthan_India"));
        mAjmer_Rajasthan_India.setTag(0);
        markerList.add(mAjmer_Rajasthan_India);
        mAkola_Maharashtra_India=mMap.addMarker(new MarkerOptions().position(Akola_Maharashtra_India).title("Akola_Maharashtra_India"));
        mAkola_Maharashtra_India.setTag(0);
        markerList.add(mAkola_Maharashtra_India);
        mAkot_Maharashtra_India=mMap.addMarker(new MarkerOptions().position(Akot_Maharashtra_India).title("Akot_Maharashtra_India"));
        mAkot_Maharashtra_India.setTag(0);
        markerList.add(mAkot_Maharashtra_India);
        mAlipurduar_WestBengal_India=mMap.addMarker(new MarkerOptions().position(Alipurduar_WestBengal_India).title("Alipurduar_WestBengal_India"));
        mAlipurduar_WestBengal_India.setTag(0);
        markerList.add(mAlipurduar_WestBengal_India);
        mAlmora_Uttarakhand_India=mMap.addMarker(new MarkerOptions().position(Almora_Uttarakhand_India).title("Almora_Uttarakhand_India"));
        mAlmora_Uttarakhand_India.setTag(0);
        markerList.add(mAlmora_Uttarakhand_India);
        mAmalner_Maharashtra_India=mMap.addMarker(new MarkerOptions().position(Amalner_Maharashtra_India).title("Amalner_Maharashtra_India"));
        mAmalner_Maharashtra_India.setTag(0);
        markerList.add(mAmalner_Maharashtra_India);
        mAmbalaCity_Haryana_India=mMap.addMarker(new MarkerOptions().position(AmbalaCity_Haryana_India).title("AmbalaCity_Haryana_India"));
        mAmbalaCity_Haryana_India.setTag(0);
        markerList.add(mAmbalaCity_Haryana_India);
        mAmbernath_Maharashtra_India=mMap.addMarker(new MarkerOptions().position(Ambernath_Maharashtra_India).title("Ambernath_Maharashtra_India"));
        mAmbernath_Maharashtra_India.setTag(0);
        markerList.add(mAmbernath_Maharashtra_India);




        for (Marker m : markerList) {
            LatLng latLng=new LatLng(m.getPosition().latitude,m.getPosition().longitude);
            mMap.addMarker(new MarkerOptions().position(latLng));
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(latLng,10));


        }
    }
}