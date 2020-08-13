package com.pc.profnavykt.ProfessiiCode;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.pc.profnavykt.MainActivity;
import com.pc.profnavykt.R;

import androidx.fragment.app.Fragment;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link S43_01_09#newInstance} factory method to
 * create an instance of this fragment.
 */
public class S43_01_09 extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public S43_01_09() {
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
    public static S43_01_09 newInstance(String param1, String param2) {
        S43_01_09 fragment = new S43_01_09();
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
        View root =inflater.inflate(R.layout.fragment_s43_01_09, container, false);
        TextView upText=root.findViewById(R.id.upText);
        TextView kv=root.findViewById(R.id.textView26);
        TextView lvl=root.findViewById(R.id.textView28);
        TextView srok9=root.findViewById(R.id.textView30);
        TextView srok11=root.findViewById(R.id.textView16);
        TextView formEd9=root.findViewById(R.id.textView32);
        TextView formEd11=root.findViewById(R.id.textView13);
        TextView mesto9b=root.findViewById(R.id.textView14);
        TextView mesto9c=root.findViewById(R.id.textView17);
        TextView mesto11=root.findViewById(R.id.textView15);
        switch(MainActivity.item){

            case "ytek":
                lvl.setText(R.string.minus);
                srok11.setText(R.string.srok_1_10);
                mesto11.setText(R.string.com_osn_m15);
                break;

            case "mrtk":
            case "ytts":
            case "zt":
            case "namt":
            case "stk":
            case "uat":
                lvl.setText(R.string.minus);
                srok11.setText(R.string.minus);
                mesto11.setText(R.string.minus);
                /*----------------------------*/
                srok9.setText(R.string.srok_3_10);
                mesto9b.setText(R.string.budjet_m25);
                break;

        }
        return root;
    }
}
