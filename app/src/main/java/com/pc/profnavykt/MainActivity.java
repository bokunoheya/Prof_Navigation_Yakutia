package com.pc.profnavykt;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.pc.profnavykt.ProfessiiCode.S05_01_01;
//import com.pc.profnavykt.databinding.FragmentProfessiiNtBinding;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
public class MainActivity extends AppCompatActivity {
    public static String item;
    private AppBarConfiguration mAppBarConfiguration;
   // protected OnBackPressedListener onBackPressedListener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Write a message to the database
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("message");
        myRef.setValue("Hello, World!");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar); //установка label
        setSupportActionBar(toolbar);
        S05_01_01.tts= toolbar; //Наследуемое в S05_01_01
     //   toolbar.setBackgroundColor(ContextCompat.getColor(getApplicationContext(),R.color.green));
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow, R.id.socGarant, R.id.blankFragment2)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
/*        new ShowcaseView.Builder(this)
                .setTarget(new ActionViewTarget(this, ActionViewTarget.Type.HOME))
                .setContentTitle("ShowcaseView")
                .setContentText("This is highlighting the Home button")
                .hideOnTouchOutside()
                .build();*/

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) { //Настрока меню
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.search, menu);

      return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }


    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Так переход назад не возможен, нажмите на верхне-левое стрелку", Toast.LENGTH_SHORT).show();
    }
/*@Override                                                                                   // Обработка перехода Назад
public void onBackPressed() {                                                               //
    if (onBackPressedListener != null)                                                      //
        onBackPressedListener.doBack();                                                     //
    else                                                                                    //
        super.onBackPressed();                                                              //
}                                                                                           //
    public interface OnBackPressedListener {                                                //
        public void doBack();                                                               //
    }                                                                                       //
    public void setOnBackPressedListener(OnBackPressedListener onBackPressedListener) {     //
        this.onBackPressedListener = onBackPressedListener;                                 //
    }//*/


}
