package com.alex.helyer.mathe;

import android.content.Context;
import android.support.v7.app.AlertDialog;

import static android.content.Context.MODE_PRIVATE;

/**
 * Created by pc on 18/11/2017.
 */

public class ControlInsignias {


    public void setLogro(int indice, Context context){

        int puntos = context.getSharedPreferences("PERFIL", MODE_PRIVATE).getInt("puntos",0);

        AlertDialog.Builder alertDialog = new AlertDialog.Builder(context);
        switch (indice) {
            case 1:
                AlertDialog.Builder alertDialog2 = new AlertDialog.Builder(context);
                alertDialog2.setMessage("¡Esta insignia va de nuestra parte! tu nivel es"+puntos);
                alertDialog2.setTitle("¡Hola!").show();
                break;
            case 2:
                if(puntos<100){
                    alertDialog.setMessage("Necesitas 100 puntos para desbloquear esta insignia");
                    alertDialog.setTitle("Ups").show();
                } else{
                    alertDialog.setMessage("¡Bien hecho! Ganaste esta insignia al conseguir 100 puntos ;)");
                    alertDialog.setTitle("Ups").show();
                }

                break;
            case 3:
                if(puntos<500) {
                    alertDialog.setMessage("Necesitas 500 puntos para desbloquear esta insignia");
                    alertDialog.setTitle("Ups").show();
                }else{
                    alertDialog.setMessage("¡Bien hecho! Ganaste esta insignia al conseguir 500 puntos ;)");
                    alertDialog.setTitle("Ups").show();
                }
                break;
            case 4:
                if(puntos<1000) {
                    alertDialog.setMessage("Necesitas 1000 puntos para desbloquear esta insignia");
                    alertDialog.setTitle("Ups").show();
                } else{
                    alertDialog.setMessage("¡Bien hecho! Ganaste esta insignia al conseguir 1000 puntos ;)");
                    alertDialog.setTitle("Ups").show();
                }
                break;
            case 5:
                if(puntos<2000) {
                    alertDialog.setMessage("Necesitas 2000 puntos para desbloquear esta insignia");
                    alertDialog.setTitle("Ups").show();
                } else{
                    alertDialog.setMessage("¡Bien hecho! Ganaste esta insignia al conseguir 2000 puntos ;)");
                    alertDialog.setTitle("Ups").show();
                }
                break;
            case 6:
                if(puntos<5000) {
                    alertDialog.setMessage("Necesitas 5000 puntos para desbloquear esta insignia");
                    alertDialog.setTitle("Ups").show();
                } else{
                    alertDialog.setMessage("¡Bien hecho! Ganaste esta insignia al conseguir 5000 puntos ;)");
                    alertDialog.setTitle("Ups").show();
                }
                break;
            case 7:
                alertDialog.setMessage("Necesitas 350 puntos para desbloquear esta insignia");
                alertDialog.setTitle("Ups").show();
                break;
            case 8:
                alertDialog.setMessage("Necesitas 400 puntos para desbloquear esta insignia");
                alertDialog.setTitle("Ups").show();
                break;
            case 9:
                alertDialog.setMessage("Necesitas 450 puntos para desbloquear esta insignia");
                alertDialog.setTitle("Ups").show();
                break;
        }


    }

}
