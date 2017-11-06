package com.alex.helyer.mathe;

/**
 * Created by helyer on 06/11/17.
 */

public class ReactivosN2 {

    public String[] PREGUNTAS_MULTIPLES = {"Calcula: (7)2-6+7","Calcula: 31+31-69","Calcula: 64+85-162","Calcula: (1)(5)(9)-14","Calcula: 77-99+2"};

    public String[] RES_MULTIPLES1 = {"21","-6","14","-25","-18"};
    public String[] RES_MULTIPLES2 = {"14","-8","13","25","-19"};
    public String[] RES_MULTIPLES3 = {"16","7","-12","-31","-21"};
    public String[] RES_MULTIPLES4 = {"17","-5","11","21","-22"};
    public String[] CORR_MULTIPLES = {"15","-7","-13","31","-20"};

    public String[] PREGUNTAS_ABIERTAS = {"Calcula -56+16","Calcula: -16+34-19","Calcula: -64+24-2","Calcula: (-7)-(-7)-(+5)","Calcula:(+3)-(+8)","Calcula -13+5","Calcula 5+3+1","Calcula -5-5+1","Calcula 10-10+1","Calcula 5-3+8","Calcula (5-7)+1","Calcula 1+1+11","Calcula (-2)+(-1)","Calcula -1-3-4","Calcula -1-1-10","Escribe el valor absoluto del siguiente número: -3","Escribe el valor absoluto del siguiente número: +6","Escribe el valor absoluto del siguiente número: -10","Escribe el valor absoluto del siguiente número: -22","Escribe el valor absoluto del siguiente número: +2..."};
    public String[] RESPUESTAS_ABIERTAS = {"-40","-1","-42","-5","-5","-8","9","-9","1","10","-1","13","-3","-8","-12","3","6","10","22","27"};

    public String[] PREGUNTAS_VF = {"-25+31-4+6=8","14-67=52","-11+48=37","5 + 2·( -3 )= -1","(5)(3)+2 = 17","(2)(3)+(3)(3)=15"};
    public String[] RESPUESTAS_VF = {"verdadero","falso","verdadero","verdadero","verdadero","verdadero"};

    public String getPreguntas_M(int index) {
        String pregunta = PREGUNTAS_MULTIPLES[index];
        return pregunta;
    }

    public String getPreguntas_A(int index) {
        String pregunta = PREGUNTAS_ABIERTAS[index];
        return pregunta;
    }

    public String getPreguntas_VF(int index) {
        String pregunta = PREGUNTAS_VF[index];
        return pregunta;
    }

    public String getRes_Multiples(int index, int opc) {
        String res = "null";

        switch (opc) {
            case 1:
                res = RES_MULTIPLES1[index];
                break;
            case 2:
                res = RES_MULTIPLES2[index];
                break;
            case 3:
                res = RES_MULTIPLES3[index];
                break;
            case 4:
                res = RES_MULTIPLES4[index];
                break;
        }
        return res;
    }

    public String getCorrect_Multiples(int index) {
        String respuesta = CORR_MULTIPLES[index];

        return respuesta;
    }

    public int checkRespuesta_M(String answer, int index) {
        int res = 0;

        if (answer.contentEquals(CORR_MULTIPLES[index])) {
            res = 1;
        }

        return res;
    }

    public int checkRespuesta_VF(String answer, int index) {
        int res = 0;

        if (answer.contentEquals(RESPUESTAS_VF[index])) {
            res = 1;
        }

        return res;
    }

    public int checkRespuesta_A(String answer, int index) {
        int res = 0;

        if (answer.contentEquals(RESPUESTAS_ABIERTAS[index])) {
            res = 1;
        }

        return res;
    }

}
