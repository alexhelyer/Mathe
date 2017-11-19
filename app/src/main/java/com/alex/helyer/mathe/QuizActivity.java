package com.alex.helyer.mathe;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import static com.loopj.android.http.AsyncHttpClient.log;

public class QuizActivity extends AppCompatActivity implements FragmentTransition {

    int flag = 0;
    int count = 0;


    int score = 0;


    //SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Only PORTRAIT(Vertical)
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        //FullScreen
        //requestWindowFeature(Window.FEATURE_ACTION_BAR);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_quiz);
        getSupportActionBar().hide();

        getSharedPreferences("SCORE", MODE_PRIVATE).edit().putInt("score",0).commit();

        flag = getRandom();

        switch (flag) {
            case 0:
                getSupportFragmentManager().beginTransaction().replace(R.id.QuizContent, new MultipleFragment()).commit();
                break;
            case 1:
                getSupportFragmentManager().beginTransaction().replace(R.id.QuizContent, new AbiertaFragment()).commit();
                break;
            case 2:
                getSupportFragmentManager().beginTransaction().replace(R.id.QuizContent, new VFFragment()).commit();
                break;
        }


    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder mialerta = new AlertDialog.Builder(this);
        mialerta.setTitle("¡Alerta!");
        mialerta.setMessage("¿Deseas salir?, Tu progreso no se registrará");
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

    public int getRandom() {

        int numero = 0;

        Intent intent = getIntent();
        int bandera = intent.getIntExtra("tipo",1);

        if (bandera==1)
            numero = (int) (Math.random()*3);
        else
            numero = 1;

        return numero;
    }

    @Override
    public void siguiente() {

        count++;
        flag = getRandom();

        score = getSharedPreferences("SCORE", MODE_PRIVATE).getInt("score",0);


        if (count<10) {
            switch (flag) {
                case 0:
                    getSupportFragmentManager().beginTransaction().replace(R.id.QuizContent, new MultipleFragment()).commit();
                    break;
                case 1:
                    getSupportFragmentManager().beginTransaction().replace(R.id.QuizContent, new AbiertaFragment()).commit();
                    break;
                case 2:
                    getSupportFragmentManager().beginTransaction().replace(R.id.QuizContent, new VFFragment()).commit();
                    break;
            }
        }
        else if (count == 10) {
            getSupportFragmentManager().beginTransaction().replace(R.id.QuizContent, new ResultadoFragment()).commit();
        }
        else if (count>10) {
            String datos = getSharedPreferences("ALGORITMO", MODE_PRIVATE).getString("datos","08-08-08-08-08");
            datos = insertarDato(datos,score);
            getSharedPreferences("ALGORITMO", MODE_PRIVATE).edit().putString("datos",datos).commit();
            double promedio = getPromedioDatos(datos);
            getSharedPreferences("ALGORITMO", MODE_PRIVATE).edit().putString("promedio", ""+promedio).commit();
            Toast.makeText(this, "Finish: "+datos+" prom:"+promedio, Toast.LENGTH_LONG).show();
            int nivel = getSharedPreferences("ALGORITMO", MODE_PRIVATE).getInt("nivel",-1);
            nivel = CheckNivel(promedio,nivel);
            getSharedPreferences("ALGORITMO", MODE_PRIVATE).edit().putInt("nivel",nivel).commit();

            //Guardamos los datos del promedio.
            setPromedioGeneral(score);

            //getSharedPreferences("ESTADISTICAS", MODE_PRIVATE).getString("promedio_general", "0-1");
            finish();
        }

    }

    public String insertarDato(String datos, int dato) {
        String midato;
        if (dato<10)
            midato = "0"+Integer.toString(dato);
        else
            midato = Integer.toString(dato);

        String DATOS = datos + "-" + midato;

        DATOS = DATOS.substring(3,17);

        return DATOS;
    }

    public double getPromedioDatos(String datos) {
        String[] midatos = datos.split("-");

        int suma=0;
        int contador=0;
        for (int i=0; i<midatos.length; i++) {
            log.i("Promedio:",midatos[i]);
            contador++;
            suma = suma + Integer.parseInt(midatos[i]);
        }

        double promedio =  (suma+0.0)/(contador-0.0);

        log.i("Suma:",""+suma);
        log.i("Cont:",""+contador);
        log.i("Prom:",""+promedio);


        return promedio;

    }
    public int CheckNivel(double promedio, int nivel) {

        if (promedio>8.5) {
            nivel++;

            if (nivel>3)
                nivel = 3;

            getSharedPreferences("ALGORITMO", MODE_PRIVATE).edit().putString("datos","08-08-08-08-08").commit();
        }
        else if (promedio<7.0) {
            nivel--;

            if (nivel<1)
                nivel = 1;

            getSharedPreferences("ALGORITMO", MODE_PRIVATE).edit().putString("datos","08-08-08-08-08").commit();
        }

        return nivel;
    }

    private String setPromedioGeneral(int mi_score) {
        String datos = getSharedPreferences("ESTADISTICAS", MODE_PRIVATE).getString("promedio_general", "0-0");
        String[] midatos = datos.split("-");

        int total = Integer.parseInt(midatos[0]) + mi_score;
        int count = Integer.parseInt(midatos[1]) + 1;

        String mi_promedio_general = total + "-" + count ;
        getSharedPreferences("ESTADISTICAS", MODE_PRIVATE).edit().putString("promedio_general",mi_promedio_general).apply();
        return null;
    }



}
