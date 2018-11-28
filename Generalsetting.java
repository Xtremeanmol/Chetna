package com.example.chetna.myapplication;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Generalsetting extends Fragment {

    public Generalsetting() {}
    TextView t1,t2;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_generalsetting,container,false);
        t1=v.findViewById(R.id.tv1);
        t2=v.findViewById(R.id.us1);

        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment f3 = new Aboutus();
                FragmentManager fm =getFragmentManager();
                FragmentTransaction ft=fm.beginTransaction().addToBackStack("");
                ft.replace(R.id.mainactivity,f3);
                ft.commit();
            }
        });
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment f2 = new User_agrrement();
                FragmentManager fm =getFragmentManager();
                FragmentTransaction ft=fm.beginTransaction().addToBackStack("");
                ft.replace(R.id.mainactivity,f2);
                ft.commit();
            }
        });


        return v;



    } }