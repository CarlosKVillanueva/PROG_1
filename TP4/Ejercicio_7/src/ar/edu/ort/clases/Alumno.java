package ar.edu.ort.clases;

/**
 * Ejercicio_7 @author CKVillanueva el 5/16/2022 | 8:07 AM
 */
public class Alumno {
    private long legajo;
    private String apellido;
    private int edad;

    public Alumno(long legajo, String apellido, int edad) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getApellido() {
        return apellido;
    }
}
