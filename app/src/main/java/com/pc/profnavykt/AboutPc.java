package com.pc.profnavykt;

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
public class AboutPc extends Fragment {
    Button spis_uch;
    public AboutPc() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root= inflater.inflate(R.layout.fragment_about_pc, container, false);
        spis_uch= root.findViewById(R.id.button29);
        spis_uch.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.pc));
return root;
    }
}
