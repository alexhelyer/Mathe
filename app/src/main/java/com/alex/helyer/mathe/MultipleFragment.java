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
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import static android.content.Context.MODE_PRIVATE;


/**
 * A simple {@link Fragment} subclass.
 */
public class MultipleFragment extends Fragment {

    TextView txtMultiple;

    Button btnOpc1;
    Button btnOpc2;
    Button btnOpc3;
    Button btnOpc4;
    private Boolean sonidoState, vibracionState;
    String answer = "null";
    ImageView tips;

    int score;

    //Reactivos misreactivos = new Reactivos();
    ReactivosN1 reactivosN1 = new ReactivosN1();
    ReactivosN2 reactivosN2 = new ReactivosN2();
    ReactivosN3 reactivosN3 = new ReactivosN3();
    int mi_nivel = 1;
    ExamenDiagnostico miDiagnostico = new ExamenDiagnostico();

    MediaPlayer mediaPlayer;

    public MultipleFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_multiple, container, false);

        txtMultiple = (TextView) rootView.findViewById(R.id.txtMultiple);
        btnOpc1 = (Button) rootView.findViewById(R.id.btnOpc1);
        btnOpc2 = (Button) rootView.findViewById(R.id.btnOpc2);
        btnOpc3 = (Button) rootView.findViewById(R.id.btnOpc3);
        btnOpc4 = (Button) rootView.findViewById(R.id.btnOpc4);
        tips = (ImageView) rootView.findViewById(R.id.tips);

        mediaPlayer = MediaPlayer.create(getContext(),R.raw.correct);

        int session_state = getActivity().getSharedPreferences("SESSION", Context.MODE_PRIVATE).getInt("session_state",0);

        if (session_state==2) {

            mi_nivel = getActivity().getSharedPreferences("ALGORITMO", Context.MODE_PRIVATE).getInt("nivel",1);
            final int random = getRandom();

            if (mi_nivel==3) {
                txtMultiple.setText(reactivosN3.getPreguntas_M(random));

                btnOpc1.setText(reactivosN3.getRes_Multiples(random,1));
                btnOpc2.setText(reactivosN3.getRes_Multiples(random,2));
                btnOpc3.setText(reactivosN3.getRes_Multiples(random,3));
                btnOpc4.setText(reactivosN3.getRes_Multiples(random,4));


                switch (getRandomCorrect()) {
                    case 1:
                        btnOpc1.setText(reactivosN3.getCorrect_Multiples(random));
                        break;
                    case 2:
                        btnOpc2.setText(reactivosN3.getCorrect_Multiples(random));
                        break;
                    case 3:
                        btnOpc3.setText(reactivosN3.getCorrect_Multiples(random));
                        break;
                    case 4:
                        btnOpc4.setText(reactivosN3.getCorrect_Multiples(random));
                        break;
                }

                btnOpc1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        answer = btnOpc1.getText().toString();
                        if (reactivosN3.checkRespuesta_M(answer,random)==1) {
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
                btnOpc2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        answer = btnOpc2.getText().toString();
                        if (reactivosN3.checkRespuesta_M(answer,random)==1) {
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
                btnOpc3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        answer = btnOpc3.getText().toString();
                        if (reactivosN3.checkRespuesta_M(answer,random)==1) {
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
                btnOpc4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        answer = btnOpc4.getText().toString();
                        if (reactivosN3.checkRespuesta_M(answer,random)==1) {
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
            else if (mi_nivel==2) {
                txtMultiple.setText(reactivosN2.getPreguntas_M(random));

                btnOpc1.setText(reactivosN2.getRes_Multiples(random,1));
                btnOpc2.setText(reactivosN2.getRes_Multiples(random,2));
                btnOpc3.setText(reactivosN2.getRes_Multiples(random,3));
                btnOpc4.setText(reactivosN2.getRes_Multiples(random,4));


                switch (getRandomCorrect()) {
                    case 1:
                        btnOpc1.setText(reactivosN2.getCorrect_Multiples(random));
                        break;
                    case 2:
                        btnOpc2.setText(reactivosN2.getCorrect_Multiples(random));
                        break;
                    case 3:
                        btnOpc3.setText(reactivosN2.getCorrect_Multiples(random));
                        break;
                    case 4:
                        btnOpc4.setText(reactivosN2.getCorrect_Multiples(random));
                        break;
                }

                btnOpc1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        answer = btnOpc1.getText().toString();
                        if (reactivosN2.checkRespuesta_M(answer,random)==1) {
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
                btnOpc2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        answer = btnOpc2.getText().toString();
                        if (reactivosN2.checkRespuesta_M(answer,random)==1) {
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
                btnOpc3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        answer = btnOpc3.getText().toString();
                        if (reactivosN2.checkRespuesta_M(answer,random)==1) {
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
                btnOpc4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        answer = btnOpc4.getText().toString();
                        if (reactivosN2.checkRespuesta_M(answer,random)==1) {
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
                txtMultiple.setText(reactivosN1.getPreguntas_M(random));

                btnOpc1.setText(reactivosN1.getRes_Multiples(random,1));
                btnOpc2.setText(reactivosN1.getRes_Multiples(random,2));
                btnOpc3.setText(reactivosN1.getRes_Multiples(random,3));
                btnOpc4.setText(reactivosN1.getRes_Multiples(random,4));


                switch (getRandomCorrect()) {
                    case 1:
                        btnOpc1.setText(reactivosN1.getCorrect_Multiples(random));
                        break;
                    case 2:
                        btnOpc2.setText(reactivosN1.getCorrect_Multiples(random));
                        break;
                    case 3:
                        btnOpc3.setText(reactivosN1.getCorrect_Multiples(random));
                        break;
                    case 4:
                        btnOpc4.setText(reactivosN1.getCorrect_Multiples(random));
                        break;
                }

                btnOpc1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        answer = btnOpc1.getText().toString();
                        if (reactivosN1.checkRespuesta_M(answer,random)==1) {
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
                btnOpc2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        answer = btnOpc2.getText().toString();
                        if (reactivosN1.checkRespuesta_M(answer,random)==1) {
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
                btnOpc3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        answer = btnOpc3.getText().toString();
                        if (reactivosN1.checkRespuesta_M(answer,random)==1) {
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
                btnOpc4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        answer = btnOpc4.getText().toString();
                        if (reactivosN1.checkRespuesta_M(answer,random)==1) {
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
        }
        else {
            final String DATOS = getActivity().getSharedPreferences("DIAGNOSTICO", MODE_PRIVATE).getString("examen","null");
            final int index = getActivity().getSharedPreferences("DIAGNOSTICO", Context.MODE_PRIVATE).getInt("index",0);
            txtMultiple.setText(miDiagnostico.getPregunta(index, DATOS));

            btnOpc1.setText(miDiagnostico.getRes_Multiple(index,1, DATOS));
            btnOpc2.setText(miDiagnostico.getRes_Multiple(index,2, DATOS));
            btnOpc3.setText(miDiagnostico.getRes_Multiple(index,3, DATOS));
            btnOpc4.setText(miDiagnostico.getRes_Multiple(index,4, DATOS));

            switch (getRandomCorrect()) {
                case 1:
                    btnOpc1.setText(miDiagnostico.getCorrect_Multiple(index, DATOS));
                    break;
                case 2:
                    btnOpc2.setText(miDiagnostico.getCorrect_Multiple(index, DATOS));
                    break;
                case 3:
                    btnOpc3.setText(miDiagnostico.getCorrect_Multiple(index, DATOS));
                    break;
                case 4:
                    btnOpc4.setText(miDiagnostico.getCorrect_Multiple(index, DATOS));
                    break;
            }

            btnOpc1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    answer = btnOpc1.getText().toString();
                    if (miDiagnostico.checkRespuesta(answer,index, DATOS)==1) {
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
            btnOpc2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    answer = btnOpc2.getText().toString();
                    if (miDiagnostico.checkRespuesta(answer,index, DATOS)==1) {
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
            btnOpc3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    answer = btnOpc3.getText().toString();
                    if (miDiagnostico.checkRespuesta(answer,index, DATOS)==1) {
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
            btnOpc4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    answer = btnOpc4.getText().toString();
                    if (miDiagnostico.checkRespuesta(answer,index, DATOS)==1) {
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
        tips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Le pasamos al método de la clase TipClass un entero que se guarda en SharedPreferences
                //para elegir el subtema adecuado y le mandamos el contexto getActivity()
                TipsClass tipsClass = new TipsClass();
                tipsClass.showTipDialog(18,getActivity());
            }
        });




        return rootView;
    }


    public int getRandom() {
        int numero = (int) (Math.random()*5);

        return numero;
    }

    public int getRandomCorrect() {
        int numero = (int) (Math.random()*4) + 1;

        return numero;
    }

}
