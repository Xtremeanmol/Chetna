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


public class Accountsetting extends Fragment {


    public Accountsetting() {

    }

    TextView t1,t2,t3;


    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_accountfragment, container, false);
        t1=v.findViewById(R.id.pv1);
        t2=v.findViewById(R.id.cp1);
        t3=v.findViewById(R.id.pi);

        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment privacy=new Privacy();
                FragmentManager fm= getActivity().getSupportFragmentManager();
                FragmentTransaction ft =fm.beginTransaction().addToBackStack("");
                ft.replace(R.id.mainactivity,privacy);
                ft.commit();
            }
        });

        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment password=new Changepassword();
                FragmentManager fm= getActivity().getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction().addToBackStack("");
                ft.replace(R.id.mainactivity,password);
                ft.commit();
            }
        });

        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment info=new Personalinfo();
                FragmentManager fm = getActivity().getSupportFragmentManager();
                FragmentTransaction ft =fm.beginTransaction().addToBackStack("");
                ft.replace(R.id.mainactivity,info);
                ft.commit();
            }
        });

        return v;

    }


}
