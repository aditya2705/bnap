package com.alphalabz.businessapp.Fragments;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.alphalabz.businessapp.Objects.EventObject;
import com.alphalabz.businessapp.R;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Twinklee on 10-03-2016.
 */
public class SocialFeedFragment extends Fragment {
    public View rootView;
    @Bind(R.id.gridview)
    GridView gridview;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_social_feed, container, false);
        ButterKnife.bind(this, rootView);
        gridview.setAdapter(new ImageAdapter(getActivity()));
        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                switch (position) {
                    case 0:
                        Intent intent_1 = new Intent();
                        intent_1.setAction(Intent.ACTION_VIEW);
                        intent_1.addCategory(Intent.CATEGORY_BROWSABLE);
                        intent_1.setData(Uri.parse("https://m.facebook.com/facebook"));
                        startActivity(intent_1);
                        break;
                    case 1:
                        Intent intent_2 = new Intent();
                        intent_2.setAction(Intent.ACTION_VIEW);
                        intent_2.addCategory(Intent.CATEGORY_BROWSABLE);
                        intent_2.setData(Uri.parse("https://mobile.twitter.com/twitter"));
                        startActivity(intent_2);
                        break;
                    case 2:
                        Intent intent_3 = new Intent();
                        intent_3.setAction(Intent.ACTION_VIEW);
                        intent_3.addCategory(Intent.CATEGORY_BROWSABLE);
                        intent_3.setData(Uri.parse("https://www.instagram.com/instagram/"));
                        startActivity(intent_3);
                        break;
                    case 3:
                        Intent intent_4 = new Intent();
                        intent_4.setAction(Intent.ACTION_VIEW);
                        intent_4.addCategory(Intent.CATEGORY_BROWSABLE);
                        intent_4.setData(Uri.parse("https://plus.google.com/+googleplus/"));
                        startActivity(intent_4);
                        break;
                    case 4:
                        Intent intent_5 = new Intent();
                        intent_5.setAction(Intent.ACTION_VIEW);
                        intent_5.addCategory(Intent.CATEGORY_BROWSABLE);
                        intent_5.setData(Uri.parse("https://m.youtube.com/#/user/YouTube"));
                        startActivity(intent_5);
                        break;
                    case 5:
                        Intent intent_6 = new Intent();
                        intent_6.setAction(Intent.ACTION_VIEW);
                        intent_6.addCategory(Intent.CATEGORY_BROWSABLE);
                        intent_6.setData(Uri.parse("https://www.tumblr.com/"));
                        startActivity(intent_6);
                        break;


                }


            }
        });


        return rootView;




    }
    public class ImageAdapter extends BaseAdapter {
        private Context mContext;


        public int getCount() {
            return mThumbIds.length;
        }
        public Object getItem(int position) {
            return mThumbIds[position];
        }
        public long getItemId(int position) {
            return 0;
        }
        public ImageAdapter(Context c) {
            mContext = c;
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView imageView;

            if (convertView == null){
                imageView = new ImageView(mContext);
                imageView.setLayoutParams(new GridView.LayoutParams(250, 150));
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                //imageView.setPadding(8, 8, 8, 8);
            }
            else{
                imageView = (ImageView) convertView;
            }
            imageView.setImageResource(mThumbIds[position]);
            return imageView;
        }

        private Integer[] mThumbIds = {
                R.drawable.fb_final, R.drawable.twitter,
                R.drawable.insta, R.drawable.google,
                R.drawable.youtube, R.drawable.tumblr


        };

    }







}



