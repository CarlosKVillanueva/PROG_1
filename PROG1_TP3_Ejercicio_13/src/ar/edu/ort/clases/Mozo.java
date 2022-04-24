package ar.edu.ort.clases;

/**
 * PROG1_TP3_Ejercicio_13 @author CKVillanueva el 4/22/2022 | 4:24 PM
 */
public class Mozo extends EmpleadoAgremiado {
    private Categoria categoria;

    public Mozo(String nombre, String legajo, int fechaIngreso, double horarioEntrada, double horarioSalida, Categoria categoria) {
        super(nombre, legajo, fechaIngreso, horarioEntrada, horarioSalida);
        this.categoria = categoria;
    }
}
