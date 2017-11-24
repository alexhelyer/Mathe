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
                alertDialog2.setMessage("¡Esta insignia va de nuestra parte!");
                alertDialog2.setTitle("Terrícola \uD83D\uDE0E").show();
                break;
            case 2:
                if(puntos<100){
                    alertDialog.setMessage("Necesitas 100 puntos para desbloquear esta insignia");
                    alertDialog.setTitle("Ups ☹").show();
                } else{
                    alertDialog.setMessage("¡Bien hecho! Ganaste esta insignia al conseguir 100 puntos ;)");
                    alertDialog.setTitle("Pensador \uD83D\uDE0E").show();
                }

                break;
            case 3:
                if(puntos<500) {
                    alertDialog.setMessage("Necesitas 500 puntos para desbloquear esta insignia");
                    alertDialog.setTitle("Ups ☹").show();
                }else{
                    alertDialog.setMessage("¡Bien hecho! Ganaste esta insignia al conseguir 500 puntos ;)");
                    alertDialog.setTitle("Analista \uD83D\uDE0E").show();
                }
                break;
            case 4:
                if(puntos<1000) {
                    alertDialog.setMessage("Necesitas 1000 puntos para desbloquear esta insignia");
                    alertDialog.setTitle("Ups ☹️").show();
                } else{
                    alertDialog.setMessage("¡Bien hecho! Ganaste esta insignia al conseguir 1000 puntos ;)");
                    alertDialog.setTitle("Rey \uD83D\uDE0E").show();
                }
                break;
            case 5:
                if(puntos<2000) {
                    alertDialog.setMessage("Necesitas 2000 puntos para desbloquear esta insignia");
                    alertDialog.setTitle("Ups ☹️").show();
                } else{
                    alertDialog.setMessage("¡Bien hecho! Ganaste esta insignia al conseguir 2000 puntos ;)");
                    alertDialog.setTitle("Explorador \uD83D\uDE0E").show();
                }
                break;
            case 6:
                if(puntos<5000) {
                    alertDialog.setMessage("Necesitas 5000 puntos para desbloquear esta insignia");
                    alertDialog.setTitle("Ups ☹️").show();
                } else{
                    alertDialog.setMessage("¡Bien hecho! Ganaste esta insignia al conseguir 5000 puntos ;)");
                    alertDialog.setTitle("Conquistador \uD83D\uDE0E").show();
                }
                break;
            case 7:
                if(puntos<10000) {
                    alertDialog.setMessage("Necesitas 10000 puntos para desbloquear esta insignia");
                    alertDialog.setTitle("Ups ☹️").show();
                } else{
                    alertDialog.setMessage("¡Bien hecho! Ganaste esta insignia al conseguir 10000 puntos ;)");
                    alertDialog.setTitle("Astronauta \uD83D\uDE0E").show();
                }
                break;
            case 8:
                if(puntos<15000) {
                    alertDialog.setMessage("Necesitas 15000 puntos para desbloquear esta insignia");
                    alertDialog.setTitle("Ups ☹️").show();
                } else{
                    alertDialog.setMessage("¡Bien hecho! Ganaste esta insignia al conseguir 15000 puntos ;)");
                    alertDialog.setTitle("Conquistador de tierras lejanas \uD83D\uDE0E").show();
                }
                break;
            case 9:
                if(puntos<20000) {
                    alertDialog.setMessage("Necesitas 20000 puntos para desbloquear esta insignia");
                    alertDialog.setTitle("Ups ☹️").show();
                } else{
                    alertDialog.setMessage("¡Bien hecho! Ganaste esta insignia al conseguir 20000 puntos \uD83D\uDE0A");
                    alertDialog.setTitle("Campeón Universal \uD83D\uDE0E").show();
                }
                break;
        }


    }

}
