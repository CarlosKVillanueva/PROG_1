package ar.edu.ort;

import ar.edu.ort.clases.Frigorifico;
import java.util.Arrays;

/**
 * Ejercicio_6 @author CKVillanueva el 5/14/2022 | 11:20 PM
 */
public class Main_Ejercicio_6 {
    public static void main(String[] args) {
        Frigorifico fri = new Frigorifico("La Lonja");

       fri.informarCantPedidos();
       int[] clientesXPais = fri.clientesPorPais();
        System.out.println();
        System.out.printf("Clientes por Pais: Argentina: %d, Brasil %d, Chile: %d, Uruguay: %d\n",
                clientesXPais[0],clientesXPais[1],clientesXPais[2],clientesXPais[3] );

        System.out.println("Pais mas Rentable: "+fri.paisMasRentable());
    }


}
