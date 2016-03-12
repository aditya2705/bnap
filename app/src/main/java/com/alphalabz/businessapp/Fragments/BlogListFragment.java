package com.alphalabz.businessapp.Fragments;

/**
 * Created by SHWETHA on 11-03-2016.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alphalabz.businessapp.Adapters.RecyclerAdapterBlog;
import com.alphalabz.businessapp.Objects.BlogCustomObject;
import com.alphalabz.businessapp.R;

import java.util.ArrayList;

/**
 * Created by SHWETHA on 09-03-2016.
 */
public class BlogListFragment extends Fragment {

    public View rootView;
    public RecyclerView recyclerView;
    // TODO: Rename and change types of parameters


    public BlogListFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        rootView = inflater.inflate(R.layout.fragment_blog, container, false);
        recyclerView = (RecyclerView) rootView.findViewById(R.id.recyclerView1);


        ArrayList<BlogCustomObject> customObjectArrayList = new ArrayList<>();
        customObjectArrayList.add(new BlogCustomObject("07 October,2015", R.drawable.ic_action_facebook,"Lorem Ipsum is simply dummy text of the printing and typesetting industry."));

        customObjectArrayList.add(new BlogCustomObject("07 October,2015", R.drawable.ic_action_facebook,"Lorem Ipsum is simply dummy text of the printing and typesetting industry."));
        customObjectArrayList.add(new BlogCustomObject("07 October,2015", R.drawable.ic_action_facebook,"Lorem Ipsum is simply dummy text of the printing and typesetting industry."));
        customObjectArrayList.add(new BlogCustomObject("07 October,2015", R.drawable.ic_action_facebook,"Lorem Ipsum is simply dummy text of the printing and typesetting industry."));
        customObjectArrayList.add(new BlogCustomObject("07 October,2015", R.drawable.ic_action_facebook,"Lorem Ipsum is simply dummy text of the printing and typesetting industry."));



        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(new RecyclerAdapterBlog(getContext(), customObjectArrayList));

        return rootView;
    }





}
