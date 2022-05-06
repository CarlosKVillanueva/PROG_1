package ar.edu.ort.clases;

/**
 * PROG1_TP3_Ejercicio_12 @author CKVillanueva el 4/16/2022 | 7:14 PM
 */
public abstract class Fuente implements Calificable{
    private String nombre;
    private String path;

    public Fuente(String nombre, String path) {
        this.nombre = nombre;
        this.path = path;
    }


}
