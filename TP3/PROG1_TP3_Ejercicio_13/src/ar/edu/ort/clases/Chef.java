package ar.edu.ort.clases;

/**
 * PROG1_TP3_Ejercicio_13 @author CKVillanueva el 4/22/2022 | 4:42 PM
 */
public class Chef extends Cocinero {
    private String titulo;

    public Chef(String nombre, String legajo, int fechaIngreso, String ART, int cantAniosExp, String titulo) {
        super(nombre, legajo, fechaIngreso, ART, cantAniosExp);
        this.titulo = titulo;

    }
}
