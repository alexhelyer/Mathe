package com.alex.helyer.mathe;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Toast;

import com.alex.helyer.mathe.teoria.Algebra01Fragment;
import com.alex.helyer.mathe.teoria.DecimalesFragment;
import com.alex.helyer.mathe.teoria.EnterosFragment;
import com.alex.helyer.mathe.teoria.FactorizacionFragment;
import com.alex.helyer.mathe.teoria.FraccionariosFragment;
import com.alex.helyer.mathe.teoria.NaturalesFragment;

public class CursoTeoriaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Only PORTRAIT(Vertical)
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        //FullScreen
        //requestWindowFeature(Window.FEATURE_ACTION_BAR);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_curso_teoria);

        getSupportActionBar().hide();

        Intent intent = getIntent();
        int opc = intent.getIntExtra("ID_subtema",-1);

        //Toast.makeText(this, "opc:"+opc, Toast.LENGTH_LONG).show();

        switch (opc) {
            case 0:
                getSupportFragmentManager().beginTransaction().replace(R.id.teoria_content, new NaturalesFragment ()).commit();
                break;
            case 1:
                getSupportFragmentManager().beginTransaction().replace(R.id.teoria_content, new EnterosFragment()).commit();
                break;
            case 2:
                getSupportFragmentManager().beginTransaction().replace(R.id.teoria_content, new FraccionariosFragment()).commit();
                break;
            case 3:
                getSupportFragmentManager().beginTransaction().replace(R.id.teoria_content, new DecimalesFragment()).commit();
                break;
            case 4:
                getSupportFragmentManager().beginTransaction().replace(R.id.teoria_content, new Algebra01Fragment()).commit();
                break;
            case 5:
                getSupportFragmentManager().beginTransaction().replace(R.id.teoria_content, new Algebra01Fragment()).commit();
                break;
            case 6:
                getSupportFragmentManager().beginTransaction().replace(R.id.teoria_content, new FactorizacionFragment()).commit();
                break;
            case 7:
                getSupportFragmentManager().beginTransaction().replace(R.id.teoria_content, new FactorizacionFragment()).commit();
                break;
            case 8:
                getSupportFragmentManager().beginTransaction().replace(R.id.teoria_content, new FactorizacionFragment()).commit();
                break;
            case 9:
                getSupportFragmentManager().beginTransaction().replace(R.id.teoria_content, new FactorizacionFragment()).commit();
                break;
            case 10:
                getSupportFragmentManager().beginTransaction().replace(R.id.teoria_content, new FactorizacionFragment()).commit();
                break;
            case 11:
                getSupportFragmentManager().beginTransaction().replace(R.id.teoria_content, new FactorizacionFragment()).commit();
                break;
            case 12:
                getSupportFragmentManager().beginTransaction().replace(R.id.teoria_content, new FactorizacionFragment()).commit();
                break;
            case 13:
                getSupportFragmentManager().beginTransaction().replace(R.id.teoria_content, new FactorizacionFragment()).commit();
                break;
            case 14:
                getSupportFragmentManager().beginTransaction().replace(R.id.teoria_content, new FactorizacionFragment()).commit();
                break;
            case 15:
                getSupportFragmentManager().beginTransaction().replace(R.id.teoria_content, new FactorizacionFragment()).commit();
                break;
            case 16:
                getSupportFragmentManager().beginTransaction().replace(R.id.teoria_content, new FactorizacionFragment()).commit();
                break;
            case 17:
                getSupportFragmentManager().beginTransaction().replace(R.id.teoria_content, new FactorizacionFragment()).commit();
                break;
            case 18:
                getSupportFragmentManager().beginTransaction().replace(R.id.teoria_content, new FactorizacionFragment()).commit();
                break;
        }





    }
}
