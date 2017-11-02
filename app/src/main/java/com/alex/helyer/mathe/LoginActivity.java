package com.alex.helyer.mathe;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;

import org.json.JSONObject;

import cz.msebera.android.httpclient.Header;

public class LoginActivity extends AppCompatActivity {

    String user, pass;

    EditText usuario;
    EditText password;

    Button btnEntrar;
    TextView recuperar;

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

        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user = usuario.getText().toString();
                pass = password.getText().toString();

                //Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                //startActivity(intent);
                //intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP );
                //finish();
                Conexion();
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

    public void Conexion() {
        AsyncHttpClient client = new AsyncHttpClient();
        String URL = "https://myappmate.000webhostapp.com/loginapp.php";

        RequestParams params = new RequestParams();
        params.put("user", user);
        params.put("pass", pass);

        client.get(URL, params, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                if (statusCode==200) {
                    String jsonResponse = new String(responseBody);
                    String getUser, getPass;
                    try {
                        JSONObject jsonobj = new JSONObject(jsonResponse);
                        getUser = jsonobj.getString("usuario");
                        getPass = jsonobj.getString("password");
                        Toast.makeText(LoginActivity.this, getUser+"-"+getPass, Toast.LENGTH_SHORT).show();
                        if ( !getUser.contentEquals("ERROR")  ) {
                            //SharedPreferences
                            //SharedPreferences preferences = getSharedPreferences("SESSION", MODE_PRIVATE);
                            //Editor
                            //SharedPreferences.Editor editor = preferences.edit();
                            //editor.putBoolean("SessionON", true);
                            //editor.commit();

                            //Recordamos que ya inicio sesion.
                             getSharedPreferences("SESSION", MODE_PRIVATE).edit().putInt("session_state",1).commit();
                            Intent intent = new Intent(LoginActivity.this,DiagnosticoActivity.class);
                            startActivity(intent);
                            finish();
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
                Toast.makeText(LoginActivity.this, "NO POST", Toast.LENGTH_SHORT).show();
            }
        });
    }



}
