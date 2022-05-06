package ar.edu.ort.clases;

/**
 * PROG1_TP3_Ejercicio_13 @author CKVillanueva el 4/22/2022 | 4:39 PM
 */
public class EmpleadoCocina extends Empleado {
    private String ART;

    public EmpleadoCocina(String nombre, String legajo, int fechaIngreso, String ART) {
        super(nombre, legajo, fechaIngreso);
        this.ART = ART;
    }
}
