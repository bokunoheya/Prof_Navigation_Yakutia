package com.pc.profnavykt.CollegesProfessii;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.pc.profnavykt.MainActivity;
import com.pc.profnavykt.R;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ProfessiiUytk#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ProfessiiUytk extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    public static String stroke="uytk";
    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ProfessiiUytk() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ProfessiiApt.
     */
    // TODO: Rename and change types and number of parameters
    public static ProfessiiUytk newInstance(String param1, String param2) {
        ProfessiiUytk fragment = new ProfessiiUytk();
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
        View root= inflater.inflate(R.layout.fragment_professii_uytk, container, false);
        Button button1=root.findViewById(R.id.button1);
        button1.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s09_02_07));
        Button button2=root.findViewById(R.id.button2);
        button2.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s10_02_05));
        Button button3=root.findViewById(R.id.button3);
        button3.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s13_02_11));
        Button button4=root.findViewById(R.id.button4);
        button4.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s13_01_10));
        Button button5=root.findViewById(R.id.button5);
        button5.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s15_01_19));
        Button button6=root.findViewById(R.id.button6);
        button6.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s15_02_14));
        Button button7=root.findViewById(R.id.button7);
        button7.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s21_01_10));
        Button button8=root.findViewById(R.id.button8);
        button8.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s21_02_18));
        Button button9=root.findViewById(R.id.button9);
        button9.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s21_02_15));
        Button button10=root.findViewById(R.id.button10);
        button10.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s21_02_17));
        Button button11=root.findViewById(R.id.button11);
        button11.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s23_01_17));
        Button button12=root.findViewById(R.id.button12);
        button12.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s23_02_07));
        Button button13=root.findViewById(R.id.button13);
        button13.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s21_01_16));
        Button button14=root.findViewById(R.id.button14);
        button14.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s27_02_07));
        Button button15=root.findViewById(R.id.button15);
        button15.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s23_02_01));

        MainActivity.item=stroke;
        return root;
    }
}
