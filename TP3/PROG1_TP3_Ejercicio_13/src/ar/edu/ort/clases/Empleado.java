package ar.edu.ort.clases;

/**
 * PROG1_TP3_Ejercicio_13 @author CKVillanueva el 4/22/2022 | 4:17 PM
 */
public abstract class Empleado {
    private String nombre;
    private String legajo;
    private int fechaIngreso;

    public Empleado(String nombre, String legajo, int fechaIngreso) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.fechaIngreso = fechaIngreso;
    }
}
