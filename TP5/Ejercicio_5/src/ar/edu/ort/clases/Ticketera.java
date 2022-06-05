package ar.edu.ort.clases;

import ar.edu.ort.tdas.implementaciones.ColaNodos;
import ar.edu.ort.tdas.interfaces.Cola;
import java.time.LocalDate;
import java.util.Random;

/**
 * Ejercicio_5@author CKVillanueva el 6/5/2022 | 12:10 AM
 */
public class Ticketera {
    private String nombre;
    Cola<Ticket> tickets;


    public Ticketera(String nombre) {
        this.nombre = nombre;
        tickets = new ColaNodos<>();
        agregarTickets();
    }

    public void agregarTickets() {
        Ticket ticket;
        for (int i = 0; i < 30; i++) {
            int sectorRand = new Random().nextInt(0, 4);
            int prioriRand = new Random().nextInt(0, 3);
            tickets.add(new Ticket(i+1, LocalDate.of(2022,04,20), Sector.values()[sectorRand], Prioridad.values()[prioriRand]));
        }
    }


    public Ticket eliminarTicket(int id) {
        Ticket ticket, ticketBuscado = null;
        tickets.add(null);
        ticket = tickets.remove();

        while (ticket != null) {
            if (ticket.mismTicket(id)) {
                ticketBuscado = ticket;
            } else {
                tickets.add(ticket);
            }
            ticket = tickets.remove();
        }

        return ticketBuscado;
    }


    public int[][] cantTicketsXSectorPrioridad() {
        int[][] resultado = new int[Sector.values().length][Prioridad.values().length];
        Ticket ticket;
        tickets.add(null);
        ticket = tickets.remove();

        while (ticket != null) {
            resultado[ticket.getSector().ordinal()][ticket.getPrioridad().ordinal()]++;
            tickets.add(ticket);
            ticket = tickets.remove();
        }

        return resultado;
    }
}
