package com.alex.helyer.mathe;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class GradoDiagnosticoFragment extends Fragment {

    Button DiagnosticoPrimero;
    Button DiagnosticoSegundo;
    Button DiagnosticoTercero;


    public GradoDiagnosticoFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_grado_diagnostico, container, false);

        DiagnosticoPrimero = (Button) rootView.findViewById(R.id.btnDiagnosticoPrimero);
        DiagnosticoSegundo = (Button) rootView.findViewById(R.id.btnDiagnosticoSegundo);
        DiagnosticoTercero = (Button) rootView.findViewById(R.id.btnDiagnosticoTercero);


        DiagnosticoPrimero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((FragmentTransition)getActivity()).siguiente();
            }
        });
        DiagnosticoSegundo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((FragmentTransition)getActivity()).siguiente();
            }
        });
        DiagnosticoTercero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((FragmentTransition)getActivity()).siguiente();
            }
        });
        return rootView;
    }

}
