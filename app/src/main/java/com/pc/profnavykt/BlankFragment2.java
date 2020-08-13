package com.pc.profnavykt;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;

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
        but16.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s15_01_05_colleges));
      /*  Button but17= root.findViewById(R.id.but17) ;
        but17.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s21_01_13_colleges));*/
        Button but18= root.findViewById(R.id.but18) ;
        but18.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s21_01_16_colleges));
        Button but19= root.findViewById(R.id.but19) ;
        but19.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s20_01_01_colleges));
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
    /*    Button but26= root.findViewById(R.id.but26) ;
        but26.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s44_02_05_colleges));*/
        Button but27= root.findViewById(R.id.but27) ;
        but27.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s49_02_01_colleges));
        Button but28= root.findViewById(R.id.but28) ;
        but28.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s19_02_03_colleges));
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
        Button but38= root.findViewById(R.id.but38) ;
        but38.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s13_02_11_colleges));
       /* Button but39= root.findViewById(R.id.but39) ;
        but39.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s13_01_10_colleges));*///out but39
/*        Button but40= root.findViewById(R.id.but40) ;
        but40.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s13_02_03_colleges));*/
        Button but41= root.findViewById(R.id.but41) ;
        but41.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s13_01_04_colleges));
        Button but42= root.findViewById(R.id.but42) ;
        but42.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s13_02_02_colleges));
        Button but43= root.findViewById(R.id.but43) ;
        but43.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s13_02_07_colleges));
/*        Button but44= root.findViewById(R.id.but44) ;
        but44.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s15_01_05_colleges));*/
        Button but45= root.findViewById(R.id.but45) ;
        but45.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s15_01_25_colleges));
