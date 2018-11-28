package com.example.chetna.myapplication;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
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

public class Settings extends Fragment

{
    public Settings(){

    }
    TextView t1,t2,t3,t5,t7,t8,t9;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_settings,container,false);

        t1=v.findViewById(R.id.tv1);
        t2=v.findViewById(R.id.tv2);
        t3=v.findViewById(R.id.tv3);
        t5=v.findViewById(R.id.tv5);
        t7=v.findViewById(R.id.tv7);
        t8=v.findViewById(R.id.tv8);
        t9=v.findViewById(R.id.tv9);

        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragmentgs= new Generalsetting();
                FragmentManager fm=getFragmentManager();
                FragmentTransaction ft=fm.beginTransaction().addToBackStack("");
                ft.replace(R.id.mainactivity,fragmentgs);
                ft.commit();
            }
        });

        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment f1 = new Accountsetting();
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction().addToBackStack("");
                ft.replace(R.id.mainactivity,f1);
                ft.commit();
            }
        });
        t7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment f2 = new Helpfeedback();
                FragmentManager fm =getFragmentManager();
                FragmentTransaction ft=fm.beginTransaction().addToBackStack("");
                ft.replace(R.id.mainactivity,f2);
                ft.commit();
            }
        });
        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    try
                    {
                        Intent rateIntent = rateIntentForUrl("market://details");
                        startActivity(rateIntent);
                    }
                    catch (ActivityNotFoundException e)
                    {
                        Intent rateIntent = rateIntentForUrl("https://play.google.com/store/apps/details");
                        startActivity(rateIntent);
                    }
                }

                private Intent rateIntentForUrl(String url)
                {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(String.format("%s?id=%s", url, getContext().getPackageName())));
                    int flags = Intent.FLAG_ACTIVITY_NO_HISTORY | Intent.FLAG_ACTIVITY_MULTIPLE_TASK;
                    if (Build.VERSION.SDK_INT >= 21) {
                        flags |= Intent.FLAG_ACTIVITY_NEW_DOCUMENT;
                    } else {
                        //noinspection deprecation
                        flags |= Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET;
                    }
                    intent.addFlags(flags);
                    return intent;
                }


        });

        return v;


    }
}


