package ar.edu.ort.clases;

/**
 * PROG1_TP3_Ejercicio_9
 *
 * @author CKVillanueva el 4/10/2022 | 6:51 PM
 */
public class Amarra {
    private int nro;
    private Coordenada ubicacion;
    private boolean disponible;
    private Barco barco;

    public Amarra(int nro, Coordenada ubicacion) {
        this.nro = nro;
        this.ubicacion = ubicacion;
        this.disponible = true;
        this.barco = null;
    }

    public double calcularAlquiler() {
        return this.barco.calcularAlquiler();
    }

    public Barco getBarco() {
        return barco;
    }

    public boolean estaDisponible() {
        return this.barco == null;
    }

    public void reservarAmarra(Barco barco) {
        this.disponible = false;
        this.barco = barco;
    }
}
