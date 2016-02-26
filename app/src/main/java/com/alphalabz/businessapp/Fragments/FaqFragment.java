package com.alphalabz.businessapp.Fragments;

/**
 * Created by Sonali Gujarathi on 2/26/2016.
 */
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;

import com.alphalabz.businessapp.Adapters.ExpandableAdapterFaqs;
import com.alphalabz.businessapp.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import butterknife.ButterKnife;

/**
 * Created by Sonali Gujarathi on 2/26/2016.
 */
public class FaqFragment extends Fragment {
    View rootView;
    ExpandableListView expandableListView;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_faqs, container, false);
        ButterKnife.bind(this, rootView);

        expandableListView = (ExpandableListView)rootView.findViewById(R.id.exp_listview);
        List<String> Headings = new ArrayList<String>();
        List<String> L1 = new ArrayList<String>();
        List<String> L2 = new ArrayList<String>();
        List<String> L3 = new ArrayList<String>();
        List<String> L4 = new ArrayList<String>();
        List<String> L5 = new ArrayList<String>();
        List<String> L6 = new ArrayList<String>();
        List<String> L7 = new ArrayList<String>();
        List<String> L8 = new ArrayList<String>();
        HashMap<String,List<String>> ChildList = new HashMap<String,List<String>>();
        String heading_items[] = getResources().getStringArray(R.array.header_titles);
        String l1[] = getResources().getStringArray(R.array.h1_items);
        String l2[] = getResources().getStringArray(R.array.h2_items);
        String l3[] = getResources().getStringArray(R.array.h3_items);
        String l4[] = getResources().getStringArray(R.array.h4_items);
        String l5[] = getResources().getStringArray(R.array.h5_items);
        String l6[] = getResources().getStringArray(R.array.h6_items);
        String l7[] = getResources().getStringArray(R.array.h7_items);
        String l8[] = getResources().getStringArray(R.array.h8_items);
        for (String title : heading_items)
        {
            Headings.add(title);
        }
        for (String title : l1){
            L1.add(title);
        }
        for (String title : l2){
            L2.add(title);
        }for (String title : l3){
            L3.add(title);
        }for (String title : l4){
            L4.add(title);
        }for (String title : l5){
            L5.add(title);
        }for (String title : l6){
            L6.add(title);
        }for (String title : l7){
            L7.add(title);
        }for (String title : l8){
            L8.add(title);
        }
        ChildList.put(Headings.get(0),L1);
        ChildList.put(Headings.get(1),L2);
        ChildList.put(Headings.get(2),L3);
        ChildList.put(Headings.get(3),L4);
        ChildList.put(Headings.get(4),L5);
        ChildList.put(Headings.get(5),L6);
        ChildList.put(Headings.get(6),L7);
        ChildList.put(Headings.get(7),L8);
        ExpandableAdapterFaqs expandableAdapter = new ExpandableAdapterFaqs(rootView, Headings, ChildList);
        expandableListView.setAdapter(expandableAdapter);

        return rootView;
    }
}
