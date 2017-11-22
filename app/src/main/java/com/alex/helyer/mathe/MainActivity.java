package com.alex.helyer.mathe;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button Login;
    Button Registrarse;

    //MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Only PORTRAIT(Vertical)
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        //mediaPlayer = MediaPlayer.create(this, R.raw.correct);

        Login = (Button) findViewById(R.id.btnLogin);
        Registrarse = (Button) findViewById(R.id.btnRegistrarse);

        //Obtenemos la variable session_state
         int session_state = getSharedPreferences("SESSION", MODE_PRIVATE).getInt("session_state",0);

        //Toast.makeText(this, "session_state:"+session_state, Toast.LENGTH_SHORT).show();


        //getSharedPreferences("ALGORITMO", MODE_PRIVATE).edit().putInt("nivel",3).commit();

        if (session_state==2) {
            //Pasamos Directamente a HomeActivity
            Intent intent = new Intent(MainActivity.this, HomeActivity.class);
            startActivity(intent);
            finish();
        }
        else if (session_state==1) {
            //Pasamos al examen diagnostico
            Intent intent = new Intent(MainActivity.this, DiagnosticoActivity.class);
            startActivity(intent);
            finish();
        }
        else {
            Login.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //mediaPlayer.start();
                    Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                    startActivity(intent);
                    finish();
                }
            });

            Registrarse.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, RegistrarseActivity.class);
                    startActivity(intent);
                    finish();
                }
            });
        }





    }
}
