package ar.edu.ort.clases;

import java.util.ArrayList;

/**
 * PROG1_TP3_Ejercicio_9 @author CKVillanueva el 4/10/2022 | 9:47 PM
 */
public class Puerto {
    private String nombre;
    private ArrayList<Amarra> amarras;

    public Puerto(String nombre) {
        this.nombre = nombre;
        this.amarras = new ArrayList<>();
    }

    public void agregarAmarras(Amarra amarra, Barco barco) {
        amarras.add(amarra);
        amarra.reservarAmarra(barco);
    }

    public int barcosConAlquilerMayorA(double monto) {
        int cont = 0;
        for (Amarra amarra : amarras) {
            if (!amarra.estaDisponible() && amarra.calcularAlquiler() > monto) {
                    cont++;
            }
        }
        return cont;
    }

    public Barco barcoConMayorConsumo() {
        Barco barco = null, barcoMayor = null;
        double potenciaMax = 0, potenciaActual = 0;

        for (Amarra amarra : amarras) {
            barco = amarra.getBarco();
            if (!amarra.estaDisponible() && barco instanceof Deportivo) {
                potenciaActual = ((Deportivo)barco).getPotencia();
                if (potenciaActual > potenciaMax) {
                    potenciaMax = potenciaActual;
                    barcoMayor = barco;
                }
            }
        }
        return barcoMayor;
    }

    @Override
    public String toString() {
        return "Puerto{" +
                "nombre='" + nombre + '\'' +
                ", amarras=" + amarras +
                '}';
    }
}
