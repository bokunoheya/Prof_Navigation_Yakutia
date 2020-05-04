package com.pc.profnavykt;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.pc.profnavykt.ui.slideshow.SlideshowFragment;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.Navigation;

/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment6 extends Fragment {

    public BlankFragment6() {
        // Required empty public constructor
    }
    Button next;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root=inflater.inflate(R.layout.fragment_blank6, container, false);

        next=root.findViewById(R.id.blinknav);
        next.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.blankFragment2));
        return root;
    }

}
