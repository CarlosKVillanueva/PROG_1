package ar.edu.ort.clases;

/**
 * Ejercicio_6 @author CKVillanueva el 5/15/2022 | 11:08 AM
 */
public class Vendedor {
    private int id;
    private String nombre;

    public Vendedor(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }
}
