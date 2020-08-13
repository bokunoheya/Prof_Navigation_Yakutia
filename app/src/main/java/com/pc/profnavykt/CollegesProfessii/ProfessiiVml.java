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
 * Use the {@link ProfessiiVml#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ProfessiiVml extends Fragment {
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    public static String stroke="vml";    ////////////////////////////////

    private String mParam1;
    private String mParam2;
    public ProfessiiVml() {

    }
    public static ProfessiiVml newInstance(String param1, String param2) {
        ProfessiiVml fragment = new ProfessiiVml();
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
        View root= inflater.inflate(R.layout.fragment_professii_vml, container, false);
        Button button1=root.findViewById(R.id.button1);
        button1.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s13_01_10));
        Button button2=root.findViewById(R.id.button2);
        button2.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s15_01_05));

        MainActivity.item=stroke;     ////////////////////////////////

        return root;
    }
}
