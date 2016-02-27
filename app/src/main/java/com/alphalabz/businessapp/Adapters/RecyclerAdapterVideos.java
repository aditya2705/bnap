package com.alphalabz.businessapp.Adapters;

/**
 * Created by SHWETHA on 26-02-2016.
 */

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.alphalabz.businessapp.Objects.VideosCustomObject;
import com.alphalabz.businessapp.R;

import java.util.ArrayList;

/**
 * Created by SHWETHA on 24-02-2016.
 */
public class RecyclerAdapterVideos extends RecyclerView.Adapter<CustomViewHolder> {

    private Context context;
    private ArrayList<VideosCustomObject> customObjectArrayList;

    public RecyclerAdapterVideos(Context context, ArrayList<VideosCustomObject> customObjectArrayList) {
        this.context = context;
        this.customObjectArrayList = customObjectArrayList;
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_customvideos, parent, false);
        CustomViewHolder customViewHolder = new CustomViewHolder(v);
        return customViewHolder;
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {
        VideosCustomObject customObject = customObjectArrayList.get(position);
        holder.titleTextView.setText(customObject.getTitle());
        holder.descriptionTextView.setText(customObject.getDescription());
        holder.imageView.setImageResource(customObject.getImageResourceID());
    }

    @Override
    public int getItemCount() {
        return customObjectArrayList.size();
    }
}

class CustomViewHolder extends RecyclerView.ViewHolder {

    public TextView titleTextView, descriptionTextView;
    public ImageView imageView;

    public CustomViewHolder(View itemView) {
        super(itemView);
        titleTextView = (TextView) itemView.findViewById(R.id.titleText);
        descriptionTextView = (TextView) itemView.findViewById(R.id.descriptionText);
        imageView = (ImageView) itemView.findViewById(R.id.image);
    }
}


