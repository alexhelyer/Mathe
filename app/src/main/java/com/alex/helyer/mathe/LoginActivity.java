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


                if (usuario.getText().toString().equals("") || password.getText().toString().equals("")) {
                    Toast.makeText(LoginActivity.this, "Uno o más campos vacíos", Toast.LENGTH_SHORT).show();
                }else{
                    user = usuario.getText().toString();
                    pass = password.getText().toString();
                    View view = LoginActivity.this.getCurrentFocus();
                    if (view != null) {
                        InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
                    }

                    Login login = new Login(user, pass);
                    login.execute((Void) null);
                }
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

        public int flag = -1;
        public int nivel = 0;

        String getUser, getNivel;

        //Datos Personales
        String nombre, correo, genero, localidad, edad;
        Login(String email, String password) {
            mEmail = email;
            mPassword = password;
        }


        @Override
        protected void onPreExecute() {
            container.setVisibility(View.INVISIBLE);
            progress.setVisibility(View.VISIBLE);

            // TODO: Servicio: Inicio de Sesión
            AsyncHttpClient client = new AsyncHttpClient();
            String URL = "https://jair-alex.com/mathe/loginapp.php";

            RequestParams datos = new RequestParams();
            datos.put("user", mEmail);
            datos.put("pass", mPassword);

            //Solo realiza una intento de peticion con duracion de 1.5seg
            //client.setMaxRetriesAndTimeout(1,10000);

            client.get(URL, datos, new AsyncHttpResponseHandler() {
                @Override
                public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                    if (statusCode==200) {
                        String jsonResponse = new String(responseBody);

                        try {
                            JSONObject jsonobj = new JSONObject(jsonResponse);
                            getUser = jsonobj.getString("usuario");
                            getNivel = jsonobj.getString("nivel");
                            nivel = Integer.parseInt(getNivel);
                            //Obtenemos los datos personales
                            nombre = jsonobj.getString("nombre");
                            correo = jsonobj.getString("correo");
                            genero = jsonobj.getString("genero");
                            localidad = jsonobj.getString("localidad");
                            edad = jsonobj.getString("edad");

                            if ( getUser.contentEquals("100") ) {
                                flag = 100;
                            }
                            else if ( getUser.contentEquals("300") ) {
                                flag = 300;
                            }
                            else {
                                flag = 200;
                            }

                        }
                        catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    cancel(true);
                    onPostExecute(true);
                }

                @Override
                public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                    //Fallo la Conexion.
                    flag = 404;
                    cancel(true);
                    onPostExecute(true);
                }


            });

            super.onPreExecute();
        }

        @Override
        protected Boolean doInBackground(Void... params) {
            try {
                // Simulate network access.
                Thread.sleep(20000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            return true;
        }

        @Override
        protected void onPostExecute(Boolean aBoolean) {
            if (flag==200) {
                //Recordamos que ya inicio sesion. Y guardamos datos del usuario.
                //getSharedPreferences("PERFIL", MODE_PRIVATE).edit().putInt("session_state",1).commit();
                getSharedPreferences("PERFIL", MODE_PRIVATE).edit().putString("user",getUser).apply();
                getSharedPreferences("PERFIL", MODE_PRIVATE).edit().putString("nombre",nombre).apply();
                getSharedPreferences("PERFIL", MODE_PRIVATE).edit().putString("correo",correo).apply();
                getSharedPreferences("PERFIL", MODE_PRIVATE).edit().putString("genero",genero).apply();
                getSharedPreferences("PERFIL", MODE_PRIVATE).edit().putString("localidad",localidad).apply();
                getSharedPreferences("PERFIL", MODE_PRIVATE).edit().putString("edad",edad).apply();

                if ( nivel==0 ) {
                    //Pasamos al Diagnostico
                    getSharedPreferences("SESSION", MODE_PRIVATE).edit().putInt("session_state",1).commit();


                    getSharedPreferences("PERFIL", MODE_PRIVATE).edit().putInt("puntos", 0).apply();
                    getSharedPreferences("ESTADISTICAS", MODE_PRIVATE).edit().putInt("imagen_perfil", 1).apply();

                    getSharedPreferences("ESTADISTICAS", MODE_PRIVATE).edit().putString("promedio_general", "0-0").apply();
                    getSharedPreferences("ALGORITMO", MODE_PRIVATE).edit().putString("desempenio", "00-00-00-00-00").apply();
                    getSharedPreferences("ESTADISTICAS", MODE_PRIVATE).edit().putString("efectividad", "0-0-0").apply();

                    Intent intent = new Intent(LoginActivity.this,DiagnosticoActivity.class);
                    startActivity(intent);
                    finish();
                    //Toast.makeText(LoginActivity.this, "Bienvenido Diagnostico:"+nivel, Toast.LENGTH_SHORT).show();
                }
                else {
                    //Pasamos a HomeActivuty
                    getSharedPreferences("SESSION", MODE_PRIVATE).edit().putInt("session_state",2).commit();
                    getSharedPreferences("ALGORITMO", MODE_PRIVATE).edit().putInt("nivel",nivel).commit();

                    // TODO: Petición: Obtener progreso de usuario
                    AsyncHttpClient client = new AsyncHttpClient();
                    String URL = "https://jair-alex.com/mathe/getProgreso.php";

                    RequestParams datos = new RequestParams();
                    datos.put("user", getUser);

                    client.get(URL, datos, new AsyncHttpResponseHandler() {
                        @Override
                        public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                            if (statusCode==200) {
                                String respuesta = new String(responseBody);
                                String[] getDato = respuesta.split("/");
                                //Toast.makeText(LoginActivity.this, getDato[0], Toast.LENGTH_LONG).show();
                                getSharedPreferences("PERFIL", MODE_PRIVATE).edit().putInt("puntos",Integer.parseInt(getDato[0])).apply();
                                getSharedPreferences("ESTADISTICAS", MODE_PRIVATE).edit().putInt("imagen_perfil", Integer.parseInt(getDato[1])).apply();

                                getSharedPreferences("ESTADISTICAS", MODE_PRIVATE).edit().putString("promedio_general",getDato[2]).apply();
                                getSharedPreferences("ALGORITMO", MODE_PRIVATE).edit().putString("desempenio",getDato[3]).apply();
                                getSharedPreferences("ESTADISTICAS", MODE_PRIVATE).edit().putString("efectividad", getDato[4]).apply();

                                Intent intent = new Intent(LoginActivity.this,HomeActivity.class);
                                startActivity(intent);
                                finish();
                            }
                        }

                        @Override
                        public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                            String respuesta = new String(responseBody);
                        }
                    });


                    //Toast.makeText(LoginActivity.this, "Bienvenido Home:"+nivel, Toast.LENGTH_SHORT).show();
                }

            }
            else {
                progress.setVisibility(View.INVISIBLE);
                container.setVisibility(View.VISIBLE);
                if (flag==100)
                    Toast.makeText(LoginActivity.this, "Los datos son incorrectos", Toast.LENGTH_SHORT).show();
                else if (flag==300)
                    Toast.makeText(LoginActivity.this, "Activa tu cuenta antes de continuar", Toast.LENGTH_SHORT).show();
                else if (flag==404)
                    Toast.makeText(LoginActivity.this, "No hay conexión a internet", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(LoginActivity.this, flag + ": No es posible conectarse al servidor", Toast.LENGTH_SHORT).show();
            }
            super.onPostExecute(aBoolean);
        }

    }



}
