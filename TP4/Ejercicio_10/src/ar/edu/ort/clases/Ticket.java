package ar.edu.ort.clases;

import java.time.LocalDate;

/**
 * Ejercicio_10@author CKVillanueva el 5/27/2022 | 11:28 PM
 */
public class Ticket {
    private String nombreEspectador;
    private LocalDate fecha;
    private String nombrePelicula;

    public Ticket(String nombreEspectador, LocalDate fecha, String nombrePelicula) {
        this.nombreEspectador = nombreEspectador;
        this.fecha = fecha;
        this.nombrePelicula = nombrePelicula;
    }
}
