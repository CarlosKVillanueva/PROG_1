package ar.edu.ort.clases;

/**
 * Ejercicio_4 @author CKVillanueva el 5/13/2022 | 10:14 AM
 */
public class Reserva {
    private int codigo;
    private int cantViajeros;
    private Recorrido recorrido;

    public double getPrecio() {
        return this.recorrido.getPrecio();
    }

    public int cantVecesRecorrida(Estacion estacion) {
        int acumPersonas = 0;
        if (this.recorrido.pasaPor(estacion)) {
            acumPersonas = this.cantViajeros;
        }
        return acumPersonas;
    }

}
