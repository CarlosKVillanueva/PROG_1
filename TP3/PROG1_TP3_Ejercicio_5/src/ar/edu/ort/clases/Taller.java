package ar.edu.ort.clases;

import java.util.ArrayList;

/**
 * @author CKVillanueva el 4/10/2022
 * @project PROG1_TP3_Ejercicio_5
 */

public class Taller {
    private String nombre;

    public Taller(String nombre) {
        this.nombre = nombre;
    }

    public int cantServiciosPosibles(ArrayList<Bicicleta> bicicletas) {
        int cont = 0;
        for (Bicicleta bicicleta :
                bicicletas) {
            if (bicicleta.esApta()) {
                cont++;
            }
        }
        return cont;
    }
}
