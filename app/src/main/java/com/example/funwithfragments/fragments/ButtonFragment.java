package com.example.funwithfragments.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.funwithfragments.R;
import com.example.funwithfragments.fragments.PictureFragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class ButtonFragment extends Fragment {

    private View rootView;

    public ButtonFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_button, container, false);

        Button button01 = rootView.findViewById(R.id.button01);
        button01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PictureFragment pictureFragment = new PictureFragment();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                //addto backstack goes back to activity instead of home screen
                //tells the fragment to go back to previous fragmnet instead of back to the app
                fragmentTransaction.replace(R.id.main_container, pictureFragment).addToBackStack("picture");
                fragmentTransaction.commit();

            }
        });

        return rootView;
    }
}
