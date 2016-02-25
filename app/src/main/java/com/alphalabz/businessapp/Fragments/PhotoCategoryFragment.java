package com.alphalabz.businessapp.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alphalabz.businessapp.Adapters.RecyclerAdapterPhotoCategory;
import com.alphalabz.businessapp.Objects.PhotoCategoryObject;
import com.alphalabz.businessapp.R;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Nishita on 22-02-2016.
 */
public class PhotoCategoryFragment extends Fragment {

    View rootView;
    ArrayList<PhotoCategoryObject> data;
    @Bind(R.id.recycler_photo_category) RecyclerView recyclerView;
    RecyclerAdapterPhotoCategory recyclerAdapterPhotoCategory;
    LinearLayoutManager linearLayoutManager;
    public PhotoCategoryFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_photo_category, container, false);
        ButterKnife.bind(this,rootView);
        data =new ArrayList<>();
        data.add(new PhotoCategoryObject("Presentation Skills ", R.drawable.workshop));
        data.add(new PhotoCategoryObject("Multinational Companies", R.drawable.workshop));
        data.add(new PhotoCategoryObject("Corporate", R.drawable.workshop));


        linearLayoutManager = new LinearLayoutManager(getContext());

        recyclerView.setLayoutManager(linearLayoutManager);

        recyclerAdapterPhotoCategory = new RecyclerAdapterPhotoCategory(getContext(),data);
        recyclerView.setAdapter(recyclerAdapterPhotoCategory);
        return rootView;

    }


}
