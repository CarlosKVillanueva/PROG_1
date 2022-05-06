package ar.edu.ort.clases;

/**
 * PROG1_TP3_Ejercicio_13 @author CKVillanueva el 4/22/2022 | 4:19 PM
 */
public abstract class EmpleadoAgremiado extends Empleado{
    private double horarioEntrada;
    private double horarioSalida;

    public EmpleadoAgremiado(String nombre, String legajo, int fechaIngreso, double horarioEntrada, double horarioSalida) {
        super(nombre, legajo, fechaIngreso);
        this.horarioEntrada = horarioEntrada;
        this.horarioSalida = horarioSalida;
    }
}
