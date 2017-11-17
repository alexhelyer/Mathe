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

            case 1: //Naturales
                dialogHeader.setStyle(Style.HEADER_WITH_TITLE)
                        .setScrollable(true)
                        .setHeaderDrawable(R.drawable.header)
                        .withDialogAnimation(true)
                        .withDarkerOverlay(true)
                        .setTitle("Naturales")
                        .setDescription("El porcentaje es un símbolo matemático, que representa una cantidad dada como una fracción en 100 partes iguales" +
                                "\n• Los números naturales pertenecen al conjunto de los números enteros positivos: no tienen decimales, no son fraccionarios y se encuentran a la derecha del cero en la recta real")
                        .setPositiveText("Entendido");
                break;
            case 2: //Enteros
                dialogHeader.setStyle(Style.HEADER_WITH_TITLE)
                        .setScrollable(true)
                        .setHeaderDrawable(R.drawable.header)
                        .withDialogAnimation(true)
                        .withDarkerOverlay(true)
                        .setTitle("Enteros")
                        .setDescription("Los números enteros abarcan a los números naturales, incluyendo al cero y a los números negativos")
                        .setPositiveText("Entendido");
                break;
            case 3: //Fraccionarios
                dialogHeader.setStyle(Style.HEADER_WITH_TITLE)
                        .setHeaderDrawable(R.drawable.header)
                        .setScrollable(true)
                        .withDialogAnimation(true)
                        .withDarkerOverlay(true)
                        .setTitle("Fraccionarios")
                        .setDescription("Para resolver una división de fracciones debes multiplicar el numerador de una fracción, por el denominador de la otra y viceversa")
                        .setPositiveText("Entendido");
                break;
            case 4: //Decimales
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
            //--------------> Álgebra <-------------
            case 5: //Ecuación de 1er Grado 1ra forma (x+a=b)
                dialogHeader.setStyle(Style.HEADER_WITH_TITLE)
                        .setScrollable(true)
                        .setHeaderDrawable(R.drawable.header)
                        .withDialogAnimation(true)
                        .withDarkerOverlay(true)
                        .setTitle("Ecuación de 1er Grado")
                        .setDescription("Procedimiento general para resolver ecuaciones enteras de primer grado:" +
                                "\n•  Se reducen los términos semejantes, cuando es posible" +
                                "\n• Se hace la transposición de términos, los que contengan la incógnita se ubican en el miembro izquierdo, y los que carezcan de ella en el derecho" +
                                "\n• Se reducen términos semejantes, hasta donde es posible" +
                                "\n• Se despeja la incógnita")
                        .setPositiveText("Entendido");
                break;
            case 6: //Ecuación de 1er Grado 2da forma (ax+b=cx+d)
                dialogHeader.setStyle(Style.HEADER_WITH_TITLE)
                        .setScrollable(true)
                        .setHeaderDrawable(R.drawable.header)
                        .withDialogAnimation(true)
                        .withDarkerOverlay(true)
                        .setTitle("Ecuación de 1er Grado")
                        .setDescription("Procedimiento general para resolver ecuaciones enteras de primer grado:" +
                                "\n•  Se reducen los términos semejantes, cuando es posible" +
                                "\n• Se hace la transposición de términos, los que contengan la incógnita se ubican en el miembro izquierdo, y los que carezcan de ella en el derecho" +
                                "\n• Se reducen términos semejantes, hasta donde es posible" +
                                "\n• Se despeja la incógnita")
                        .setPositiveText("Entendido");
                break;
            case 7: //Ecuación de 2do Grado
                dialogHeader.setStyle(Style.HEADER_WITH_TITLE)
                        .setScrollable(true)
                        .setHeaderDrawable(R.drawable.header)
                        .withDialogAnimation(true)
                        .withDarkerOverlay(true)
                        .setTitle("Ecuación de 2do Grado")
                        .setDescription("Para una ecuación cuadrática con coeficientes reales o complejos existen siempre dos soluciones, no necesariamente distintas, llamadas raíces, que pueden ser reales o complejas")
                        .setPositiveText("Entendido");
                break;
            case 8: //Factorización
                dialogHeader.setStyle(Style.HEADER_WITH_TITLE)
                        .setScrollable(true)
                        .setHeaderDrawable(R.drawable.header)
                        .withDialogAnimation(true)
                        .withDarkerOverlay(true)
                        .setTitle("Factorización")
                        .setDescription("Recuerda que para factorizar un polinomio puedes aplicar la propiedad distributiva de la multiplicación respecto de la suma" +
                                "\n Ejemplo: ax + ay = a(x+y)")
                        .setPositiveText("Entendido");
                break;
            //--------------> Geometría <-------------
            case 9: //Perímetros y Áreas
                dialogHeader.setStyle(Style.HEADER_WITH_TITLE)
                        .setScrollable(true)
                        .setHeaderDrawable(R.drawable.header)
                        .withDialogAnimation(true)
                        .withDarkerOverlay(true)
                        .setTitle("Perímetros y Áreas")
                        .setDescription("El perímetro es la suma de las longitudes de los lados de una figura geométrica plana." +
                                "\nLa fórmula para calcular el área del círculo es: A = π r²")
                        .setPositiveText("Entendido");
                break;
            case 10: //Volumen de Cubos
                dialogHeader.setStyle(Style.HEADER_WITH_TITLE)
                        .setScrollable(true)
                        .setHeaderDrawable(R.drawable.header)
                        .withDialogAnimation(true)
                        .withDarkerOverlay(true)
                        .setTitle("Volumen de Cubos")
                        .setDescription("El cubo es un poliedro con seis caras, cada una con forma de cuadrado y con las mismas dimensiones, unidas entre sí mediante ángulos rectos." +
                                "\n La forma más fácil de calcular su volumen es elevar al cubo la longitud de una de sus aristas")
                        .setPositiveText("Entendido");
                break;
            case 11: //Prismas y Pirámides
                dialogHeader.setStyle(Style.HEADER_WITH_TITLE)
                        .setScrollable(true)
                        .setHeaderDrawable(R.drawable.header)
                        .withDialogAnimation(true)
                        .withDarkerOverlay(true)
                        .setTitle("Prismas y Pirámides")
                        .setDescription("Recuerda que el volumen de una pirámide es un tercio del área de la base por la altura")
                        .setPositiveText("Entendido");
                break;
            case 12: //Ecuación de la Pendiente
                dialogHeader.setStyle(Style.HEADER_WITH_TITLE)
                        .setScrollable(true)
                        .setHeaderDrawable(R.drawable.header)
                        .withDialogAnimation(true)
                        .withDarkerOverlay(true)
                        .setTitle("Ecuación de la Pendiente")
                        .setDescription("La pendiente de una recta en un sistema de representación rectangular (de un plano cartesiano), " +
                                "\nsuele estar representada por la letra m, y está definida como la diferencia en el eje Y dividido por la " +
                                "\ndiferencia en el eje X para dos puntos distintos en una recta")
                        .setPositiveText("Entendido");
                break;
            //--------------> Trigonometría <-------------
            case 13: //Triángulos Isósceles y Equilateros
                dialogHeader.setStyle(Style.HEADER_WITH_TITLE)
                        .setScrollable(true)
                        .setHeaderDrawable(R.drawable.header)
                        .withDialogAnimation(true)
                        .withDarkerOverlay(true)
                        .setTitle("Triángulos Isósceles y Equilateros")
                        .setDescription("• Los triángulos equilateros tienen sus tres lados iguales"+
                                "\n• Los triángulos isosceles tienen dos lados iguales")
                        .setPositiveText("Entendido");
                break;
            case 14: //Ángulos Inscritos
                dialogHeader.setStyle(Style.HEADER_WITH_TITLE)
                        .setScrollable(true)
                        .setHeaderDrawable(R.drawable.header)
                        .withDialogAnimation(true)
                        .withDarkerOverlay(true)
                        .setTitle("Ángulos Inscritos")
                        .setDescription("• La suma de los ángulos de un triángulo es de 180 grados")
                        .setPositiveText("Entendido");
                break;
            case 15: //Triángulos Rectángulos
                dialogHeader.setStyle(Style.HEADER_WITH_TITLE)
                        .setScrollable(true)
                        .setHeaderDrawable(R.drawable.header)
                        .withDialogAnimation(true)
                        .withDarkerOverlay(true)
                        .setTitle("Triángulos Rectángulos")
                        .setDescription("Se denomina triángulo rectángulo a cualquier triángulo con un ángulo recto, es decir, un ángulo de 90 grados")
                        .setPositiveText("Entendido");
                break;
            case 16: //Teorema de Pitágoras
                dialogHeader.setStyle(Style.HEADER_WITH_TITLE)
                        .setScrollable(true)
                        .setHeaderDrawable(R.drawable.header)
                        .withDialogAnimation(true)
                        .withDarkerOverlay(true)
                        .setTitle("Teorema de Pitágoras")
                        .setDescription("El teorema de Pitágoras establece que en todo triángulo rectángulo, el cuadrado de la longitud de la hipotenusa" +
                                "\nes igual a la suma de los cuadrados de las respectivas longitudes de los catetos")
                        .setPositiveText("Entendido");
                break;
            //--------------> Probabilidad <-------------
            case 17: //Dos eventos mutuamente excluyentes
                dialogHeader.setStyle(Style.HEADER_WITH_TITLE)
                        .setScrollable(true)
                        .setHeaderDrawable(R.drawable.header)
                        .withDialogAnimation(true)
                        .withDarkerOverlay(true)
                        .setTitle("Dos eventos mutuamente excluyentes")
                        .setDescription("Los eventos mutuamente excluyentes son dos resultados de un evento que no pueden ocurrir al mismo tiempo")
                        .setPositiveText("Entendido");
                break;
            case 18: //Dos eventos independientes
                dialogHeader.setStyle(Style.HEADER_WITH_TITLE)
                        .setScrollable(true)
                        .setHeaderDrawable(R.drawable.header)
                        .withDialogAnimation(true)
                        .withDarkerOverlay(true)
                        .setTitle("Dos eventos independientes")
                        .setDescription("Los eventos independientes ocurren ya sea cuando:" +
                                "\n•  El proceso que genera el elemento aleatorio no elimina ningún posible resultado" +
                                "\n• El proceso sí elimina un posible resultado, pero el resultado es sustituido antes de que suceda una segunda acción")
                        .setPositiveText("Entendido");
                break;
            case 19: //Resultados equiprobables y no equiprobables
                dialogHeader.setStyle(Style.HEADER_WITH_TITLE)
                        .setScrollable(true)
                        .setHeaderDrawable(R.drawable.header)
                        .withDialogAnimation(true)
                        .withDarkerOverlay(true)
                        .setTitle("Resultados equiprobables y no equiprobables")
                        .setDescription("Los resultados equiprobables son aquellos en donde todos los posibles resultados de un evento" +
                                "\n o suceso tienen la misma oportunidad de salir")
                        .setPositiveText("Entendido");
                break;
        }


        dialogHeader.show();
    }

}
