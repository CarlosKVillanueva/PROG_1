package ar.edu.ort;

import ar.edu.ort.clases.*;
import java.util.Random;

/**
 * Ejercicio_5 @author CKVillanueva el 5/14/2022 | 12:26 PM
 */
public class Main_Ejercicio_5 {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("La Mulita");

        generarChoferes(empresa);
        generarCamiones(empresa);
        generarViajes(empresa);

//        System.out.println(Arrays.toString(empresa.obtenerCostoPorViajes()));
        empresa.obtenerViajesXChoferCamion();
        empresa.mostrar();

    }

    private static void generarViajes(Empresa empresa) {
        for (int i = 0; i < 5000; i++) {
            String idChofer = String.valueOf((new Random()).nextInt(20));
            int idCamion = (new Random()).nextInt(10);
            double kmViaje = (Math.random() * (100 - 50)) + 50;
            empresa.generarViajes(new Viaje(idCamion, idChofer, kmViaje));
        }
    }

    private static void generarChoferes(Empresa empresa) {
        for (int i = 0; i < 20; i++) {
            empresa.asignarChofer(i, new Chofer("" + i, "Nombre" + i, 100));
        }
    }

    private static void generarCamiones(Empresa empresa) {
        for (int i = 0; i < 10; i++) {
            empresa.asignarCamion(i, new Camion( i, 8));
        }
    }
}
