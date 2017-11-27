package com.alex.helyer.mathe;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.Toast;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;

import org.json.JSONException;
import org.json.JSONObject;

import cz.msebera.android.httpclient.Header;

public class RegistrarseActivity extends AppCompatActivity {

    EditText inNombre;
    EditText inApellido;
    EditText inUsuario;
    EditText inCorreo;
    EditText inPassword;
    EditText inconfirmPassword;

    Spinner spinLocalidad;
    Spinner spinEdad;
    Spinner spinGenero;

    Button btnRegistrarse;

    RelativeLayout progress_container;
    ScrollView container;

    String[] estados = new String[]{"CDMX","Aguascalientes","Baja California",
            "Baja California Sur", "Campeche", "Chiapas", "Chihuahua",
            "Coahuila de Zaragoza", "Colima", "Colima", "Durango", "Guanajuato",
            "Guerrero", "Hidalgo", "Jalisco", "México", "Michoacán de Ocampo",
            "Morelos", "Nayarit", "Nuevo León", "Oaxaca", "Puebla", "Querétaro de Arteaga",
            "Quintana Roo", "San Luis Potosí", "Sinaloa", "Sonora","Tabasco",
            "Tamaulipas", "Tlaxcala", "Veracruz", "Yucatán", "Zacatecas"};

    String[] edades = new String[]{"11 años o menos","12 años","13 años","14 años","15 años o más"};

    String[] generos = new String[]{"Masculino","Femenino"};


