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
 * Use the {@link S13_01_10#newInstance} factory method to
 * create an instance of this fragment.
 */
public class S13_01_10 extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public S13_01_10() {
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
    public static S13_01_10 newInstance(String param1, String param2) {
        S13_01_10 fragment = new S13_01_10();
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
        View root =inflater.inflate(R.layout.fragment_s13_01_10, container, false);
        TextView upText=root.findViewById(R.id.upText);
        TextView kv=root.findViewById(R.id.textView26);
        TextView lvl=root.findViewById(R.id.textView28);
        TextView srokO9=root.findViewById(R.id.srok_o9);//
        TextView srokO11=root.findViewById(R.id.srok_o11);
        TextView srokZ9=root.findViewById(R.id.srok_z9);
        TextView srokZ11=root.findViewById(R.id.srok_z11);//
        TextView formEd9=root.findViewById(R.id.textView32);
        TextView formEd11=root.findViewById(R.id.textView13);
        TextView mestoO9=root.findViewById(R.id.mesto_o9);
        TextView mestoO11=root.findViewById(R.id.mesto_o11);
        TextView mestoZ9=root.findViewById(R.id.mesto_z9);
        TextView mestoZ11=root.findViewById(R.id.mesto_z11);
        switch(MainActivity.item){

            case "vml":
                srokO9.setText(R.string.srok_2_10);
                mestoO9.setText(R.string.budjet_m12);
                break;

            case "ltt":
            case "uytk":
                srokO9.setText(R.string.srok_2_10);
                mestoO9.setText(R.string.budjet_m25);
                break;

            case "hok":
                srokO11.setText(R.string.srok_2_10);//2 года 10 мес
                mestoO11.setText(R.string.budjet_m25);
                break;
            case "zt":
                srokO9.setText(R.string.srok_2_10);
                mestoO9.setText(R.string.budjet_m15);
                break;
            case "mrtk":
                srokO9.setText(R.string.srok_2_10);
                mestoO9.setText(R.string.budjet_m100);
                break;
        }
        return root;
    }
}
