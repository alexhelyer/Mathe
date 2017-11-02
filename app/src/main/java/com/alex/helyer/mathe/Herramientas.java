package com.alex.helyer.mathe;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

import static android.content.Context.MODE_PRIVATE;

/**
 * Created by pc on 02/11/2017.
 */

public class Herramientas extends Fragment {

    private Button button;
    private Switch sonido;
    private Switch vibracion;
    private Boolean stateSonido, stateVibracion;

    public Herramientas() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View herramientas = inflater.inflate(R.layout.herramientas_fragment, container, false);

        //Show ActionBar and Back Arrow
        ((AppCompatActivity) getActivity()).getSupportActionBar().show();
        ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        button = (Button) herramientas.findViewById(R.id.logout);
        sonido = (Switch) herramientas.findViewById(R.id.switch_sonido);
        vibracion = (Switch) herramientas.findViewById(R.id.switch_vibracion);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "logout", Toast.LENGTH_SHORT).show();
            }
        });


        //Settings
        stateSonido = getActivity().getSharedPreferences("SETTINGS", MODE_PRIVATE).getBoolean("sonido",false);
        if(stateSonido){
            sonido.setChecked(true);
        } else {
            sonido.setChecked(false);
        }
        stateVibracion = getActivity().getSharedPreferences("SETTINGS", MODE_PRIVATE).getBoolean("vibracion",false);
        if(stateVibracion){
            vibracion.setChecked(true);
        } else {
            vibracion.setChecked(false);
        }

        //Listeners Settings (audio and vibration)
        vibracion.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    getActivity().getSharedPreferences("SETTINGS", MODE_PRIVATE).edit().putBoolean("vibracion",isChecked).commit();
                } else{
                    getActivity().getSharedPreferences("SETTINGS", MODE_PRIVATE).edit().putBoolean("vibracion",isChecked).commit();
                }
            }
        });
        sonido.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    getActivity().getSharedPreferences("SETTINGS", MODE_PRIVATE).edit().putBoolean("sonido",isChecked).commit();
                } else{
                    getActivity().getSharedPreferences("SETTINGS", MODE_PRIVATE).edit().putBoolean("sonido",isChecked).commit();
                }
            }
        });


        return herramientas;
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setHasOptionsMenu(true);
        super.onCreate(savedInstanceState);
    }


    //Change fragment with back arrow
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                // todo: goto back activity from here
                Toast.makeText(getActivity(), "Back", Toast.LENGTH_SHORT).show();
                getFragmentManager().beginTransaction().replace(R.id.content, new AcercaFragment()).commit();
                return true;


            default:
                return super.onOptionsItemSelected(item);

        }
    }
}
