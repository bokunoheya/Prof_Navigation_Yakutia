package com.pc.profnavykt.ui.home;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProviders;
import androidx.navigation.Navigation;

import com.pc.profnavykt.BaseBackPressedListener;
import com.pc.profnavykt.MainActivity;
import com.pc.profnavykt.R;

public class HomeFragment extends Fragment {
Button test;
Button profile;
Button spis_uch;
Button professii;
    Button next;
//Button specialnosti;
    int count=0;
    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        FragmentActivity activity = getActivity();                                                // Отмена перехода назад
        ((MainActivity)activity).setOnBackPressedListener(new BaseBackPressedListener(activity)); //

        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        final View root = inflater.inflate(R.layout.fragment_home, container, false);
        test= root.findViewById(R.id.button2);
        profile= root.findViewById(R.id.profile);
        spis_uch= root.findViewById(R.id.spis_uch);
        professii= root.findViewById(R.id.professii);
        //specialnosti= root.findViewById(R.id.specialnosti);
       // test.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.nav_slideshow));
        profile.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.nav_gallery));
       // spis_uch.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.blankFragment5));
      //  professii.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.blankFragment6));
      //  specialnosti.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.specialnosti2));

/*        spis_uch.setOnClickListener(new View.OnClickListener() { Старый код с переходом на активити 1
            public void onClick(View v) {
                Intent intent=new Intent(getContext(), ListColleges.class);
                startActivity(intent);
            }
        });*/
/*        spis_uch.setOnClickListener(new View.OnClickListener() { Старый код с переходом на активити 2
            public void onClick(View v) {
                Intent intent=new Intent(getContext(), BlinkActivityProfessii.class);
                startActivity(intent);
            }
        });*/
/*Список учреждений{*/
        final SharedPreferences preferences = this.getActivity().getSharedPreferences("pref", Context.MODE_PRIVATE);
        if (preferences.getBoolean("is_start_3", false) != true) { // получить true/false по ключу 'is_start' (если null, то false)
              // прикрепляем лаяут для первого запуска 'main_first_start'
            //    Toast.makeText(this, "Text saved", Toast.LENGTH_SHORT).show();

            spis_uch.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    spis_uch.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.blankFragment5));
                    preferences.edit().putBoolean("is_start_3", true).commit();
                }
            });
        }else{
            spis_uch.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.nav_slideshow));
        }
/*}*/
/*Список профессий{*/
        final SharedPreferences preferences2 = this.getActivity().getSharedPreferences("pref2", Context.MODE_PRIVATE);
        if (preferences2.getBoolean("is_start_4", false) != true) { // получить true/false по ключу 'is_start' (если null, то false)
            professii.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    professii.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.blankFragment6));
                    preferences2.edit().putBoolean("is_start_4", true).commit();
                }
            });
        }else{
            professii.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.blankFragment2));
        }
/*}*/
/*Тест{*/
        final SharedPreferences preferences3 = this.getActivity().getSharedPreferences("pref3", Context.MODE_PRIVATE);
        if (preferences3.getBoolean("is_start_5", false) != true) { // получить true/false по ключу 'is_start' (если null, то false)
            test.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    test.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.blankFragment7));
                    preferences3.edit().putBoolean("is_start_5", true).commit();
                }
            });
        }else{
            test.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.nav_slideshow));
        }
/*}*/
        return root;
    }

}
