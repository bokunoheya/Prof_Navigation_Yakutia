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
 * Use the {@link ProfessiiNt#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ProfessiiNt extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ProfessiiNt() {
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
    public static ProfessiiNt newInstance(String param1, String param2) {
        ProfessiiNt fragment = new ProfessiiNt();
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
        View root= inflater.inflate(R.layout.fragment_professii_nt, container, false);
        Button button1=root.findViewById(R.id.button1);
        button1.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s15_01_05));
        Button button2=root.findViewById(R.id.button2);
        button2.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s08_01_07));
        Button button3=root.findViewById(R.id.button3);
        button3.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s43_01_09));
        Button button4=root.findViewById(R.id.button4);
        button4.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s23_01_17));

        return root;
    }
}