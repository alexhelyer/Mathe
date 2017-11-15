package com.alex.helyer.mathe;


import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.content.Context.MODE_PRIVATE;


/**
 * A simple {@link Fragment} subclass.
 */
public class PracticarAbiertaFragment extends Fragment {

    TextView txtAbierta;
    EditText resAbierta;
    Button btnOk;

    private Boolean sonidoState, vibracionState;
    MediaPlayer mediaPlayer;

    int mi_nivel = 2;
    int mi_grado = 1;
    int mi_tipo  = 1;
    int mi_subte = 0;

    int indexRandom = 0;

    int tam = 1;


    String DATOS = "null";

    int score = 0;


    public PracticarAbiertaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_practicar_abierta, container, false);
        txtAbierta = (TextView) rootView.findViewById(R.id.txtAbierta);
        resAbierta = (EditText) rootView.findViewById(R.id.resAbierta);
        btnOk = (Button) rootView.findViewById(R.id.btnOk);

        mediaPlayer = MediaPlayer.create(getContext(),R.raw.correct);

        Intent intent = getActivity().getIntent();
        mi_subte = intent.getIntExtra("ID_subtema",0);
        //Datos misdatos = new Datos(mi_grado, mi_nivel, mi_subte, mi_tipo);
        ReactivosAbiertos reactivosAbiertos = new ReactivosAbiertos(mi_subte, mi_nivel);

        DATOS = reactivosAbiertos.getDatos();

        final Reactivos reactivos = new Reactivos(DATOS);

        tam = reactivos.getSize();
        indexRandom = getRandomIndex(tam);

        Toast.makeText(getActivity(), "tam:"+tam , Toast.LENGTH_LONG).show();

        txtAbierta.setText(reactivos.getPregunta(indexRandom));

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String mirespuesta = resAbierta.getText().toString();

                if (!mirespuesta.contentEquals("")) {
                    if (reactivos.checkRespuesta(mirespuesta,indexRandom)==1) {
                        score = getActivity().getSharedPreferences("SCORE", MODE_PRIVATE).getInt("score",0) + 1 ;
                        getActivity().getSharedPreferences("SCORE", MODE_PRIVATE).edit().putInt("score",score).apply();
                        //Check if sound is enable
                        sonidoState = getActivity().getSharedPreferences("SETTINGS", MODE_PRIVATE).getBoolean("sonido",false);
                        if(sonidoState){ mediaPlayer.start(); }

                    }
                    else {
                        //Check if vibration is enable
                        vibracionState = getActivity().getSharedPreferences("SETTINGS", MODE_PRIVATE).getBoolean("vibracion",false);
                        if(vibracionState) {
                            Vibrator vibrator = (Vibrator) getActivity().getSystemService(Context.VIBRATOR_SERVICE);
                            vibrator.vibrate(160);
                        }
                    }
                    ((FragmentTransition)getActivity()).siguiente();
                }

            }
        });

        return rootView;
    }

    public int getRandomIndex(int size) {
        int random = (int) (Math.random()*size);
        return random;
    }

}
