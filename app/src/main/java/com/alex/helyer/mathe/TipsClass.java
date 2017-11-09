package com.alex.helyer.mathe;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;

import com.github.javiersantos.materialstyleddialogs.MaterialStyledDialog;
import com.github.javiersantos.materialstyleddialogs.enums.Style;

/**
 * Created by pc on 08/11/2017.
 */

public class TipsClass {

    public void showTipDialog(int subtema, Context context){

        final MaterialStyledDialog.Builder dialogHeader = new MaterialStyledDialog.Builder(context);

        switch (subtema){
            //Adding a custom View to the dialog
            //https://github.com/javiersantos/MaterialStyledDialogs/wiki/Adding-a-custom-view

            //--------------> Aritmética <-------------
            case 1: //Decimales
                //LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                //View customView = inflater.inflate(R.layout.image_profile_container, null);

                    dialogHeader.setStyle(Style.HEADER_WITH_TITLE)
                    .setScrollable(true)
                    .setHeaderDrawable(R.drawable.header)
                    .withDialogAnimation(true)
                    .withDarkerOverlay(true)
                    .setTitle("Decimales")
                    .setDescription("Los números decimales son otra forma de representar las fracciones, por esto, algunas fracciones se pueden convertir en números decimales.\n" +
                            "\n• La Décima es la unidad dividida en 10 partes iguales = 1/10 = 0.1" +
                            "\n• La Centésima es la unidad dividida en 100 partes iguales = 1/100 = 0.01" +
                            "\n• La Milésima es la unidad dividida en 1000 partes iguales = 1/1000 = 0.001" +
                            "\n\nPor ejemplo:\n" +
                            "8/10 (ocho décimos) es lo mismo que 8 dividido 10 y el resultado de esto es: 0.8 y se lee: cero punto ocho.")
                    .setPositiveText("Entendido");
                break;
            case 2: //Naturales
                dialogHeader.setStyle(Style.HEADER_WITH_TITLE)
                        .setHeaderDrawable(R.drawable.header)
                        .withDialogAnimation(true)
                        .withDarkerOverlay(true)
                        .setTitle("Naturales")
                        .setDescription("Aquí van las fórmulas")
                        .setPositiveText("Entendido");
                break;
            case 3: //Enteros
                dialogHeader.setStyle(Style.HEADER_WITH_TITLE)
                        .setHeaderDrawable(R.drawable.header)
                        .withDialogAnimation(true)
                        .withDarkerOverlay(true)
                        .setTitle("Enteros")
                        .setDescription("Aquí van las fórmulas")
                        .setPositiveText("Entendido");
                break;
            case 4: //Fraccionarios
                dialogHeader.setStyle(Style.HEADER_WITH_TITLE)
                        .setHeaderDrawable(R.drawable.header)
                        .withDialogAnimation(true)
                        .withDarkerOverlay(true)
                        .setTitle("Fraccionarios")
                        .setDescription("Aquí van las fórmulas")
                        .setPositiveText("Entendido");
                break;
            //--------------> Álgebra <-------------
            case 5: //Ecuación de 1er Grado 1ra forma (x+a=b)
                dialogHeader.setStyle(Style.HEADER_WITH_TITLE)
                        .setHeaderDrawable(R.drawable.header)
                        .withDialogAnimation(true)
                        .withDarkerOverlay(true)
                        .setTitle("Ecuación de 1er Grado")
                        .setDescription("Aquí van las fórmulas")
                        .setPositiveText("Entendido");
                break;
            case 6: //Ecuación de 1er Grado 2da forma (ax+b=cx+d)
                dialogHeader.setStyle(Style.HEADER_WITH_TITLE)
                        .setHeaderDrawable(R.drawable.header)
                        .withDialogAnimation(true)
                        .withDarkerOverlay(true)
                        .setTitle("Ecuación de 1er Grado")
                        .setDescription("Aquí van las fórmulas")
                        .setPositiveText("Entendido");
                break;
            case 7: //Ecuación de 2do Grado
                dialogHeader.setStyle(Style.HEADER_WITH_TITLE)
                        .setHeaderDrawable(R.drawable.header)
                        .withDialogAnimation(true)
                        .withDarkerOverlay(true)
                        .setTitle("Ecuación de 2do Grado")
                        .setDescription("Aquí van las fórmulas")
                        .setPositiveText("Entendido");
                break;
            case 8: //Factorización
                dialogHeader.setStyle(Style.HEADER_WITH_TITLE)
                        .setHeaderDrawable(R.drawable.header)
                        .withDialogAnimation(true)
                        .withDarkerOverlay(true)
                        .setTitle("Factorización")
                        .setDescription("Aquí van las fórmulas")
                        .setPositiveText("Entendido");
                break;
            //--------------> Geometría <-------------
            case 9: //Perímetros y Áreas
                dialogHeader.setStyle(Style.HEADER_WITH_TITLE)
                        .setHeaderDrawable(R.drawable.header)
                        .withDialogAnimation(true)
                        .withDarkerOverlay(true)
                        .setTitle("Perímetros y Áreas")
                        .setDescription("Aquí van las fórmulas")
                        .setPositiveText("Entendido");
                break;
            case 10: //Volumen de Cubos
                dialogHeader.setStyle(Style.HEADER_WITH_TITLE)
                        .setHeaderDrawable(R.drawable.header)
                        .withDialogAnimation(true)
                        .withDarkerOverlay(true)
                        .setTitle("Perímetros y Áreas")
                        .setDescription("Aquí van las fórmulas")
                        .setPositiveText("Entendido");
                break;
            case 11: //Prismas y Pirámides
                dialogHeader.setStyle(Style.HEADER_WITH_TITLE)
                        .setHeaderDrawable(R.drawable.header)
                        .withDialogAnimation(true)
                        .withDarkerOverlay(true)
                        .setTitle("Prismas y Pirámides")
                        .setDescription("Aquí van las fórmulas")
                        .setPositiveText("Entendido");
                break;
            case 12: //Ecuación de la Pendiente
                dialogHeader.setStyle(Style.HEADER_WITH_TITLE)
                        .setHeaderDrawable(R.drawable.header)
                        .withDialogAnimation(true)
                        .withDarkerOverlay(true)
                        .setTitle("Ecuación de la Pendiente")
                        .setDescription("Aquí van las fórmulas")
                        .setPositiveText("Entendido");
                break;
            //--------------> Trigonometría <-------------
            case 13: //Triángulos Isósceles y Equilateros
                dialogHeader.setStyle(Style.HEADER_WITH_TITLE)
                        .setHeaderDrawable(R.drawable.header)
                        .withDialogAnimation(true)
                        .withDarkerOverlay(true)
                        .setTitle("Triángulos Isósceles y Equilateros")
                        .setDescription("Aquí van las fórmulas")
                        .setPositiveText("Entendido");
                break;
            case 14: //Ángulos Inscritos
                dialogHeader.setStyle(Style.HEADER_WITH_TITLE)
                        .setHeaderDrawable(R.drawable.header)
                        .withDialogAnimation(true)
                        .withDarkerOverlay(true)
                        .setTitle("Ángulos Inscritos")
                        .setDescription("Aquí van las fórmulas")
                        .setPositiveText("Entendido");
                break;
            case 15: //Triángulos Rectángulos
                dialogHeader.setStyle(Style.HEADER_WITH_TITLE)
                        .setHeaderDrawable(R.drawable.header)
                        .withDialogAnimation(true)
                        .withDarkerOverlay(true)
                        .setTitle("Triángulos Rectángulos")
                        .setDescription("Aquí van las fórmulas")
                        .setPositiveText("Entendido");
                break;
            case 16: //Teorema de Pitágoras
                dialogHeader.setStyle(Style.HEADER_WITH_TITLE)
                        .setHeaderDrawable(R.drawable.header)
                        .withDialogAnimation(true)
                        .withDarkerOverlay(true)
                        .setTitle("Teorema de Pitágoras")
                        .setDescription("Aquí van las fórmulas")
                        .setPositiveText("Entendido");
                break;
            //--------------> Probabilidad <-------------
            case 17: //Dos eventos mutuamente excluyentes
                dialogHeader.setStyle(Style.HEADER_WITH_TITLE)
                        .setHeaderDrawable(R.drawable.header)
                        .withDialogAnimation(true)
                        .withDarkerOverlay(true)
                        .setTitle("Dos eventos mutuamente excluyentes")
                        .setDescription("Aquí van las fórmulas")
                        .setPositiveText("Entendido");
                break;
            case 18: //Dos eventos independientes
                dialogHeader.setStyle(Style.HEADER_WITH_TITLE)
                        .setHeaderDrawable(R.drawable.header)
                        .withDialogAnimation(true)
                        .withDarkerOverlay(true)
                        .setTitle("Dos eventos independientes")
                        .setDescription("Aquí van las fórmulas")
                        .setPositiveText("Entendido");
                break;
            case 19: //Resultados equiprobables y no equiprobables
                dialogHeader.setStyle(Style.HEADER_WITH_TITLE)
                        .setHeaderDrawable(R.drawable.header)
                        .withDialogAnimation(true)
                        .withDarkerOverlay(true)
                        .setTitle("Resultados equiprobables y no equiprobables")
                        .setDescription("Aquí van las fórmulas")
                        .setPositiveText("Entendido");
                break;
        }


        dialogHeader.show();
    }

}
