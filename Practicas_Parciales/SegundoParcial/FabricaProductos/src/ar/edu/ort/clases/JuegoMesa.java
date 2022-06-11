package ar.edu.ort.clases;

import java.awt.*;

/**
 * FabricaProductos@author CKVillanueva el 6/10/2022 | 9:56 AM
 */
public class JuegoMesa extends Producto {
    private int cantJugadores;
    private int cantCartas;

    public JuegoMesa(String nombre, String descripcion, int cantJugadores, int cantCartas) {
        super(nombre, descripcion);
        this.cantJugadores = cantJugadores;
        this.cantCartas = cantCartas;
    }

    @Override
    public Estado evaluar() {
        return cantCartas % cantJugadores == 0 ? Estado.BUENO : Estado.MALO;
    }

    @Override
    public TipoProducto getTipoProducto() {
        return TipoProducto.JUEGO_MESA;
    }


    @Override
    public String toString() {
        return String.format("%s\t|\tCantidad Jugadores: %d\t|\tCantidad de Cartas: %d", super.toString(), cantJugadores, cantCartas);
    }
}
