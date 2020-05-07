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
 * Use the {@link ProfessiiVpk#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ProfessiiVpk extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ProfessiiVpk() {
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
    public static ProfessiiVpk newInstance(String param1, String param2) {
        ProfessiiVpk fragment = new ProfessiiVpk();
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
        View root= inflater.inflate(R.layout.fragment_professii_vpk, container, false);
        Button s44_02_01=root.findViewById(R.id.button1);
        s44_02_01.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s44_02_01));
        Button s44_02_02=root.findViewById(R.id.button2);
        s44_02_02.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s44_02_02));
        Button s44_02_03=root.findViewById(R.id.button3);
        s44_02_03.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s44_02_03));
        Button s44_02_04=root.findViewById(R.id.button4);
        s44_02_04.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s44_02_04));
        Button s44_02_05=root.findViewById(R.id.button5);
        s44_02_05.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s44_02_05));
        Button s49_02_02=root.findViewById(R.id.button6);
        s49_02_02.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s49_02_02));
        return root;
    }
}
