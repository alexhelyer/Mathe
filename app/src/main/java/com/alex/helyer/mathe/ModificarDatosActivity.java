package com.alex.helyer.mathe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class ModificarDatosActivity extends AppCompatActivity {

    Spinner spinLocalidad;
    Spinner spinEdad;
    TextView guardarDatos;


    String[] estados = new String[]{"CDMX","Aguascalientes","Baja California",
            "Baja California Sur", "Campeche", "Chiapas", "Chihuahua",
            "Coahuila de Zaragoza", "Colima", "Colima", "Durango", "Guanajuato",
            "Guerrero", "Hidalgo", "Jalisco", "México", "Michoacán de Ocampo",
            "Morelos", "Nayarit", "Nuevo León", "Oaxaca", "Puebla", "Querétaro de Arteaga",
            "Quintana Roo", "San Luis Potosí", "Sinaloa", "Sonora","Tabasco",
            "Tamaulipas", "Tlaxcala", "Veracruz", "Yucatán", "Zacatecas"};

    String[] edades = new String[]{"11-","11","12","13","14","15","15+"};


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

        guardarDatos = (TextView)findViewById(R.id.guardar_datos);
        guardarDatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                actualizarDatos();
            }
        });

    }

    private void actualizarDatos(){
        Toast.makeText(this, "updateData", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        this.getSupportActionBar().show();
        this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
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
