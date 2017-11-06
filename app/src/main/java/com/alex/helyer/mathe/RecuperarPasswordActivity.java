package com.alex.helyer.mathe;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;

import org.json.JSONObject;

import cz.msebera.android.httpclient.Header;

public class RecuperarPasswordActivity extends AppCompatActivity {

    EditText inCorreo;
    Button btnRecuperar;

    String correo;

    int state = 0;



    RelativeLayout progress;
    LinearLayout container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Solo PORTRAIT
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_recuperar_password);
        getSupportActionBar().setTitle("Recuperar Contraseña");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        inCorreo = (EditText) findViewById(R.id.inCorreoRecuperar);
        btnRecuperar = (Button) findViewById(R.id.btnRecuperar);

        container = (LinearLayout) findViewById(R.id.recuperar_container);
        progress = (RelativeLayout) findViewById(R.id.progress_container02);

        btnRecuperar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                correo = inCorreo.getText().toString();

                View view = RecuperarPasswordActivity.this.getCurrentFocus();
                if (view != null) {
                    InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
                }

                RecuperarPassword recuperarPassword = new RecuperarPassword(correo);
                recuperarPassword.execute();

            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        finish();
        return super.onOptionsItemSelected(item);
    }

    private class RecuperarPassword extends AsyncTask<Void,Void,Boolean> {

        private final String mEmail;
        int flag;

        RecuperarPassword(String email) {
            mEmail = email;
        }


        @Override
        protected void onPreExecute() {
            container.setVisibility(View.INVISIBLE);
            progress.setVisibility(View.VISIBLE);

            flag = RecuperarPass(mEmail);
            super.onPreExecute();
        }

        @Override
        protected Boolean doInBackground(Void... params) {
            try {
                // Simulate network access.
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            return true;
        }

        @Override
        protected void onPostExecute(Boolean aBoolean) {
            progress.setVisibility(View.INVISIBLE);
            container.setVisibility(View.VISIBLE);

            if (flag==200) {
                //Recordamos que ya inicio sesion.
                Toast.makeText(RecuperarPasswordActivity.this, "Se envio un correo", Toast.LENGTH_SHORT).show();
            }
            else if (flag==400) {
                Toast.makeText(RecuperarPasswordActivity.this, "El correo no esta registrado", Toast.LENGTH_SHORT).show();
            }
            else if (flag==404) {
                Toast.makeText(RecuperarPasswordActivity.this, "No hay conexión con el Internet", Toast.LENGTH_SHORT).show();
            }
            else {
                Toast.makeText(RecuperarPasswordActivity.this, "Estamos teniendo problemas, intente otra vez", Toast.LENGTH_SHORT).show();
            }

            super.onPostExecute(aBoolean);
        }
    }

    private int RecuperarPass(String email) {

        AsyncHttpClient client = new AsyncHttpClient();
        String URL = "https://myappmate.000webhostapp.com/recuperarpassApp.php";

        RequestParams params = new RequestParams();
        params.put("correo", email);

        //Solo realiza una intento de peticion con duracion de 1.5seg
        client.setMaxRetriesAndTimeout(1,1800);

        client.post(URL, params, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                if (statusCode==200) {
                    String respuesta = new String(responseBody);
                    respuesta = respuesta.substring(respuesta.length()-3,respuesta.length());

                    state = Integer.parseInt(respuesta);

                }
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                state = 404;
            }
        });

        return state;

    }


}
