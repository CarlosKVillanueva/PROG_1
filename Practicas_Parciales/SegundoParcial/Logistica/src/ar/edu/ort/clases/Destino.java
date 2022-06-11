package ar.edu.ort.clases;

/**
 * Logistica@author CKVillanueva el 6/11/2022 | 1:46 PM
 */
public class Destino {
    private String nombre;
    private String telefono;

    public Destino(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public boolean mismoDestino(String destino) {
        return this.nombre.equals(destino);
    }
}
