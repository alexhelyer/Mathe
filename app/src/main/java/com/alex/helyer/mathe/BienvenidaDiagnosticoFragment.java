package com.alex.helyer.mathe;


import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import static android.content.Context.VIBRATOR_SERVICE;


/**
 * A simple {@link Fragment} subclass.
 */
public class BienvenidaDiagnosticoFragment extends Fragment {

    Button btnDiagnosticoContinuar;




    public BienvenidaDiagnosticoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_bienvenida_diagnostico, container, false);

        btnDiagnosticoContinuar = (Button) rootView.findViewById(R.id.btnDiagnosticoContinuar);


        btnDiagnosticoContinuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((FragmentTransition)getActivity()).siguiente();
            }
        });


        return rootView;
    }

}
