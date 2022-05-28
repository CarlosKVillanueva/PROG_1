package ar.edu.ort.clases;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

/**
 * Ejercicio_10@author CKVillanueva el 5/27/2022 | 9:23 PM
 */
public class Charla {
    private LocalDate fecha;
    private int nroCharla;
    private Espectador[] espectadores;

    public Charla(LocalDate fecha, int nroCharla, int cantEspectadores) {
        this.fecha = fecha;
        this.nroCharla = nroCharla;
        this.espectadores = new Espectador[cantEspectadores];
    }

    /*private Espectador[] generarEspectadores(int cantEspectadores) {

        Espectador[] espectadores = new Espectador[cantEspectadores];
        *//*for (int i = 0; i < cantEspectadores; i++) {
            espectadores[i] = new Espectador("Espectador " + i, i);
        }*//*
        return espectadores;
    }*/


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

    public LocalDate getFecha() {
        return this.fecha;
    }

    public int getNroCharla() {
        return nroCharla;
    }

    public int getVacantes() {
        return (int) Arrays
                .stream(espectadores)
                .filter(Objects::isNull)
                .count();
    }

    public void agregarEspectador(Espectador espectador) {
        int i = 0;
        boolean corte = true;
        while (i < espectadores.length && corte) {
            if (espectadores[i] == null) {
                espectadores[i] = espectador;
                corte = false;
            }
            i++;
        }
    }
}
