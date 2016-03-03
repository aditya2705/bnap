package com.alphalabz.businessapp.Fragments;

/**
 * Created by Twinklee on 27-02-2016.
 */
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alphalabz.businessapp.Adapters.RecyclerAdapterEventImages;
import com.alphalabz.businessapp.Adapters.RecyclerAdapterEventVideos;
import com.alphalabz.businessapp.Objects.EventObject;
import com.alphalabz.businessapp.R;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Twinklee on 26-02-2016.
 */
public class EventDetailFragment extends Fragment {
    public View rootView;
    @Bind(R.id.recyclerView_images)
    RecyclerView recyclerView_images;
    @Bind(R.id.recyclerView_videos)
    RecyclerView recyclerView_videos;

    RecyclerAdapterEventImages recyclerAdapterEventImages;
    RecyclerAdapterEventVideos recyclerAdapterEventVideos;


    ArrayList<EventObject> itemsData_images;
    ArrayList<EventObject> itemsData_videos;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_event_detail, container, false);
        ButterKnife.bind(this, rootView);
        itemsData_images = new ArrayList<>();
       itemsData_videos = new ArrayList<>();

        itemsData_images.add(new EventObject(R.drawable.img1));
        itemsData_images.add(new EventObject(R.drawable.img2));
        itemsData_images.add(new EventObject(R.drawable.img3));

        itemsData_videos.add(new EventObject(R.drawable.img1));
        itemsData_videos.add(new EventObject(R.drawable.img2));
        itemsData_videos.add(new EventObject(R.drawable.img3));
  // images

        final  LinearLayoutManager layoutManager_images;
        layoutManager_images = new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL, false);

        recyclerAdapterEventImages = new RecyclerAdapterEventImages(this, itemsData_images);
        recyclerView_images.setAdapter(recyclerAdapterEventImages);

        recyclerView_images.setLayoutManager(layoutManager_images);

        //videos

        final  LinearLayoutManager layoutManager_videos;
        layoutManager_videos = new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL, false);

        recyclerAdapterEventVideos = new RecyclerAdapterEventVideos(this, itemsData_videos);
        recyclerView_videos.setAdapter(recyclerAdapterEventVideos);

        recyclerView_videos.setLayoutManager(layoutManager_videos);



        return rootView;



         }


}



