package com.alex.helyer.mathe;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;

import cz.msebera.android.httpclient.Header;

public class ModificarDatosActivity extends AppCompatActivity {

    Spinner spinLocalidad;
    Spinner spinEdad;
    Spinner spinGenero;
    TextView guardarDatos;

    EditText nombre;
    EditText correo;

    EditText pass;

    //TextView guardar;
    RelativeLayout progress_container;


    String[] estados = new String[]{"CDMX","Aguascalientes","Baja California",
            "Baja California Sur", "Campeche", "Chiapas", "Chihuahua",
            "Coahuila de Zaragoza", "Colima", "Colima", "Durango", "Guanajuato",
            "Guerrero", "Hidalgo", "Jalisco", "México", "Michoacán de Ocampo",
            "Morelos", "Nayarit", "Nuevo León", "Oaxaca", "Puebla", "Querétaro de Arteaga",
            "Quintana Roo", "San Luis Potosí", "Sinaloa", "Sonora","Tabasco",
            "Tamaulipas", "Tlaxcala", "Veracruz", "Yucatán", "Zacatecas"};

    String[] edades = new String[]{"11 años o menos","12 años","13 años","14 años","15 años o más"};

    String[] generos = new String[]{"Masculino","Femenino"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modificar_datos);

        spinLocalidad = (Spinner) findViewById(R.id.localidad);
        ArrayAdapter<String> adapterLocalidad = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, estados);
        spinLocalidad.setAdapter(adapterLocalidad);

        spinEdad = (Spinner) findViewById(R.id.edad);
        ArrayAdapter<String> adapterEdad = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, edades );
        spinEdad.setAdapter(adapterEdad);

        spinGenero = (Spinner) findViewById(R.id.genero);
        ArrayAdapter<String> adapterGenero = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, generos );
        spinGenero.setAdapter(adapterGenero);



        nombre = (EditText) findViewById(R.id.editar_usuario);
        correo = (EditText) findViewById(R.id.editar_correo);

        pass = (EditText) findViewById(R.id.pass_nueva);

        progress_container = (RelativeLayout) findViewById(R.id.progress_container);


        //Obtenemos datos desde SharedPreferences;
        final String getUser =      getSharedPreferences("PERFIL", MODE_PRIVATE).getString("user","user");
        final String getNombre =      getSharedPreferences("PERFIL", MODE_PRIVATE).getString("nombre","nombre");
        final String getCorreo =      getSharedPreferences("PERFIL", MODE_PRIVATE).getString("correo","correo");

        /*
        final String getGenero =      getSharedPreferences("PERFIL", MODE_PRIVATE).getString("genero","genero");
        final String getLocalidad =   getSharedPreferences("PERFIL", MODE_PRIVATE).getString("localidad","localidad");
        final String getEdad =        getSharedPreferences("PERFIL", MODE_PRIVATE).getString("edad","edad");
        final String getPass = pass.getText().toString();
        */


        nombre.setText(getNombre);
        correo.setText(getCorreo);

        correo.hasFocusable();

        guardarDatos = (TextView)findViewById(R.id.guardar_datos);
        guardarDatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //

                progress_container.setVisibility(View.VISIBLE);


                final String setNombre =      nombre.getText().toString();
                final String setCorreo =      correo.getText().toString();
                final String setGenero =      spinGenero.getSelectedItem().toString();
                final String setLocalidad =   spinLocalidad.getSelectedItem().toString();
                final String setEdad =        spinEdad.getSelectedItem().toString().substring(0,2);
                String setPass =        pass.getText().toString();
                final int intEdad = Integer.parseInt(setEdad);


                // TODO: Servicio - Actualizar datos del usuario
                AsyncHttpClient client = new AsyncHttpClient();
                String URL = "https://jair-alex.com/mathe/ActualizarDatos.php";

                RequestParams datos = new RequestParams();
                datos.put("user", getUser);
                datos.put("nombre", setNombre);
                datos.put("correo", setCorreo);
                datos.put("genero", setGenero);
                datos.put("localidad", setLocalidad);
                datos.put("edad", intEdad);
                datos.put("pass", setPass);

                client.get(URL, datos, new AsyncHttpResponseHandler() {
                    @Override
                    public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                        if (statusCode==200) {
                            //Toast.makeText(ModificarDatosActivity.this, new String(responseBody) + "   " + intEdad, Toast.LENGTH_SHORT).show();
                            actualizarDatos(setNombre, setCorreo, setGenero, setLocalidad, setEdad);
                            Toast.makeText(ModificarDatosActivity.this, "Perfil Actualizado", Toast.LENGTH_SHORT).show();
                        }
                        progress_container.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                        progress_container.setVisibility(View.INVISIBLE);
                        Toast.makeText(ModificarDatosActivity.this, "No hay conexión a internet", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });


        //Escondemos el teclado
        //if(getCurrentFocus()!=null) {
            //InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
            //inputMethodManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
        //}

    }

    private void actualizarDatos(String Mnombre, String Mcorreo, String Mgenero, String Mlocalidad, String Medad){
        getSharedPreferences("PERFIL", MODE_PRIVATE).edit().putString("nombre",Mnombre).apply();
        getSharedPreferences("PERFIL", MODE_PRIVATE).edit().putString("correo",Mcorreo).apply();
        getSharedPreferences("PERFIL", MODE_PRIVATE).edit().putString("genero",Mgenero).apply();
        getSharedPreferences("PERFIL", MODE_PRIVATE).edit().putString("localidad",Mlocalidad).apply();
        getSharedPreferences("PERFIL", MODE_PRIVATE).edit().putString("edad",Medad).apply();
    }

    @Override
    protected void onResume() {
        super.onResume();
        this.getSupportActionBar().show();
        this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Editar Perfil");
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }
    }

    @Override
    public void onBackPressed() {
       this.finish();
    }
}
