package com.example.funwithfragments.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.funwithfragments.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {
    private View rootView;


    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment into the view heiharchy

        rootView = inflater.inflate(R.layout.fragment_main, container, false);
//        TextView textView = rootView.findViewById(R.id.);
        return rootView;



    }

}
