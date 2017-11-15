package com.alex.helyer.mathe;

/**
 * Created by helyer on 13/11/17.
 */

public class ReactivosAbiertos {
    int subtema, nivel;



    ReactivosAbiertos(int misubtema, int minivel) {
        subtema = misubtema;
        nivel = minivel;
    }

    String DATOS = "[{\"id\":\"1\",\"tipo\":\"0\",\"reactivo\":\"s"+subtema+"-g0"+"-n"+nivel+"-tAbierto"+"\",\"respuesta\":\"2\",\"opc1\":\"28\\/11\",\"opc2\":\"7\",\"opc3\":\"11\\/2\",\"opc4\":\"14\"}]";

    public String getDatos() {

        switch (subtema) {
            case 0: //NATURALES
                switch (nivel) {
                    case 1:
                        DATOS = "[{\"id_reactivo_abierto\":\"57\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"1\",\"nivel\":\"1\",\"reactivo\":\"Cu\\u00e1l es el n\\u00famero que sigue en la sucesi\\u00f3n: 1,0,1,0,__\",\"respuesta\":\"1\",\"visto\":\"0\",\"fecha\":\"2017-11-03\"}, {\"id_reactivo_abierto\":\"135\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"1\",\"nivel\":\"1\",\"reactivo\":\"Resuelve 56-36\",\"respuesta\":\"20\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_abierto\":\"136\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"1\",\"nivel\":\"1\",\"reactivo\":\"Resuelve 13*3\",\"respuesta\":\"39\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_abierto\":\"137\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"1\",\"nivel\":\"1\",\"reactivo\":\"\\u00bfCu\\u00e1ntos a\\u00f1os tiene un lustro?\",\"respuesta\":\"5\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_abierto\":\"138\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"1\",\"nivel\":\"1\",\"reactivo\":\"Resuelve 2017 - 2000\",\"respuesta\":\"17\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_abierto\":\"139\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"1\",\"nivel\":\"1\",\"reactivo\":\"Resuelve 1810 - 1510\",\"respuesta\":\"300\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_abierto\":\"224\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"1\",\"nivel\":\"1\",\"reactivo\":\"Resuelve: 345 - 315\",\"respuesta\":\"30\",\"visto\":\"0\",\"fecha\":\"2017-11-14\"}, {\"id_reactivo_abierto\":\"225\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"1\",\"nivel\":\"1\",\"reactivo\":\"Resuelve: 37 + 12\",\"respuesta\":\"49\",\"visto\":\"0\",\"fecha\":\"2017-11-14\"}, {\"id_reactivo_abierto\":\"226\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"1\",\"nivel\":\"1\",\"reactivo\":\"Resuelve: 5 * 20\",\"respuesta\":\"100\",\"visto\":\"0\",\"fecha\":\"2017-11-14\"}, {\"id_reactivo_abierto\":\"227\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"1\",\"nivel\":\"1\",\"reactivo\":\"\\u00bfCu\\u00e1ntos a\\u00f1os tiene una d\\u00e9cada?\",\"respuesta\":\"10\",\"visto\":\"0\",\"fecha\":\"2017-11-14\"}, {\"id_reactivo_abierto\":\"228\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"1\",\"nivel\":\"1\",\"reactivo\":\"\\u00bfCu\\u00e1ntos lados tiene un pent\\u00e1gono?\",\"respuesta\":\"5\",\"visto\":\"0\",\"fecha\":\"2017-11-14\"}, {\"id_reactivo_abierto\":\"229\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"1\",\"nivel\":\"1\",\"reactivo\":\"Resuelve: 21 + 33\",\"respuesta\":\"54\",\"visto\":\"0\",\"fecha\":\"2017-11-14\"}, {\"id_reactivo_abierto\":\"230\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"1\",\"nivel\":\"1\",\"reactivo\":\"Resuelve: 15 * 5\",\"respuesta\":\"75\",\"visto\":\"0\",\"fecha\":\"2017-11-14\"}, {\"id_reactivo_abierto\":\"231\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"1\",\"nivel\":\"1\",\"reactivo\":\"\\u00bfCu\\u00e1ntos a\\u00f1os tiene un siglo?\",\"respuesta\":\"100\",\"visto\":\"0\",\"fecha\":\"2017-11-14\"}, {\"id_reactivo_abierto\":\"232\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"1\",\"nivel\":\"1\",\"reactivo\":\"Resuelve: 210 + 54\",\"respuesta\":\"264\",\"visto\":\"0\",\"fecha\":\"2017-11-14\"}]";
                        break;
                    case 2:
                        DATOS = "[{\"id_reactivo_abierto\":\"53\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"1\",\"nivel\":\"2\",\"reactivo\":\"\\u00bfCu\\u00e1l es la moda en los siguientes datos: 5,4,3,7,6,5,2,8,5\",\"respuesta\":\"5\",\"visto\":\"0\",\"fecha\":\"2017-10-30\"}, {\"id_reactivo_abierto\":\"140\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"1\",\"nivel\":\"2\",\"reactivo\":\"Calcula: 24 + 67\",\"respuesta\":\"91\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_abierto\":\"141\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"1\",\"nivel\":\"2\",\"reactivo\":\"Calcula: 21 + 37\",\"respuesta\":\"58\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_abierto\":\"142\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"1\",\"nivel\":\"2\",\"reactivo\":\"Calcula: 17 + 35\",\"respuesta\":\"52\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_abierto\":\"143\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"1\",\"nivel\":\"2\",\"reactivo\":\"Calcula: 65 + 23\",\"respuesta\":\"88\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_abierto\":\"144\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"1\",\"nivel\":\"2\",\"reactivo\":\"Calcula: 243 - 132\",\"respuesta\":\"111\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_abierto\":\"145\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"1\",\"nivel\":\"2\",\"reactivo\":\"Calcula: 345 - 127\",\"respuesta\":\"218\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_abierto\":\"146\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"1\",\"nivel\":\"2\",\"reactivo\":\"Calcula: 97 - 59\",\"respuesta\":\"38\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_abierto\":\"147\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"1\",\"nivel\":\"2\",\"reactivo\":\"Calcula: 213 - 87\",\"respuesta\":\"126\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_abierto\":\"148\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"1\",\"nivel\":\"2\",\"reactivo\":\"Calcula: 23 * 5\",\"respuesta\":\"115\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_abierto\":\"149\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"1\",\"nivel\":\"2\",\"reactivo\":\"Calcula: 12 * 7\",\"respuesta\":\"84\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_abierto\":\"150\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"1\",\"nivel\":\"2\",\"reactivo\":\"Calcula: 84 * 4\",\"respuesta\":\"336\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_abierto\":\"151\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"1\",\"nivel\":\"2\",\"reactivo\":\"Calcula: 45 * 3\",\"respuesta\":\"135\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_abierto\":\"152\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"1\",\"nivel\":\"2\",\"reactivo\":\"Calcula: 121 \\u00f7 11\",\"respuesta\":\"11\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_abierto\":\"155\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"1\",\"nivel\":\"2\",\"reactivo\":\"Calcula: 64 \\u00f7 16\",\"respuesta\":\"4\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_abierto\":\"156\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"1\",\"nivel\":\"2\",\"reactivo\":\"Calcula: 63 \\u00f7 3\",\"respuesta\":\"21\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_abierto\":\"157\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"1\",\"nivel\":\"2\",\"reactivo\":\"Calcula: 110 \\u00f7 5\",\"respuesta\":\"22\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_abierto\":\"181\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"2\",\"nivel\":\"2\",\"reactivo\":\"Resuelve 4*5+4-1\",\"respuesta\":\"23\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_abierto\":\"182\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"2\",\"nivel\":\"2\",\"reactivo\":\"Calcula el 75% de 800\",\"respuesta\":\"600\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_abierto\":\"183\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"2\",\"nivel\":\"2\",\"reactivo\":\"Si 14 l\\u00e1pices cuestan pesos, \\u00bfCu\\u00e1nto costar\\u00e1n 25 l\\u00e1pices?\",\"respuesta\":\"75\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_abierto\":\"184\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"2\",\"nivel\":\"2\",\"reactivo\":\"Calcula el 25% de 400\",\"respuesta\":\"100\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_abierto\":\"185\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"2\",\"nivel\":\"2\",\"reactivo\":\"Calcula el 42% de 250\",\"respuesta\":\"105\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}]";
                        break;
                    case 3:
                        DATOS = "[{\"id_reactivo_abierto\":\"54\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"3\",\"nivel\":\"3\",\"reactivo\":\"Encuentra el valor que sigue en la siguiente sucesi\\u00f3n: 8,32,72,128,200,__\",\"respuesta\":\"288\",\"visto\":\"0\",\"fecha\":\"2017-11-03\"}, {\"id_reactivo_abierto\":\"55\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"1\",\"nivel\":\"3\",\"reactivo\":\"Encuentra el valor que sigue en la siguiente sucesi\\u00f3n: 4,7,12,19,28,__\",\"respuesta\":\"39\",\"visto\":\"0\",\"fecha\":\"2017-11-03\"}, {\"id_reactivo_abierto\":\"56\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"3\",\"nivel\":\"3\",\"reactivo\":\"Cu\\u00e1l es el siguiente n\\u00famero en la sucesi\\u00f3n: 0, 1, 1, 2, 3,__\",\"respuesta\":\"5\",\"visto\":\"0\",\"fecha\":\"2017-11-03\"}, {\"id_reactivo_abierto\":\"186\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"2\",\"nivel\":\"3\",\"reactivo\":\"Calcula el 76% de 850\",\"respuesta\":\"646\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_abierto\":\"187\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"2\",\"nivel\":\"3\",\"reactivo\":\"Calcula 45*2*25\",\"respuesta\":\"2250\",\"visto\":\"0\",\"fecha\":\"2017-11-14\"}, {\"id_reactivo_abierto\":\"188\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"2\",\"nivel\":\"3\",\"reactivo\":\"\\u00bfCu\\u00e1ntos segundos hay en dos d\\u00edas?\",\"respuesta\":\"172800\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_abierto\":\"189\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"2\",\"nivel\":\"3\",\"reactivo\":\"\\u00bfCu\\u00e1ntos segundos tiene una semana?\",\"respuesta\":\"604800\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_abierto\":\"190\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"2\",\"nivel\":\"3\",\"reactivo\":\"El precio de un celular es de $1200 sin IVA. \\u00bfCu\\u00e1nto hay que pagar por \\u00e9l si el IVA es del 16%?\",\"respuesta\":\"1392\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_abierto\":\"233\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"2\",\"nivel\":\"3\",\"reactivo\":\"Calcula el 37% de 25900\",\"respuesta\":\"9583\",\"visto\":\"0\",\"fecha\":\"2017-11-14\"}, {\"id_reactivo_abierto\":\"234\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"2\",\"nivel\":\"3\",\"reactivo\":\"Calcula (45\\u00f79*5)\\/25\",\"respuesta\":\"1\",\"visto\":\"0\",\"fecha\":\"2017-11-14\"}, {\"id_reactivo_abierto\":\"235\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"2\",\"nivel\":\"3\",\"reactivo\":\"Un avi\\u00f3n vuela a 11000 m y un submarino est\\u00e1 a -850 m. \\u00bfCu\\u00e1l es la diferencia de altura entre ambos?\",\"respuesta\":\"11850\",\"visto\":\"0\",\"fecha\":\"2017-11-14\"}, {\"id_reactivo_abierto\":\"236\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"2\",\"nivel\":\"3\",\"reactivo\":\"Compramos un congelador. Cuando lo enchufamos a la red el\\u00e9ctrica est\\u00e1 a la temperatura ambiente, que es de 25 grados. Si cada hora baja la temperatura 5 grados, \\u00bfa qu\\u00e9 temperatura estar\\u00e1 al cabo de 6 horas?\",\"respuesta\":\"-5\",\"visto\":\"0\",\"fecha\":\"2017-11-14\"}, {\"id_reactivo_abierto\":\"237\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"2\",\"nivel\":\"3\",\"reactivo\":\"Calcula el 32% de 950\",\"respuesta\":\"304\",\"visto\":\"0\",\"fecha\":\"2017-11-14\"}, {\"id_reactivo_abierto\":\"238\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"2\",\"nivel\":\"3\",\"reactivo\":\"Calcula 7*13*23\",\"respuesta\":\"2093\",\"visto\":\"0\",\"fecha\":\"2017-11-14\"}, {\"id_reactivo_abierto\":\"239\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"2\",\"nivel\":\"3\",\"reactivo\":\"Halla el n\\u00famero primo m\\u00e1s pr\\u00f3ximo que divide a 221.\",\"respuesta\":\"13\",\"visto\":\"0\",\"fecha\":\"2017-11-14\"}]";
                        break;
                }
                break;
            case 1: //ENTEROS
                switch (nivel) {
                    case 1:
                        DATOS = "[{\"id_reactivo_abierto\":\"58\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"1\",\"reactivo\":\"Calcula -3-5-2\",\"respuesta\":\"-10\",\"visto\":\"0\",\"fecha\":\"2017-11-05\"}, {\"id_reactivo_abierto\":\"59\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"1\",\"reactivo\":\"Calcula -8-4\",\"respuesta\":\"-12\",\"visto\":\"0\",\"fecha\":\"2017-11-05\"}, {\"id_reactivo_abierto\":\"60\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"1\",\"reactivo\":\"Calcula 8+3+2\",\"respuesta\":\"13\",\"visto\":\"0\",\"fecha\":\"2017-11-05\"}, {\"id_reactivo_abierto\":\"61\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"1\",\"reactivo\":\"Calcula -5+4\",\"respuesta\":\"-1\",\"visto\":\"0\",\"fecha\":\"2017-11-05\"}, {\"id_reactivo_abierto\":\"62\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"1\",\"reactivo\":\"Calcula 9-10+2\",\"respuesta\":\"1\",\"visto\":\"0\",\"fecha\":\"2017-11-05\"}, {\"id_reactivo_abierto\":\"63\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"1\",\"reactivo\":\"Calcula -13+5\",\"respuesta\":\"-8\",\"visto\":\"0\",\"fecha\":\"2017-11-05\"}, {\"id_reactivo_abierto\":\"64\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"1\",\"reactivo\":\"Calcula 5+3+1\",\"respuesta\":\"9\",\"visto\":\"0\",\"fecha\":\"2017-11-05\"}, {\"id_reactivo_abierto\":\"65\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"1\",\"reactivo\":\"Calcula -5-5+1\",\"respuesta\":\"-9\",\"visto\":\"0\",\"fecha\":\"2017-11-05\"}, {\"id_reactivo_abierto\":\"66\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"1\",\"reactivo\":\"Calcula 10-10+1\",\"respuesta\":\"1\",\"visto\":\"0\",\"fecha\":\"2017-11-05\"}, {\"id_reactivo_abierto\":\"67\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"1\",\"reactivo\":\"Calcula 5-3+8\",\"respuesta\":\"10\",\"visto\":\"0\",\"fecha\":\"2017-11-05\"}, {\"id_reactivo_abierto\":\"68\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"1\",\"reactivo\":\"Calcula (5-7)+1\",\"respuesta\":\"-1\",\"visto\":\"0\",\"fecha\":\"2017-11-05\"}, {\"id_reactivo_abierto\":\"69\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"1\",\"reactivo\":\"Calcula 1+1+11\",\"respuesta\":\"13\",\"visto\":\"0\",\"fecha\":\"2017-11-05\"}, {\"id_reactivo_abierto\":\"70\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"1\",\"reactivo\":\"Calcula (-2)+(-1)\",\"respuesta\":\"-3\",\"visto\":\"0\",\"fecha\":\"2017-11-05\"}, {\"id_reactivo_abierto\":\"71\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"1\",\"reactivo\":\"Calcula -1-3-4\",\"respuesta\":\"-8\",\"visto\":\"0\",\"fecha\":\"2017-11-05\"}, {\"id_reactivo_abierto\":\"72\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"1\",\"reactivo\":\"Calcula -1-1-10\",\"respuesta\":\"-12\",\"visto\":\"0\",\"fecha\":\"2017-11-05\"}, {\"id_reactivo_abierto\":\"73\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"1\",\"reactivo\":\"Escribe el valor absoluto del siguiente n\\u00famero: -3\",\"respuesta\":\"3\",\"visto\":\"0\",\"fecha\":\"2017-11-05\"}, {\"id_reactivo_abierto\":\"74\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"1\",\"reactivo\":\"Escribe el valor absoluto del siguiente n\\u00famero: +6\",\"respuesta\":\"6\",\"visto\":\"0\",\"fecha\":\"2017-11-05\"}, {\"id_reactivo_abierto\":\"75\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"1\",\"reactivo\":\"Escribe el valor absoluto del siguiente n\\u00famero: -10\",\"respuesta\":\"10\",\"visto\":\"0\",\"fecha\":\"2017-11-05\"}, {\"id_reactivo_abierto\":\"76\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"1\",\"reactivo\":\"Escribe el valor absoluto del siguiente n\\u00famero: -22\",\"respuesta\":\"22\",\"visto\":\"0\",\"fecha\":\"2017-11-05\"}, {\"id_reactivo_abierto\":\"77\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"1\",\"reactivo\":\"Escribe el valor absoluto del siguiente n\\u00famero: +27\",\"respuesta\":\"27\",\"visto\":\"0\",\"fecha\":\"2017-11-05\"}, {\"id_reactivo_abierto\":\"78\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"1\",\"reactivo\":\"Escribe el valor absoluto del siguiente n\\u00famero: -17\",\"respuesta\":\"17\",\"visto\":\"0\",\"fecha\":\"2017-11-05\"}, {\"id_reactivo_abierto\":\"79\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"1\",\"reactivo\":\"Escribe el valor absoluto del siguiente n\\u00famero: +100\",\"respuesta\":\"100\",\"visto\":\"0\",\"fecha\":\"2017-11-05\"}, {\"id_reactivo_abierto\":\"80\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"1\",\"reactivo\":\"Escribe el valor absoluto del siguiente n\\u00famero: -1\",\"respuesta\":\"1\",\"visto\":\"0\",\"fecha\":\"2017-11-05\"}]";
                        break;
                    case 2:
                        DATOS = "[{\"id_reactivo_abierto\":\"81\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"2\",\"reactivo\":\"Calcula -56+16\",\"respuesta\":\"-40\",\"visto\":\"0\",\"fecha\":\"2017-11-05\"}, {\"id_reactivo_abierto\":\"82\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"2\",\"reactivo\":\"Calcula: -16+34-19\",\"respuesta\":\"-1\",\"visto\":\"0\",\"fecha\":\"2017-11-05\"}, {\"id_reactivo_abierto\":\"83\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"2\",\"reactivo\":\"Calcula: -64+24-2\",\"respuesta\":\"-42\",\"visto\":\"0\",\"fecha\":\"2017-11-05\"}, {\"id_reactivo_abierto\":\"84\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"2\",\"reactivo\":\"Calcula: (-7)-(-7)-(+5)\",\"respuesta\":\"-5\",\"visto\":\"0\",\"fecha\":\"2017-11-05\"}, {\"id_reactivo_abierto\":\"85\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"2\",\"reactivo\":\"Calcula:(+3)-(+8)\",\"respuesta\":\"-5\",\"visto\":\"0\",\"fecha\":\"2017-11-05\"}, {\"id_reactivo_abierto\":\"86\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"2\",\"reactivo\":\"Calcula: (-11)+(+8)-(-6)\",\"respuesta\":\"3\",\"visto\":\"0\",\"fecha\":\"2017-11-05\"}, {\"id_reactivo_abierto\":\"87\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"2\",\"reactivo\":\"Calcula: -19+52-13\",\"respuesta\":\"20\",\"visto\":\"0\",\"fecha\":\"2017-11-05\"}, {\"id_reactivo_abierto\":\"88\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"2\",\"reactivo\":\"Calcula: {[(5-2)+3]-1}\",\"respuesta\":\"5\",\"visto\":\"0\",\"fecha\":\"2017-11-05\"}, {\"id_reactivo_abierto\":\"89\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"2\",\"reactivo\":\"Calcula: (9)(2)-45+13\",\"respuesta\":\"-14\",\"visto\":\"0\",\"fecha\":\"2017-11-05\"}, {\"id_reactivo_abierto\":\"90\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"2\",\"reactivo\":\"Calcula: 79-26-14\",\"respuesta\":\"39\",\"visto\":\"0\",\"fecha\":\"2017-11-05\"}, {\"id_reactivo_abierto\":\"91\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"2\",\"reactivo\":\"Calcula: -13(2)+14\",\"respuesta\":\"-12\",\"visto\":\"0\",\"fecha\":\"2017-11-06\"}, {\"id_reactivo_abierto\":\"92\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"2\",\"reactivo\":\"Calcula: 95-112\",\"respuesta\":\"-17\",\"visto\":\"0\",\"fecha\":\"2017-11-06\"}, {\"id_reactivo_abierto\":\"93\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"2\",\"reactivo\":\"Calcula: 65+31-47\",\"respuesta\":\"49\",\"visto\":\"0\",\"fecha\":\"2017-11-06\"}, {\"id_reactivo_abierto\":\"94\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"2\",\"reactivo\":\"99-101\",\"respuesta\":\"-2\",\"visto\":\"0\",\"fecha\":\"2017-11-06\"}, {\"id_reactivo_abierto\":\"95\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"2\",\"reactivo\":\"Calcula: 99+101\",\"respuesta\":\"200\",\"visto\":\"0\",\"fecha\":\"2017-11-06\"}, {\"id_reactivo_abierto\":\"96\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"2\",\"reactivo\":\"Calcula: 199-101\",\"respuesta\":\"98\",\"visto\":\"0\",\"fecha\":\"2017-11-06\"}, {\"id_reactivo_abierto\":\"97\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"2\",\"reactivo\":\"Calcula: 199+99+4\",\"respuesta\":\"302\",\"visto\":\"0\",\"fecha\":\"2017-11-06\"}, {\"id_reactivo_abierto\":\"120\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"2\",\"reactivo\":\"Resuelve (11)*(-4)\",\"respuesta\":\"-44\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_abierto\":\"121\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"2\",\"reactivo\":\"Resuelve 12 * -4\",\"respuesta\":\"-48\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_abierto\":\"122\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"2\",\"reactivo\":\"Resuelve 6 * 11\",\"respuesta\":\"66\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_abierto\":\"123\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"2\",\"reactivo\":\"Resuelve (11) * (10)\",\"respuesta\":\"110\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_abierto\":\"124\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"2\",\"reactivo\":\"Calcula 8*9*10\",\"respuesta\":\"720\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_abierto\":\"125\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"2\",\"reactivo\":\"Resuelve 19 * 10\",\"respuesta\":\"190\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}]";
                        break;
                    case 3:
                        DATOS = "[{\"id_reactivo_abierto\":\"98\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"3\",\"reactivo\":\"Calcula: 1-(-3)+[4-(1-3)]\",\"respuesta\":\"10\",\"visto\":\"0\",\"fecha\":\"2017-11-06\"}, {\"id_reactivo_abierto\":\"99\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"3\",\"reactivo\":\"Calcula: 3-[(5-8)-(3-6)]\",\"respuesta\":\"3\",\"visto\":\"0\",\"fecha\":\"2017-11-06\"}, {\"id_reactivo_abierto\":\"100\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"3\",\"reactivo\":\"Calcula: [(6)-(-8)]-[(-4)-(-8)]\",\"respuesta\":\"10\",\"visto\":\"0\",\"fecha\":\"2017-11-06\"}, {\"id_reactivo_abierto\":\"101\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"3\",\"reactivo\":\"Calcula: (9-[(3)-(3-12)-(8)])\",\"respuesta\":\"5\",\"visto\":\"0\",\"fecha\":\"2017-11-06\"}, {\"id_reactivo_abierto\":\"102\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"3\",\"reactivo\":\"Calcula: (-8)+[(7)-(-4)+(-5)]\",\"respuesta\":\"-2\",\"visto\":\"0\",\"fecha\":\"2017-11-06\"}, {\"id_reactivo_abierto\":\"126\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"3\",\"reactivo\":\"Resuelve 17 * 19\",\"respuesta\":\"323\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_abierto\":\"127\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"3\",\"reactivo\":\"Resuelve 5*13-8\",\"respuesta\":\"57\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_abierto\":\"128\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"3\",\"reactivo\":\"Resuelve 56 - (45*2)\",\"respuesta\":\"-34\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_abierto\":\"129\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"3\",\"reactivo\":\"Resulve (17)*(-13)\",\"respuesta\":\"-221\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_abierto\":\"130\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"3\",\"reactivo\":\"Resuelve 35*86\",\"respuesta\":\"3010\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_abierto\":\"131\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"3\",\"reactivo\":\"Resuelve (12)*(16)*(2)\",\"respuesta\":\"384\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_abierto\":\"132\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"3\",\"reactivo\":\"Resuelve -24*3+47\",\"respuesta\":\"-25\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_abierto\":\"133\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"3\",\"reactivo\":\"Resuelve 78 * 39\",\"respuesta\":\"3042\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_abierto\":\"134\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"3\",\"reactivo\":\"Resuelve 83*33\",\"respuesta\":\"2739\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}]";
                        break;
                }
                break;
            case 2: //Fraccionarios
                switch (nivel) {
                    case 1:
                        DATOS = "[{\"id_reactivo_abierto\":\"191\",\"tema\":\"aritmetica\",\"subtema\":\"fraccionarios\",\"grado\":\"2\",\"nivel\":\"1\",\"reactivo\":\"Resuelve 8\\u00f72\",\"respuesta\":\"4\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_abierto\":\"192\",\"tema\":\"aritmetica\",\"subtema\":\"fraccionarios\",\"grado\":\"2\",\"nivel\":\"1\",\"reactivo\":\"Resuelve 45\\u00f79\",\"respuesta\":\"5\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_abierto\":\"193\",\"tema\":\"aritmetica\",\"subtema\":\"fraccionarios\",\"grado\":\"2\",\"nivel\":\"1\",\"reactivo\":\"Resulve 56\\u00f77\",\"respuesta\":\"8\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_abierto\":\"194\",\"tema\":\"aritmetica\",\"subtema\":\"fraccionarios\",\"grado\":\"2\",\"nivel\":\"1\",\"reactivo\":\"Resuelve 54\\u00f79\",\"respuesta\":\"6\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_abierto\":\"195\",\"tema\":\"aritmetica\",\"subtema\":\"fraccionarios\",\"grado\":\"2\",\"nivel\":\"1\",\"reactivo\":\"Resuelve 8\\u00f78\",\"respuesta\":\"1\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}]";
                        break;
                    case 2:
                        DATOS = "[{\"id_reactivo_abierto\":\"170\",\"tema\":\"aritmetica\",\"subtema\":\"fraccionarios\",\"grado\":\"1\",\"nivel\":\"2\",\"reactivo\":\"Reduce la expresi\\u00f3n: 64\\/4\",\"respuesta\":\"16\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_abierto\":\"171\",\"tema\":\"aritmetica\",\"subtema\":\"fraccionarios\",\"grado\":\"1\",\"nivel\":\"2\",\"reactivo\":\"Una caja contiene 60 bombones. Eva se comi\\u00f3 1\\/5 de los bombones. \\u00bfCu\\u00e1ntos bombones se comi\\u00f3 Eva?\",\"respuesta\":\"12\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_abierto\":\"172\",\"tema\":\"aritmetica\",\"subtema\":\"fraccionarios\",\"grado\":\"1\",\"nivel\":\"2\",\"reactivo\":\"Calcula: -45\\/3\",\"respuesta\":\"-15\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_abierto\":\"173\",\"tema\":\"aritmetica\",\"subtema\":\"fraccionarios\",\"grado\":\"1\",\"nivel\":\"2\",\"reactivo\":\"Calcula: -21\\/-3\",\"respuesta\":\"7\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_abierto\":\"174\",\"tema\":\"aritmetica\",\"subtema\":\"fraccionarios\",\"grado\":\"1\",\"nivel\":\"2\",\"reactivo\":\"Pedro tiene 3\\/2 de la edad de su hermano Carlos. Si Carlos a\\u00fan tiene 6 a\\u00f1os. \\u00bfCu\\u00e1ntos a\\u00f1os tiene Pedro?\",\"respuesta\":\"9\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_abierto\":\"175\",\"tema\":\"aritmetica\",\"subtema\":\"fraccionarios\",\"grado\":\"1\",\"nivel\":\"2\",\"reactivo\":\"Jair tiene que pagar sus cuentas bancarias a mitad del mes. Si se dice que un mes consta de 30 d\\u00edas. \\u00bfQu\\u00e9 d\\u00eda Jair paga sus cuentas bancarias?\",\"respuesta\":\"15\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_abierto\":\"176\",\"tema\":\"aritmetica\",\"subtema\":\"fraccionarios\",\"grado\":\"1\",\"nivel\":\"2\",\"reactivo\":\"Resuelve: 189\\/21\",\"respuesta\":\"9\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_abierto\":\"177\",\"tema\":\"aritmetica\",\"subtema\":\"fraccionarios\",\"grado\":\"1\",\"nivel\":\"2\",\"reactivo\":\"Reduce la expresi\\u00f3n: 128\\/32\",\"respuesta\":\"4\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_abierto\":\"179\",\"tema\":\"aritmetica\",\"subtema\":\"fraccionarios\",\"grado\":\"1\",\"nivel\":\"2\",\"reactivo\":\"\\u00bfCu\\u00e1ntos a\\u00f1os tiene 2\\/5 parte de una d\\u00e9cada?\",\"respuesta\":\"4\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_abierto\":\"180\",\"tema\":\"aritmetica\",\"subtema\":\"fraccionarios\",\"grado\":\"1\",\"nivel\":\"2\",\"reactivo\":\"Reduce: (-98)\\/(-7)\",\"respuesta\":\"14\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_abierto\":\"196\",\"tema\":\"aritmetica\",\"subtema\":\"fraccionarios\",\"grado\":\"2\",\"nivel\":\"2\",\"reactivo\":\"Resuelve 255\\u00f717\",\"respuesta\":\"15\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_abierto\":\"197\",\"tema\":\"aritmetica\",\"subtema\":\"fraccionarios\",\"grado\":\"2\",\"nivel\":\"2\",\"reactivo\":\"Resuelve 57\\u00f719\",\"respuesta\":\"3\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_abierto\":\"198\",\"tema\":\"aritmetica\",\"subtema\":\"fraccionarios\",\"grado\":\"2\",\"nivel\":\"2\",\"reactivo\":\"Resuelve 48\\u00f712\",\"respuesta\":\"4\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_abierto\":\"199\",\"tema\":\"aritmetica\",\"subtema\":\"fraccionarios\",\"grado\":\"2\",\"nivel\":\"2\",\"reactivo\":\"110\\u00f711\",\"respuesta\":\"10\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_abierto\":\"200\",\"tema\":\"aritmetica\",\"subtema\":\"fraccionarios\",\"grado\":\"2\",\"nivel\":\"2\",\"reactivo\":\"Resuelve 162\\u00f79\",\"respuesta\":\"18\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_abierto\":\"202\",\"tema\":\"aritmetica\",\"subtema\":\"fraccionarios\",\"grado\":\"2\",\"nivel\":\"2\",\"reactivo\":\"Resuelve 216\\u00f74\",\"respuesta\":\"54\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}]";
                        break;
                    case 3:
                        DATOS = "[{\"id_reactivo_abierto\":\"201\",\"tema\":\"aritmetica\",\"subtema\":\"fraccionarios\",\"grado\":\"2\",\"nivel\":\"3\",\"reactivo\":\"Resuelve 248\\u00f78\",\"respuesta\":\"31\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_abierto\":\"203\",\"tema\":\"aritmetica\",\"subtema\":\"fraccionarios\",\"grado\":\"2\",\"nivel\":\"3\",\"reactivo\":\"Resuelve 462\\u00f722\",\"respuesta\":\"21\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_abierto\":\"204\",\"tema\":\"aritmetica\",\"subtema\":\"fraccionarios\",\"grado\":\"2\",\"nivel\":\"3\",\"reactivo\":\"Resuelve 1400\\u00f756\",\"respuesta\":\"25\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_abierto\":\"205\",\"tema\":\"aritmetica\",\"subtema\":\"fraccionarios\",\"grado\":\"2\",\"nivel\":\"3\",\"reactivo\":\"Resuelve 4752\\u00f799\",\"respuesta\":\"48\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_abierto\":\"206\",\"tema\":\"aritmetica\",\"subtema\":\"fraccionarios\",\"grado\":\"2\",\"nivel\":\"3\",\"reactivo\":\"Resuelve 3128\\u00f792\",\"respuesta\":\"34\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}]";
                        break;
                }
                break;
            case 3: //
                switch (nivel) {
                    case 1:
                        DATOS = "[{\"id_reactivo_abierto\":\"115\",\"tema\":\"aritmetica\",\"subtema\":\"decimales\",\"grado\":\"2\",\"nivel\":\"1\",\"reactivo\":\"Resuelve 0.1 x 6.0\",\"respuesta\":\"0.6\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_abierto\":\"116\",\"tema\":\"aritmetica\",\"subtema\":\"decimales\",\"grado\":\"2\",\"nivel\":\"1\",\"reactivo\":\"Resuelve 4.0 x 0.2\",\"respuesta\":\"0.8\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_abierto\":\"117\",\"tema\":\"aritmetica\",\"subtema\":\"decimales\",\"grado\":\"2\",\"nivel\":\"1\",\"reactivo\":\"Resuelve 0.5 x 6.0\",\"respuesta\":\"3\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_abierto\":\"118\",\"tema\":\"aritmetica\",\"subtema\":\"decimales\",\"grado\":\"2\",\"nivel\":\"1\",\"reactivo\":\"Resuelve 9.0 x 0.7\",\"respuesta\":\"6.3\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_abierto\":\"119\",\"tema\":\"aritmetica\",\"subtema\":\"decimales\",\"grado\":\"2\",\"nivel\":\"1\",\"reactivo\":\"Resuelve 0.5 x 3.0\",\"respuesta\":\"1.5\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_abierto\":\"153\",\"tema\":\"aritmetica\",\"subtema\":\"decimales\",\"grado\":\"1\",\"nivel\":\"1\",\"reactivo\":\"Calcula: 144 \\u00f7 3\",\"respuesta\":\"48\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_abierto\":\"154\",\"tema\":\"aritmetica\",\"subtema\":\"decimales\",\"grado\":\"1\",\"nivel\":\"1\",\"reactivo\":\"Calcula: 64 \\u00f7 4\",\"respuesta\":\"16\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}]";
                        break;
                    case 2:
                        DATOS = "[{\"id_reactivo_abierto\":\"103\",\"tema\":\"aritmetica\",\"subtema\":\"decimales\",\"grado\":\"2\",\"nivel\":\"2\",\"reactivo\":\"Resuelve: 3.6 + 7.5\",\"respuesta\":\"11.1\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_abierto\":\"104\",\"tema\":\"aritmetica\",\"subtema\":\"decimales\",\"grado\":\"2\",\"nivel\":\"2\",\"reactivo\":\"Resuelve: 1.1 + 8.6\",\"respuesta\":\"9.7\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_abierto\":\"105\",\"tema\":\"aritmetica\",\"subtema\":\"decimales\",\"grado\":\"2\",\"nivel\":\"2\",\"reactivo\":\"Resuelve: 8.9 + 7.0\",\"respuesta\":\"15.9\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_abierto\":\"113\",\"tema\":\"aritmetica\",\"subtema\":\"decimales\",\"grado\":\"2\",\"nivel\":\"2\",\"reactivo\":\"Resuelve: 5.8 - 1.2\",\"respuesta\":\"4.6\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_abierto\":\"114\",\"tema\":\"aritmetica\",\"subtema\":\"decimales\",\"grado\":\"2\",\"nivel\":\"2\",\"reactivo\":\"Resuelve: 0.5 - 3.2\",\"respuesta\":\"-2.7\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_abierto\":\"158\",\"tema\":\"aritmetica\",\"subtema\":\"decimales\",\"grado\":\"1\",\"nivel\":\"2\",\"reactivo\":\"Resuelve: 13.4 + 17.3\",\"respuesta\":\"30.7\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_abierto\":\"159\",\"tema\":\"aritmetica\",\"subtema\":\"decimales\",\"grado\":\"1\",\"nivel\":\"2\",\"reactivo\":\"Resuelve: 6.9 - 21.5\",\"respuesta\":\"-14.6\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_abierto\":\"160\",\"tema\":\"aritmetica\",\"subtema\":\"decimales\",\"grado\":\"1\",\"nivel\":\"2\",\"reactivo\":\"Resuelve: -21.32 - 1.21\",\"respuesta\":\"-22.53\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_abierto\":\"162\",\"tema\":\"aritmetica\",\"subtema\":\"decimales\",\"grado\":\"1\",\"nivel\":\"2\",\"reactivo\":\"Resuelve: 3.6 * 7\",\"respuesta\":\"25.2\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_abierto\":\"163\",\"tema\":\"aritmetica\",\"subtema\":\"decimales\",\"grado\":\"1\",\"nivel\":\"2\",\"reactivo\":\"Resuelve: -7.5 * 5\",\"respuesta\":\"-37.5\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_abierto\":\"164\",\"tema\":\"aritmetica\",\"subtema\":\"decimales\",\"grado\":\"1\",\"nivel\":\"2\",\"reactivo\":\"Resuelve: 5.2 * 4\",\"respuesta\":\"20.8\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_abierto\":\"165\",\"tema\":\"aritmetica\",\"subtema\":\"decimales\",\"grado\":\"1\",\"nivel\":\"2\",\"reactivo\":\"Resuelve: 2 * 6.52\",\"respuesta\":\"13.04\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_abierto\":\"166\",\"tema\":\"aritmetica\",\"subtema\":\"decimales\",\"grado\":\"1\",\"nivel\":\"2\",\"reactivo\":\"Resuelve: 12.4 \\u00f7 2\",\"respuesta\":\"6.2\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_abierto\":\"167\",\"tema\":\"aritmetica\",\"subtema\":\"decimales\",\"grado\":\"1\",\"nivel\":\"2\",\"reactivo\":\"Resuelve: 21 \\u00f7 4\",\"respuesta\":\"5.25\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_abierto\":\"168\",\"tema\":\"aritmetica\",\"subtema\":\"decimales\",\"grado\":\"1\",\"nivel\":\"2\",\"reactivo\":\"Resuelve: 13 \\u00f7 4\",\"respuesta\":\"3.25\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_abierto\":\"169\",\"tema\":\"aritmetica\",\"subtema\":\"decimales\",\"grado\":\"1\",\"nivel\":\"2\",\"reactivo\":\"Resuelve: 44.8 \\u00f7 4\",\"respuesta\":\"11.2\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_abierto\":\"178\",\"tema\":\"aritmetica\",\"subtema\":\"decimales\",\"grado\":\"1\",\"nivel\":\"2\",\"reactivo\":\"\\u00bfCu\\u00e1ntos a\\u00f1os tiene 2\\/5 parte de una d\\u00e9cada?\",\"respuesta\":\"4\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}]";
                        break;
                    case 3:
                        DATOS = "[{\"id_reactivo_abierto\":\"106\",\"tema\":\"aritmetica\",\"subtema\":\"decimales\",\"grado\":\"2\",\"nivel\":\"3\",\"reactivo\":\"Resuelve 0.11 + 0.65\",\"respuesta\":\"0.76\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_abierto\":\"107\",\"tema\":\"aritmetica\",\"subtema\":\"decimales\",\"grado\":\"2\",\"nivel\":\"3\",\"reactivo\":\"Resuelve 0.54 + 0.35\",\"respuesta\":\"0.89\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_abierto\":\"108\",\"tema\":\"aritmetica\",\"subtema\":\"decimales\",\"grado\":\"2\",\"nivel\":\"3\",\"reactivo\":\"Resuelve 0.78 + 7.40 \",\"respuesta\":\"8.18\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_abierto\":\"109\",\"tema\":\"aritmetica\",\"subtema\":\"decimales\",\"grado\":\"2\",\"nivel\":\"3\",\"reactivo\":\"Resuelve 0.44 + 0.71\",\"respuesta\":\"1.15\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_abierto\":\"110\",\"tema\":\"aritmetica\",\"subtema\":\"decimales\",\"grado\":\"2\",\"nivel\":\"3\",\"reactivo\":\"Resuelve 0.43 + 1.80 \",\"respuesta\":\"2.23\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_abierto\":\"111\",\"tema\":\"aritmetica\",\"subtema\":\"decimales\",\"grado\":\"2\",\"nivel\":\"3\",\"reactivo\":\"Resuelve 0.11 + 0.96\",\"respuesta\":\"1.07\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_abierto\":\"112\",\"tema\":\"aritmetica\",\"subtema\":\"decimales\",\"grado\":\"2\",\"nivel\":\"3\",\"reactivo\":\"Resuelve 9.10 - 0.71\",\"respuesta\":\"8.39\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_abierto\":\"161\",\"tema\":\"aritmetica\",\"subtema\":\"decimales\",\"grado\":\"1\",\"nivel\":\"3\",\"reactivo\":\"Resuelve: 23.4 * 3\",\"respuesta\":\"70.2\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}]";
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