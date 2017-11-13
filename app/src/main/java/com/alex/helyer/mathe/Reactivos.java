package com.alex.helyer.mathe;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by helyer on 24/10/17.
 */

public class Reactivos {

    String DATOS;

    Reactivos (String datos) {
        DATOS = datos;
    }

    public int getSize() {
        JSONArray jsonArray = getJSONArray(DATOS);
        int respuesta = jsonArray.length();
        return respuesta;
    }

    public String getPregunta(int index) {
        String respuesta = getDatoJSON(DATOS,index,"reactivo");
        return respuesta;
    }

    public String getRespuesta(int index) {
        String respuesta = getDatoJSON(DATOS,index,"respuesta");
        return respuesta;
    }

    public int checkRespuesta(String answer, int index) {
        int res = 0;

        if (answer.contentEquals(getRespuesta(index))) {
            res = 1;
        }

        return res;
    }

    private JSONArray getJSONArray(String json) {
        JSONArray jsonArray = null;
        try {
            jsonArray = new JSONArray(json);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jsonArray;
    }

    private String getDatoJSON(String json, int index, String nombre) {
        String dato = "NULL";
        try {
            JSONArray jsonArray = new JSONArray(json);
            dato = jsonArray.getJSONObject(index).getString(nombre);

        } catch (JSONException e) {
            e.printStackTrace();
        }
        return dato;
    }


}
