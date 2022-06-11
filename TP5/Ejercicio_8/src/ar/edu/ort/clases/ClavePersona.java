package ar.edu.ort.clases;

/**
 * Ejercicio_8@author CKVillanueva el 6/7/2022 | 6:35 PM
 */
public class ClavePersona {
    private int prioridad;
    private int orden;

    public ClavePersona(int prirodidad, int orden) {
        this.prioridad = prirodidad;
        this.orden = orden;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public int getOrden() {
        return orden;
    }
}
