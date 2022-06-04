package ar.edu.ort.clases;

import java.time.LocalDate;

/**
 * Ejercicio_10@author CKVillanueva el 5/27/2022 | 9:23 PM
 */
public class Charla {
    private LocalDate fecha;
    private int nroCharla;
    private Espectador[] espectadores;
    private int localidesDisponibles;




    public Charla(LocalDate fecha, int nroCharla, int cantEspectadores) {
        this.fecha = fecha;
        this.nroCharla = nroCharla;
        this.espectadores = new Espectador[cantEspectadores];
        this.localidesDisponibles = cantEspectadores;
    }

    public void mostrarCharla() {
        System.out.println("Fecha: " + fecha + " Nro de charla: " + nroCharla);
    }

    public boolean noEstaRegistrado(Espectador espectador) {
        int i = 0;
        boolean estaRegistrado = false;
        while (i < espectadores.length && !estaRegistrado) {
            estaRegistrado = espectadores[i] == espectador;
            i++;
        }
        return estaRegistrado ;
    }

    public boolean hayVacante() {
        return espectadores[espectadores.length -1] == null;
    }

    public void agregarEspectador(Espectador espectador) {

        int i = 0;
        boolean corte = true;
        while (i < espectadores.length && corte) {
            if (espectadores[i] == null) {
                espectadores[i] = espectador;
                this.localidesDisponibles--;
                corte = false;
            }
            i++;
        }
    }

    public int getLocalidesDisponibles() {
        return localidesDisponibles;
    }

    public LocalDate getFecha() {
        return this.fecha;
    }

    public int getNroCharla() {
        return nroCharla;
    }

}
