package com.alphalabz.businessapp.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alphalabz.businessapp.Adapters.RecyclerAdapterGallery;
import com.alphalabz.businessapp.Objects.PhotoCategoryObject;
import com.alphalabz.businessapp.R;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Nishita on 24-02-2016.
 */
public class GalleryFragment extends Fragment {
    View rootView;
    ArrayList<PhotoCategoryObject> arrayList;
    GridLayoutManager gridLayoutManager;
    RecyclerAdapterGallery recyclerAdapterGallery;
    @Bind(R.id.recycler_gallery)
    RecyclerView recyclerView;

    public GalleryFragment() {

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_gallery, container, false);
        ButterKnife.bind(this, rootView);
        arrayList = new ArrayList<>();
        gridLayoutManager = new GridLayoutManager(getContext(), 3);
        for (int i = 0; i < 15; i += 3) {
            arrayList.add(new PhotoCategoryObject(R.drawable.img1));
            arrayList.add(new PhotoCategoryObject(R.drawable.img2));
            arrayList.add(new PhotoCategoryObject(R.drawable.img3));
        }

        recyclerAdapterGallery = new RecyclerAdapterGallery(getContext(), arrayList);
        recyclerView.setAdapter(recyclerAdapterGallery);
        recyclerView.setLayoutManager(gridLayoutManager);
        return rootView;
    }
}

