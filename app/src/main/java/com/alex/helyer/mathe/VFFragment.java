package com.alex.helyer.mathe;


import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.content.Context.MODE_PRIVATE;


/**
 * A simple {@link Fragment} subclass.
 */
public class VFFragment extends Fragment {

    TextView txtVF;

    Button btnVerdadero;
    Button btnFalso;
    private Boolean sonidoState, vibracionState;
    Reactivos misreactivos = new Reactivos();
    ExamenDiagnostico miDiagnostico = new ExamenDiagnostico();

    int score;

    MediaPlayer mediaPlayer;


    public VFFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_vf, container, false);
        txtVF = (TextView) rootView.findViewById(R.id.txtVF);
        btnVerdadero = (Button) rootView.findViewById(R.id.btnVerdadero);
        btnFalso = (Button) rootView.findViewById(R.id.btnFalso);

        mediaPlayer = MediaPlayer.create(getContext(),R.raw.correct);

        int session_state = getActivity().getSharedPreferences("SESSION", Context.MODE_PRIVATE).getInt("session_state",0);

        if (session_state==2) {
            final int random = getRandom();

            txtVF.setText(misreactivos.getPreguntas_VF(random));

            btnVerdadero.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (misreactivos.checkRespuesta_VF("verdadero",random)==1) {
                        //Toast.makeText(getActivity(), "Correcto", Toast.LENGTH_SHORT).show();
                        score = getActivity().getSharedPreferences("SCORE", Context.MODE_PRIVATE).getInt("score",0) + 1 ;
                        getActivity().getSharedPreferences("SCORE", Context.MODE_PRIVATE).edit().putInt("score",score).commit();
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
            });

            btnFalso.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (misreactivos.checkRespuesta_VF("falso",random)==1) {
                        //Toast.makeText(getActivity(), "Correcto", Toast.LENGTH_SHORT).show();
                        score = getActivity().getSharedPreferences("SCORE", Context.MODE_PRIVATE).getInt("score",0) + 1 ;
                        getActivity().getSharedPreferences("SCORE", Context.MODE_PRIVATE).edit().putInt("score",score).commit();
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
            });
        }
        else {
            final String DATOS = getActivity().getSharedPreferences("DIAGNOSTICO", MODE_PRIVATE).getString("examen","null");
            final int index = getActivity().getSharedPreferences("DIAGNOSTICO", Context.MODE_PRIVATE).getInt("index",0);
            txtVF.setText(miDiagnostico.getPregunta(index, DATOS));

            btnVerdadero.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (miDiagnostico.checkRespuesta("verdadero",index, DATOS)==1) {
                        //Toast.makeText(getActivity(), "Correcto", Toast.LENGTH_SHORT).show();
                        score = getActivity().getSharedPreferences("SCORE", Context.MODE_PRIVATE).getInt("score",0) + 1 ;
                        getActivity().getSharedPreferences("SCORE", Context.MODE_PRIVATE).edit().putInt("score",score).commit();
                        mediaPlayer.start();
                    }
                    else {
                        Vibrator vibrator = (Vibrator) getActivity().getSystemService(Context.VIBRATOR_SERVICE);
                        vibrator.vibrate(160);
                    }
                    ((FragmentTransition)getActivity()).siguiente();
                }
            });

            btnFalso.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (miDiagnostico.checkRespuesta("falso",index, DATOS)==1) {
                        //Toast.makeText(getActivity(), "Correcto", Toast.LENGTH_SHORT).show();
                        score = getActivity().getSharedPreferences("SCORE", Context.MODE_PRIVATE).getInt("score",0) + 1 ;
                        getActivity().getSharedPreferences("SCORE", Context.MODE_PRIVATE).edit().putInt("score",score).commit();
                        mediaPlayer.start();
                    }
                    else {
                        Vibrator vibrator = (Vibrator) getActivity().getSystemService(Context.VIBRATOR_SERVICE);
                        vibrator.vibrate(160);
                    }
                    ((FragmentTransition)getActivity()).siguiente();
                }
            });

        }





        return rootView;
    }

    public int getRandom() {
        int numero = (int) (Math.random()*5);

        return numero;
    }

}
