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
 * Use the {@link S15_01_05_colleges#newInstance} factory method to
 * create an instance of this fragment.
 */
public class S15_01_05_colleges extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public S15_01_05_colleges() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment S21_01_10_colleges.
     */
    // TODO: Rename and change types and number of parameters
    public static S15_01_05_colleges newInstance(String param1, String param2) {
        S15_01_05_colleges fragment = new S15_01_05_colleges();
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
        View root= inflater.inflate(R.layout.s15_01_05_colleges, container, false);
        Button but1= root.findViewById(R.id.but1);
        but1.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.vml));
        Button but2= root.findViewById(R.id.but2);
        but2.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.namt));
        Button but3= root.findViewById(R.id.but3);
        but3.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.ck));
        Button but4= root.findViewById(R.id.but4);
        but4.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.ypt));
        Button but5= root.findViewById(R.id.but5);
        but5.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.yipk));
        Button but6= root.findViewById(R.id.but6);
        but6.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.apt));
        Button but7= root.findViewById(R.id.but7);
        but7.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.zt));
        Button but8= root.findViewById(R.id.but8);
        but8.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.tt));
        Button but9= root.findViewById(R.id.but9);
        but9.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.zml));
        Button but10= root.findViewById(R.id.but10);
        but10.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.ggt));
        Button but11= root.findViewById(R.id.but11);
        but11.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.mrtk));

        return root;
    }
}
