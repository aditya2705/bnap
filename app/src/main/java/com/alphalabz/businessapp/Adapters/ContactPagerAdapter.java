package com.alphalabz.businessapp.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.alphalabz.businessapp.Fragments.ContactFormFragment;
import com.alphalabz.businessapp.Fragments.ContactUsFragment;

/**
 * Created by Nishita on 02-03-2016.
 */
public class ContactPagerAdapter extends FragmentPagerAdapter {
    private final String[] tab_names = { "Contact Us", "Contact Form"};

    public ContactPagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);

    }
    @Override
    public Fragment getItem(int position) {
        switch(position) {
            case 0:
                return new ContactUsFragment();
            default:
                return new ContactFormFragment();
        }
    }

        @Override
        public CharSequence getPageTitle(int position) {
            return tab_names[position];
        }

        @Override
        public int getCount() {
            return tab_names.length;
        }



    }


