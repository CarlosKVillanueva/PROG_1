package ar.edu.ort.clases;

import java.time.LocalDate;

/**
 * Ejercicio_5@author CKVillanueva el 6/5/2022 | 12:11 AM
 */
public class Ticket {
    private int id;
    private LocalDate fecha;
    private Sector sector;
    private Prioridad prioridad;

    public Ticket(int id, LocalDate fecha, Sector sector, Prioridad prioridad) {
        this.id = id;
        this.fecha = fecha;
        this.sector = sector;
        this.prioridad = prioridad;
    }

    public Sector getSector() {
        return sector;
    }

    public Prioridad getPrioridad() {
        return prioridad;
    }

    public boolean mismTicket(int id) {
        return this.id == id;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", fecha=" + fecha +
                ", sector=" + sector +
                ", prioridad=" + prioridad +
                '}';
    }
}