    String nombre, apellido, usuario, correo, localidad, edad, genero, password, confirmpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Only PORTRAIT(Vertical)
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_registrarse);

        getSupportActionBar().setTitle("Registrarse");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        progress_container = (RelativeLayout) findViewById(R.id.progress_container);
        container = (ScrollView) findViewById(R.id.scroll_container);

        inNombre = (EditText) findViewById(R.id.inNombre);
        inApellido = (EditText) findViewById(R.id.inApellido);
        inUsuario = (EditText) findViewById(R.id.inUsuario);
        inCorreo = (EditText) findViewById(R.id.inCorreo);
        inPassword = (EditText) findViewById(R.id.inPassword);
        inconfirmPassword = (EditText) findViewById(R.id.inConfirmPassword);

        spinLocalidad = (Spinner) findViewById(R.id.spinLocalidad);
        spinEdad = (Spinner) findViewById(R.id.spinEdad);
        spinGenero = (Spinner) findViewById(R.id.spinGenero);

        btnRegistrarse = (Button) findViewById(R.id.Registrarse);

        ArrayAdapter<String> adapterLocalidad = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, estados);
        spinLocalidad.setAdapter(adapterLocalidad);

        ArrayAdapter<String> adapterEdad = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, edades );
        spinEdad.setAdapter(adapterEdad);

        ArrayAdapter<String> adapterGenero = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, generos);
        spinGenero.setAdapter(adapterGenero);

        btnRegistrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //get Datos

                nombre = inNombre.getText().toString();
                apellido = inApellido.getText().toString();
                usuario = inUsuario.getText().toString();
                correo = inCorreo.getText().toString();
                localidad = spinLocalidad.getSelectedItem().toString();
                edad = spinEdad.getSelectedItem().toString();
                genero = spinGenero.getSelectedItem().toString();
                password = inPassword.getText().toString();
                confirmpass = inconfirmPassword.getText().toString();

                InputValidatorHelper myInput = new InputValidatorHelper();


                if(!myInput.containsDigit(nombre) || !myInput.containsDigit(apellido)){
                    //Validar nombre y apellido
                    Toast.makeText(RegistrarseActivity.this, "El campo nombre y apellido solo pueden contener letras", Toast.LENGTH_LONG).show();
                } else if (!myInput.isEmpty(nombre) || !myInput.isEmpty(apellido) || !myInput.isEmpty(usuario) || !myInput.isEmpty(password)){
                    //Revisar que todos los campos esten llenos.
                    Toast.makeText(RegistrarseActivity.this, "Por favor llena todos los campos", Toast.LENGTH_LONG).show();
                }  else if (!myInput.isValidEmail(correo)){
                    //Válidar cuenta de correo
                    Toast.makeText(RegistrarseActivity.this, "Tu cuenta de correo no es válida", Toast.LENGTH_LONG).show();
                } else if (!myInput.checkPass(password,confirmpass)){
                    //Validar contraseñas
                    Toast.makeText(RegistrarseActivity.this, "Las contraseñas no coinciden", Toast.LENGTH_LONG).show();
                } else if (!myInput.checkLength(password)){
                    Toast.makeText(RegistrarseActivity.this, "La contraseña debe tener un mínimo 5 caracteres", Toast.LENGTH_LONG).show();
                } else{
                    //Si todoo sale bien registramos.
                    //Toast.makeText(RegistrarseActivity.this, "REGISTRAR", Toast.LENGTH_SHORT).show();
                    //RegistrarUsuario();
                    Registrarse registrarse = new Registrarse(nombre, apellido, usuario, correo, localidad, edad, genero, password);
                    registrarse.execute();
                }



                //Toast.makeText(RegistrarseActivity.this, spinLocalidad.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
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


    private class InputValidatorHelper {

        private boolean isValidEmail(String string){
            return string.contains("@") && string.contains(".");
        }

        private boolean isEmpty(String string){
            return !string.equals("");
        }

        private  boolean containsDigit(String s) {
            boolean containsDigit = false;

            if (s != null && !s.isEmpty()) {
                for (char c : s.toCharArray()) {
                    if (containsDigit = Character.isDigit(c)) {
                        break;
                    }
                }
            }

            return !containsDigit;
        }

        private boolean checkPass(String pass1, String pass2){
            return pass1.equals(pass2);
        }

        private boolean checkLength(String pass1){
            return pass1.length() >= 5;
        }
    }



    private class Registrarse extends AsyncTask<Void,Void,Boolean> {


        private final String mNombre;
        private final String mApellido;
        private final String mUsuario;
        private final String mCorreo;
        private final String mLocalidad;
        private final String mEdad;
        private final String mGenero;
        private final String mPassword;



        public int flag = 0;
        public int nivel = 0;

        //Datos Personales
        String nombre, correo, genero, localidad, edad;

        Registrarse(String nombre, String apellido, String usuario, String correo, String localidad, String edad, String genero, String password) {
            mNombre = nombre;
            mApellido = apellido;
            mUsuario = usuario;
            mCorreo = correo;
            mLocalidad = localidad;
            mEdad = edad;
            mGenero = genero;
            mPassword = password;
        }


        @Override
        protected void onPreExecute() {

            container.setVisibility(View.INVISIBLE);
            progress_container.setVisibility(View.VISIBLE);


            //Empezamos con el envio de datos

            // TODO: Servicio - Registrar nuevo usuario
            AsyncHttpClient client = new AsyncHttpClient();
            String URL = "https://jair-alex.com/mathe/registroApp.php";

            RequestParams params = new RequestParams();
            params.put("nombre", mNombre);
            params.put("apellido", mApellido);
            params.put("usuario", mUsuario);
            params.put("correo", mCorreo);
            params.put("localidad", mLocalidad);
            params.put("edad", mEdad);
            params.put("genero", mGenero);
            params.put("password", mPassword);
            params.put("confirmpass", mPassword);

            client.post(URL, params, new AsyncHttpResponseHandler() {
                @Override
                public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                    if (statusCode==200) {
                        String response = new String(responseBody);
                        response = response.substring(0,3);

                        flag = Integer.parseInt(response);
                    }
                    cancel(true);
                    onPostExecute(true);
                }

                @Override
                public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
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

            if ( flag == 200 ) {
                Toast.makeText(RegistrarseActivity.this, "!Se registro un nuevo usuario¡", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(RegistrarseActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
            else {
                progress_container.setVisibility(View.INVISIBLE);
                container.setVisibility(View.VISIBLE);

                if (flag==100) {
                    Toast.makeText(RegistrarseActivity.this, "!El usuario ya existe¡", Toast.LENGTH_SHORT).show();
                }
                else if (flag==150) {
                    Toast.makeText(RegistrarseActivity.this, "!El correo ya existe¡", Toast.LENGTH_SHORT).show();
                }
                else if (flag==404) {
                    Toast.makeText(RegistrarseActivity.this, "No hay conexión a internet", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(RegistrarseActivity.this, "No es posible conectarse al servidor", Toast.LENGTH_SHORT).show();
                }

            }

            //Here Code
            super.onPostExecute(aBoolean);
        }

    }


}
