package ar.edu.ort;

import ar.edu.ort.clases.*;

/**
 * PROG1_TP3_Ejercicio_10@author CKVillanueva el 15/04/2022 | 12:36
 */
public class Main {
    public static void main(String[] args) {
        Comercio comercio = new Comercio("Coso");
        comercio.agregarOperacion(new ServicioArmado(8));//1656
        comercio.agregarOperacion(new ServicioReparacion(8,3));//2070
        comercio.agregarOperacion(new Insumos("Toner", 1.1, 300, Tipo.HARDWARE));//399,30

        comercio.mostrar();
    }
}
