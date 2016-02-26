package com.alphalabz.businessapp.Fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.alphalabz.businessapp.R;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Vaibhavi on 26-02-2016.
 */
public class TeamFragment extends Fragment {
    public View rootView;
    @Bind(R.id.ll_1) LinearLayout left;
    @Bind(R.id.ll_2) LinearLayout right;

    GridView grid;
    String[]name={
            "Jannice Murray",
            "Mathew Dale",
            "John Parker",
            "Rohn Hasley"
    };
    String[]post={
            "C.E.O.",
            "V.P.",
            "Director",
            "Manager"
    };
    String[]description={
            "Lorem Ipsum Dolor" +
                    "sit amet," +
                    "consectetur" +
                    "adipisicing elit.",
            "Lorem Ipsum Dolor" +
                    "sit amet," +
                    "consectetur" +
                    "adipisicing elit.",
            "Lorem Ipsum Dolor" +
                    "sit amet," +
                    "consectetur" +
                    "adipisicing elit.",
            "Lorem Ipsum Dolor" +
                    "sit amet," +
                    "consectetur" +
                    "adipisicing elit."
    };
    int[]imageID={
            R.drawable.one,
            R.drawable.onet,
            R.drawable.oneth,
            R.drawable.one
    };

    void view_inflate(View view,int i)
    {

        ImageView image = (ImageView)view.findViewById(R.id.grid_image);
        TextView tvName =(TextView)view.findViewById(R.id.grid_text_name);
        TextView tvPost =(TextView)view.findViewById(R.id.grid_text_post);
        TextView tvDescription =(TextView)view.findViewById(R.id.grid_text_description);
        tvName.setText(name[i]);
        tvPost.setText(post[i]);
        tvDescription.setText(description[i]);
        image.setImageResource(imageID[i]);

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.team, container, false);
        ButterKnife.bind(this, rootView);

        int length=name.length;
        //Context mContext=TeamFragment.this;
        //LayoutInflater inflator=(LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view;

        for(int i=0;i<length;i++)
        {
            view=inflater.inflate(R.layout.custom_team,null);  // why not outside loop

            if((i%2)==0)
            {

                view_inflate(view,i);
                left.addView(view);

            }
            else
            {
                view_inflate(view,i);
                right.addView(view);

            }
        }
        return rootView;

    }



}


