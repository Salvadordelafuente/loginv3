package app.ejemplo.loginv3;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.ejemplo.loginv3.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapaActivity extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        //Registrar escucha onMapReadyCallback
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

        mMap = googleMap;

        LatLng Santiago = new LatLng(-33.449418724752405, -70.66316079713658);
        mMap.addMarker(new MarkerOptions()
                .position(Santiago)
                .title("Black And White"));

        CameraPosition cameraPosition = CameraPosition.builder()
                .target(Santiago)
                .zoom(18)
                .build();

        mMap.moveCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));

    }
}
