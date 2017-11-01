package com.alex.helyer.mathe;

/**
 * Created by helyer on 24/10/17.
 */

public class Reactivos {


    public String[] PREGUNTAS_MULTIPLES = {"Cuanto es 2+2","Cuantos es 2+3","Cuanto es 4+5","Cuanto es 10+21","Cuanto es 32+12"};

    public String[] RES_MULTIPLES1 = {"6","2","7","21","41"};
    public String[] RES_MULTIPLES2 = {"3","4","11","28","45"};
    public String[] RES_MULTIPLES3 = {"5","7","8","33","39"};
    public String[] RES_MULTIPLES4 = {"2","9","10","32","47"};
    public String[] CORR_MULTIPLES = {"4","5","9","31","44"};


    public String[] PREGUNTAS_ABIERTAS = {"2+2","2+3","4+5","10+21","32+12","11+8","32+2","45+32","3-1","34-21","51+2","60-31","14-2","2*3","5*6","2*4","5-2","10*3","14+27","19-7"};
    public String[] RESPUESTAS_ABIERTAS = {"4","5","9","31","44","19","34","77","2","13","53","29","12","6","30","8","3","30","41","12"};

    public String[] PREGUNTAS_VF = {"2+2=5","2+3=5","4+5=9","10+21=23","32+12=43"};
    public String[] RESPUESTAS_VF = {"falso","verdadero","verdadero","falso","falso"};





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
