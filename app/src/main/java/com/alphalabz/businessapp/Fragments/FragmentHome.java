package com.alphalabz.businessapp.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.alphalabz.businessapp.R;

/**
 * Created by swainroshankumar on 26/02/16.
 */
public class FragmentHome extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);

    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        TextView tv = (TextView) view.findViewById(R.id.textView);

        TextView tv1 = (TextView) view.findViewById(R.id.textView1);
        TextView tv2 = (TextView) view.findViewById(R.id.text);
        TextView tv3 = (TextView) view.findViewById(R.id.text1);
        TextView tv4 = (TextView) view.findViewById(R.id.text2);

        TextView tv5 = (TextView) view.findViewById(R.id.text3);
        TextView tv6 = (TextView) view.findViewById(R.id.text4);
        TextView tv7 = (TextView) view.findViewById(R.id.textPara);

        /*tv.setText(getString(R.string.tv));

        tv1.setText(getString(R.string.tv1));
        tv2.setText(getString(R.string.tv2));
        tv3.setText(getString(R.string.tv3));
        tv4.setText(getString(R.string.tv4));
        tv5.setText(getString(R.string.tv5));
        tv6.setText(getString(R.string.tv6));

        tv7.setText(getString(R.string.tv7));
        */

        ImageView iv = (ImageView) view.findViewById(R.id.i);
        ImageView iv1 = (ImageView) view.findViewById(R.id.imageView1);
        ImageView iv2 = (ImageView) view.findViewById(R.id.imageView2);
        ImageView iv3 = (ImageView) view.findViewById(R.id.imageView3);
        ImageView iv4 = (ImageView) view.findViewById(R.id.imageView4);
        /*
        iv.setImageResource(R.drawable.i1);
        iv1.setImageResource(R.drawable.i4);
        iv2.setImageResource(R.drawable.i4);
        iv3.setImageResource(R.drawable.i5);
        iv4.setImageResource(R.drawable.i5);
        */
    }
}

