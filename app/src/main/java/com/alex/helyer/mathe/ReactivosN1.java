package com.alex.helyer.mathe;

/**
 * Created by helyer on 06/11/17.
 */

public class ReactivosN1 {

    public String[] PREGUNTAS_MULTIPLES = {"Calcula -7-10-1","Calcula -6+2-20","Calcula: -4+11","Calcula: 6+2-9","Calcula: 14-18+2"};

    public String[] RES_MULTIPLES1 = {"-17","-26","-7","1","4"};
    public String[] RES_MULTIPLES2 = {"18","-28","8","-2","-3"};
    public String[] RES_MULTIPLES3 = {"-19","24","6","0","0"};
    public String[] RES_MULTIPLES4 = {"18","22","5","3","2"};
    public String[] CORR_MULTIPLES = {"-18","-24","7","-1","-2"};

    public String[] PREGUNTAS_ABIERTAS = {"Calcula -3-5-2","Calcula -8-4","Calcula 8+3+2","Calcula -5+4","Calcula 9-10+2","Calcula -13+5","Calcula 5+3+1","Calcula -5-5+1","Calcula 10-10+1","Calcula 5-3+8","Calcula (5-7)+1","Calcula 1+1+11","Calcula (-2)+(-1)","Calcula -1-3-4","Calcula -1-1-10","Escribe el valor absoluto del siguiente número: -3","Escribe el valor absoluto del siguiente número: +6","Escribe el valor absoluto del siguiente número: -10","Escribe el valor absoluto del siguiente número: -22","Escribe el valor absoluto del siguiente número: +2..."};
    public String[] RESPUESTAS_ABIERTAS = {"-10","-12","13","-1","1","-8","9","-9","1","10","-1","13","-3","-8","-12","3","6","10","22","27"};

    public String[] PREGUNTAS_VF = {"-5+2+3=0","-20+19+2=2","4-2+5=7","-1-3-1+5=0","6+4-2=9","10+22-7=25"};
    public String[] RESPUESTAS_VF = {"verdadero","falso","verdadero","verdadero","falso","verdadero"};

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
