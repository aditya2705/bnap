package com.alphalabz.businessapp.Fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by SHWETHA on 26-02-2016.
 */







import com.alphalabz.businessapp.Adapters.RecyclerAdapterVideos;
import com.alphalabz.businessapp.Objects.VideosCustomObject;
import com.alphalabz.businessapp.R;



    public class VideosFragment extends android.support.v4.app.Fragment {

        public View rootView;
        public RecyclerView recyclerView;

        // TODO: Rename and change types of parameters


        public VideosFragment() {
            // Required empty public constructor
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // Inflate the layout for this fragment
            rootView = inflater.inflate(R.layout.fragment_videos, container, false);
            recyclerView = (RecyclerView)rootView.findViewById(R.id.recyclerView);

            ArrayList<VideosCustomObject> customObjectArrayList = new ArrayList<>();
            customObjectArrayList.add(new VideosCustomObject("Title 1","Description 1",R.drawable.and1));
            customObjectArrayList.add(new VideosCustomObject("Title 2","Description 2",R.drawable.and1));
            customObjectArrayList.add(new VideosCustomObject("Title 3", "Description 3", R.drawable.and1));
            customObjectArrayList.add(new VideosCustomObject("Title 4", "Description 4", R.drawable.and1));

            recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
            recyclerView.setAdapter(new RecyclerAdapterVideos(getContext(),customObjectArrayList));

            return rootView;
        }
    }






