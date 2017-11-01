package com.alex.helyer.mathe;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;

import cz.msebera.android.httpclient.Header;

public class RecuperarPasswordActivity extends AppCompatActivity {

    EditText inCorreo;
    Button btnRecuperar;

    String correo;

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

        btnRecuperar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                correo = inCorreo.getText().toString();

                RecuperarPassword();
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        finish();
        return super.onOptionsItemSelected(item);
    }

    private void RecuperarPassword() {
        AsyncHttpClient client = new AsyncHttpClient();
        String URL = "https://myappmate.000webhostapp.com/recuperarpassApp.php";

        RequestParams params = new RequestParams();
        params.put("correo", correo);

        client.post(URL, params, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                if (statusCode==200) {
                    String respuesta = new String(responseBody);
                    respuesta = respuesta.substring(respuesta.length()-14,respuesta.length());
                    Toast.makeText(RecuperarPasswordActivity.this, respuesta, Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {

            }
        });
    }
}
