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
 * Use the {@link ProfessiiStk#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ProfessiiStk extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

    public static String stroke="stk";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ProfessiiStk() {
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
    public static ProfessiiStk newInstance(String param1, String param2) {
        ProfessiiStk fragment = new ProfessiiStk();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root= inflater.inflate(R.layout.fragment_professii_stk, container, false);
        Button button1=root.findViewById(R.id.button1);
        button1.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s23_02_04));
        Button button2=root.findViewById(R.id.button2);
        button2.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s15_01_20));
        Button button3=root.findViewById(R.id.button3);
        button3.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s21_01_08));
        Button button4=root.findViewById(R.id.button4);
        button4.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.s43_01_09));
        MainActivity.item=stroke;
        return root;
    }
}
