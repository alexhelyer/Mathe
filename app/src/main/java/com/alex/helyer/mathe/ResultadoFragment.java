package com.alex.helyer.mathe;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.github.lzyzsd.circleprogress.DonutProgress;


/**
 * A simple {@link Fragment} subclass.
 */
public class ResultadoFragment extends Fragment {

    DonutProgress donutProgress;

    TextView txtScore;
    Button btnOK;


    //SharedPreferences sharedPref = getActivity().getPreferences(Context.MODE_PRIVATE);

    //int score = sharedPref.getInt("score_final",-1);

    public ResultadoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_resultado, container, false);


        donutProgress = (DonutProgress) rootView.findViewById(R.id.donut_progress);
        txtScore = (TextView) rootView.findViewById(R.id.txtScore);
        btnOK = (Button) rootView.findViewById(R.id.btnOK);


        int score = getActivity().getSharedPreferences("SCORE", Context.MODE_PRIVATE).getInt("score",0);
        txtScore.setText(Integer.toString(score)+"/10");
        donutProgress.setDonut_progress(Integer.toString(score*10));

        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((FragmentTransition)getActivity()).siguiente();
                //getActivity().finish();
            }
        });



        return rootView;
    }

}
