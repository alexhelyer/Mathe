package com.alex.helyer.mathe;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import de.hdodenhof.circleimageview.CircleImageView;

import static android.content.Context.MODE_PRIVATE;


/**
 * A simple {@link Fragment} subclass.
 */
public class LogrosFragment extends Fragment {

    private ImageView imageView1,imageView2,imageView3,imageView4,imageView9,imageView5,imageView6,imageView7,imageView8;

    public LogrosFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_logros, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        imageView1 = (ImageView)getActivity().findViewById(R.id.image1);
        imageView2 = (ImageView)getActivity().findViewById(R.id.image2);
        imageView3 = (ImageView)getActivity().findViewById(R.id.image3);
        imageView4 = (ImageView)getActivity().findViewById(R.id.image4);
        imageView5 = (ImageView)getActivity().findViewById(R.id.image5);
        imageView6 = (ImageView)getActivity().findViewById(R.id.image6);
        imageView7 = (ImageView)getActivity().findViewById(R.id.image7);
        imageView8 = (ImageView)getActivity().findViewById(R.id.image8);
        imageView9 = (ImageView)getActivity().findViewById(R.id.image9);

        cambiarImagen();

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ControlInsignias controlInsignias = new ControlInsignias();
                controlInsignias.setLogro(1, getActivity());
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ControlInsignias controlInsignias = new ControlInsignias();
                controlInsignias.setLogro(2, getActivity());
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ControlInsignias controlInsignias = new ControlInsignias();
                controlInsignias.setLogro(3, getActivity());
            }
        });
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ControlInsignias controlInsignias = new ControlInsignias();
                controlInsignias.setLogro(4, getActivity());
            }
        });
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ControlInsignias controlInsignias = new ControlInsignias();
                controlInsignias.setLogro(5, getActivity());
            }
        });
        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ControlInsignias controlInsignias = new ControlInsignias();
                controlInsignias.setLogro(6, getActivity());
            }
        });
        imageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ControlInsignias controlInsignias = new ControlInsignias();
                controlInsignias.setLogro(7, getActivity());
            }
        });
        imageView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ControlInsignias controlInsignias = new ControlInsignias();
                controlInsignias.setLogro(8, getActivity());
            }
        });
        imageView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ControlInsignias controlInsignias = new ControlInsignias();
                controlInsignias.setLogro(9, getActivity());
            }
        });

            }

    public void cambiarImagen(){
        int Mispuntos = getActivity().getSharedPreferences("PERFIL", MODE_PRIVATE).getInt("puntos",0);
        imageView1.setImageResource(R.mipmap.insignia1); //Insignia de regalo
        if(Mispuntos >= 100){
            imageView2.setImageResource(R.mipmap.insignia2);
        }
        if(Mispuntos >= 500){
            imageView3.setImageResource(R.mipmap.insignia3);
        }
        if(Mispuntos >= 1000){
            imageView4.setImageResource(R.mipmap.insignia4);
        }
        if(Mispuntos >= 2000){
            imageView5.setImageResource(R.mipmap.insignia5);
        }
        if(Mispuntos >= 5000){
            imageView6.setImageResource(R.mipmap.insignia6);
        }
        if(Mispuntos >= 10000){
            imageView7.setImageResource(R.mipmap.insignia7);
        }
        if(Mispuntos >= 15000){
            imageView8.setImageResource(R.mipmap.insignia8);
        }
        if(Mispuntos >= 20000){
            imageView9.setImageResource(R.mipmap.insignia9);
        }

    }




}
