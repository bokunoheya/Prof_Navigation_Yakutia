package com.pc.profnavykt.ui.slideshow;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.pc.profnavykt.R;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import androidx.navigation.Navigation;

public class SlideshowFragment extends Fragment {
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button button10;
    Button button11;
    Button button12;
    Button button13;



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_slideshow, container, false);
        button1= root.findViewById(R.id.button1)       ;
        button1.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.apt));
        button2= root.findViewById(R.id.button2)       ;
        button2.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.mrtk));
        button3= root.findViewById(R.id.button3)       ;
        button3.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.akns));
        button4= root.findViewById(R.id.button4)       ;
        button4.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.amk));
        button5= root.findViewById(R.id.button5)       ;
        button5.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.vvt));
        button6= root.findViewById(R.id.button6)       ;
        button6.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.ytek));
        button7= root.findViewById(R.id.button7)       ;
        button7.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.ykit));
        button8= root.findViewById(R.id.button8)       ;
        button8.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.ygk));
        button9= root.findViewById(R.id.button9)       ;
        button9.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.ruor));
        button10= root.findViewById(R.id.button10)       ;
        button10.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.yki));
        button11= root.findViewById(R.id.button11)       ;
        button11.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.yhdu));
        button12= root.findViewById(R.id.button12)       ;
        button12.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.ymk));
        button13= root.findViewById(R.id.button13)       ;
        button13.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.ybs));
        Button  button14= root.findViewById(R.id.button14)       ;
        button14.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.hok));
        Button  button15= root.findViewById(R.id.button15)       ;
        button15.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.npk));
        Button  button16= root.findViewById(R.id.button16)       ;
        button16.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.vpk));
        Button  button17= root.findViewById(R.id.button17)       ;
        button17.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.ypk));
       // Toolbar toolbar = root.findViewById(R.id.toolbar);
        /*toolbar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#03DAC5")));*/
     //   toolbar = ((MainActivity)getActivity()).getSupportActionBar(toolbar);
/*
        Button button = root.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(getContext(), ListColleges.class);
                startActivity(intent);
            }
        });
*/

        return root;

    }

}
