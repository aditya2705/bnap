package com.alphalabz.businessapp.Adapters;

/**
 * Created by SHWETHA on 11-03-2016.
 */

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.alphalabz.businessapp.Objects.BlogCustomObject;
import com.alphalabz.businessapp.R;

import java.util.ArrayList;

/**
 * Created by SHWETHA on 09-03-2016.
 */

public class RecyclerAdapterBlog extends RecyclerView.Adapter<CustomBlogViewHolder> {

    private Context context;
    private ArrayList<BlogCustomObject> customObjectArrayList;

    public RecyclerAdapterBlog(Context context, ArrayList<BlogCustomObject> customObjectArrayList) {
        this.context = context;
        this.customObjectArrayList = customObjectArrayList;
    }

    @Override
    public CustomBlogViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_blog_card, parent, false);
        CustomBlogViewHolder customViewHolder = new CustomBlogViewHolder(v);
        return customViewHolder;
    }

    @Override
    public void onBindViewHolder(CustomBlogViewHolder holder, int position) {
        BlogCustomObject customObject = customObjectArrayList.get(position);
        holder.titleTextView.setText(customObject.getTitle());
        holder.descriptionTextView.setText(customObject.getDescription());
        holder.imageView.setImageResource(customObject.getImageResourceID());
    }

    @Override
    public int getItemCount() {
        return customObjectArrayList.size();
    }
}

class CustomBlogViewHolder extends RecyclerView.ViewHolder {

    public TextView titleTextView, descriptionTextView;
    public ImageView imageView;


    public CustomBlogViewHolder(View itemView) {
        super(itemView);
        titleTextView = (TextView) itemView.findViewById(R.id.title);
        descriptionTextView = (TextView) itemView.findViewById(R.id.descriptionText);
        imageView=(ImageView)itemView.findViewById(R.id.image1);
    }
}


