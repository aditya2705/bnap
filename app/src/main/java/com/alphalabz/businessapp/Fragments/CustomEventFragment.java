package com.alphalabz.businessapp.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alphalabz.businessapp.Adapters.RecyclerAdapterCustomEventCard;
import com.alphalabz.businessapp.Objects.CustomEventCardObject;
import com.alphalabz.businessapp.R;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by swainroshankumar on 10/03/16.
 */
public class CustomEventFragment extends Fragment {

    View rootView;
    ArrayList<CustomEventCardObject> data;
    @Bind(R.id.event_recyclerView)
    RecyclerView recyclerView;
    RecyclerAdapterCustomEventCard recyclerAdapterCustomEventCard;
    LinearLayoutManager linearLayoutManager;

    public CustomEventFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_event, container, false);
        ButterKnife.bind(this, rootView);
        data = new ArrayList<>();
        data.add(new CustomEventCardObject("Sona Mahapatra","17 Oct 2017","00:00 Am Onwards", R.drawable.and1));



        linearLayoutManager = new LinearLayoutManager(getContext());

        recyclerView.setLayoutManager(linearLayoutManager);


        recyclerAdapterCustomEventCard = new RecyclerAdapterCustomEventCard(getContext(), data);
        recyclerView.setAdapter(recyclerAdapterCustomEventCard);
        return rootView;


    }


}