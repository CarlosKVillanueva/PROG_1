package ar.edu.ort;

import ar.edu.ort.clases.Colegio;
import ar.edu.ort.clases.Pelota;
import ar.edu.ort.clases.TipoPelota;
import java.util.Arrays;
import java.util.Random;

/**
 * Ejercicio_4@author CKVillanueva el 6/4/2022 | 11:30 AM
 */
public class MainEjercicio_4 {
    public static void main(String[] args) {
        Colegio colegio = new Colegio();
        llenarCanasto(colegio);
        System.out.println(colegio.agregarPelota(new Pelota(17, TipoPelota.FUTBOL)));
        System.out.println(colegio.buscarPelota(8));
        System.out.println(colegio.buscarPelota(81));
        colegio.verPelotasEnTopes();
        System.out.println(Arrays.deepToString(colegio.pelotasPorTipo()));
    }

    private static void llenarCanasto(Colegio colegio) {
        for (int i = 0; i < 15; i++) {
            int rand = new Random().nextInt(1, 4);
            colegio.agregarPelota(new Pelota(i + 1, rand == 1 ? TipoPelota.FUTBOL : rand == 2 ? TipoPelota.VOLEY : TipoPelota.BASKET));
        }
    }
}
