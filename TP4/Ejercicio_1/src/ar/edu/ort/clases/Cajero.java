package ar.edu.ort.clases;

import java.util.ArrayList;

/**
 * Ejercicio_1 @author CKVillanueva el 5/6/2022 | 11:06 AM
 */
public class Cajero {
    private long id;
    private String apellido;
    private int antiguedadEnMeses;

    public Cajero(long id, String apellido, int antiguedadEnMeses) {
        this.id = id;
        this.apellido = apellido;
        this.antiguedadEnMeses = antiguedadEnMeses;
    }

    public long getId() {
        return id;
    }

    public String getApellido() {
        return apellido;
    }

}
