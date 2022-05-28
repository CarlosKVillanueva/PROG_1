package ar.edu.ort;

import ar.edu.ort.clases.*;
/**
 * Ejercicio_8 @author CKVillanueva el 5/22/2022 | 12:56 AM
 */
public class Main_Ejercicio_8 {
    public static void main(String[] args) {
        Avion avion = new Avion("Boeing");
        Aerolinea aerolinea = new Aerolinea("Aerolinea", avion);
        aerolinea.mostrarCapacidad();
        aerolinea.asignar();
        System.out.println("*** Capacidad con Reservas asigandas ***");
        aerolinea.mostrarCapacidad();
        System.out.println(aerolinea.asientosLibresConVentanilla());
    }
}
