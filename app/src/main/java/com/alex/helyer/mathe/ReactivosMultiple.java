package com.alex.helyer.mathe;

/**
 * Created by helyer on 14/11/17.
 */

public class ReactivosMultiple {
    int subtema, nivel;

    ReactivosMultiple(int misubtema, int minivel) {
        subtema = misubtema;
        nivel = minivel;
    }

    String DATOS = "[{\"id\":\"1\",\"tipo\":\"0\",\"reactivo\":\"s"+subtema+"-g0"+"-n"+nivel+"-tAbierto"+"\",\"respuesta\":\"2\",\"opc1\":\"28\\/11\",\"opc2\":\"7\",\"opc3\":\"11\\/2\",\"opc4\":\"14\"}]";

    public String getDatos() {

        switch (subtema) {
            case 0: //NATURALES
                switch (nivel) {
                    case 1:
                        DATOS = "[{\"id_reactivo_multiple\":\"25\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"1\",\"nivel\":\"1\",\"reactivo\":\"En la ecuaci\\u00f3n x-2=6  encuentra el valor de x\",\"respuesta\":\"8\",\"incorrecta1\":\"4\",\"incorrecta2\":\"-4\",\"incorrecta3\":\"-8\",\"incorrecta4\":\"6\",\"visto\":\"0\",\"fecha\":\"2017-10-11\"}, {\"id_reactivo_multiple\":\"90\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"2\",\"nivel\":\"1\",\"reactivo\":\"Resuelve (4)*(12)\",\"respuesta\":\"48\",\"incorrecta1\":\"36\",\"incorrecta2\":\"24\",\"incorrecta3\":\"46\",\"incorrecta4\":\"52\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_multiple\":\"91\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"2\",\"nivel\":\"1\",\"reactivo\":\"Resuelve 56-(5*3)\",\"respuesta\":\"41\",\"incorrecta1\":\"40\",\"incorrecta2\":\"153\",\"incorrecta3\":\"38\",\"incorrecta4\":\"42\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_multiple\":\"92\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"2\",\"nivel\":\"1\",\"reactivo\":\"Isaac Newton naci\\u00f3 en 1643 y muri\\u00f3 en 1727 \\u00bfCon qu\\u00e9 edad muri\\u00f3?\",\"respuesta\":\"85 a\\u00f1os\",\"incorrecta1\":\"80 a\\u00f1os\",\"incorrecta2\":\"75 a\\u00f1os\",\"incorrecta3\":\"77 a\\u00f1os\",\"incorrecta4\":\"79 a\\u00f1os\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_multiple\":\"93\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"2\",\"nivel\":\"1\",\"reactivo\":\"Resuelve 4*20-20\",\"respuesta\":\"60\",\"incorrecta1\":\"0\",\"incorrecta2\":\"80\",\"incorrecta3\":\"66\",\"incorrecta4\":\"62\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_multiple\":\"94\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"2\",\"nivel\":\"1\",\"reactivo\":\"Selecciona la opci\\u00f3n con n\\u00fameros m\\u00faltiplos de 4\",\"respuesta\":\"8,12,16\",\"incorrecta1\":\"8,12,14\",\"incorrecta2\":\"12,14,18\",\"incorrecta3\":\"6,10,20\",\"incorrecta4\":\"8,11,15\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}]";
                        break;
                    case 2:
                        DATOS = "[{\"id_reactivo_multiple\":\"95\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"2\",\"nivel\":\"2\",\"reactivo\":\"Jos\\u00e9 compro 1 kg de az\\u00facar por 20 pesos. \\u00bfCu\\u00e1nto le dar\\u00e1n por 5 pesos?\",\"respuesta\":\"1\\/4 g\",\"incorrecta1\":\"1\\/3 g\",\"incorrecta2\":\"300 g\",\"incorrecta3\":\"500 g\",\"incorrecta4\":\"50 g\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_multiple\":\"96\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"2\",\"nivel\":\"2\",\"reactivo\":\"De los 800 alumnos de un colegio, han ido de viaje 600. \\u00bfQu\\u00e9 porcentaje de alumnos ha ido de viaje?\",\"respuesta\":\"75%\",\"incorrecta1\":\"80%\",\"incorrecta2\":\"90%\",\"incorrecta3\":\"65%\",\"incorrecta4\":\"95%\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_multiple\":\"97\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"2\",\"nivel\":\"2\",\"reactivo\":\"Si 14 l\\u00e1pices cuestan 42 pesos. \\u00bfCu\\u00e1nto costar\\u00e1n 25 l\\u00e1pices?\",\"respuesta\":\"75 pesos\",\"incorrecta1\":\"60 pesos\",\"incorrecta2\":\"55 pesos\",\"incorrecta3\":\"80 pesos\",\"incorrecta4\":\"50 pesos\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_multiple\":\"98\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"2\",\"nivel\":\"2\",\"reactivo\":\"Si 5 obreros hacen una obra en 40 d\\u00edas, \\u00bfcu\\u00e1nto tardar\\u00e1n 8 obreros en hacer la misma obra?\",\"respuesta\":\"25 d\\u00edas\",\"incorrecta1\":\"20 d\\u00edas\",\"incorrecta2\":\"18 d\\u00edas\",\"incorrecta3\":\"27 d\\u00edas\",\"incorrecta4\":\"21 dias\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_multiple\":\"99\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"2\",\"nivel\":\"2\",\"reactivo\":\"Calcula el 35% de 150\",\"respuesta\":\"52.5\",\"incorrecta1\":\"55\",\"incorrecta2\":\"60\",\"incorrecta3\":\"75\",\"incorrecta4\":\"70\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}]";
                        break;
                    case 3:
                        DATOS = "[{\"id_reactivo_multiple\":\"100\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"2\",\"nivel\":\"3\",\"reactivo\":\"Un producto que costaba $350 aumenta el precio 18%. \\u00bfCu\\u00e1nto cuesta ahora el producto?\",\"respuesta\":\"$413\",\"incorrecta1\":\"$420\",\"incorrecta2\":\"$387\",\"incorrecta3\":\"$400\",\"incorrecta4\":\"$512\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_multiple\":\"101\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"2\",\"nivel\":\"3\",\"reactivo\":\"Al subir el precio de una bicicleta un 20%, el precio final es $360. \\u00bfC\\u00faal era el precio inicial?\",\"respuesta\":\"$300\",\"incorrecta1\":\"$320\",\"incorrecta2\":\"$280\",\"incorrecta3\":\"$295\",\"incorrecta4\":\"$310\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_multiple\":\"102\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"2\",\"nivel\":\"3\",\"reactivo\":\"Un auto viaja a 58 km\\/h \\u00bfQu\\u00e9 distancia recorrer\\u00e1 1800 segundos?\",\"respuesta\":\"29 km\",\"incorrecta1\":\"27 km\",\"incorrecta2\":\"100 km\",\"incorrecta3\":\"95 km\",\"incorrecta4\":\"35 km\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_multiple\":\"103\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"2\",\"nivel\":\"3\",\"reactivo\":\"\\u00bfCu\\u00e1ntos segundos han pasado de las 16:40 a las 20:00 horas?\",\"respuesta\":\"12000 s\",\"incorrecta1\":\"8500 s\",\"incorrecta2\":\"4850 s\",\"incorrecta3\":\"14000 s\",\"incorrecta4\":\"10000 s\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_multiple\":\"104\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"2\",\"nivel\":\"3\",\"reactivo\":\"3 obreros construyen un muro en 12 horas, \\u00bfcu\\u00e1nto tardar\\u00e1n en construirlo 6 obreros?\",\"respuesta\":\"6 h\",\"incorrecta1\":\"5:30 h\",\"incorrecta2\":\"8 h\",\"incorrecta3\":\"4 h\",\"incorrecta4\":\"2 h\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}]";
                        break;
                }
                break;
            case 1: //ENTEROS
                switch (nivel) {
                    case 1:
                        DATOS = "[{\"id_reactivo_multiple\":\"43\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"1\",\"reactivo\":\"Calcula -7-10-1\",\"respuesta\":\"-18\",\"incorrecta1\":\"-17\",\"incorrecta2\":\"18\",\"incorrecta3\":\"-19\",\"incorrecta4\":\"17\",\"visto\":\"0\",\"fecha\":\"2017-11-05\"}, {\"id_reactivo_multiple\":\"44\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"1\",\"reactivo\":\"Calcula -6+2-20\",\"respuesta\":\"-24\",\"incorrecta1\":\"-26\",\"incorrecta2\":\"-28\",\"incorrecta3\":\"24\",\"incorrecta4\":\"20\",\"visto\":\"0\",\"fecha\":\"2017-11-05\"}, {\"id_reactivo_multiple\":\"56\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"1\",\"reactivo\":\"Calcula: -4+11\",\"respuesta\":\"7\",\"incorrecta1\":\"-7\",\"incorrecta2\":\"8\",\"incorrecta3\":\"6\",\"incorrecta4\":\"10\",\"visto\":\"0\",\"fecha\":\"2017-11-06\"}, {\"id_reactivo_multiple\":\"57\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"1\",\"reactivo\":\"Calcula: 6+2-9\",\"respuesta\":\"-1\",\"incorrecta1\":\"1\",\"incorrecta2\":\"-2\",\"incorrecta3\":\"0\",\"incorrecta4\":\"2\",\"visto\":\"0\",\"fecha\":\"2017-11-06\"}, {\"id_reactivo_multiple\":\"58\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"1\",\"reactivo\":\"Calcula: 14-18+2\",\"respuesta\":\"-2\",\"incorrecta1\":\"4\",\"incorrecta2\":\"-3\",\"incorrecta3\":\"0\",\"incorrecta4\":\"3\",\"visto\":\"0\",\"fecha\":\"2017-11-06\"}, {\"id_reactivo_multiple\":\"75\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"2\",\"nivel\":\"1\",\"reactivo\":\"Resuelve (11)*(-4)\",\"respuesta\":\"-44\",\"incorrecta1\":\"44\",\"incorrecta2\":\"40\",\"incorrecta3\":\"43\",\"incorrecta4\":\"45\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_multiple\":\"76\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"2\",\"nivel\":\"1\",\"reactivo\":\"Resuelve 12 * 6\",\"respuesta\":\"72\",\"incorrecta1\":\"68\",\"incorrecta2\":\"74\",\"incorrecta3\":\"78\",\"incorrecta4\":\"71\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_multiple\":\"77\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"2\",\"nivel\":\"1\",\"reactivo\":\"Resuelve (6) * (-11)\",\"respuesta\":\"-66\",\"incorrecta1\":\"66\",\"incorrecta2\":\"55\",\"incorrecta3\":\"-65\",\"incorrecta4\":\"-71\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_multiple\":\"78\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"2\",\"nivel\":\"1\",\"reactivo\":\"Resuelve (11)*(11)\",\"respuesta\":\"121\",\"incorrecta1\":\"111\",\"incorrecta2\":\"120\",\"incorrecta3\":\"110\",\"incorrecta4\":\"122\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_multiple\":\"79\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"2\",\"nivel\":\"1\",\"reactivo\":\"Resuelve (-11)*(-12)\",\"respuesta\":\"132\",\"incorrecta1\":\"-132\",\"incorrecta2\":\"121\",\"incorrecta3\":\"120\",\"incorrecta4\":\"-131\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}]";
                        break;
                    case 2:
                        DATOS = "[{\"id_reactivo_multiple\":\"45\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"2\",\"reactivo\":\"Calcula: (7)2-6+7\",\"respuesta\":\"15\",\"incorrecta1\":\"21\",\"incorrecta2\":\"14\",\"incorrecta3\":\"16\",\"incorrecta4\":\"10\",\"visto\":\"0\",\"fecha\":\"2017-11-05\"}, {\"id_reactivo_multiple\":\"46\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"2\",\"reactivo\":\"Calcula: 31+31-69\",\"respuesta\":\"-7\",\"incorrecta1\":\"-6\",\"incorrecta2\":\"-8\",\"incorrecta3\":\"7\",\"incorrecta4\":\"6\",\"visto\":\"0\",\"fecha\":\"2017-11-06\"}, {\"id_reactivo_multiple\":\"47\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"2\",\"reactivo\":\"Calcula: 64+85-162\",\"respuesta\":\"-13\",\"incorrecta1\":\"14\",\"incorrecta2\":\"13\",\"incorrecta3\":\"-12\",\"incorrecta4\":\"15\",\"visto\":\"0\",\"fecha\":\"2017-11-06\"}, {\"id_reactivo_multiple\":\"48\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"2\",\"reactivo\":\"Calcula: (1)(5)(9)-14\",\"respuesta\":\"31\",\"incorrecta1\":\"-25\",\"incorrecta2\":\"25\",\"incorrecta3\":\"-31\",\"incorrecta4\":\"20\",\"visto\":\"0\",\"fecha\":\"2017-11-06\"}, {\"id_reactivo_multiple\":\"49\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"2\",\"reactivo\":\"Calcula: 77-99+2\",\"respuesta\":\"-20\",\"incorrecta1\":\"-18\",\"incorrecta2\":\"-19\",\"incorrecta3\":\"-21\",\"incorrecta4\":\"22\",\"visto\":\"0\",\"fecha\":\"2017-11-06\"}, {\"id_reactivo_multiple\":\"50\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"2\",\"reactivo\":\"88-99+12\",\"respuesta\":\"1\",\"incorrecta1\":\"-1\",\"incorrecta2\":\"0\",\"incorrecta3\":\"2\",\"incorrecta4\":\"-2\",\"visto\":\"0\",\"fecha\":\"2017-11-06\"}, {\"id_reactivo_multiple\":\"80\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"2\",\"nivel\":\"2\",\"reactivo\":\"Resuelve (10)*(-18)\",\"respuesta\":\"-180\",\"incorrecta1\":\"180\",\"incorrecta2\":\"170\",\"incorrecta3\":\"190\",\"incorrecta4\":\"-170\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_multiple\":\"81\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"2\",\"nivel\":\"2\",\"reactivo\":\"Resuelve (19)*(-17)\",\"respuesta\":\"-323\",\"incorrecta1\":\"323\",\"incorrecta2\":\"232\",\"incorrecta3\":\"333\",\"incorrecta4\":\"321\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_multiple\":\"82\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"2\",\"nivel\":\"2\",\"reactivo\":\"Resuelve 5*9+5-3\",\"respuesta\":\"47\",\"incorrecta1\":\"55\",\"incorrecta2\":\"50\",\"incorrecta3\":\"37\",\"incorrecta4\":\"60\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_multiple\":\"83\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"2\",\"nivel\":\"2\",\"reactivo\":\"Resuelve 45-128-13\",\"respuesta\":\"-96\",\"incorrecta1\":\"-86\",\"incorrecta2\":\"-98\",\"incorrecta3\":\"96\",\"incorrecta4\":\"95\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_multiple\":\"84\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"2\",\"nivel\":\"2\",\"reactivo\":\"Resuelve 13*17\",\"respuesta\":\"221\",\"incorrecta1\":\"210\",\"incorrecta2\":\"231\",\"incorrecta3\":\"211\",\"incorrecta4\":\"-211\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}]";
                        break;
                    case 3:
                        DATOS = "[{\"id_reactivo_multiple\":\"51\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"3\",\"reactivo\":\"Calcula: 1-(-3)+[4-(1-3)]\",\"respuesta\":\"10\",\"incorrecta1\":\"9\",\"incorrecta2\":\"-10\",\"incorrecta3\":\"11\",\"incorrecta4\":\"12\",\"visto\":\"0\",\"fecha\":\"2017-11-06\"}, {\"id_reactivo_multiple\":\"52\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"3\",\"reactivo\":\"Calcula: 3-[(5-8)-(3-6)]\",\"respuesta\":\"3\",\"incorrecta1\":\"4\",\"incorrecta2\":\"2\",\"incorrecta3\":\"5\",\"incorrecta4\":\"-3\",\"visto\":\"0\",\"fecha\":\"2017-11-06\"}, {\"id_reactivo_multiple\":\"53\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"3\",\"reactivo\":\"Calcula: [(6)-(-8)]-[(-4)-(-8)]\",\"respuesta\":\"10\",\"incorrecta1\":\"9\",\"incorrecta2\":\"11\",\"incorrecta3\":\"14\",\"incorrecta4\":\"-10\",\"visto\":\"0\",\"fecha\":\"2017-11-06\"}, {\"id_reactivo_multiple\":\"54\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"3\",\"reactivo\":\"Calcula: (9-[(3)-(3-12)-(8)])\",\"respuesta\":\"5\",\"incorrecta1\":\"6\",\"incorrecta2\":\"-4\",\"incorrecta3\":\"7\",\"incorrecta4\":\"-5\",\"visto\":\"0\",\"fecha\":\"2017-11-06\"}, {\"id_reactivo_multiple\":\"55\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"3\",\"reactivo\":\"Calcula: (-8)+[(7)-(-4)+(-5)]\",\"respuesta\":\"-2\",\"incorrecta1\":\"2\",\"incorrecta2\":\"-4\",\"incorrecta3\":\"-1\",\"incorrecta4\":\"3\",\"visto\":\"0\",\"fecha\":\"2017-11-06\"}, {\"id_reactivo_multiple\":\"85\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"2\",\"nivel\":\"3\",\"reactivo\":\"Resuelve 86 * 35\",\"respuesta\":\"3010\",\"incorrecta1\":\"3000\",\"incorrecta2\":\"2980\",\"incorrecta3\":\"3110\",\"incorrecta4\":\"3183\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_multiple\":\"86\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"2\",\"nivel\":\"3\",\"reactivo\":\"Resuelve 7*4+6-4*8\",\"respuesta\":\"2\",\"incorrecta1\":\"44\",\"incorrecta2\":\"24\",\"incorrecta3\":\"32\",\"incorrecta4\":\"4\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_multiple\":\"87\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"2\",\"nivel\":\"3\",\"reactivo\":\"Resuelve -24*3+47\",\"respuesta\":\"-25\",\"incorrecta1\":\"-1200\",\"incorrecta2\":\"-86\",\"incorrecta3\":\"48\",\"incorrecta4\":\"-21\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_multiple\":\"88\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"2\",\"nivel\":\"3\",\"reactivo\":\"Resuelve (78)*(-36)\",\"respuesta\":\"-2808\",\"incorrecta1\":\"-2818\",\"incorrecta2\":\"-2800\",\"incorrecta3\":\"2808\",\"incorrecta4\":\"-2785\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_multiple\":\"89\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"2\",\"nivel\":\"3\",\"reactivo\":\"Resuelve 81*53\",\"respuesta\":\"4293\",\"incorrecta1\":\"4296\",\"incorrecta2\":\"4283\",\"incorrecta3\":\"4303\",\"incorrecta4\":\"4133\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}]";
                        break;
                }
                break;
            case 2: //Fraccionarios
                switch (nivel) {
                    case 1:
                        DATOS = "[{\"id_reactivo_multiple\":\"105\",\"tema\":\"aritmetica\",\"subtema\":\"fraccionarios\",\"grado\":\"2\",\"nivel\":\"1\",\"reactivo\":\"Resuelve 12\\u00f74\",\"respuesta\":\"3\",\"incorrecta1\":\"4\",\"incorrecta2\":\"6\",\"incorrecta3\":\"3.5\",\"incorrecta4\":\"2\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_multiple\":\"106\",\"tema\":\"aritmetica\",\"subtema\":\"fraccionarios\",\"grado\":\"2\",\"nivel\":\"1\",\"reactivo\":\"Resuelve 20\\u00f72\",\"respuesta\":\"10\",\"incorrecta1\":\"5\",\"incorrecta2\":\"8\",\"incorrecta3\":\"12\",\"incorrecta4\":\"11\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_multiple\":\"107\",\"tema\":\"aritmetica\",\"subtema\":\"fraccionarios\",\"grado\":\"2\",\"nivel\":\"1\",\"reactivo\":\"Resuelve 72\\u00f78\",\"respuesta\":\"9\",\"incorrecta1\":\"8\",\"incorrecta2\":\"7\",\"incorrecta3\":\"8.5\",\"incorrecta4\":\"10\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_multiple\":\"108\",\"tema\":\"aritmetica\",\"subtema\":\"fraccionarios\",\"grado\":\"2\",\"nivel\":\"1\",\"reactivo\":\"Resuelve 27\\u00f73\",\"respuesta\":\"9\",\"incorrecta1\":\"8.5\",\"incorrecta2\":\"6\",\"incorrecta3\":\"11\",\"incorrecta4\":\"10\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_multiple\":\"109\",\"tema\":\"aritmetica\",\"subtema\":\"fraccionarios\",\"grado\":\"2\",\"nivel\":\"1\",\"reactivo\":\"Resuelve 64\\u00f764\",\"respuesta\":\"1\",\"incorrecta1\":\"8\",\"incorrecta2\":\"64\",\"incorrecta3\":\"6\",\"incorrecta4\":\"7\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}]";
                        break;
                    case 2:
                        DATOS = "[{\"id_reactivo_multiple\":\"28\",\"tema\":\"aritmetica\",\"subtema\":\"fraccionarios\",\"grado\":\"3\",\"nivel\":\"2\",\"reactivo\":\"\\u00bfC\\u00f3mo se puede representar el 75% como fracci\\u00f3n?\",\"respuesta\":\"3\\/4\",\"incorrecta1\":\"4\\/3\",\"incorrecta2\":\"0.75\",\"incorrecta3\":\"3\\/2\",\"incorrecta4\":\"5\\/4\",\"visto\":\"0\",\"fecha\":\"2017-10-30\"}, {\"id_reactivo_multiple\":\"110\",\"tema\":\"aritmetica\",\"subtema\":\"fraccionarios\",\"grado\":\"2\",\"nivel\":\"2\",\"reactivo\":\"Resuelve 255\\u00f715\",\"respuesta\":\"17\",\"incorrecta1\":\"16\",\"incorrecta2\":\"14\",\"incorrecta3\":\"18\",\"incorrecta4\":\"15\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_multiple\":\"111\",\"tema\":\"aritmetica\",\"subtema\":\"fraccionarios\",\"grado\":\"2\",\"nivel\":\"2\",\"reactivo\":\"Resuelve 57\\u00f719\",\"respuesta\":\"3\",\"incorrecta1\":\"2.5\",\"incorrecta2\":\"3.5\",\"incorrecta3\":\"4\",\"incorrecta4\":\"1\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_multiple\":\"112\",\"tema\":\"aritmetica\",\"subtema\":\"fraccionarios\",\"grado\":\"2\",\"nivel\":\"2\",\"reactivo\":\"Resuelve 48\\u00f73\",\"respuesta\":\"16\",\"incorrecta1\":\"19\",\"incorrecta2\":\"17\",\"incorrecta3\":\"16.3\",\"incorrecta4\":\"15\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_multiple\":\"113\",\"tema\":\"aritmetica\",\"subtema\":\"fraccionarios\",\"grado\":\"2\",\"nivel\":\"2\",\"reactivo\":\"Resuelve 275\\u00f725\",\"respuesta\":\"11\",\"incorrecta1\":\"12\",\"incorrecta2\":\"15\",\"incorrecta3\":\"13.5\",\"incorrecta4\":\"10\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_multiple\":\"114\",\"tema\":\"aritmetica\",\"subtema\":\"fraccionarios\",\"grado\":\"2\",\"nivel\":\"2\",\"reactivo\":\"Resuelve 161\\u00f723\",\"respuesta\":\"7\",\"incorrecta1\":\"7.5\",\"incorrecta2\":\"9\",\"incorrecta3\":\"11\",\"incorrecta4\":\"8\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}]";
                        break;
                    case 3:
                        DATOS = "[{\"id_reactivo_multiple\":\"115\",\"tema\":\"aritmetica\",\"subtema\":\"fraccionarios\",\"grado\":\"2\",\"nivel\":\"3\",\"reactivo\":\"Resuelve 248\\u00f78\",\"respuesta\":\"31\",\"incorrecta1\":\"29\",\"incorrecta2\":\"30\",\"incorrecta3\":\"27\",\"incorrecta4\":\"32\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_multiple\":\"116\",\"tema\":\"aritmetica\",\"subtema\":\"fraccionarios\",\"grado\":\"2\",\"nivel\":\"3\",\"reactivo\":\"216\\u00f78\",\"respuesta\":\"27\",\"incorrecta1\":\"26\",\"incorrecta2\":\"25\",\"incorrecta3\":\"29\",\"incorrecta4\":\"30\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_multiple\":\"117\",\"tema\":\"aritmetica\",\"subtema\":\"fraccionarios\",\"grado\":\"2\",\"nivel\":\"3\",\"reactivo\":\"Resuelve 462\\u00f721\",\"respuesta\":\"22\",\"incorrecta1\":\"21\",\"incorrecta2\":\"20.5\",\"incorrecta3\":\"23\",\"incorrecta4\":\"25\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_multiple\":\"118\",\"tema\":\"aritmetica\",\"subtema\":\"fraccionarios\",\"grado\":\"2\",\"nivel\":\"3\",\"reactivo\":\"Resuelve 4340\\u00f762\",\"respuesta\":\"70\",\"incorrecta1\":\"69\",\"incorrecta2\":\"71\",\"incorrecta3\":\"72\",\"incorrecta4\":\"65\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_multiple\":\"119\",\"tema\":\"aritmetica\",\"subtema\":\"fraccionarios\",\"grado\":\"2\",\"nivel\":\"3\",\"reactivo\":\"Resuelve 1407\\u00f767\",\"respuesta\":\"21\",\"incorrecta1\":\"23\",\"incorrecta2\":\"25\",\"incorrecta3\":\"27\",\"incorrecta4\":\"29\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}]";
                        break;
                }
                break;
            case 3: // Decimales
                switch (nivel) {
                    case 1:
                        DATOS = "[{\"id_reactivo_multiple\":\"70\",\"tema\":\"aritmetica\",\"subtema\":\"decimales\",\"grado\":\"2\",\"nivel\":\"1\",\"reactivo\":\"Resuelve 5.2 - 6.3\",\"respuesta\":\"-1.1\",\"incorrecta1\":\"-1\",\"incorrecta2\":\"-1.3\",\"incorrecta3\":\"-1.5\",\"incorrecta4\":\"1.1\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_multiple\":\"71\",\"tema\":\"aritmetica\",\"subtema\":\"decimales\",\"grado\":\"2\",\"nivel\":\"1\",\"reactivo\":\"Resuelve 10 - 3.3\",\"respuesta\":\"6.7\",\"incorrecta1\":\"7.7\",\"incorrecta2\":\"6.6\",\"incorrecta3\":\"7.6\",\"incorrecta4\":\"7.1\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_multiple\":\"72\",\"tema\":\"aritmetica\",\"subtema\":\"decimales\",\"grado\":\"2\",\"nivel\":\"1\",\"reactivo\":\"Resuelve 0.0 + 4.7\",\"respuesta\":\"4.7\",\"incorrecta1\":\"4.8\",\"incorrecta2\":\"7.5\",\"incorrecta3\":\"4.71\",\"incorrecta4\":\"4.5\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_multiple\":\"73\",\"tema\":\"aritmetica\",\"subtema\":\"decimales\",\"grado\":\"2\",\"nivel\":\"1\",\"reactivo\":\"Resuelve 9.9 - 6.6\",\"respuesta\":\"3.3\",\"incorrecta1\":\"3.2\",\"incorrecta2\":\"3.1\",\"incorrecta3\":\"3.23\",\"incorrecta4\":\"3.4\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_multiple\":\"74\",\"tema\":\"aritmetica\",\"subtema\":\"decimales\",\"grado\":\"2\",\"nivel\":\"1\",\"reactivo\":\"Resuelve 10.1 - 10\",\"respuesta\":\"0.1\",\"incorrecta1\":\"1\",\"incorrecta2\":\"1.1\",\"incorrecta3\":\"0.01\",\"incorrecta4\":\"0.11\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}]";
                        break;
                    case 2:
                        DATOS = "[{\"id_reactivo_multiple\":\"27\",\"tema\":\"aritmetica\",\"subtema\":\"decimales\",\"grado\":\"3\",\"nivel\":\"2\",\"reactivo\":\"\\u00bfC\\u00f3mo se puede representar el 25% como decimal?\",\"respuesta\":\"0.25\",\"incorrecta1\":\"0.5\",\"incorrecta2\":\"2.5\",\"incorrecta3\":\"0.75\",\"incorrecta4\":\"0.35\",\"visto\":\"0\",\"fecha\":\"2017-10-30\"}, {\"id_reactivo_multiple\":\"59\",\"tema\":\"aritmetica\",\"subtema\":\"decimales\",\"grado\":\"2\",\"nivel\":\"2\",\"reactivo\":\"Resuelve 3.6 + 7.5\",\"respuesta\":\"11.1\",\"incorrecta1\":\"9.9\",\"incorrecta2\":\"11.2\",\"incorrecta3\":\"10.1\",\"incorrecta4\":\"10.2\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_multiple\":\"60\",\"tema\":\"aritmetica\",\"subtema\":\"decimales\",\"grado\":\"2\",\"nivel\":\"2\",\"reactivo\":\"Resuelve 6.3 + 8.5\",\"respuesta\":\"14.8\",\"incorrecta1\":\"13.8\",\"incorrecta2\":\"15.2\",\"incorrecta3\":\"15.8\",\"incorrecta4\":\"13.6\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_multiple\":\"61\",\"tema\":\"aritmetica\",\"subtema\":\"decimales\",\"grado\":\"2\",\"nivel\":\"2\",\"reactivo\":\"Resuelve 8.1 + 6.5 \",\"respuesta\":\"14.6\",\"incorrecta1\":\"14.9\",\"incorrecta2\":\"14.5\",\"incorrecta3\":\"15.1\",\"incorrecta4\":\"14.1\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_multiple\":\"62\",\"tema\":\"aritmetica\",\"subtema\":\"decimales\",\"grado\":\"2\",\"nivel\":\"2\",\"reactivo\":\"Resuelve 8.9 + 7.0\",\"respuesta\":\"15.9\",\"incorrecta1\":\"16.9\",\"incorrecta2\":\"14.9\",\"incorrecta3\":\"15.6\",\"incorrecta4\":\"15.7\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}]";
                        break;
                    case 3:
                        DATOS = "[{\"id_reactivo_multiple\":\"63\",\"tema\":\"aritmetica\",\"subtema\":\"decimales\",\"grado\":\"2\",\"nivel\":\"3\",\"reactivo\":\"Resuelve 0.11 + 0.65\",\"respuesta\":\"0.76\",\"incorrecta1\":\"0.67\",\"incorrecta2\":\"0.77\",\"incorrecta3\":\"1.76\",\"incorrecta4\":\"0.8\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_multiple\":\"64\",\"tema\":\"aritmetica\",\"subtema\":\"decimales\",\"grado\":\"2\",\"nivel\":\"3\",\"reactivo\":\"Resuelve 0.57 + 0.91\",\"respuesta\":\"1.48\",\"incorrecta1\":\"1.28\",\"incorrecta2\":\"1.38\",\"incorrecta3\":\"1.58\",\"incorrecta4\":\"2.21\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_multiple\":\"65\",\"tema\":\"aritmetica\",\"subtema\":\"decimales\",\"grado\":\"2\",\"nivel\":\"3\",\"reactivo\":\"Resuelve 0.78 + 7.40\",\"respuesta\":\"8.18\",\"incorrecta1\":\"8.28\",\"incorrecta2\":\"8.08\",\"incorrecta3\":\"8.80\",\"incorrecta4\":\"8.91\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_multiple\":\"66\",\"tema\":\"aritmetica\",\"subtema\":\"decimales\",\"grado\":\"2\",\"nivel\":\"3\",\"reactivo\":\"Resuelve 0.83 + 2.9\",\"respuesta\":\"3.73\",\"incorrecta1\":\"3.63\",\"incorrecta2\":\"3.72\",\"incorrecta3\":\"3.82\",\"incorrecta4\":\"3.56\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_multiple\":\"67\",\"tema\":\"aritmetica\",\"subtema\":\"decimales\",\"grado\":\"2\",\"nivel\":\"3\",\"reactivo\":\"Resuelve 0.61 + 0.68\",\"respuesta\":\"1.29\",\"incorrecta1\":\"1.39\",\"incorrecta2\":\"1.19\",\"incorrecta3\":\"1.21\",\"incorrecta4\":\"1.31\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_multiple\":\"68\",\"tema\":\"aritmetica\",\"subtema\":\"decimales\",\"grado\":\"2\",\"nivel\":\"3\",\"reactivo\":\"Resuelve 0.27 + 0.62\",\"respuesta\":\"0.89\",\"incorrecta1\":\"0.69\",\"incorrecta2\":\"0.79\",\"incorrecta3\":\"0.99\",\"incorrecta4\":\"0.85\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_multiple\":\"69\",\"tema\":\"aritmetica\",\"subtema\":\"decimales\",\"grado\":\"2\",\"nivel\":\"3\",\"reactivo\":\"Resuelve 0.24 - 0.59\",\"respuesta\":\"-0.35\",\"incorrecta1\":\"-0.25\",\"incorrecta2\":\"0.35\",\"incorrecta3\":\"-0.40\",\"incorrecta4\":\"0.37\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}]";
                        break;
                }
                break;
            case 4:
                switch (nivel) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                }
                break;
            case 5:
                switch (nivel) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                }
                break;
            case 6:
                switch (nivel) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                }
                break;
            case 7:
                switch (nivel) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                }
                break;
            case 8:
                switch (nivel) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                }
                break;
            case 9:
                switch (nivel) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                }
                break;
            case 10:
                switch (nivel) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                }
                break;
            case 11:
                switch (nivel) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                }
                break;
            case 12:
                switch (nivel) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                }
                break;
            case 13:
                switch (nivel) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                }
                break;
            case 14:
                switch (nivel) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                }
                break;
            case 15:
                switch (nivel) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                }
                break;
            case 16:
                switch (nivel) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                }
                break;
            case 17:
                switch (nivel) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                }
                break;
            case 18:
                switch (nivel) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                }
                break;
        }
        return DATOS;
    }
}
