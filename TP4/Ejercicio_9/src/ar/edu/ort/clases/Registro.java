package ar.edu.ort.clases;


import java.time.LocalDate;

/**
 * Ejercicio_9 @author CKVillanueva el 5/20/2022 | 1:46 PM
 */
public class Registro {
    private String patente;
    private LocalDate fechaRetiro;

    public Registro(String patente, LocalDate fechaRetiro) {
        this.patente = patente;
        this.fechaRetiro = fechaRetiro;
    }
}
