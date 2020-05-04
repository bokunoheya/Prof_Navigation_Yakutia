package com.pc.profnavykt;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import static java.lang.Thread.sleep;
import com.pc.profnavykt.R;
public class SplashScreen extends AppCompatActivity {
//    private final int SPLASH_DISPLAY_LENGHT = 1500;
Thread splashTread;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        StartAnimations();
    }
private void StartAnimations(){
            Animation anim= AnimationUtils.loadAnimation(this, R.anim.alpha);
//            anim.reset();
            ConstraintLayout layout=findViewById(R.id.splash_activity);
//            layout.clearAnimation();
            layout.startAnimation(anim);

        splashTread = new Thread() {
            @Override
            public void run() {
                try {
                    int waited = 0;
                    // Splash screen pause time
                    while (waited < 2500) {
                        sleep(100);
                        waited += 100;
                    }
                Intent mainIntent = new Intent(SplashScreen.this, BlinkActivity.class);
//                    mainIntent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    startActivity(mainIntent);
                    finish();
                } catch (InterruptedException e) {
                } finally {
                    finish();
                }
            }
        };
        splashTread.start();
    }
    }

