package ar.edu.ort;

import ar.edu.ort.clases.Edificio;
import ar.edu.ort.clases.Factura;
import ar.edu.ort.clases.Servicio;
import ar.edu.ort.tdas.implementaciones.PilaNodos;
import ar.edu.ort.tdas.interfaces.Pila;
import java.util.Arrays;
import java.util.Random;

/**
 * Ejercicio_6@author CKVillanueva el 6/5/2022 | 12:10 PM
 */
public class MainEjercicio_6 {
    public static void main(String[] args) {
        Pila<Factura> facturaPila = new PilaNodos<>();
        Edificio edificio = new Edificio();

        llenarPila(facturaPila);

        edificio.comparar(facturaPila);
        System.out.println(Arrays.toString(edificio.montoAAbonarPorTipo()));
        edificio.mostrarServicios();

    }

    private static void llenarPila(Pila<Factura> facturaPila) {

        for (int i = 0; i < 50; i++) {
            int randMes = new Random().nextInt(1, 12);
            double randMonto = new Random().nextDouble(100.01, 200.01);
            int randServicio = new Random().nextInt(0, 4);
            facturaPila.push(new Factura(i+1,randMes,randMonto, Servicio.values()[randServicio]));
        }

    }


}