/*        Button but46= root.findViewById(R.id.but46) ;
        but46.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s15_02_07_colleges));*/
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
/*        Button but52= root.findViewById(R.id.but52) ;
        but52.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s15_01_30_colleges));*/ //no data
        Button but53= root.findViewById(R.id.but53) ;
        but53.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s15_01_36_colleges));
   /*     Button but54= root.findViewById(R.id.but54) ;
        but54.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s18_01_05_colleges));*/
        Button but55= root.findViewById(R.id.but55) ;
        but55.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s18_01_27_colleges));
        Button but56= root.findViewById(R.id.but56) ;
        but56.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s18_01_29_colleges));
        Button but57= root.findViewById(R.id.but57) ;
        but57.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s18_01_33_colleges));
        Button but58= root.findViewById(R.id.but58) ;
        but58.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s15_02_07_colleges));
        Button but59= root.findViewById(R.id.but59) ;
        but59.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s35_02_05_colleges));
        Button but60= root.findViewById(R.id.but60) ;
        but60.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s38_02_07_colleges));
        Button but61= root.findViewById(R.id.but61) ;
        but61.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s51_02_03_colleges));
        Button but62= root.findViewById(R.id.but62) ;
        but62.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s36_02_01_colleges));
        Button but63= root.findViewById(R.id.but63) ;
        but63.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s53_02_04_colleges));
        Button but64= root.findViewById(R.id.but64) ;
        but64.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s21_02_13_colleges));
        Button but65= root.findViewById(R.id.but65) ;
        but65.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s05_01_01_colleges));
        Button but66= root.findViewById(R.id.but66) ;
        but66.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s54_01_20_colleges));
        Button but67= root.findViewById(R.id.but67) ;
        but67.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s54_02_02_colleges));
        Button but68= root.findViewById(R.id.but68) ;
        but68.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s54_02_01_colleges));
        Button but69= root.findViewById(R.id.but69) ;
        but69.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s23_01_02_colleges));
        Button but70= root.findViewById(R.id.but70) ;
        but70.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s54_02_05_colleges));
        Button but71= root.findViewById(R.id.but71) ;
        but71.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s20_02_02_colleges));
        Button but72= root.findViewById(R.id.but72) ;
        but72.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s21_02_05_colleges));
        Button but73= root.findViewById(R.id.but73) ;
        but73.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s21_02_04_colleges));
        Button but74= root.findViewById(R.id.but74) ;
        but74.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s36_02_02_colleges));
        Button but75= root.findViewById(R.id.but75) ;
        but75.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s53_02_03_colleges));
        Button but76= root.findViewById(R.id.but76) ;
        but76.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s11_02_15_colleges));
        Button but77= root.findViewById(R.id.but77) ;
        but77.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s09_02_07_colleges));
        Button but78= root.findViewById(R.id.but78) ;
        but78.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s52_02_01_colleges));
        Button but79= root.findViewById(R.id.but79) ;
        but79.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s38_02_04_colleges));
        Button but80= root.findViewById(R.id.but80) ;
        but80.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s29_02_04_colleges));
        Button but81= root.findViewById(R.id.but81) ;
        but81.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s29_02_03_colleges));
        Button but82= root.findViewById(R.id.but82) ;
        but82.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s31_02_03_colleges));
        Button but83= root.findViewById(R.id.but83) ;
        but83.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s35_02_01_colleges));
        Button but84= root.findViewById(R.id.but84) ;
        but84.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s21_02_14_colleges));
        Button but85= root.findViewById(R.id.but85) ;
        but85.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s08_01_10_colleges));
        Button but86= root.findViewById(R.id.but86) ;
        but86.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s08_01_07_colleges));
        Button but87= root.findViewById(R.id.but87) ;
        but87.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s08_01_25_colleges));
        Button but88= root.findViewById(R.id.but88) ;
        but88.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s08_01_26_colleges));
        Button but89= root.findViewById(R.id.but89) ;
        but89.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s35_01_14_colleges));
        Button but90= root.findViewById(R.id.but90) ;
        but90.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s19_01_10_colleges));
        Button but91= root.findViewById(R.id.but91) ;
        but91.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s08_01_06_colleges));
        Button but92= root.findViewById(R.id.but92) ;
        but92.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s23_01_06_colleges));
        Button but93= root.findViewById(R.id.but93) ;
        but93.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s23_01_07_colleges));
        Button but94= root.findViewById(R.id.but94) ;
        but94.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s34_02_02_colleges));
        Button but95= root.findViewById(R.id.but95) ;
        but95.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s08_02_08_colleges));
        Button but96= root.findViewById(R.id.but96) ;
        but96.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s08_01_14_colleges));
        Button but97= root.findViewById(R.id.but97) ;
        but97.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s08_01_02_colleges));
        Button but98= root.findViewById(R.id.but98) ;
        but98.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s09_01_01_colleges));
        Button but99= root.findViewById(R.id.but99) ;
        but99.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s09_01_02_colleges));
        Button but100= root.findViewById(R.id.but100) ;
        but100.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s51_02_01_colleges));
        Button but101= root.findViewById(R.id.but101) ;
        but101.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s10_02_05_colleges));
        Button but102= root.findViewById(R.id.but102) ;
        but102.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s21_02_18_colleges));
        Button but103= root.findViewById(R.id.but103) ;
        but103.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s29_01_28_colleges));
     /*   Button but104= root.findViewById(R.id.but104) ;
        but104.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s18_01_28_colleges));
        Button but105= root.findViewById(R.id.but105) ;
        but105.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s21_01_01_colleges));*///no datd
        Button but106= root.findViewById(R.id.but106) ;
        but106.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s23_01_01_colleges));
        Button but107= root.findViewById(R.id.but107) ;
        but107.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s38_02_03_colleges));
        Button but108= root.findViewById(R.id.but108) ;
        but108.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s10_02_01_colleges));
        Button but109= root.findViewById(R.id.but109) ;
        but109.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s23_02_01_colleges));
        Button but110= root.findViewById(R.id.but110) ;
        but110.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s35_02_14_colleges));
        Button but111= root.findViewById(R.id.but111) ;
        but111.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s21_02_17_colleges));
        Button but112= root.findViewById(R.id.but112) ;
        but112.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s20_02_04_colleges));
        Button but113= root.findViewById(R.id.but113) ;
        but113.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s38_01_02_colleges));
        Button but114= root.findViewById(R.id.but114) ;
        but114.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s11_02_10_colleges));
        Button but115= root.findViewById(R.id.but115) ;
        but115.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s21_02_01_colleges));
        Button but116= root.findViewById(R.id.but116) ;
        but116.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s54_02_04_colleges));
        Button but117= root.findViewById(R.id.but117) ;
        but117.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s22_02_06_colleges));
        Button but118= root.findViewById(R.id.but118) ;
        but118.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s09_02_06_colleges));
        Button but119= root.findViewById(R.id.but119) ;
        but119.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s23_01_08_colleges));
        Button but120= root.findViewById(R.id.but120) ;
        but120.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s08_01_09_colleges));
        Button but121= root.findViewById(R.id.but121) ;
        but121.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s53_02_05_colleges));
        Button but122= root.findViewById(R.id.but122) ;
        but122.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s21_02_03_colleges));
        Button but123= root.findViewById(R.id.but123) ;
        but123.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s39_02_01_colleges));
        Button but124= root.findViewById(R.id.but124) ;
        but124.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s51_02_02_colleges));
        Button but125= root.findViewById(R.id.but125) ;
        but125.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s08_02_05_colleges));
        Button but126= root.findViewById(R.id.but126) ;
        but126.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s08_02_10_colleges));
   /*     Button but127= root.findViewById(R.id.but127) ;
        but127.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s08_02_06_colleges));*///no datd
        Button but128= root.findViewById(R.id.but128) ;
        but128.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s08_02_01_colleges));
        Button but129= root.findViewById(R.id.but129) ;
        but129.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s26_02_03_colleges));
        Button but130= root.findViewById(R.id.but130) ;
        but130.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s26_02_02_colleges));
        Button but131= root.findViewById(R.id.but131) ;
        but131.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s26_01_01_colleges));
        Button but132= root.findViewById(R.id.but132) ;
        but132.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s55_02_01_colleges));
        Button but133= root.findViewById(R.id.but133) ;
        but133.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s53_02_07_colleges));
        Button but134= root.findViewById(R.id.but134) ;
        but134.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s23_02_06_colleges));
        Button but135= root.findViewById(R.id.but135) ;
        but135.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s23_02_04_colleges));
        Button but136= root.findViewById(R.id.but136) ;
        but136.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s23_02_07_colleges));
        Button but137= root.findViewById(R.id.but137) ;
        but137.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s11_02_02_colleges));
        Button but138= root.findViewById(R.id.but138) ;
        but138.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s19_02_07_colleges));
        Button but139= root.findViewById(R.id.but139) ;
        but139.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s35_02_06_colleges));
        Button but140= root.findViewById(R.id.but140) ;
        but140.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s35_01_13_colleges));
        Button but141= root.findViewById(R.id.but141) ;
        but141.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s27_02_07_colleges));
        Button but142= root.findViewById(R.id.but142) ;
        but142.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s38_02_06_colleges));
        Button but143= root.findViewById(R.id.but143) ;
        but143.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s53_02_06_colleges));
        Button but144= root.findViewById(R.id.but144) ;
        but144.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s38_02_01_colleges));
        Button but145= root.findViewById(R.id.but145) ;
        but145.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s26_02_01_colleges));
        Button but146= root.findViewById(R.id.but146) ;
        but146.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s35_02_16_colleges));
        Button but147= root.findViewById(R.id.but147) ;
        but147.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s26_02_06_colleges));//but148 пропущен
   /*     Button but149= root.findViewById(R.id.but149) ;
        but149.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s26_02_05_colleges));*/
        Button but150= root.findViewById(R.id.but150) ;
        but150.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s08_01_18_colleges));
        Button but151= root.findViewById(R.id.but151) ;
        but151.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s13_01_10_colleges));
        Button but152= root.findViewById(R.id.but152) ;
        but152.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s35_01_15_colleges));
        Button but153= root.findViewById(R.id.but153) ;
        but153.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s13_01_07_colleges));
        Button but154= root.findViewById(R.id.but154) ;
        but154.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s13_01_05_colleges));
        Button but155= root.findViewById(R.id.but155) ;
        but155.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s13_01_03_colleges));

        final ScrollView scrollView=root.findViewById(R.id.scroll);
        scrollView.post(new Runnable() {
            @Override
            public void run() {
                scrollView.scrollTo(0, scrollView.getScrollY());
            }
        });
        return root;
    }
}
