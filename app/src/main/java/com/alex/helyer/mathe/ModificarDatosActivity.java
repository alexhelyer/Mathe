package com.alex.helyer.mathe;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class ModificarDatosActivity extends AppCompatActivity {

    Spinner spinLocalidad;
    Spinner spinEdad;
    Spinner spinGenero;
    TextView guardarDatos;

    EditText nombre;
    EditText correo;


    String[] estados = new String[]{"CDMX","Aguascalientes","Baja California",
            "Baja California Sur", "Campeche", "Chiapas", "Chihuahua",
            "Coahuila de Zaragoza", "Colima", "Colima", "Durango", "Guanajuato",
            "Guerrero", "Hidalgo", "Jalisco", "México", "Michoacán de Ocampo",
            "Morelos", "Nayarit", "Nuevo León", "Oaxaca", "Puebla", "Querétaro de Arteaga",
            "Quintana Roo", "San Luis Potosí", "Sinaloa", "Sonora","Tabasco",
            "Tamaulipas", "Tlaxcala", "Veracruz", "Yucatán", "Zacatecas"};

    String[] edades = new String[]{"11 años o menos","11 años","12 años","13 años","14 años","15 años","15 años o más"};

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


        //Obtenemos datos desde SharedPreferences;
        String getNombre =      getSharedPreferences("PERFIL", MODE_PRIVATE).getString("nombre","nombre");
        String getCorreo =      getSharedPreferences("PERFIL", MODE_PRIVATE).getString("correo","correo");
        String getGenero =      getSharedPreferences("PERFIL", MODE_PRIVATE).getString("genero","genero");
        String getLocalidad =   getSharedPreferences("PERFIL", MODE_PRIVATE).getString("localidad","localidad");
        String getEdad =        getSharedPreferences("PERFIL", MODE_PRIVATE).getString("edad","edad");

        nombre.setText(getNombre);
        correo.setText(getCorreo);

        correo.hasFocusable();

        guardarDatos = (TextView)findViewById(R.id.guardar_datos);
        guardarDatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                actualizarDatos();
            }
        });


        //Escondemos el teclado
        //if(getCurrentFocus()!=null) {
            //InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
            //inputMethodManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
        //}

    }

    private void actualizarDatos(){
        Toast.makeText(this, "updateData", Toast.LENGTH_SHORT).show();
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
                // todo: goto back activity from here
                //Toast.makeText(getActivity(), "Back", Toast.LENGTH_SHORT).show();
                //getFragmentManager().beginTransaction().replace(R.id.content, new AcercaFragment()).commit();
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
