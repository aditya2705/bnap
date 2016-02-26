package com.alphalabz.businessapp.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.alphalabz.businessapp.R;

public class MainActivityhome extends AppCompatActivity {

    String tag="fstag";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main_activityhome);
        if (savedInstanceState==null)
            getFragmentManager().beginTransaction().add(R.id.fl,new FragmentHome(),tag).commit();


    }
}
