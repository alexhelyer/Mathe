package com.alex.helyer.mathe;

import android.content.pm.ActivityInfo;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;

public class HomeActivity extends AppCompatActivity {

    Fragment inicioFragment = new InicioFragment();
    Fragment cursoFragment = new CursoFragment();
    Fragment practicarFragment = new PracticarFragment();
    Fragment acercaFragment = new AcercaFragment();


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()){
                case R.id.navigation_inicio:
                    getSupportFragmentManager().beginTransaction().replace(R.id.content, inicioFragment).commit();
                    return true;
                case R.id.navigation_curso:
                    getSupportFragmentManager().beginTransaction().replace(R.id.content, cursoFragment).commit();
                    return true;
                case R.id.navigation_practicar:
                    getSupportFragmentManager().beginTransaction().replace(R.id.content, practicarFragment).commit();
                    return true;
                case R.id.navigation_acerca:
                    getSupportFragmentManager().beginTransaction().replace(R.id.content, acercaFragment).commit();
                    return true;
            }

            return false;
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Only PORTRAIT(Vertical)
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        //FullScreen
        //requestWindowFeature(Window.FEATURE_ACTION_BAR);
        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_home);

        getSupportActionBar().hide();

        getSupportFragmentManager().beginTransaction().replace(R.id.content, inicioFragment).commit();


        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }


}
