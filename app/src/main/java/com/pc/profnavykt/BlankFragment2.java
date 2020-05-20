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
 * Use the {@link BlankFragment2#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BlankFragment2 extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public BlankFragment2() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment BlankFragment2.
     */
    // TODO: Rename and change types and number of parameters
    public static BlankFragment2 newInstance(String param1, String param2) {
        BlankFragment2 fragment = new BlankFragment2();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root= inflater.inflate(R.layout.fragment_blank2, container, false);
        Button but1= root.findViewById(R.id.but1) ;
        but1.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s19_01_04_colleges));
        Button but2= root.findViewById(R.id.but2) ;
        but2.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s21_01_10_colleges));
        Button but3= root.findViewById(R.id.but3) ;
        but3.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s21_01_08_colleges));
        Button but4= root.findViewById(R.id.but4) ;
        but4.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s13_02_03_colleges));
        Button but5= root.findViewById(R.id.but5) ;
        but5.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s23_01_17_colleges));
        Button but6= root.findViewById(R.id.but6) ;
        but6.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s21_02_15_colleges));
        Button but7= root.findViewById(R.id.but7) ;
        but7.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s35_01_01_colleges));
        Button but8= root.findViewById(R.id.but8) ;
        but8.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s13_01_07_colleges));
        Button but9= root.findViewById(R.id.but9) ;
        but9.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s35_01_21_colleges));
        Button but10= root.findViewById(R.id.but10) ;
        but10.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s53_02_01_colleges));
        Button but11= root.findViewById(R.id.but11) ;
        but11.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s44_02_04_colleges));
        Button but12= root.findViewById(R.id.but12) ;
        but12.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s44_02_05_colleges));
        Button but13= root.findViewById(R.id.but13) ;
        but13.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s31_02_01_colleges));
        Button but14= root.findViewById(R.id.but14) ;
        but14.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s31_02_02_colleges));
        Button but15= root.findViewById(R.id.but15) ;
        but15.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s34_02_01_colleges));
        return root;
    }
}
