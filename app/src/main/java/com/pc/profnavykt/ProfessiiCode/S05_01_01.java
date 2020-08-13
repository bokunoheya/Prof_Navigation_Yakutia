package com.pc.profnavykt.ProfessiiCode;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.pc.profnavykt.CollegesProfessii.ProfessiiNt;
import com.pc.profnavykt.CollegesProfessii.ProfessiiTml;
import com.pc.profnavykt.MainActivity;
import com.pc.profnavykt.R;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link S05_01_01#newInstance} factory method to
 * create an instance of this fragment.
 */
public class S05_01_01 extends Fragment {
    public static Toolbar tts;
    public static int t=50;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
   Toolbar ta=tts;

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

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root= inflater.inflate(R.layout.fragment_s05_01_01, container, false);
        upText=root.findViewById(R.id.upText);
        kv=root.findViewById(R.id.textView26);
        lvl=root.findViewById(R.id.textView28);
        srok=root.findViewById(R.id.textView30);
        formEd=root.findViewById(R.id.textView32);
        mesto=root.findViewById(R.id.textView34);
/*if(ProfessiiNt.stroke==0){
    upText.setText(R.string.s38_01_02);     //"Продавец, контролер-кассир"
    kv.setText(R.string.kv_text_s38_01_02); //Кассир торгового зала, Продавец
    lvl.setText(R.string.minus);            //-
    srok.setText(R.string.srok_10);         //10 мес
    formEd.setText(R.string.soo11);         //Очное, среднее общее образование (на базе 11 кл.)
    mesto.setText(R.string.m25);            //25
    ProfessiiNt.stroke=1;

}*/
        switch(MainActivity.item){
            case "nt":

                tts.setTitle(R.string.s38_01_02); // наследование Toolbar из Mainactivity, установка нового Title
                upText.setText(R.string.s38_01_02);     //"Продавец, контролер-кассир"
                kv.setText(R.string.kv_text_s38_01_02); //Кассир торгового зала, Продавец
                lvl.setText(R.string.minus);            //-
                srok.setText(R.string.srok_10);         //10 мес
                formEd.setText(R.string.soo11);         //Очное, среднее общее образование (на базе 11 кл.)
                mesto.setText(R.string.m25);
                break;
            case "tml":
                upText.setText(R.string.s05_01_01);//Гидрометнаблюдатель
                kv.setText(R.string.kv_text_s05_01_01);//Гидрометнаблюдатель
                lvl.setText(R.string.minus);//-
                srok.setText(R.string.srok_1_10);//1 года 10 мес
                formEd.setText(R.string.soo11);//Очное, среднее общее образование (на базе 11 кл.)
                mesto.setText(R.string.m25);//25
                break;
        }
/*        switch(ProfessiiTml.stroke){
    case 0:     upText.setText(R.string.s05_01_01);//Гидрометнаблюдатель
        kv.setText(R.string.kv_text_s05_01_01);//Гидрометнаблюдатель
        lvl.setText(R.string.minus);//-
        srok.setText(R.string.srok_1_10);//1 года 10 мес
        formEd.setText(R.string.soo11);//Очное, среднее общее образование (на базе 11 кл.)
        mesto.setText(R.string.m25);//25
        ProfessiiTml.stroke=1;
        break;
        }*/

return root;
    }
}
