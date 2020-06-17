package com.pc.profnavykt;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link S05_01_01#newInstance} factory method to
 * create an instance of this fragment.
 */
public class S05_01_01 extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public S05_01_01() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment S13_02_03.
     */
    // TODO: Rename and change types and number of parameters
    public static S05_01_01 newInstance(String param1, String param2) {
        S05_01_01 fragment = new S05_01_01();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }
TextView upText;
TextView kv;
TextView lvl;
TextView srok;
TextView formEd;
TextView mesto;
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
        View root= inflater.inflate(R.layout.fragment_s05_01_01, container, false);
        upText=root.findViewById(R.id.textView24);
        kv=root.findViewById(R.id.textView26);
        lvl=root.findViewById(R.id.textView28);
        srok=root.findViewById(R.id.textView30);
        formEd=root.findViewById(R.id.textView32);
        mesto=root.findViewById(R.id.textView34);
if(ProfessiiNt.activity==1){
    upText.setText(R.string.s38_01_02);
    kv.setText(R.string.kv_text_s38_01_02);
    lvl.setText(R.string.minus);
    srok.setText(R.string.srok_10);
    formEd.setText(R.string.soo11);
    mesto.setText(R.string.m25);
    ProfessiiNt.activity=0;
}


return root;
    }
}
