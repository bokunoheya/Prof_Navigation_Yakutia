package com.pc.profnavykt.ProfessiiList;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.pc.profnavykt.R;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link S21_01_08_colleges#newInstance} factory method to
 * create an instance of this fragment.
 */
public class S21_01_08_colleges extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public S21_01_08_colleges() {
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
    public static S21_01_08_colleges newInstance(String param1, String param2) {
        S21_01_08_colleges fragment = new S21_01_08_colleges();
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
        View root= inflater.inflate(R.layout.s21_01_08_colleges, container, false);
        Button but1= root.findViewById(R.id.but1);
        Button but2= root.findViewById(R.id.but2);
        Button but3= root.findViewById(R.id.but3);
        Button but4= root.findViewById(R.id.but4);
        Button but5= root.findViewById(R.id.but5);
        but1.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.hok));
        but2.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.apt));
        but3.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.ggt));
        but4.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.nt));
        but5.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.stk));
        return root;
    }
}
