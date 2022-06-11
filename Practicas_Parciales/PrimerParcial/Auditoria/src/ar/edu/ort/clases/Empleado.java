package ar.edu.ort.clases;

/**
 * Auditoria @author CKVillanueva el 4/22/2022 | 8:13 PM
 */
public class Empleado {
    private String nombre;
    private String apellido;
    private String legajo;

    public Empleado(String nombre, String apellido, String legajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
    }

    public void mostrar() {
        System.out.printf("| Auditor: %s %s %s\n", nombre, apellido, legajo);
    }
}
