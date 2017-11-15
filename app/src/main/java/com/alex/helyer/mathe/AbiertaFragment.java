package com.alex.helyer.mathe;


import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import com.github.javiersantos.materialstyleddialogs.MaterialStyledDialog;
import com.github.javiersantos.materialstyleddialogs.enums.Style;

import static android.content.Context.MODE_PRIVATE;


/**
 * A simple {@link Fragment} subclass.
 */
public class AbiertaFragment extends Fragment {

    TextView txtAbierta;
    EditText resAbierta;
    Button btnOk;
    //Reactivos misreactivos = new Reactivos();
    ReactivosN1 reactivosN1 = new ReactivosN1();
    ReactivosN2 reactivosN2 = new ReactivosN2();
    ReactivosN3 reactivosN3 = new ReactivosN3();
    ImageView tips;

    ExamenDiagnostico miDiagnostico = new ExamenDiagnostico();
    int score;
    MediaPlayer mediaPlayer;
    private Boolean sonidoState, vibracionState;





    int mi_nivel = 1;
    int mi_subte = 0;

    int indexRandom = 0;







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
        tips = (ImageView) rootView.findViewById(R.id.tips);

        mediaPlayer = MediaPlayer.create(getContext(),R.raw.correct);


        final int session_state = getActivity().getSharedPreferences("SESSION", Context.MODE_PRIVATE).getInt("session_state",0);




        if (session_state==2) {

            Intent intent = getActivity().getIntent();
            mi_subte = intent.getIntExtra("ID_subtema",0);
            Toast.makeText(getActivity(),"mi_subte"+mi_subte, Toast.LENGTH_SHORT).show();
            mi_nivel = getActivity().getSharedPreferences("ALGORITMO", Context.MODE_PRIVATE).getInt("nivel",1);

            ReactivosAbiertos reactivosAbiertos = new ReactivosAbiertos(mi_subte, mi_nivel);
            String DATOS = reactivosAbiertos.getDatos();
            final Reactivos reactivos = new Reactivos(DATOS);

            indexRandom = getRandomIndex(reactivos.getSize());
            //final int random = getRandom();

                txtAbierta.setText(reactivos.getPregunta(indexRandom));

                btnOk.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        String mirespuesta = resAbierta.getText().toString();
                        if (!mirespuesta.contentEquals("")) {
                            if (reactivos.checkRespuesta(mirespuesta,indexRandom)==1) {
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

        // ******* Dialogo de información *******///
        tips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Le pasamos al método de la clase TipClass un entero que se guarda en SharedPreferences
                //para elegir el subtema adecuado y le mandamos el contexto getActivity()
                TipsClass tipsClass = new TipsClass();
                tipsClass.showTipDialog(1,getActivity());
            }
        });

        return rootView;
    }

    public int getRandomIndex(int size) {
        int random = (int) (Math.random()*size);
        return random;
    }

}
