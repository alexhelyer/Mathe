package com.alex.helyer.mathe;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
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
import android.widget.TextView;
import android.widget.Toast;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;

import org.json.JSONObject;

import cz.msebera.android.httpclient.Header;

import static com.loopj.android.http.AsyncHttpClient.log;

public class LoginActivity extends AppCompatActivity {

    String user, pass;

    EditText usuario;
    EditText password;

    Button btnEntrar;
    TextView recuperar;

    ProgressBar progressBar;

    RelativeLayout progress;
    LinearLayout container;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Only PORTRAIT(Vertical)
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_login);

        getSupportActionBar().setTitle("Iniciar Sesión");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        usuario = (EditText) findViewById(R.id.usuario);
        password = (EditText) findViewById(R.id.password);

        btnEntrar = (Button) findViewById(R.id.btnEntrar);
        recuperar = (TextView) findViewById(R.id.recuperar);

        progressBar = (ProgressBar) findViewById(R.id.progress_bar);
        container = (LinearLayout) findViewById(R.id.login_container);
        progress = (RelativeLayout) findViewById(R.id.progress_container);

        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user = usuario.getText().toString();
                pass = password.getText().toString();

                View view = LoginActivity.this.getCurrentFocus();
                if (view != null) {
                    InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
                }
                Login login = new Login(user,pass);
                login.execute((Void) null);
            }
        });

        recuperar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, RecuperarPasswordActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    public void Conexion1() {

    }



    private class Login extends AsyncTask<Void,Void,Boolean> {

        private final String mEmail;
        private final String mPassword;

        public int flag = 0;

        Login(String email, String password) {
            mEmail = email;
            mPassword = password;
        }


        @Override
        protected void onPreExecute() {
            container.setVisibility(View.INVISIBLE);
            progress.setVisibility(View.VISIBLE);


            AsyncHttpClient client = new AsyncHttpClient();
            String URL = "https://myappmate.000webhostapp.com/loginapp.php";

            RequestParams datos = new RequestParams();
            datos.put("user", mEmail);
            datos.put("pass", mPassword);

            //Solo realiza una intento de peticion con duracion de 1.5seg
            client.setMaxRetriesAndTimeout(1,1800);

            //log.i("getConnectTimeout:",""+client.getConnectTimeout());
            //log.i("getResponseTimeout:",""+client.getResponseTimeout());

            client.get(URL, datos, new AsyncHttpResponseHandler() {
                @Override
                public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                    if (statusCode==200) {
                        String jsonResponse = new String(responseBody);
                        String getUser, getPass;
                        try {
                            JSONObject jsonobj = new JSONObject(jsonResponse);
                            getUser = jsonobj.getString("usuario");
                            getPass = jsonobj.getString("password");
                            //Toast.makeText(LoginActivity.this, getUser+"-"+getPass, Toast.LENGTH_SHORT).show();
                            if ( !getUser.contentEquals("ERROR")  ) {
                                //Recordamos que ya inicio sesion.
                                //getSharedPreferences("SESSION", MODE_PRIVATE).edit().putInt("session_state",1).commit();
                                //Intent intent = new Intent(LoginActivity.this,DiagnosticoActivity.class);
                                //startActivity(intent);
                                //finish();
                                //Toast.makeText(LoginActivity.this,"Bienvenido",Toast.LENGTH_SHORT).show();
                                flag = 200;
                            }
                            else {
                                //Toast.makeText(LoginActivity.this,"Datos Incorrectos",Toast.LENGTH_SHORT).show();
                                flag = 100;
                            }
                        }
                        catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }

                @Override
                public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                    //Fallo la Conexion.
                    //Toast.makeText(LoginActivity.this, "No hay conexión con el Internet", Toast.LENGTH_SHORT).show();
                    flag = 404;
                }
            });

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
            if (flag==200) {
                //Recordamos que ya inicio sesion.
                getSharedPreferences("SESSION", MODE_PRIVATE).edit().putInt("session_state",1).commit();
                Intent intent = new Intent(LoginActivity.this,DiagnosticoActivity.class);
                startActivity(intent);
                finish();
                Toast.makeText(LoginActivity.this, "Bienvenido", Toast.LENGTH_SHORT).show();
            }
            else {
                progress.setVisibility(View.INVISIBLE);
                container.setVisibility(View.VISIBLE);
                if (flag==100)
                    Toast.makeText(LoginActivity.this, "Los datos son incorrectos", Toast.LENGTH_SHORT).show();
                else if (flag==404)
                    Toast.makeText(LoginActivity.this, "No hay conexión con el Internet", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(LoginActivity.this, "Estamos teniendo problemas, intente otra vez", Toast.LENGTH_SHORT).show();
            }
            super.onPostExecute(aBoolean);
        }
    }



}
