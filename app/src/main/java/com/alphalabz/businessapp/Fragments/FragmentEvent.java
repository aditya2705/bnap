package com.alphalabz.businessapp.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alphalabz.businessapp.R;

/**
 * Created by swainroshankumar on 26/02/16.
 */
public class FragmentEvent extends Fragment implements View.OnClickListener {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v =  inflater.inflate(R.layout.fragment_event, container, false);

        View event1 = v.findViewById(R.id.event_1);
        event1.setOnClickListener(this);
        View event2 = v.findViewById(R.id.event_2);
        event2.setOnClickListener(this);
        return v;
    }

    @Override
    public void onClick(View view) {
        getActivity().getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, new EventDetailFragment()).commit();
    }
}
