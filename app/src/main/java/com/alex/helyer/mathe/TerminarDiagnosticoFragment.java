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
public class TerminarDiagnosticoFragment extends Fragment {

    Button btnCompletarDiagnostico;

    public TerminarDiagnosticoFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_terminar_diagnostico, container, false);

        btnCompletarDiagnostico = (Button) rootView.findViewById(R.id.btnCompletarDiagnostico);

        btnCompletarDiagnostico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((FragmentTransition)getActivity()).siguiente();
            }
        });

        return rootView;
    }

}
