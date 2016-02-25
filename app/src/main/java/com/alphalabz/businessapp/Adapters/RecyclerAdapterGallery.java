package com.alphalabz.businessapp.Adapters;

import android.content.Context;
import android.media.Image;
import android.support.annotation.IntegerRes;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.alphalabz.businessapp.Objects.PhotoCategoryObject;
import com.alphalabz.businessapp.R;

import java.util.ArrayList;
import java.util.Vector;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Nishita on 25-02-2016.
 */
public class RecyclerAdapterGallery extends RecyclerView.Adapter<RecyclerViewHolderGallery> {

    Context context;
    ArrayList<PhotoCategoryObject> arrayList;

    public RecyclerAdapterGallery(Context context, ArrayList<PhotoCategoryObject> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    public RecyclerViewHolderGallery onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.custom_gallery_photo, parent, false);
        return new RecyclerViewHolderGallery(itemView);
    }


    @Override
    public void onBindViewHolder(RecyclerViewHolderGallery holder, int position) {
          //  holder.imageView.setImageResource(arrayList.get(position));
        holder.imageView.setImageResource(arrayList.get(position).image);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public void additem(int position, int imageRes)
    {
        arrayList.add(position,new PhotoCategoryObject(imageRes));
        this.notifyItemInserted(position);
        this.notifyDataSetChanged();
    }
    public void deleteitem(int position)
    {
        arrayList.remove(position);
        notifyItemRemoved(position);
    }
}

     class RecyclerViewHolderGallery extends RecyclerView.ViewHolder{
        public @Bind(R.id.img)ImageView  imageView;
         public RecyclerViewHolderGallery(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
        /*list_txt= (TextView)itemView.findViewById(R.id.desc);
        list_img=(ImageView)itemView.findViewById(R.id.img);*/
    }



}