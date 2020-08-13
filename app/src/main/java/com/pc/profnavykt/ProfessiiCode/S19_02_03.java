package com.pc.profnavykt.ProfessiiCode;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.pc.profnavykt.CollegesProfessii.ProfessiiNt;
import com.pc.profnavykt.CollegesProfessii.ProfessiiYtek;
import com.pc.profnavykt.CollegesProfessii.ProfessiiYtts;
import com.pc.profnavykt.MainActivity;
import com.pc.profnavykt.R;

import androidx.fragment.app.Fragment;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link S19_02_03#newInstance} factory method to
 * create an instance of this fragment.
 */
public class S19_02_03 extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public S19_02_03() {
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
    public static S19_02_03 newInstance(String param1, String param2) {
        S19_02_03 fragment = new S19_02_03();
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
    TextView upText;
    TextView kv;
    TextView lvl;
    TextView srok;
    TextView formEd;
    TextView mesto;
    TextView mesto2;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root= inflater.inflate(R.layout.fragment_s19_02_03, container, false);
        upText=root.findViewById(R.id.upText);
        kv=root.findViewById(R.id.textView26);
        lvl=root.findViewById(R.id.textView28);
        srok=root.findViewById(R.id.textView30);
        formEd=root.findViewById(R.id.textView32);
        mesto=root.findViewById(R.id.textView34);
        mesto2=root.findViewById(R.id.textView60);
        switch(MainActivity.item){
            case "ytek":           upText.setText(R.string.s19_02_03);     //Технология хлеба, макаронных и кондитерских изделий
                kv.setText(R.string.kv_text_s19_02_03); //Кассир торгового зала, Продавец
                lvl.setText(R.string.minus);            //-
                srok.setText(R.string.srok_2_10);         //10 мес
                formEd.setText(R.string.soo11);         //Очное, среднее общее образование (на базе 11 кл.)
                mesto.setText(R.string.budjet_m25);            //25
                mesto2.setText(R.string.com_osn_m5);            //5
                break;
            case "ytts":             upText.setText(R.string.s19_02_03);//Технология хлеба, макаронных и кондитерских изделий
                kv.setText(R.string.kv_text_s19_02_03);//Гидрометнаблюдатель
                lvl.setText(R.string.lvl_text);//Базовый
                srok.setText(R.string.srok_2_10);//1 года 10 мес
                formEd.setText(R.string.soo11);//Очное, среднее общее образование (на базе 11 кл.)
                mesto.setText(R.string.m25);//25
                break;
        }
        return root;
    }
}
