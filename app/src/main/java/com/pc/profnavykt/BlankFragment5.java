package com.pc.profnavykt;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment5 extends Fragment {

    public BlankFragment5() {
        // Required empty public constructor
    }
    Button next;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root= inflater.inflate(R.layout.fragment_blank5, container, false);

            next=root.findViewById(R.id.blinknav2);
            next.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.nav_slideshow));
            //return w;
        /*else{
            Navigation.createNavigateOnClickListener(R.id.nav_slideshow);
        }*/
/*        next=root.findViewById(R.id.blinknav);
        next.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.blankFragment2));*/
        return root;
    }

}
