package com.alphalabz.businessapp.Adapters;

/**
 * Created by Twinklee on 27-02-2016.
 */
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.alphalabz.businessapp.Fragments.EventDetailFragment;
import com.alphalabz.businessapp.Objects.EventObject;
import com.alphalabz.businessapp.R;

import java.util.ArrayList;

/**
 * Created by Twinklee on 26-02-2016.
 */
public class RecyclerAdapterEventImages extends RecyclerView.Adapter<RecyclerAdapterEventImages.RecyclerViewHolderEventImages>{


    public View rootView;

    EventDetailFragment context;
    ArrayList<EventObject> itemsData_images;


    public RecyclerAdapterEventImages(EventDetailFragment context, ArrayList<EventObject> itemsData_images) {

        this.context = context;
        this.itemsData_images = itemsData_images;

    }


    @Override
    public RecyclerAdapterEventImages.RecyclerViewHolderEventImages onCreateViewHolder(ViewGroup parent, int viewType) {


        View itemLayoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.event_recycler_item,null);
        RecyclerViewHolderEventImages viewHolder = new  RecyclerViewHolderEventImages(itemLayoutView);
        return viewHolder;


    }



    @Override
    public void onBindViewHolder(RecyclerViewHolderEventImages viewHolder, int position) {

        viewHolder.imgViewIcon.setImageResource(itemsData_images.get(position).getImageUrl());
    }


    public static class RecyclerViewHolderEventImages extends RecyclerView.ViewHolder
    {
        public ImageView imgViewIcon;



        public RecyclerViewHolderEventImages(View itemLayoutView){
            super(itemLayoutView);
            imgViewIcon=(ImageView) itemLayoutView.findViewById(R.id.pic);

        }


    }


    @Override
    public int getItemCount() {
        return itemsData_images.size();
    }
}
