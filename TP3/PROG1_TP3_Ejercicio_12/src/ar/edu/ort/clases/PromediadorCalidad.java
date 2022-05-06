package ar.edu.ort.clases;

import java.util.ArrayList;

/**
 * PROG1_TP3_Ejercicio_12 @author CKVillanueva el 4/17/2022 | 4:50 PM
 */
public class PromediadorCalidad {

    public static double promedioIndiceCalidad(ArrayList<? extends Calificable> lista) {
        double acumFuentes = 0;
        for (Calificable c : lista) {
            acumFuentes += c.indiceCalidad();
        }
        return (lista.size() > 0) ? (acumFuentes / lista.size()) : 0;
    }
}
