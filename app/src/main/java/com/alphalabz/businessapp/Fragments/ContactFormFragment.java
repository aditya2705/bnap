package com.alphalabz.businessapp.Fragments;

/**
 * Created by Nishita on 21-02-2016.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.alphalabz.businessapp.R;

import butterknife.Bind;
import butterknife.ButterKnife;


public class ContactFormFragment extends Fragment {

    public View rootView;

    // TODO: Rename and change types of parameters

    public
    @Bind(R.id.fullname)
    EditText fullname;
    public
    @Bind(R.id.email)
    EditText email;
    public
    @Bind(R.id.subject)
    EditText subject;
    public
    @Bind(R.id.comments)
    EditText comments;
    public
    @Bind(R.id.submitbtn)
    Button submitbtn;

    public ContactFormFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_contactform, container, false);
        ButterKnife.bind(this, rootView);
        submitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //add code for On Submit
            }
        });
        return rootView;
    }
}
