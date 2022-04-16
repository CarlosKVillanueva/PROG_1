package ar.edu.ort.clases;

/**
 * PROG1_TP3_Ejercicio_10 @author CKVillanueva el 4/15/2022 | 8:06 PM
 */
public abstract class Matematica {
    static double sumarPorcentaje(double monto, double porcentaje) {
        return monto + (monto * (porcentaje/100));
    }
}
