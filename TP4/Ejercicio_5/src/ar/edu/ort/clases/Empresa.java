package ar.edu.ort.clases;

import java.util.ArrayList;

/**
 * Ejercicio_5 @author CKVillanueva el 5/14/2022 | 12:26 PM
 */
public class Empresa {
    private String razonSocial;
    private Camion[] camiones;
    private Chofer[] choferes;
    private ArrayList<Viaje> viajes;
    int [][] viajesPorChofer = new int[20][10];

    public Empresa(String razonSocial) {
        this.razonSocial = razonSocial;
        camiones = new Camion[10];
        choferes = new Chofer[20];
        viajes = new ArrayList<>();
    }

    public double[] obtenerCostoPorViajes() {
        double[] costos = new double[viajes.size()];
        int i = 0;
        for (Viaje viaje : viajes) {
            Camion camion = buscarCamion(viaje.getIdCamion());
            Chofer chofer = buscarChofer(viaje.getIdChofer());
            double costoPorViaje = (camion.getCostoPorKm() * viaje.getKmViaje()) + chofer.getCostoPorViaje();
            costos[i] = costoPorViaje;
            i++;
        }
        return costos;
    }

    @SuppressWarnings(value = "unused")
    public int[][] obtenerViajesXChoferCamion() {

        for (int posChof = 0; posChof < choferes.length; posChof++) {
            String chofer = choferes[posChof].getId();
            for (int posCam = 0; posCam < camiones.length; posCam++) {
                int camion = camiones[posCam].getId();
                int contViajes = 0;
                for (Viaje viaje : viajes) {
                    if (viaje.mismoCamionChofer(camion, chofer)) {
                        contViajes++;
                    }
                }
                viajesPorChofer[posChof][posCam] = contViajes;
            }
        }
        return viajesPorChofer;
    }

    public void mostrar() {
        for (int i = 0; i < viajesPorChofer.length; i++) {
            System.out.printf("Chofer %d:\n", i + 1);
            for (int j = 0; j < viajesPorChofer[i].length; j++) {
                System.out.printf("Camion %d: %d\t",j + 1, viajesPorChofer[i][j]);
            }
            System.out.println();
        }

    }

    private Camion buscarCamion(int id) {
        int i = 0, cantidadElementos = camiones.length;
        Camion elementoBuscado = null;

        while (i < cantidadElementos && elementoBuscado == null) {
            Camion elemento = camiones[i];
            if (elemento.mismoId(id)) {
                elementoBuscado = elemento;
            } else {
                i++;
            }
        }
        return elementoBuscado;
    }

    private Chofer buscarChofer(String id) {
        int i = 0, cantidadElementos = choferes.length;
        Chofer elementoBuscado = null;

        while (i < cantidadElementos && elementoBuscado == null) {
            Chofer elemento = choferes[i];
            if (elemento.mismoId(id)) {
                elementoBuscado = elemento;
            } else {
                i++;
            }
        }
        return elementoBuscado;
    }

    public void asignarChofer(int i,Chofer chofer) {
        choferes[i] = chofer;
    }

    public void asignarCamion(int i, Camion camion) {
        camiones[i] = camion;
    }

    public void generarViajes(Viaje viaje) {
        viajes.add(viaje);
    }


    @Override
    public String toString() {
        return "Empresa{" +
                "razonSocial='" + razonSocial + '\'' +
                '}';
    }
}
