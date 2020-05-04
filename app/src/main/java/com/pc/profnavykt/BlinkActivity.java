package com.pc.profnavykt;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Toast;

public class BlinkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_first_start);
/*        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(this);
        if (pref.getBoolean("is_start", false) != true) { // получить true/false по ключу 'is_start' (если null, то false)
            setContentView(R.layout.main_first_start); // прикрепляем лаяут для первого запуска 'main_first_start'
            pref.edit().putBoolean("is_start", true).commit(); // пишем в SharedPreferences 'true'
        } else {
            setContentView(R.layout.activity_main); // прикрепляем лаяут для остальных запусков
        }*/
        StartAnimations();
    }
    private void StartAnimations(){
        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(this);
        if (pref.getBoolean("is_start", false) != true) { // получить true/false по ключу 'is_start' (если null, то false)
            setContentView(R.layout.main_first_start); // прикрепляем лаяут для первого запуска 'main_first_start'
        //    Toast.makeText(this, "Text saved", Toast.LENGTH_SHORT).show();
            pref.edit().putBoolean("is_start", true).commit(); // пишем в SharedPreferences 'true'

        } else {
            Intent mainIntent = new Intent(BlinkActivity.this, MainActivity.class);
            startActivity(mainIntent); // прикрепляем лаяут для остальных запусков
         //   Toast.makeText(this, "Text error", Toast.LENGTH_SHORT).show();
        }

    }
public void click(View view){
    Intent mainIntent = new Intent(BlinkActivity.this, MainActivity.class);
    startActivity(mainIntent);
}

}
