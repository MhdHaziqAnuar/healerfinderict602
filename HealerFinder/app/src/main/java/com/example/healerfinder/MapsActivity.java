package com.example.healerfinder;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.healerfinder.databinding.ActivityMapsBinding;

import java.util.Vector;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;

    LatLng myLocation;

    Vector<MarkerOptions> markerOptions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        myLocation = new LatLng (6.4521,100.2778);

        markerOptions = new Vector<>();

        markerOptions.add(new MarkerOptions().title("Hospital Tuanku Fauziah Kangar")
                .position(new LatLng(6.43872073339, 100.27377399))
                .snippet("Open 24 hours")
        );

        markerOptions.add(new MarkerOptions().title("Klinik Desa Jejawi")
                .position(new LatLng(6.4454, 100.237905))
                .snippet("Phone : 04-980 9836")
        );

        markerOptions.add(new MarkerOptions().title("Klinik Kesihatan Padang Besar")
                .position(new LatLng(6.656846, 100.3156589))
                .snippet("Phone : 04-949 0333")
        );

        markerOptions.add(new MarkerOptions().title("Klinik Kesihatan Arau")
                .position(new LatLng(6.432418, 100.270436))
                .snippet("04-986 1169")
        );

        markerOptions.add(new MarkerOptions().title("Hospital Jitra")
                .position(new LatLng(6.2788, 100.4191))
                .snippet("Open 24 hours")
        );

        markerOptions.add(new MarkerOptions().title("Hospital Kuala Nerang")
                .position(new LatLng(6.2526, 100.6098))
                .snippet("Open 24 hours")
        );

        markerOptions.add(new MarkerOptions().title("Klinik Rafflesia")
                .position(new LatLng(6.4456188, 100.2213896))
                .snippet("Phone: 013-459 0699")
        );

        markerOptions.add(new MarkerOptions().title("Klinik Desa Kampung Surau")
                .position(new LatLng(6.384342, 100.2065512))
                .snippet("Phone: 04-977 4489")
        );



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

    @Override // Method to add elements to map
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        for(MarkerOptions mark : markerOptions) {
            mMap.addMarker(mark);
        }

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(myLocation, 12));
    }

}