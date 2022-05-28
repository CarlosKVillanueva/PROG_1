package ar.edu.ort;

import ar.edu.ort.clases.ClubTenis;

/**
 * Ejercicio_2@author CKVillanueva el 5/28/2022 | 1:40 PM
 */
public class Main_Ejericicio_2 {
    public static void main(String[] args) {
        ClubTenis lawn = new ClubTenis();
        lawn.agregarTubos();
        lawn.procesarPelotas();
        System.out.println("*** TUBOS EN CONDICIONES ***");
        lawn.mostrarLista("tubos");
        System.out.println("*** TUBOS USADOS ***");
        lawn.mostrarLista("usados");

    }
}
