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
        Button but16= root.findViewById(R.id.but16) ;
/*        but16.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s15_01_05_colleges));
        Button but17= root.findViewById(R.id.but17) ;
        but17.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s21_01_13_colleges));
        Button but18= root.findViewById(R.id.but18) ;
        but18.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s21_01_16_colleges));
        Button but19= root.findViewById(R.id.but19) ;
        but19.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s20_01_01_colleges));*/
        Button but20= root.findViewById(R.id.but20) ;
        but20.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s54_02_06_colleges));
        Button but21= root.findViewById(R.id.but21) ;
        but21.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s44_02_06_colleges));
        Button but22= root.findViewById(R.id.but22) ;
        but22.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s44_02_03_colleges));
        Button but23= root.findViewById(R.id.but23) ;
        but23.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s44_02_01_colleges));
        Button but24= root.findViewById(R.id.but24) ;
        but24.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s44_02_02_colleges));
        Button but25= root.findViewById(R.id.but25) ;
        but25.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s49_02_02_colleges));
        Button but26= root.findViewById(R.id.but26) ;
        but26.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s44_02_05_colleges));
        Button but27= root.findViewById(R.id.but27) ;
        but27.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s49_02_01_colleges));
      /*  Button but28= root.findViewById(R.id.but28) ;
        but28.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s19_02_03_colleges));*/
        Button but29= root.findViewById(R.id.but29) ;
        but29.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s38_02_05_colleges));
        Button but30= root.findViewById(R.id.but30) ;
        but30.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s43_02_01_colleges));
        Button but31= root.findViewById(R.id.but31) ;
        but31.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s43_01_09_colleges));
        Button but32= root.findViewById(R.id.but32) ;
        but32.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s43_01_07_colleges));
        Button but33= root.findViewById(R.id.but33) ;
        but33.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s43_02_13_colleges));
        Button but34= root.findViewById(R.id.but34) ;
        but34.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s43_02_15_colleges));
        Button but35= root.findViewById(R.id.but35) ;
        but35.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s43_02_14_colleges));
        Button but36= root.findViewById(R.id.but36) ;
        but36.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s43_02_10_colleges));
        Button but37= root.findViewById(R.id.but37) ;
        but37.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s43_01_02_colleges));
/*        Button but38= root.findViewById(R.id.but38) ;
        but38.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s13_02_11_colleges));//
        Button but39= root.findViewById(R.id.but39) ;
        but39.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s13_01_10_colleges));*/
        Button but40= root.findViewById(R.id.but40) ;
        but40.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s13_02_03_colleges));
/*      Button but41= root.findViewById(R.id.but41) ;
        but41.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s13_01_04_colleges));
        Button but42= root.findViewById(R.id.but42) ;
        but42.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s13_02_02_colleges));
        Button but43= root.findViewById(R.id.but43) ;
        but43.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s13_02_07_colleges));
        Button but44= root.findViewById(R.id.but44) ;
        but44.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s15_01_05_colleges));
        Button but45= root.findViewById(R.id.but45) ;
        but45.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s15_01_25_colleges));
        Button but46= root.findViewById(R.id.but46) ;
        but46.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s15_02_07_colleges));
        Button but47= root.findViewById(R.id.but47) ;
        but47.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s15_01_13_colleges));
        Button but48= root.findViewById(R.id.but48) ;
        but48.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s15_01_20_colleges));
        Button but49= root.findViewById(R.id.but49) ;
        but49.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s15_01_19_colleges));
        Button but50= root.findViewById(R.id.but50) ;
        but50.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s15_02_14_colleges));
        Button but51= root.findViewById(R.id.but51) ;
        but51.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s15_01_26_colleges));
        Button but52= root.findViewById(R.id.but52) ;
        but52.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s15_01_30_colleges));
        Button but53= root.findViewById(R.id.but53) ;
        but53.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s15_01_36_colleges));*/
        return root;
    }
}
