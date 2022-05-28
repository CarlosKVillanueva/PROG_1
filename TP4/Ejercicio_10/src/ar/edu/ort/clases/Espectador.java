package ar.edu.ort.clases;

/**
 * Ejercicio_10@author CKVillanueva el 5/27/2022 | 9:25 PM
 */
public class Espectador {
    private String nombre;
    private int nroCharla;

    public Espectador(String nombre, int nroCharla) {
        this.nombre = nombre;
        this.nroCharla = nroCharla;
    }


    public String getNombre() {
        return nombre;
    }

    public int getNroCharla() {
        return this.nroCharla;
    }
}
