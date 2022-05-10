package com.devdiop.gestionfoot;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.devdiop.gestionfoot.databinding.FragmentStadesBinding;

public class StadesFragment extends Fragment implements OnMapReadyCallback {

    private GoogleMap mMap;
private FragmentStadesBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                      Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_stades, container, false);


        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getChildFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        return view;
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

        LatLng Diamniadio = new LatLng(14.737871033452214, -17.202091579628654);
        mMap.addMarker(new MarkerOptions().position(Diamniadio)
                .title("Stade Maitre Abdoulaye Wade")
                .snippet("Contact: 338258005")
        );
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Diamniadio, 13));

        LatLng demba = new LatLng(14.710901445489265, -17.458454146515635);
        mMap.addMarker(new MarkerOptions().position(demba)
                .title("Stade Demba Diop")
        );
        mMap.moveCamera(CameraUpdateFactory.newLatLng(demba));

        LatLng mawade = new LatLng(16.00853170855176, -16.488259975153714);
        mMap.addMarker(new MarkerOptions().position(mawade)
                .title("Stade Mawade wade ")
        );
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(mawade,13));

        LatLng casa = new LatLng(12.580332287536693, -16.2584661021586);
        mMap.addMarker(new MarkerOptions().position(casa)
                .title("Stade Aline-Sitoe-Diatta ")
        );
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(casa,13));

        LatLng djigo = new LatLng(14.75532516544427, -17.393365761668687);
        mMap.addMarker(new MarkerOptions().position(djigo)
                .title("Stade Alassane Djigo ")
        );
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(djigo,13));

        LatLng faye = new LatLng(14.429303253811124, -16.972801386342038);
        mMap.addMarker(new MarkerOptions().position(faye)
                .title("Stade Caroline Faye ")
        );
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(faye,13));

        LatLng diop = new LatLng(14.770377493392182, -16.945111644475656);
        mMap.addMarker(new MarkerOptions().position(diop)
                .title("Stade Lat_Dior ")
        );
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(diop,13));

        LatLng ndiambour = new LatLng(15.61994228112696, -16.24241978985097);
        mMap.addMarker(new MarkerOptions().position(ndiambour)
                .title("Stade ASEC Ndiambour ")
        );
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(ndiambour,13));
        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);

        CircleOptions co = new CircleOptions()
                .center(Diamniadio)
                .radius(500)
                .fillColor(Color.GREEN)
                .strokeColor(Color.BLUE)
                .strokeWidth(5);

        mMap.addCircle(co);


    }
}