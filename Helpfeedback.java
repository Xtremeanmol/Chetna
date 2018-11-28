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
public class Helpfeedback extends Fragment {


    public Helpfeedback() {
        // Required empty public constructor
    }
    EditText ed;


    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_helpfeedback, container, false);

        ed=v.findViewById(R.id.editText);
        return v;
    }

}
