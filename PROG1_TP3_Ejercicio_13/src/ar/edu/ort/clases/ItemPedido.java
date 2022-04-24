package ar.edu.ort.clases;

import java.util.ArrayList;

/**
 * PROG1_TP3_Ejercicio_13 @author CKVillanueva el 4/22/2022 | 4:51 PM
 */
public class ItemPedido {
    private int cantidad;
    private Producto producto;

    public ItemPedido(int cantidad, Producto producto) {
        this.cantidad = cantidad;
        this.producto = producto;
    }

    public int cantBebidas() {
        return (this.producto instanceof Bebida) ? this.cantidad : 0;
    }

    @Override
    public String toString() {
        return String.format("%d\t %s\n", cantidad, producto);
    }

    public double getImporteConDescuento() {
        return this.cantidad * producto.getPrecioConDescuento() ;
    }

    public double getImporte() {
        return this.cantidad * producto.getPrecio();
    }
}
