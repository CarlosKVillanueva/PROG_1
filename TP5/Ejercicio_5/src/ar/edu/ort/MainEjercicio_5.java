package ar.edu.ort;

import ar.edu.ort.clases.Ticketera;
import java.util.Arrays;

/**
 * Ejercicio_5@author CKVillanueva el 6/5/2022 | 12:11 AM
 */
public class MainEjercicio_5 {
    public static void main(String[] args) {
        Ticketera ticketera = new Ticketera("SuppORT");

        ticketera.eliminarTicket(2);
        ticketera.eliminarTicket(38);
        System.out.println(Arrays.deepToString(ticketera.cantTicketsXSectorPrioridad()));


    }
}
