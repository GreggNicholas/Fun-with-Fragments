package com.example.funwithfragments;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.funwithfragments.fragments.ButtonFragment;
import com.example.funwithfragments.fragments.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainFragment mainFragment = new MainFragment();
//        get support for backwards compatability
        FragmentManager fragmentManager = getSupportFragmentManager();
        // transactions create a unique instance
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//        replacing the contents of the conatiner layout, replace with this new
//        remember stack
        fragmentTransaction.replace(R.id.main_container, mainFragment);
        fragmentTransaction.commit();


        ButtonFragment buttonFragment = new ButtonFragment();
        FragmentTransaction fragmentTransaction2 = fragmentManager.beginTransaction().addToBackStack("main");
        fragmentTransaction2.replace(R.id.main_container, buttonFragment);
        fragmentTransaction2.commit();
    }
}

