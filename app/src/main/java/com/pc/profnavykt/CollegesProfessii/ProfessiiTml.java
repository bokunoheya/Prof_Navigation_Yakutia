package com.pc.profnavykt.CollegesProfessii;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.pc.profnavykt.MainActivity;
import com.pc.profnavykt.ProfessiiCode.S05_01_01;
import com.pc.profnavykt.R;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ProfessiiTml#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ProfessiiTml extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    public static final String ARG_PARAM1 = "param2";
    /*private static final String ARG_PARAM2 = "param2";*/
    public static String stroke="tml";
    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ProfessiiTml() {
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
    public static ProfessiiTml newInstance(String param1, String param2) {
        ProfessiiTml fragment = new ProfessiiTml();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        /*args.putString(ARG_PARAM2, param2);*/
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            /*mParam2 = getArguments().getString(ARG_PARAM2);*/
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root= inflater.inflate(R.layout.fragment_professii_tml, container, false);

        Button button1=root.findViewById(R.id.button1);
        button1.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s05_01_01));
        Button button2=root.findViewById(R.id.button2);

        button2.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s09_01_01));
        MainActivity.item=stroke;
        return root;
    }
}
