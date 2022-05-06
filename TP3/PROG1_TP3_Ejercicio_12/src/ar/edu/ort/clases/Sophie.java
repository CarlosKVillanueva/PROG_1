package ar.edu.ort.clases;

import java.util.ArrayList;

/**
 * PROG1_TP3_Ejercicio_12 @author CKVillanueva el 4/16/2022 | 7:11 PM
 */
public class Sophie {
    private ArrayList<Programa> programas;

    public Sophie() {
        this.programas = new ArrayList<>();
    }

    public ArrayList<Programa> programasPorDebajoDe(double umbralMinimo){
        ArrayList<Programa> programasBajaCalidad = new ArrayList<>();

        for (Programa programa : programas) {
            if (programa.indiceCalidad() < umbralMinimo) {
                programasBajaCalidad.add(programa);
            }
        }
        return programasBajaCalidad;
    }
}
