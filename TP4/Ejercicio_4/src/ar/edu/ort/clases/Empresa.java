package ar.edu.ort.clases;

import java.util.ArrayList;

/**
 * Ejercicio_4 @author CKVillanueva el 5/13/2022 | 10:13 AM
 */
public class Empresa {
    private String nombre;
    private ArrayList<Reserva> reservas;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.reservas = new ArrayList<>();
    }

    public double recaudacionTotal() {
        double acum = 0;
        for (Reserva reserva : reservas) {
            acum += reserva.getPrecio();
        }
        return acum;
    }

    public int canVecesRecorrida(Estacion estacion) {
        int acum = 0;
        for (Reserva reserva : reservas) {
            acum += reserva.cantVecesRecorrida(estacion);
        }
        return acum;
    }
}

