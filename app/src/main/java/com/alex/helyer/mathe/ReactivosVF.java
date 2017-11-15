package com.alex.helyer.mathe;

/**
 * Created by helyer on 14/11/17.
 */

public class ReactivosVF {
    int subtema, nivel;

    ReactivosVF(int misubtema, int minivel) {
        subtema = misubtema;
        nivel = minivel;
    }

    String DATOS = "[{\"id\":\"1\",\"tipo\":\"0\",\"reactivo\":\"s"+subtema+"-g0"+"-n"+nivel+"-tAbierto"+"\",\"respuesta\":\"2\",\"opc1\":\"28\\/11\",\"opc2\":\"7\",\"opc3\":\"11\\/2\",\"opc4\":\"14\"}]";

    public String getDatos() {

        switch (subtema) {
            case 0: //NATURALES
                switch (nivel) {
                    case 1:
                        DATOS = "[{\"id_reactivo_vf\":\"120\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"2\",\"nivel\":\"1\",\"reactivo\":\"El n\\u00famero 24 es m\\u00faltiplo de 5\",\"respuesta\":\"falso\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_vf\":\"121\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"2\",\"nivel\":\"1\",\"reactivo\":\"7*8=54\",\"respuesta\":\"falso\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_vf\":\"167\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"1\",\"nivel\":\"1\",\"reactivo\":\"(1)*(-4) = -4 \",\"respuesta\":\"verdadero\",\"visto\":\"0\",\"fecha\":\"2017-11-14\"}, {\"id_reactivo_vf\":\"168\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"1\",\"nivel\":\"1\",\"reactivo\":\"(-10)*(-4) = -40\",\"respuesta\":\"falso\",\"visto\":\"0\",\"fecha\":\"2017-11-14\"}, {\"id_reactivo_vf\":\"169\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"2\",\"nivel\":\"1\",\"reactivo\":\"El n\\u00famero 27 es m\\u00faltiplo de 3\",\"respuesta\":\"verdadero\",\"visto\":\"0\",\"fecha\":\"2017-11-14\"}, {\"id_reactivo_vf\":\"170\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"2\",\"nivel\":\"1\",\"reactivo\":\"5 - 11 = 16\",\"respuesta\":\"falso\",\"visto\":\"0\",\"fecha\":\"2017-11-14\"}, {\"id_reactivo_vf\":\"171\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"2\",\"nivel\":\"1\",\"reactivo\":\"6 + 17 = 23\",\"respuesta\":\"verdadero\",\"visto\":\"0\",\"fecha\":\"2017-11-14\"}, {\"id_reactivo_vf\":\"172\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"2\",\"nivel\":\"1\",\"reactivo\":\"90 \\u00f7 11 = 9\",\"respuesta\":\"falso\",\"visto\":\"0\",\"fecha\":\"2017-11-14\"}]";
                        break;
                    case 2:
                        DATOS = "[{\"id_reactivo_vf\":\"101\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"2\",\"nivel\":\"2\",\"reactivo\":\"(11)*(-4) = -44 \",\"respuesta\":\"verdadero\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_vf\":\"116\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"2\",\"nivel\":\"2\",\"reactivo\":\"4*5-3=17\",\"respuesta\":\"verdadero\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_vf\":\"117\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"2\",\"nivel\":\"2\",\"reactivo\":\"1208-327=881\",\"respuesta\":\"verdadero\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_vf\":\"119\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"2\",\"nivel\":\"2\",\"reactivo\":\"5*3-6=-15\",\"respuesta\":\"falso\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_vf\":\"122\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"2\",\"nivel\":\"2\",\"reactivo\":\"130*4=540\",\"respuesta\":\"falso\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_vf\":\"123\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"2\",\"nivel\":\"2\",\"reactivo\":\"El 75% de 800 es 600\",\"respuesta\":\"verdadero\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_vf\":\"124\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"2\",\"nivel\":\"2\",\"reactivo\":\"Resuelve 106-54-32=20\",\"respuesta\":\"verdadero\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_vf\":\"125\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"2\",\"nivel\":\"2\",\"reactivo\":\"5*5*5=150\",\"respuesta\":\"falso\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_vf\":\"126\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"2\",\"nivel\":\"2\",\"reactivo\":\"el 40% de 200 es 80\",\"respuesta\":\"verdadero\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_vf\":\"173\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"2\",\"nivel\":\"2\",\"reactivo\":\"El 25% de 400 es 70\",\"respuesta\":\"falso\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_vf\":\"174\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"2\",\"nivel\":\"2\",\"reactivo\":\"La siguiente operaci\\u00f3n 5-7. \\u00bfTiene como resultado un n\\u00famero natural?\",\"respuesta\":\"falso\",\"visto\":\"0\",\"fecha\":\"2017-11-14\"}, {\"id_reactivo_vf\":\"176\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"2\",\"nivel\":\"2\",\"reactivo\":\"Los n\\u00fameros naturales tiene un n\\u00famero finito de valores.\",\"respuesta\":\"falso\",\"visto\":\"0\",\"fecha\":\"2017-11-14\"}]";
                        break;
                    case 3:
                        DATOS = "[{\"id_reactivo_vf\":\"127\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"2\",\"nivel\":\"3\",\"reactivo\":\"42*56-143=2209\",\"respuesta\":\"verdadero\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_vf\":\"128\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"2\",\"nivel\":\"3\",\"reactivo\":\"3*3*5*8+156+32=550\",\"respuesta\":\"verdadero\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_vf\":\"129\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"2\",\"nivel\":\"3\",\"reactivo\":\"Un auto que viaja a 58 km\\/h recorre 29 km en 30 minutos\",\"respuesta\":\"verdadero\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_vf\":\"130\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"2\",\"nivel\":\"3\",\"reactivo\":\"53*43-324=1955\",\"respuesta\":\"verdadero\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_vf\":\"131\",\"tema\":\"aritmetica\",\"subtema\":\"naturales\",\"grado\":\"2\",\"nivel\":\"3\",\"reactivo\":\"650-43*3+32=555\",\"respuesta\":\"falso\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}]";
                        break;
                }
                break;
            case 1: //ENTEROS
                switch (nivel) {
                    case 1:
                        DATOS = "[{\"id_reactivo_vf\":\"58\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"1\",\"reactivo\":\"-5+2+3=0\",\"respuesta\":\"verdadero\",\"visto\":\"0\",\"fecha\":\"2017-11-05\"}, {\"id_reactivo_vf\":\"59\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"1\",\"reactivo\":\"-20+19+2=2\",\"respuesta\":\"falso\",\"visto\":\"0\",\"fecha\":\"2017-11-05\"}, {\"id_reactivo_vf\":\"60\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"1\",\"reactivo\":\"4-2+5=7\",\"respuesta\":\"verdadero\",\"visto\":\"0\",\"fecha\":\"2017-11-05\"}, {\"id_reactivo_vf\":\"61\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"1\",\"reactivo\":\"-1-3-1+5=0\",\"respuesta\":\"verdadero\",\"visto\":\"0\",\"fecha\":\"2017-11-05\"}, {\"id_reactivo_vf\":\"62\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"1\",\"reactivo\":\"6+4-2=9\",\"respuesta\":\"falso\",\"visto\":\"0\",\"fecha\":\"2017-11-05\"}, {\"id_reactivo_vf\":\"63\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"1\",\"reactivo\":\"10+22-7=25\",\"respuesta\":\"verdadero\",\"visto\":\"0\",\"fecha\":\"2017-11-05\"}, {\"id_reactivo_vf\":\"102\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"2\",\"nivel\":\"1\",\"reactivo\":\"12 * 5 = 72\",\"respuesta\":\"falso\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_vf\":\"103\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"2\",\"nivel\":\"1\",\"reactivo\":\"6*11=66\",\"respuesta\":\"verdadero\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_vf\":\"104\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"2\",\"nivel\":\"1\",\"reactivo\":\"(11) * (-10) = -111\",\"respuesta\":\"falso\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_vf\":\"105\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"2\",\"nivel\":\"1\",\"reactivo\":\"12 * 11 = 121\",\"respuesta\":\"falso\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_vf\":\"118\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"2\",\"nivel\":\"1\",\"reactivo\":\"Si tres manzanas cuestan 15 pesos entonces una manzana cuesta 5 pesos\",\"respuesta\":\"verdadero\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}]";
                        break;
                    case 2:
                        DATOS = "[{\"id_reactivo_vf\":\"64\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"2\",\"reactivo\":\"-25+31-4+6=8\",\"respuesta\":\"verdadero\",\"visto\":\"0\",\"fecha\":\"2017-11-05\"}, {\"id_reactivo_vf\":\"65\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"2\",\"reactivo\":\"14-67=52\",\"respuesta\":\"falso\",\"visto\":\"0\",\"fecha\":\"2017-11-05\"}, {\"id_reactivo_vf\":\"66\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"2\",\"reactivo\":\"-11+48=37\",\"respuesta\":\"verdadero\",\"visto\":\"0\",\"fecha\":\"2017-11-05\"}, {\"id_reactivo_vf\":\"67\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"2\",\"reactivo\":\"5 + 2\\u00b7( -3 )= -1\",\"respuesta\":\"verdadero\",\"visto\":\"0\",\"fecha\":\"2017-11-05\"}, {\"id_reactivo_vf\":\"68\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"2\",\"reactivo\":\"(5)(3)+2 = 17\",\"respuesta\":\"verdadero\",\"visto\":\"0\",\"fecha\":\"2017-11-05\"}, {\"id_reactivo_vf\":\"69\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"2\",\"reactivo\":\"(2)(3)+(3)(3)=15\",\"respuesta\":\"verdadero\",\"visto\":\"0\",\"fecha\":\"2017-11-05\"}, {\"id_reactivo_vf\":\"70\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"2\",\"reactivo\":\"(6)-(2)(3)=12\",\"respuesta\":\"falso\",\"visto\":\"0\",\"fecha\":\"2017-11-05\"}, {\"id_reactivo_vf\":\"71\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"2\",\"reactivo\":\"(2)(2)(2)(3)-1=23\",\"respuesta\":\"verdadero\",\"visto\":\"0\",\"fecha\":\"2017-11-05\"}, {\"id_reactivo_vf\":\"72\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"2\",\"reactivo\":\"-69+31-42=-79\",\"respuesta\":\"falso\",\"visto\":\"0\",\"fecha\":\"2017-11-06\"}, {\"id_reactivo_vf\":\"73\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"2\",\"reactivo\":\"(3)(4)(6)(2)=144\",\"respuesta\":\"verdadero\",\"visto\":\"0\",\"fecha\":\"2017-11-06\"}, {\"id_reactivo_vf\":\"74\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"2\",\"reactivo\":\"67-43-(3)(2)=18\",\"respuesta\":\"verdadero\",\"visto\":\"0\",\"fecha\":\"2017-11-06\"}, {\"id_reactivo_vf\":\"75\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"2\",\"reactivo\":\"99+9=109\",\"respuesta\":\"falso\",\"visto\":\"0\",\"fecha\":\"2017-11-06\"}, {\"id_reactivo_vf\":\"76\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"2\",\"reactivo\":\"(-99+1)2=-196\",\"respuesta\":\"verdadero\",\"visto\":\"0\",\"fecha\":\"2017-11-06\"}, {\"id_reactivo_vf\":\"106\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"2\",\"nivel\":\"2\",\"reactivo\":\"18 * 10 = 180\",\"respuesta\":\"verdadero\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_vf\":\"107\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"2\",\"nivel\":\"2\",\"reactivo\":\"17 * 19 = 323\",\"respuesta\":\"verdadero\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_vf\":\"108\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"2\",\"nivel\":\"2\",\"reactivo\":\"16*3+8=176\",\"respuesta\":\"falso\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_vf\":\"109\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"2\",\"nivel\":\"2\",\"reactivo\":\"280-56-34=190\",\"respuesta\":\"verdadero\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_vf\":\"110\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"2\",\"nivel\":\"2\",\"reactivo\":\"17*13=211\",\"respuesta\":\"falso\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}]";
                        break;
                    case 3:
                        DATOS = "[{\"id_reactivo_vf\":\"77\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"3\",\"reactivo\":\"1-(-3)+[4-(1-3)]=10\",\"respuesta\":\"verdadero\",\"visto\":\"0\",\"fecha\":\"2017-11-06\"}, {\"id_reactivo_vf\":\"78\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"3\",\"reactivo\":\"3-[(5-8)-(3-6)]=4\",\"respuesta\":\"falso\",\"visto\":\"0\",\"fecha\":\"2017-11-06\"}, {\"id_reactivo_vf\":\"79\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"3\",\"reactivo\":\"[(6)-(-8)]-[(-4)-(-8)]=10\",\"respuesta\":\"verdadero\",\"visto\":\"0\",\"fecha\":\"2017-11-06\"}, {\"id_reactivo_vf\":\"80\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"3\",\"reactivo\":\"(9-[(3)-(3-12)-(8)])=5\",\"respuesta\":\"verdadero\",\"visto\":\"0\",\"fecha\":\"2017-11-06\"}, {\"id_reactivo_vf\":\"81\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"1\",\"nivel\":\"3\",\"reactivo\":\"(-8)+[(7)-(-4)+(-5)]=-3\",\"respuesta\":\"falso\",\"visto\":\"0\",\"fecha\":\"2017-11-06\"}, {\"id_reactivo_vf\":\"111\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"2\",\"nivel\":\"3\",\"reactivo\":\"93 * 36 = 3340\",\"respuesta\":\"falso\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_vf\":\"112\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"2\",\"nivel\":\"3\",\"reactivo\":\"7*4+6-4*8=2\",\"respuesta\":\"verdadero\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_vf\":\"113\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"2\",\"nivel\":\"3\",\"reactivo\":\"82*91=7462\",\"respuesta\":\"verdadero\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_vf\":\"114\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"2\",\"nivel\":\"3\",\"reactivo\":\"36*78=2818\",\"respuesta\":\"falso\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_vf\":\"115\",\"tema\":\"aritmetica\",\"subtema\":\"enteros\",\"grado\":\"2\",\"nivel\":\"3\",\"reactivo\":\"81*53-17=4278\",\"respuesta\":\"falso\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}]";
                        break;
                }
                break;
            case 2: //Fraccionarios
                switch (nivel) {
                    case 1:
                        DATOS = "[{\"id_reactivo_vf\":\"132\",\"tema\":\"aritmetica\",\"subtema\":\"fraccionarios\",\"grado\":\"2\",\"nivel\":\"1\",\"reactivo\":\"16\\u00f74=4\",\"respuesta\":\"verdadero\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_vf\":\"133\",\"tema\":\"aritmetica\",\"subtema\":\"fraccionarios\",\"grado\":\"2\",\"nivel\":\"1\",\"reactivo\":\"4\\u00f74=2\",\"respuesta\":\"falso\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_vf\":\"134\",\"tema\":\"aritmetica\",\"subtema\":\"fraccionarios\",\"grado\":\"2\",\"nivel\":\"1\",\"reactivo\":\"90\\u00f710=9\",\"respuesta\":\"verdadero\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_vf\":\"135\",\"tema\":\"aritmetica\",\"subtema\":\"fraccionarios\",\"grado\":\"2\",\"nivel\":\"1\",\"reactivo\":\"21\\u00f77=3.5\",\"respuesta\":\"falso\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_vf\":\"136\",\"tema\":\"aritmetica\",\"subtema\":\"fraccionarios\",\"grado\":\"2\",\"nivel\":\"1\",\"reactivo\":\"55\\u00f75=10\",\"respuesta\":\"falso\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}]";
                        break;
                    case 2:
                        DATOS = "[{\"id_reactivo_vf\":\"137\",\"tema\":\"aritmetica\",\"subtema\":\"fraccionarios\",\"grado\":\"2\",\"nivel\":\"2\",\"reactivo\":\"255\\u00f717=15\",\"respuesta\":\"verdadero\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_vf\":\"138\",\"tema\":\"aritmetica\",\"subtema\":\"fraccionarios\",\"grado\":\"2\",\"nivel\":\"2\",\"reactivo\":\"57\\u00f73=19\",\"respuesta\":\"verdadero\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_vf\":\"139\",\"tema\":\"aritmetica\",\"subtema\":\"fraccionarios\",\"grado\":\"2\",\"nivel\":\"2\",\"reactivo\":\"48\\u00f716=3.5\",\"respuesta\":\"falso\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_vf\":\"140\",\"tema\":\"aritmetica\",\"subtema\":\"fraccionarios\",\"grado\":\"2\",\"nivel\":\"2\",\"reactivo\":\"275\\u00f711=25\",\"respuesta\":\"verdadero\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_vf\":\"141\",\"tema\":\"aritmetica\",\"subtema\":\"fraccionarios\",\"grado\":\"2\",\"nivel\":\"2\",\"reactivo\":\"161\\u00f723=7.5\",\"respuesta\":\"falso\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}]";
                        break;
                    case 3:
                        DATOS = "[{\"id_reactivo_vf\":\"142\",\"tema\":\"aritmetica\",\"subtema\":\"fraccionarios\",\"grado\":\"2\",\"nivel\":\"3\",\"reactivo\":\"248\\u00f731=8\",\"respuesta\":\"verdadero\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_vf\":\"143\",\"tema\":\"aritmetica\",\"subtema\":\"fraccionarios\",\"grado\":\"2\",\"nivel\":\"3\",\"reactivo\":\"216\\u00f727=12\",\"respuesta\":\"falso\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_vf\":\"144\",\"tema\":\"aritmetica\",\"subtema\":\"fraccionarios\",\"grado\":\"2\",\"nivel\":\"3\",\"reactivo\":\"462\\u00f722=21\",\"respuesta\":\"verdadero\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_vf\":\"145\",\"tema\":\"aritmetica\",\"subtema\":\"fraccionarios\",\"grado\":\"2\",\"nivel\":\"3\",\"reactivo\":\"4340\\u00f770=63.5\",\"respuesta\":\"falso\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}, {\"id_reactivo_vf\":\"146\",\"tema\":\"aritmetica\",\"subtema\":\"fraccionarios\",\"grado\":\"2\",\"nivel\":\"3\",\"reactivo\":\"1540\\u00f720=77\",\"respuesta\":\"verdadero\",\"visto\":\"0\",\"fecha\":\"2017-11-13\"}]";
                        break;
                }
                break;
            case 3: // Decimales
                switch (nivel) {
                    case 1:
                        DATOS = "[{\"id_reactivo_vf\":\"84\",\"tema\":\"aritmetica\",\"subtema\":\"decimales\",\"grado\":\"2\",\"nivel\":\"1\",\"reactivo\":\"2.6 + 2.2 = 4.8\",\"respuesta\":\"verdadero\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_vf\":\"85\",\"tema\":\"aritmetica\",\"subtema\":\"decimales\",\"grado\":\"2\",\"nivel\":\"1\",\"reactivo\":\"1.3 + 4.1 = 5.3\",\"respuesta\":\"falso\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_vf\":\"86\",\"tema\":\"aritmetica\",\"subtema\":\"decimales\",\"grado\":\"2\",\"nivel\":\"1\",\"reactivo\":\"4.0 + 2.4 = 6.4\",\"respuesta\":\"verdadero\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_vf\":\"87\",\"tema\":\"aritmetica\",\"subtema\":\"decimales\",\"grado\":\"2\",\"nivel\":\"1\",\"reactivo\":\"3.6 - 3.1 = 0.6\",\"respuesta\":\"falso\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_vf\":\"88\",\"tema\":\"aritmetica\",\"subtema\":\"decimales\",\"grado\":\"2\",\"nivel\":\"1\",\"reactivo\":\"0.4 + 0.7 = 1.1\",\"respuesta\":\"verdadero\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}]";
                        break;
                    case 2:
                        DATOS = "[{\"id_reactivo_vf\":\"89\",\"tema\":\"aritmetica\",\"subtema\":\"decimales\",\"grado\":\"2\",\"nivel\":\"2\",\"reactivo\":\"3.6 + 7.5 = 11.1\",\"respuesta\":\"verdadero\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_vf\":\"90\",\"tema\":\"aritmetica\",\"subtema\":\"decimales\",\"grado\":\"2\",\"nivel\":\"2\",\"reactivo\":\"6.3 + 8.5 = 14.8\",\"respuesta\":\"verdadero\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_vf\":\"91\",\"tema\":\"aritmetica\",\"subtema\":\"decimales\",\"grado\":\"2\",\"nivel\":\"2\",\"reactivo\":\"1.1 + 8.6 = 9.7\",\"respuesta\":\"verdadero\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_vf\":\"92\",\"tema\":\"aritmetica\",\"subtema\":\"decimales\",\"grado\":\"2\",\"nivel\":\"2\",\"reactivo\":\"8.1 + 6.5 = 14.9\",\"respuesta\":\"falso\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_vf\":\"93\",\"tema\":\"aritmetica\",\"subtema\":\"decimales\",\"grado\":\"2\",\"nivel\":\"2\",\"reactivo\":\"8.9 + 7.0 = 16.9\",\"respuesta\":\"falso\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}]";
                        break;
                    case 3:
                        DATOS = "[{\"id_reactivo_vf\":\"94\",\"tema\":\"aritmetica\",\"subtema\":\"decimales\",\"grado\":\"2\",\"nivel\":\"3\",\"reactivo\":\"0.11 + 0.65 = 0.76\",\"respuesta\":\"verdadero\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_vf\":\"95\",\"tema\":\"aritmetica\",\"subtema\":\"decimales\",\"grado\":\"2\",\"nivel\":\"3\",\"reactivo\":\"0.25 + 0.24 = 0.48\",\"respuesta\":\"falso\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_vf\":\"96\",\"tema\":\"aritmetica\",\"subtema\":\"decimales\",\"grado\":\"2\",\"nivel\":\"3\",\"reactivo\":\"0.78 + 7.40 = 8.18\",\"respuesta\":\"verdadero\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_vf\":\"97\",\"tema\":\"aritmetica\",\"subtema\":\"decimales\",\"grado\":\"2\",\"nivel\":\"3\",\"reactivo\":\"0.73 + 2.80 = 3.53\",\"respuesta\":\"verdadero\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_vf\":\"98\",\"tema\":\"aritmetica\",\"subtema\":\"decimales\",\"grado\":\"2\",\"nivel\":\"3\",\"reactivo\":\"6.30 + 0.36 = 6.76\",\"respuesta\":\"falso\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_vf\":\"99\",\"tema\":\"aritmetica\",\"subtema\":\"decimales\",\"grado\":\"2\",\"nivel\":\"3\",\"reactivo\":\"0.25 + 9.80 = 10.50\",\"respuesta\":\"falso\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}, {\"id_reactivo_vf\":\"100\",\"tema\":\"aritmetica\",\"subtema\":\"decimales\",\"grado\":\"2\",\"nivel\":\"3\",\"reactivo\":\"6.50 - 0.90 = 5.60\",\"respuesta\":\"verdadero\",\"visto\":\"0\",\"fecha\":\"2017-11-12\"}]";
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
