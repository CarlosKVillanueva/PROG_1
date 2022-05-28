package ar.edu.ort.clases;

import java.time.LocalDate;
import java.util.Arrays;

/**
 * Ejercicio_10@author CKVillanueva el 5/27/2022 | 7:37 PM
 */
public class CicloCharlas {
    private static final int MAX_ESPECTADORES = 50;
    public static final int TANDAS = 2;
    private String nombreCiclo;
    private String[] titulosPeliculas;
    private int cantEspectadores;
    private Charla[][] charlas;
    private LocalDate fechaInicio;

    public CicloCharlas(String nombreCiclo, String[] titulosPeliculas, LocalDate fechaInicio, int cantEspectadores) {
        this.nombreCiclo = nombreCiclo;
        this.titulosPeliculas = titulosPeliculas;
        this.fechaInicio = fechaInicio;
        this.cantEspectadores = setCantidadEspectadores(cantEspectadores);
        this.charlas = generarCharlas(fechaInicio,titulosPeliculas, cantEspectadores);
    }

    private Charla[][] generarCharlas(LocalDate fechaInicio, String[] titulosPeliculas, int cantEspectadores) {
        Charla[][] charlas =new Charla[TANDAS][titulosPeliculas.length];
        LocalDate inicio = fechaInicio;
        int contPel = 1;
        for (int tanda = 0; tanda < TANDAS; tanda++) {

            for (int pel = 0; pel < titulosPeliculas.length; pel++) {
                charlas[tanda][pel] = new Charla(inicio, contPel, cantEspectadores);
                inicio = inicio.plusDays(1);
                contPel++;
            }
            inicio = fechaInicio.plusDays(10);
        }
        return charlas;
    }


    public Ticket registrarEspectadorEnCharla(Espectador espectador, int nroCharla) {
        Ticket ticket = null;

        int posTanda = (nroCharla - 1) / titulosPeliculas.length;
        int posCharla = (nroCharla - 1) % titulosPeliculas.length;

        Charla charla = charlas[posTanda][posCharla];
        boolean apto = charla.hayVacante() && !charla.noEstaRegistrado(espectador);

        if (apto) {
            charla.agregarEspectador(espectador);
            ticket = new Ticket(espectador.getNombre(), charla.getFecha(), titulosPeliculas[charla.getNroCharla() - 1]);
        }

        return ticket;
    }

    private int setCantidadEspectadores(int cantEspectadores) {
        return Math.min(cantEspectadores, MAX_ESPECTADORES);
    }

    public void mostrarCharlas() {
        for (int tanda = 0; tanda < TANDAS; tanda++) {
            for (int pelicula = 0; pelicula < titulosPeliculas.length; pelicula++) {
                charlas[tanda][pelicula].mostrarCharla();
            }
        }
    }


    public void mostrarCicloCharlas() {
        System.out.printf("Ciclo de Charlas \'%s\', %s\n", this.nombreCiclo, this.fechaInicio);
        for (int tanda = 0; tanda < TANDAS; tanda++) {
            System.out.printf("*** Tanda %d ***\n", tanda + 1);
            for (int icharla = 0; icharla < titulosPeliculas.length; icharla++) {
                Charla charla = charlas[tanda][icharla];
                System.out.printf("%s\t\tCharla %d\t\t%s\t\t(%d vaacantes)\n",charla.getFecha(), charla.getNroCharla(),titulosPeliculas[icharla],charla.getVacantes());
            }
        }
    }
}


