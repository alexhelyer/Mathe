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
import android.widget.ImageView;
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
    //Reactivos misreactivos = new Reactivos();
    ReactivosN1 reactivosN1 = new ReactivosN1();
    ReactivosN2 reactivosN2 = new ReactivosN2();
    ReactivosN3 reactivosN3 = new ReactivosN3();
    ExamenDiagnostico miDiagnostico = new ExamenDiagnostico();
    ImageView tips;
    int subtema;

    int score;

    MediaPlayer mediaPlayer;

    int mi_nivel = 1;
    int mi_subte = 0;

    int indexRandom = 0;

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
        tips = (ImageView) rootView.findViewById(R.id.tips);

        mediaPlayer = MediaPlayer.create(getContext(),R.raw.correct);

        int session_state = getActivity().getSharedPreferences("SESSION", Context.MODE_PRIVATE).getInt("session_state",0);

        //Escondemos los tips si esta resolviendo el diagnostico
        if(session_state==1){
            tips.setVisibility(View.INVISIBLE);
        }
        if (session_state==2) {

            Intent intent = getActivity().getIntent();
            mi_subte = intent.getIntExtra("ID_subtema",0);
            //Toast.makeText(getActivity(),"mi_subte"+mi_subte, Toast.LENGTH_SHORT).show();
            mi_nivel = getActivity().getSharedPreferences("ALGORITMO", Context.MODE_PRIVATE).getInt("nivel",1);

            ReactivosVF reactivosVF = new ReactivosVF(mi_subte, mi_nivel);
            String DATOS = reactivosVF.getDatos();
            final Reactivos reactivos = new Reactivos(DATOS);

            indexRandom = getRandomIndex(reactivos.getSize());

            //final int random = getRandom();

                txtVF.setText(reactivos.getPregunta(indexRandom));

                btnVerdadero.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (reactivos.checkRespuesta("verdadero",indexRandom)==1) {
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
                        if (reactivos.checkRespuesta("falso",indexRandom)==1) {
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

        // ******* Dialogo de información *******///
        subtema = getActivity().getSharedPreferences("SUBTEMA_ACTUAL", MODE_PRIVATE).getInt("subtema",0);
        tips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Le pasamos al método de la clase TipClass un entero que se guarda en SharedPreferences
                //para elegir el subtema adecuado y le mandamos el contexto getActivity()
                TipsClass tipsClass = new TipsClass();
                tipsClass.showTipDialog(subtema,getActivity());
            }
        });



        return rootView;
    }

    public int getRandomIndex(int size) {
        int random = (int) (Math.random()*size);
        return random;
    }

}
