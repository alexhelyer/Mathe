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
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.content.Context.MODE_PRIVATE;


/**
 * A simple {@link Fragment} subclass.
 */
public class AbiertaFragment extends Fragment {

    TextView txtAbierta;
    EditText resAbierta;
    Button btnOk;
    Reactivos misreactivos = new Reactivos();
    ReactivosN1 reactivosN1 = new ReactivosN1();
    ReactivosN2 reactivosN2 = new ReactivosN2();
    ReactivosN3 reactivosN3 = new ReactivosN3();

    ExamenDiagnostico miDiagnostico = new ExamenDiagnostico();
    int score;
    MediaPlayer mediaPlayer;
    private Boolean sonidoState, vibracionState;





    int mi_nivel = 1;







    public AbiertaFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_abierta, container, false);
        txtAbierta = (TextView) rootView.findViewById(R.id.txtAbierta);
        resAbierta = (EditText) rootView.findViewById(R.id.resAbierta);
        btnOk = (Button) rootView.findViewById(R.id.btnOk);

        mediaPlayer = MediaPlayer.create(getContext(),R.raw.correct);

        final int session_state = getActivity().getSharedPreferences("SESSION", Context.MODE_PRIVATE).getInt("session_state",0);




        if (session_state==2) {





            mi_nivel = getActivity().getSharedPreferences("ALGORITMO", Context.MODE_PRIVATE).getInt("nivel",1);
            final int random = getRandom();

            if (mi_nivel==3) {
                txtAbierta.setText(reactivosN3.getPreguntas_A(random));

                btnOk.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        String mirespuesta = resAbierta.getText().toString();
                        if (!mirespuesta.contentEquals("")) {
                            if (reactivosN3.checkRespuesta_A(mirespuesta,random)==1) {
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

                    }
                });
            }
            else if (mi_nivel==2) {
                txtAbierta.setText(reactivosN2.getPreguntas_A(random));

                btnOk.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        String mirespuesta = resAbierta.getText().toString();
                        if (!mirespuesta.contentEquals("")) {
                            if (reactivosN2.checkRespuesta_A(mirespuesta,random)==1) {
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

                    }
                });
            }
            else {
                txtAbierta.setText(reactivosN1.getPreguntas_A(random));

                btnOk.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        String mirespuesta = resAbierta.getText().toString();
                        if (!mirespuesta.contentEquals("")) {
                            if (reactivosN1.checkRespuesta_A(mirespuesta,random)==1) {
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

                    }
                });
            }



        }
        else {
            final String DATOS = getActivity().getSharedPreferences("DIAGNOSTICO", MODE_PRIVATE).getString("examen","null");
            final int index = getActivity().getSharedPreferences("DIAGNOSTICO", Context.MODE_PRIVATE).getInt("index",0);
            txtAbierta.setText(miDiagnostico.getPregunta(index, DATOS));

            btnOk.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    String mirespuesta = resAbierta.getText().toString();
                    if (!mirespuesta.contentEquals("")) {
                        if (miDiagnostico.checkRespuesta(mirespuesta,index, DATOS)==1) {
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
