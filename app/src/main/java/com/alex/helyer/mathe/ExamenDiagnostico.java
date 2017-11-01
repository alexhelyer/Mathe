package com.alex.helyer.mathe;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;

import java.util.ArrayList;
import java.util.List;

import static android.content.Context.MODE_PRIVATE;

/**
 * Created by helyer on 25/10/17.
 */

public class ExamenDiagnostico {



    //public String DATOS;




    public String[] INDEX = {"2","0","2"};
    public String[] PREGUNTAS = {"2+2=","Cuantos es 2+2","2+2=4"};
    public String[] RESPUESTAS = {"4","4","verdadero"};

    public String[] OPCION1 = {"na","1","na"};
    public String[] OPCION2 = {"na","2","na"};
    public String[] OPCION3 = {"na","3","na"};
    public String[] OPCION4 = {"na","5","na"};


    public String[] PREGUNTAS2 = {"3+3=","Cuantos es 3+3","3+3=6"};



    /*
    public String[] INDEX = getDatosJSON("tipo");
    public String[] PREGUNTAS = getDatosJSON("reactivo");
    public String[] RESPUESTAS = getDatosJSON("respuesta");

    public String[] OPCION1 = getDatosJSON("opc1");
    public String[] OPCION2 = getDatosJSON("opc2");
    public String[] OPCION3 = getDatosJSON("opc3");
    public String[] OPCION4 = getDatosJSON("opc4");
    */

    public String getPregunta(int index, String datos) {
        PREGUNTAS = getDatosJSON(datos,"reactivo");
        String pregunta = PREGUNTAS[index];
        return pregunta;
    }
    public int checkRespuesta(String answer, int index, String datos) {
        RESPUESTAS = getDatosJSON(datos,"respuesta");

        int res = 0;

        if (answer.contentEquals(RESPUESTAS[index])) {
            res = 1;
        }

        return res;
    }

    public String getRes_Multiple(int index, int opc, String datos) {
        OPCION1 = getDatosJSON(datos,"opc1");
        OPCION2 = getDatosJSON(datos,"opc2");
        OPCION3 = getDatosJSON(datos,"opc3");
        OPCION4 = getDatosJSON(datos,"opc4");
        String res = "null";

        switch (opc) {
            case 1:
                res = OPCION1[index];
                break;
            case 2:
                res = OPCION2[index];
                break;
            case 3:
                res = OPCION3[index];
                break;
            case 4:
                res = OPCION4[index];
                break;
        }
        return res;
    }

    public String getCorrect_Multiple(int index, String datos) {
        RESPUESTAS = getDatosJSON(datos,"respuesta");
        String respuesta = RESPUESTAS[index];
        return respuesta;
    }

    public String getIndex(int index, String datos) {
        INDEX = getDatosJSON(datos,"tipo");
        String respuesta = INDEX[index];
        return respuesta;
    }




    private String[] getDatosJSON(String json, String columna) {
        String[] lista = new String[20];

        try {
            Log.i("Error","Entro JSON"+json);
            JSONArray jsonArray = new JSONArray(json);
            String text;
            for (int i=0; i<20; i++){
                text = jsonArray.getJSONObject(i).getString(columna);
                lista[i] = text;
                Log.i("Item"+i,"text:"+text);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        Log.i("Termino","ejecucion");
        return lista;
    }

}
