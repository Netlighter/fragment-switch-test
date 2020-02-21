package com.example.myapplication;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;


public class BlankFragment extends Fragment {
       public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_blank, container, false);
        FloatingActionButton btn = view.findViewById(R.id.email);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                Snackbar.make(v, R.string.hello_blank_fragment, Snackbar.LENGTH_LONG);
            }

         });
        return inflater.inflate(R.layout.fragment_blank, container, false);
    }
}