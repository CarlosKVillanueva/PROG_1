package ar.edu.ort.clases;

/**
 * PROG1_TP3_Ejercicio_13 @author CKVillanueva el 4/22/2022 | 4:40 PM
 */
public class Cocinero extends EmpleadoCocina {
    private int cantAniosExp;

    public Cocinero(String nombre, String legajo, int fechaIngreso, String ART, int cantAniosExp) {
        super(nombre, legajo, fechaIngreso, ART);
        this.cantAniosExp = cantAniosExp;
    }

    public boolean mismoLegajo(String legajo) {
        return false;
    }
}
