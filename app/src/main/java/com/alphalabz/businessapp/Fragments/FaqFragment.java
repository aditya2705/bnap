package com.alphalabz.businessapp.Fragments;

/**
 * Created by Sonali Gujarathi on 2/26/2016.
 */

/**
 * Created by Sonali Gujarathi on 2/26/2016.
 */

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alphalabz.businessapp.Activities.MainActivity;
import com.alphalabz.businessapp.Adapters.RecyclerAdapterFaqs;
import com.alphalabz.businessapp.Objects.FaqObject;
import com.alphalabz.businessapp.R;

import java.util.ArrayList;
import java.util.List;


public class FaqFragment extends Fragment {
    View rootView;
    String content="Businesses are prevalent in capitalist economies, where most of them are privately owned and provide goods and services to customers in exchange for other goods, services, or money. Businesses may also be social not-for-profit enterprises or state-owned public enterprises targeted";


    public static void startActivity(Context context) {
        context.startActivity(new Intent(context, MainActivity.class));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.fragment_faqs, container, false);


        final RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(rootView.getContext()));

        final List<FaqObject> data = new ArrayList<>();
        data.add(new FaqObject(
                "1.How should questions for FAQs be formatted?", content));
        data.add(new FaqObject(
                "2. How should questions for FAQs be formatted?", content));
        data.add(new FaqObject(
                "3. How should questions for FAQs be formatted?", content));
        data.add(new FaqObject(
                "4. How should questions for FAQs be formatted?", content));
        data.add(new FaqObject(
                "5.How should questions for FAQs be formatted?", content));
        data.add(new FaqObject(
                "6.How should questions for FAQs be formatted?", content));
        data.add(new FaqObject(
                "7.How should questions for FAQs be formatted?", content));
        data.add(new FaqObject(
                "8.How should questions for FAQs be formatted?", content));
        recyclerView.setAdapter(new RecyclerAdapterFaqs(data));


        return rootView;
    }
}

