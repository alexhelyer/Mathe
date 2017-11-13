package com.alex.helyer.mathe;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;

public class PracticarFragmentActivity extends AppCompatActivity implements FragmentTransition {

    int count = 0;
    int score = 0;

    int MAX = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Only PORTRAIT(Vertical)
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        //FullScreen
        //requestWindowFeature(Window.FEATURE_ACTION_BAR);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_practicar_fragment);

        getSupportActionBar().hide();

        //Preparamos la variable para guardarla.
        getSharedPreferences("SCORE", MODE_PRIVATE).edit().putInt("score",0).commit();

        getSupportFragmentManager().beginTransaction().replace(R.id.practicar_content, new PracticarAbiertaFragment()).commit();

    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder mialerta = new AlertDialog.Builder(this);
        mialerta.setTitle("¡Alerta!");
        mialerta.setMessage("¿Deseas salir?");
        mialerta.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //Toast.makeText(QuizActivity.this, "Presionaste NO", Toast.LENGTH_SHORT).show();
            }
        });
        mialerta.setPositiveButton("Si", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        mialerta.show();
    }

    @Override
    public void siguiente() {

        count++;

        score = getSharedPreferences("SCORE", MODE_PRIVATE).getInt("score",0);

        if (count<MAX) {
            getSupportFragmentManager().beginTransaction().replace(R.id.practicar_content, new PracticarAbiertaFragment()).commit();
        }
        else if (count == MAX) {
            getSupportFragmentManager().beginTransaction().replace(R.id.practicar_content, new PracticarResultadoFragment()).commit();
        }
        else if (count>MAX) {
            finish();
        }

    }
}
