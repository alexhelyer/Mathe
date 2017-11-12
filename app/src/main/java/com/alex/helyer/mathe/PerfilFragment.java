package com.alex.helyer.mathe;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import static android.content.Context.MODE_PRIVATE;


/**
 * A simple {@link Fragment} subclass.
 */
public class PerfilFragment extends Fragment {

    TextView nombre;
    TextView correo;
    TextView genero;
    TextView localidad;
    TextView edad;


    public PerfilFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_perfil, container, false);

        nombre = (TextView) rootView.findViewById(R.id.perfil_nombre);
        correo = (TextView) rootView.findViewById(R.id.perfil_correo);
        genero = (TextView) rootView.findViewById(R.id.perfil_genero);
        localidad = (TextView) rootView.findViewById(R.id.perfil_localidad);
        edad = (TextView) rootView.findViewById(R.id.perfil_edad);

        //Obtenemos datos desde SharedPreferences;
        String getNombre = getActivity().getSharedPreferences("PERFIL", MODE_PRIVATE).getString("nombre","nombre");
        String getCorreo = getActivity().getSharedPreferences("PERFIL", MODE_PRIVATE).getString("correo","correo");
        String getGenero = getActivity().getSharedPreferences("PERFIL", MODE_PRIVATE).getString("genero","genero");
        String getLocalidad = getActivity().getSharedPreferences("PERFIL", MODE_PRIVATE).getString("localidad","localidad");
        String getEdad = getActivity().getSharedPreferences("PERFIL", MODE_PRIVATE).getString("edad","edad");

        nombre.setText(getNombre);
        correo.setText(getCorreo);
        genero.setText(getGenero);
        localidad.setText(getLocalidad);
        edad.setText(getEdad);

        return rootView;
    }

}
