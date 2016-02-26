package com.alphalabz.businessapp.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.alphalabz.businessapp.R;

/**
 * Created by swainroshankumar on 20/02/16.
 */

public class Event extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.event_activity);

        if (savedInstanceState==null)
            getFragmentManager().beginTransaction().add(R.id.fle,new FragmentEvent()).commit();
    }
}