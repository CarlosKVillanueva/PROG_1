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
        comercio.agregarOperacion(new ServicioReparacion(8,2));//2070
        comercio.agregarOperacion(new ServicioReparacion(8,1));//2070
        comercio.agregarOperacion(new ServicioReparacion(6,1));//2070
        comercio.agregarOperacion(new Insumos("Toner", 10, 300, Tipo.HARDWARE));//399,30

        //comercio.montoIndivualFacturado();
        System.out.printf("La facturacion total es de: $%.2f\n", comercio.montoTotalFacturado() );
        System.out.printf("Las reparaciones de dificultad baja fueron: %d", comercio.cantServiciosSimples());
    }
}
