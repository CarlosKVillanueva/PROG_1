package ar.edu.ort.clases;

import java.util.ArrayList;

/**
 * PROG1_TP3_Ejercicio_9
 *
 * @author CKVillanueva el 4/10/2022 | 9:47 PM
 */
public class Puerto {
    private String nombre;
    private ArrayList<Amarra> amarras;

    public Puerto(String nombre) {
        this.nombre = nombre;
        this.amarras = new ArrayList<>();
    }

    public void agregarAmarras(Amarra amarra) {
        amarras.add(amarra);
    }

    public int barcosConAlquilerMayorA(double monto) {
        return 0;
    }

    public Barco barcoConMayorConsumo() {
        Barco barco = null;
        return barco;
    }

    @Override
    public String toString() {
        return "Puerto{" +
                "nombre='" + nombre + '\'' +
                ", amarras=" + amarras +
                '}';
    }
}
