package com.alex.helyer.mathe;

/**
 * Created by helyer on 06/11/17.
 */

public class ReactivosN3 {

    public String[] PREGUNTAS_MULTIPLES = {"Calcula: 1-(-3)+[4-(1-3)]","Calcula: 3-[(5-8)-(3-6)]","Calcula: [(6)-(-8)]-[(-4)-(-8)]","Calcula: (9-[(3)-(3-12)-(8)])","Calcula: (-8)+[(7)-(-4)+(-5)]"};

    public String[] RES_MULTIPLES1 = {"9","4","9","6","2"};
    public String[] RES_MULTIPLES2 = {"-10","2","11","-4","-4"};
    public String[] RES_MULTIPLES3 = {"11","5","14","7","-1"};
    public String[] RES_MULTIPLES4 = {"8","6","8","8","3"};
    public String[] CORR_MULTIPLES = {"10","3","10","5","-2"};

    public String[] PREGUNTAS_ABIERTAS = {"Calcula: 1-(-3)+[4-(1-3)]","Calcula: 3-[(5-8)-(3-6)]","Calcula: [(6)-(-8)]-[(-4)-(-8)]","Calcula: (9-[(3)-(3-12)-(8)])","Calcula: (-8)+[(7)-(-4)+(-5)]","Calcula -13+5","Calcula 5+3+1","Calcula -5-5+1","Calcula 10-10+1","Calcula 5-3+8","Calcula (5-7)+1","Calcula 1+1+11","Calcula (-2)+(-1)","Calcula -1-3-4","Calcula -1-1-10","Escribe el valor absoluto del siguiente número: -3","Escribe el valor absoluto del siguiente número: +6","Escribe el valor absoluto del siguiente número: -10","Escribe el valor absoluto del siguiente número: -22","Escribe el valor absoluto del siguiente número: +2..."};
    public String[] RESPUESTAS_ABIERTAS = {"10","3","10","5","-2","-8","9","-9","1","10","-1","13","-3","-8","-12","3","6","10","22","27"};

    public String[] PREGUNTAS_VF = {"1-(-3)+[4-(1-3)]=10","3-[(5-8)-(3-6)]=4","[(6)-(-8)]-[(-4)-(-8)]=10","(9-[(3)-(3-12)-(8)])=5","(-8)+[(7)-(-4)+(-5)]=-3","10+22-7=25"};
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
