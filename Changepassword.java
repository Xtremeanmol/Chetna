package com.example.chetna.myapplication;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;



/**
 * A simple {@link Fragment} subclass.
 */
public class Changepassword extends Fragment {


    public Changepassword() {
        // Required empty public constructor
    }
    EditText t1,t2,t3;

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_changepassword, container, false);

        t1=v.findViewById(R.id.op1);
        t2=v.findViewById(R.id.pass1);
        t3=v.findViewById(R.id.np1);


        return v;

    }

}
