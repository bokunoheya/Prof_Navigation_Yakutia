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
        Button  button18= root.findViewById(R.id.button18)       ;
        button18.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.ytts));
        Button  button19= root.findViewById(R.id.button19)       ;
        button19.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.ykst));
        Button  button20= root.findViewById(R.id.button20)       ;
        button20.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.yktd));
        Button  button21= root.findViewById(R.id.button21)       ;
        button21.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.yipk));
        Button  button22= root.findViewById(R.id.button22)       ;
        button22.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.ck));
        Button  button23= root.findViewById(R.id.button23)       ;
        button23.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.fek));
        Button  button24= root.findViewById(R.id.button24)       ;
        button24.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.tt));
        Button  button25= root.findViewById(R.id.button25)       ;
        button25.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.tml));
        Button  button26= root.findViewById(R.id.button26)       ;
        button26.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.stk));
        Button  button27= root.findViewById(R.id.button27)       ;
        button27.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.sit));
        Button  button28= root.findViewById(R.id.button28)       ;
        button28.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.sml));
        Button  button29= root.findViewById(R.id.button29)       ;
        button29.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.pc));
        Button  button30= root.findViewById(R.id.button30)       ;
        button30.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.ot));
        Button  button31= root.findViewById(R.id.button31)       ;
        button31.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.nt));
        Button  button32= root.findViewById(R.id.button32)       ;
        button32.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.namt));
        Button  button33= root.findViewById(R.id.button33)       ;
        button33.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.ltt));
        Button  button34= root.findViewById(R.id.button34)       ;
        button34.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.zml));
        Button  button35= root.findViewById(R.id.button35)       ;
        button35.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.zt));
        Button  button36= root.findViewById(R.id.button36)       ;
        button36.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.ggt));
        Button  button38= root.findViewById(R.id.button38)       ;
        button38.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.vt));
        Button  button39= root.findViewById(R.id.button39)       ;
        button39.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.vml));
        Button  button40= root.findViewById(R.id.button40)       ;
        button40.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.nmk));
        Button  button41= root.findViewById(R.id.button41)       ;
        button41.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.npk));
        Button  button42= root.findViewById(R.id.button42)       ;
        button42.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.rti));
        Button  button43= root.findViewById(R.id.button43)       ;
        button43.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.uat));
        Button  button44= root.findViewById(R.id.button44)       ;
        button44.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.uytk));
        Button  button45= root.findViewById(R.id.button45)       ;
        button45.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.yat));
        Button  button46= root.findViewById(R.id.button46)       ;
        button46.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.ykse));
        Button  button48= root.findViewById(R.id.button48)       ;
        button48.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.ypt));
        Button  button49= root.findViewById(R.id.button49)       ;
        button49.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.ysht));
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
