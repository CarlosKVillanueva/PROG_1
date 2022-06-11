package ar.edu.ort;

import ar.edu.ort.clases.Persona;
import ar.edu.ort.clases.Vacunatorio;
import java.util.Random;

/**
 * Ejercicio_8@author CKVillanueva el 6/7/2022 | 6:16 PM
 */
public class MainEjercicio_8 {
    public static void main(String[] args) {
        Vacunatorio vacunatorio = new Vacunatorio();
        generarLista(vacunatorio);
        vacunatorio.obtenerColaPorPrioridadYOrden();
        vacunatorio.imprimirCola();
    }

    private static void generarLista(Vacunatorio vacunatorio) {
        for (int col = 0; col < 3; col++) {
            for (int i = 0; i < 100; i++) {
                vacunatorio.agregarPersonas(col, new Persona("DNI"+i,"Nombre"+i, new Random().nextInt(18,80),
                        new Random().nextDouble(0, 2) == 1));
            }
        }
    }
}
