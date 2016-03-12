package com.alphalabz.businessapp.Fragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.alphalabz.businessapp.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Nishita on 02-03-2016.
 */
public class ContactUsFragment extends Fragment implements OnMapReadyCallback {

    public View rootView;
    @Bind(R.id.address)
    View address;
    @Bind(R.id.phone)
    View phone;
    @Bind(R.id.email)
    View email;
    GoogleMap googleMap;
    @Bind(R.id.map)
    MapView mapView;
    final String ADDRESS="Plot No.3,Flat No.A/30 Laxmi Niwas,3rd Floor,Near Sadhna School,Sion(W),Mumbai-400022";
    final String PHONE="9593857810";
    final String EMAIL="info@wohling.com";
    String[] emails= {"info@wohling.com"};
    public ContactUsFragment()
    {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        rootView= inflater.inflate(R.layout.fragment_contact_us, container, false);
        ButterKnife.bind(this, rootView);

        TextView addText= (TextView)address.findViewById(R.id.c_text);
        TextView phText=(TextView)phone.findViewById(R.id.c_text);
        TextView emailText=(TextView)email.findViewById(R.id.c_text);
        ImageView addImage= (ImageView)address.findViewById(R.id.c_img);
        ImageView phImage=(ImageView)phone.findViewById(R.id.c_img);
        ImageView emailImage=(ImageView)email.findViewById(R.id.c_img);

        addText.setText(ADDRESS);
        phText.setText(PHONE);
        emailText.setText(EMAIL);

        addImage.setImageResource(R.drawable.ic_action_location_red);
        phImage.setImageResource(R.drawable.i4);
        emailImage.setImageResource(R.drawable.i5);

        phone.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_DIAL);
                i.setData(Uri.parse("tel:" + PHONE));
                startActivity(i);
            }
        });

        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(Intent.ACTION_SEND);
                i.setData(Uri.parse("mailto:"));
                i.setType("text/plain");
                i.putExtra(Intent.EXTRA_EMAIL, emails);
                startActivity(Intent.createChooser(i, "Send mail..."));

            }
        });

        mapView.onCreate(savedInstanceState);
        mapView.getMapAsync(this);
        return rootView;
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

        this.googleMap = googleMap;

        LatLng mumbaiLatLng = new LatLng(19.076586, 72.877493);
        this.googleMap.getUiSettings().setMyLocationButtonEnabled(false);
        this.googleMap.getUiSettings().setMapToolbarEnabled(true);
        this.googleMap.getUiSettings().setCompassEnabled(false);
        this.googleMap.getUiSettings().setScrollGesturesEnabled(true);
        this.googleMap.getUiSettings().setZoomGesturesEnabled(true);
        this.googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(mumbaiLatLng, 14));
        this.googleMap.addMarker(new MarkerOptions().position(mumbaiLatLng).title("Sion(W), Mumbai"));
    }
}