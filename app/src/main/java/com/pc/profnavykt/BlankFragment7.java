package com.pc.profnavykt;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment7 extends Fragment {

    public BlankFragment7() {
        // Required empty public constructor
    }
    Button next;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root=inflater.inflate(R.layout.fragment_blank7, container, false);

        next=root.findViewById(R.id.blinknav);
        next.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.nav_slideshow));
        return root;
    }

}
