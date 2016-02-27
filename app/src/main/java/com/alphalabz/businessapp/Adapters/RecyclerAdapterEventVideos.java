package com.alphalabz.businessapp.Adapters;

/**
 * Created by Twinklee on 27-02-2016.
 */
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


import com.alphalabz.businessapp.Fragments.EventFragment;
import com.alphalabz.businessapp.Objects.EventObject;
import com.alphalabz.businessapp.Objects.PhotoCategoryObject;
import com.alphalabz.businessapp.R;

import java.util.ArrayList;

import butterknife.Bind;

/**
 * Created by Twinklee on 26-02-2016.
 */
public class RecyclerAdapterEventVideos extends RecyclerView.Adapter<RecyclerAdapterEventVideos.RecyclerViewHolderEventVideos>{


    public View rootView;

    EventFragment context;
    ArrayList<EventObject> itemsData_videos;


    public RecyclerAdapterEventVideos(EventFragment context, ArrayList<EventObject> itemsData_videos) {

        this.context = context;
        this.itemsData_videos = itemsData_videos;

    }

    @Override
    public RecyclerAdapterEventVideos.RecyclerViewHolderEventVideos onCreateViewHolder(ViewGroup parent, int viewType) {


        View itemLayoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.event_recycler_item,null);
        RecyclerViewHolderEventVideos viewHolder = new  RecyclerViewHolderEventVideos(itemLayoutView);
        return viewHolder;


    }



    @Override
    public void onBindViewHolder(RecyclerViewHolderEventVideos viewHolder, int position) {

        viewHolder.videoViewIcon.setImageResource(itemsData_videos.get(position).getImageUrl());
    }


    public static class RecyclerViewHolderEventVideos extends RecyclerView.ViewHolder
    {
        public ImageView videoViewIcon;



        public RecyclerViewHolderEventVideos(View itemLayoutView){
            super(itemLayoutView);
            videoViewIcon=(ImageView) itemLayoutView.findViewById(R.id.pic);

        }


    }


    @Override
    public int getItemCount() {
        return itemsData_videos.size();
    }
}
