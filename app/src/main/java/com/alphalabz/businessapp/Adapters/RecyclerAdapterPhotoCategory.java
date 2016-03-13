package com.alphalabz.businessapp.Adapters;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.alphalabz.businessapp.Fragments.GalleryFragment;
import com.alphalabz.businessapp.Objects.PhotoCategoryObject;
import com.alphalabz.businessapp.R;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Nishita on 22-02-2016.
 */
public class RecyclerAdapterPhotoCategory extends RecyclerView.Adapter<RecyclerViewHolder> implements View.OnClickListener {
    Context context;

    private ArrayList<PhotoCategoryObject> photoCategoryObjects = new ArrayList<PhotoCategoryObject>();

    public RecyclerAdapterPhotoCategory(Context context, ArrayList<PhotoCategoryObject> photoCategoryObjects) {
        this.context = context;
        this.photoCategoryObjects = photoCategoryObjects;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //creates a RecyclerViewHolder that holds a view of R.layout.recycler_list_item type

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.custom_photo, parent, false);
        itemView.setOnClickListener(this);
        return new RecyclerViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        holder.list_txt.setText(photoCategoryObjects.get(position).text);
        holder.list_img.setImageResource(photoCategoryObjects.get(position).image);
    }


    @Override
    public int getItemCount() {
        return photoCategoryObjects.size();
    }

    public void additem(int position, PhotoCategoryObject photoCategoryObject) {
        photoCategoryObjects.add(position, photoCategoryObject);
        this.notifyItemInserted(position);
        this.notifyDataSetChanged();
    }

    public void deleteitem(int position) {
        photoCategoryObjects.remove(position);
        notifyItemRemoved(position);
    }

    @Override
    public void onClick(View view) {
        ((AppCompatActivity)context).getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, new GalleryFragment()).commit();
    }
}

class RecyclerViewHolder extends RecyclerView.ViewHolder {

    public
    @Bind(R.id.desc)
    TextView list_txt;
    public
    @Bind(R.id.img)
    ImageView list_img;

    public RecyclerViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
        /*list_txt= (TextView)itemView.findViewById(R.id.desc);
        list_img=(ImageView)itemView.findViewById(R.id.img);*/
    }
}
