package com.alphalabz.businessapp.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alphalabz.businessapp.Adapters.ContactPagerAdapter;
import com.alphalabz.businessapp.R;
import com.ogaclejapan.smarttablayout.SmartTabLayout;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Nishita on 02-03-2016.
 */
public class ContactFragment extends Fragment {
public View rootView;
    @Bind(R.id.viewpager)
    ViewPager viewPager;
    @Bind(R.id.tab)
    SmartTabLayout tabLayout;
    ContactPagerAdapter contactPagerAdapter;
    public ContactFragment(){

    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){

        rootView = inflater.inflate(R.layout.fragment_contact_tab, container, false);
        ButterKnife.bind(this, rootView);

        contactPagerAdapter= new ContactPagerAdapter(getChildFragmentManager());
        viewPager.setAdapter(contactPagerAdapter);
        tabLayout.setCustomTabView(R.layout.custom_contact_tab, R.id.tab_text);
        tabLayout.setViewPager(viewPager);
        return rootView;

    }

}
