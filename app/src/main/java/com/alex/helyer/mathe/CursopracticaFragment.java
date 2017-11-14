package com.alex.helyer.mathe;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static android.content.Context.MODE_PRIVATE;


/**
 * A simple {@link Fragment} subclass.
 */
public class CursopracticaFragment extends Fragment {

    private ExpandableListView expandableListView;
    private ExpandableListAdapter listAdapter;
    private List<String> listDataHeader;
    private HashMap<String, List<String>> listHash;

    public CursopracticaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_cursopractica, container, false);

        expandableListView = (ExpandableListView) rootView.findViewById(R.id.ExpListView);
        setData();
        listAdapter = new ExpandableListAdapter( getActivity() , listDataHeader, listHash);
        expandableListView.setAdapter(listAdapter);

        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {

            @Override
            public boolean onChildClick( ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {

                int miID = groupPosition*4 + childPosition;

                Toast.makeText(getActivity(), "myID:" + miID , Toast.LENGTH_SHORT).show();

                //Subtema actual: Modificamos una variable para mostrar el tip adecuado
                getActivity().getSharedPreferences("SUBTEMA_ACTUAL", MODE_PRIVATE).edit().putInt("subtema",miID+1).apply();

                Intent intent;
                intent = new Intent(getActivity(), QuizActivity.class);
                startActivity(intent);

                return false;
            }
        });

        return rootView;
    }

    private void setData() {
        listDataHeader = new ArrayList<>();
        listHash = new HashMap<>();

        listDataHeader.add("Aritmética");
        listDataHeader.add("Álgebra");
        listDataHeader.add("Geometría");
        listDataHeader.add("Trigonometría");
        listDataHeader.add("Probabilidad");

        List<String> aritmetica = new ArrayList<>();
        aritmetica.add("Decimales");
        aritmetica.add("Naturales");
        aritmetica.add("Enteros");
        aritmetica.add("Fraccionarios");

        List<String> algebra = new ArrayList<>();
        algebra.add("Ecuación de primer grado x+a=b");
        algebra.add("Ecuación de primer grado (ax+b=cx+d)");
        algebra.add("Ecuación de segundo grado");
        algebra.add("Factorización");

        List<String> geometria = new ArrayList<>();
        geometria.add("Perímetros y Áreas");
        geometria.add("Volumén de cubos");
        geometria.add("Prismas y pirámides");
        geometria.add("Ecuación de la pendiente");

        List<String> trigonometria = new ArrayList<>();
        trigonometria.add("Triángulos isósceles y equilateros");
        trigonometria.add("Ángulos inscritos");
        trigonometria.add("Triángulos rectángulos");
        trigonometria.add("Teorema de Pitágoras");

        List<String> probabilidad = new ArrayList<>();
        probabilidad.add("Dos eventos mutuamente excluyentes");
        probabilidad.add("Dos eventos independientes");
        probabilidad.add("Resultados equiprobables y no equiprobables");

        listHash.put(listDataHeader.get(0), aritmetica);
        listHash.put(listDataHeader.get(1), algebra);
        listHash.put(listDataHeader.get(2), geometria);
        listHash.put(listDataHeader.get(3), trigonometria);
        listHash.put(listDataHeader.get(4), probabilidad);
    }

    @Override
    public void onResume() {
        super.onResume();
        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle("Curso");
        ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(false);
    }
}
