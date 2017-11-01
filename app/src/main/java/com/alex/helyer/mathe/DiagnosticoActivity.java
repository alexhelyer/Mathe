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

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;

import cz.msebera.android.httpclient.Header;

public class DiagnosticoActivity extends AppCompatActivity implements FragmentTransition {

    int flag = 0;
    int count = 0;
    int score = 0;

    String DatosDiagnostico;
    ExamenDiagnostico miDiagnostico = new ExamenDiagnostico();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Only PORTRAIT(Vertical)
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        //FullScreen
        requestWindowFeature(Window.FEATURE_ACTION_BAR);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_diagnostico);
        getSupportActionBar().hide();



        //Siempre empezamos desde score=0
        getSharedPreferences("SCORE", MODE_PRIVATE).edit().putInt("score",0).commit();
        //Mostramos el primer fragmento la Bienvenida.
        getSupportFragmentManager().beginTransaction().replace(R.id.diagnostico, new BienvenidaDiagnosticoFragment()).commit();

        getDatosDiagnostico();



    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder mialerta = new AlertDialog.Builder(this);
        mialerta.setTitle("¡Alerta!");
        mialerta.setMessage("¿Deseas salir, tu progeso no se registrará?");
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
        int NUMERO = 21;

        score = getSharedPreferences("SCORE", MODE_PRIVATE).getInt("score",0);

        getSharedPreferences("DIAGNOSTICO", MODE_PRIVATE).edit().putInt("index",count).commit();

        final String DATOS = getSharedPreferences("DIAGNOSTICO", MODE_PRIVATE).getString("examen","null");
        if (count<miDiagnostico.INDEX.length)
            flag = Integer.parseInt(miDiagnostico.getIndex(count, DATOS));

        count++;


        if (count<NUMERO) {
            switch (flag) {
                case 0:
                    getSupportFragmentManager().beginTransaction().replace(R.id.diagnostico, new MultipleFragment()).commit();
                    break;
                case 1:
                    getSupportFragmentManager().beginTransaction().replace(R.id.diagnostico, new AbiertaFragment()).commit();
                    break;
                case 2:
                    getSupportFragmentManager().beginTransaction().replace(R.id.diagnostico, new VFFragment()).commit();
                    break;
            }
        }
        else if (count == NUMERO) {
            getSupportFragmentManager().beginTransaction().replace(R.id.diagnostico, new GradoDiagnosticoFragment()).commit();
        }
        else if (count == (NUMERO+1)) {
            Toast.makeText(DiagnosticoActivity.this,"score:"+score,Toast.LENGTH_SHORT).show();
            getSupportFragmentManager().beginTransaction().replace(R.id.diagnostico, new TerminarDiagnosticoFragment()).commit();
        }
        else if (count>(NUMERO+1)) {
            getSharedPreferences("SESSION", MODE_PRIVATE).edit().putInt("session_state",2).commit();

            //Guardamos en una variable
            //getSharedPreferences("ALGORITMO", MODE_PRIVATE).edit().putInt("score_diagnostico",score).commit();
            int nivel = getNivelDiagnostico(score);
            getSharedPreferences("ALGORITMO", MODE_PRIVATE).edit().putInt("nivel",nivel).commit();
            Intent intent = new Intent(DiagnosticoActivity.this, HomeActivity.class);
            startActivity(intent);
            finish();
        }
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

    public void getDatosDiagnostico() {
        AsyncHttpClient client = new AsyncHttpClient();
        String URL = "http://myappmate.000webhostapp.com/sendExamen.php";
        RequestParams params = new RequestParams();

        client.post(URL, params, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                if (statusCode==200) {
                    //Conexion exitosa
                    DatosDiagnostico = new String(responseBody);
                    Toast.makeText(DiagnosticoActivity.this,"getExamen",Toast.LENGTH_SHORT).show();
                    //Guardamos lo que nos responde el sistema. El examen diagnostico cargado desde el PHP
                    getSharedPreferences("DIAGNOSTICO", MODE_PRIVATE).edit().putString("examen",DatosDiagnostico).commit();
                }
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                //No se pudo conectar
                Toast.makeText(DiagnosticoActivity.this,"El PHP no existe",Toast.LENGTH_SHORT).show();
            }
        });
    }

    public int getNivelDiagnostico(int score) {
        int nivel = 0;

        if (score>16)
            nivel = 3;
        else if (score<12)
            nivel = 1;
        else
            nivel = 2;

        return nivel;
    }



}
