package ar.edu.ort;

import ar.edu.ort.clases.Baraja;

/**
 * Ejercicio_2 @author CKVillanueva el 5/7/2022 | 8:13 PM
 */
public class Main {
    public static void main(String[] args) {
        Baraja baraja = new Baraja();
        Baraja barajaAChequear = new Baraja();
        baraja.mostrarBaraja();
        System.out.println(baraja.estaOrdenada(barajaAChequear));

    }
}