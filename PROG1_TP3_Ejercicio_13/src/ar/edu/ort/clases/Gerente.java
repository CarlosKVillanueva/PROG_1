package ar.edu.ort.clases;

/**
 * PROG1_TP3_Ejercicio_13 @author CKVillanueva el 4/22/2022 | 4:38 PM
 */
public class Gerente extends EmpleadoAgremiado {
    private int cantPersonasCargo;

    public Gerente(String nombre, String legajo, int fechaIngreso, double horarioEntrada, double horarioSalida, int cantPersonasCargo) {
        super(nombre, legajo, fechaIngreso, horarioEntrada, horarioSalida);
        this.cantPersonasCargo = cantPersonasCargo;
    }
}
