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
 * Use the {@link ProfessiiYtek#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ProfessiiYtek extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
public static String stroke="ytek";
    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ProfessiiYtek() {
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
    public static ProfessiiYtek newInstance(String param1, String param2) {
        ProfessiiYtek fragment = new ProfessiiYtek();
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
        View root= inflater.inflate(R.layout.fragment_professii_ytek, container, false);
        Button s54_02_01=root.findViewById(R.id.button1);
        s54_02_01.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s19_02_03));
        Button s54_02_02=root.findViewById(R.id.button2);
        s54_02_02.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s38_02_05));
        Button s54_02_04=root.findViewById(R.id.button3);
        s54_02_04.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s43_02_01));
        Button s54_02_05=root.findViewById(R.id.button4);
        s54_02_05.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s43_02_15));
        Button button5=root.findViewById(R.id.button5);
        button5.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s09_02_07));
        Button button6=root.findViewById(R.id.button6);
        button6.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s38_02_01));
        Button s38_02_03=root.findViewById(R.id.button7);
        s38_02_03.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s38_02_03));
        Button s38_02_07=root.findViewById(R.id.button8);
        s38_02_07.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s38_02_07));
        Button s43_01_09=root.findViewById(R.id.button9);
        s43_01_09.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s43_01_09));
        MainActivity.item=stroke;

        return root;
    }
}
