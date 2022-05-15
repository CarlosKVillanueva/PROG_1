package ar.edu.ort.clases;

/**
 * Ejercicio_4 @author CKVillanueva el 5/13/2022 | 10:15 AM
 */
public class Recorrido {

    public static final int PRECIO_ESTACION = 50;
    private static final double DESCUENTO = 0.8;
    private Estacion estPartida;
    private Estacion estDestino;

    public double getPrecio() {
        double precio = cantEstacionesRecorridas() * PRECIO_ESTACION;
        return fueCompleto() ? precio * DESCUENTO : precio;
    }

    private boolean fueCompleto() {
        return cantEstacionesRecorridas() == Estacion.values().length - 1;
    }

    private int cantEstacionesRecorridas() {
        return Math.abs(this.estDestino.ordinal() - this.estPartida.ordinal());
    }

    public boolean pasaPor(Estacion estacion) {
        int partida = estPartida.ordinal(), llegada = estDestino.ordinal(), est = estacion.ordinal();

        if (partida > llegada) {
            int aux = partida;
            partida = llegada;
            llegada = aux;
        }
        return est >= partida && est <= llegada;
    }

    public boolean pasoPorAca(Estacion estacion) {
        int partida = estPartida.ordinal(), llegada = estDestino.ordinal(), est = estacion.ordinal();
        boolean salidaMenor = est <= llegada && est >= partida;
        boolean salidaMayor = est >= llegada && est <= partida;
        return salidaMenor || salidaMayor;
     }
}
