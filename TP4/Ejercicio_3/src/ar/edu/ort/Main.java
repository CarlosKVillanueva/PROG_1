package ar.edu.ort;

import ar.edu.ort.clases.Plantel;
import java.util.Arrays;

/**
 * ${PROJECT_NAME} @author CKVillanueva el ${DATE} | ${TIME}
 */
public class Main {
    public static void main(String[] args) {
        Plantel seleccion = new Plantel();

        seleccion.mostrar();
        seleccion.cambio(9, 18);
        System.out.println("*** Cambio ***");
        seleccion.mostrar();
        seleccion.cambioPorLesion(5, "Apellido15");
        System.out.println("*** Cambio por Lesion ***");
        seleccion.mostrar();
        System.out.println("*** Reservas ***");
        System.out.println(Arrays.toString(seleccion.obtenerReservas()));
        System.out.println("*** Jugadores por Posicion ***");
        System.out.println(Arrays.toString(seleccion.cantJugadoresPorPosicion()));

    }
}