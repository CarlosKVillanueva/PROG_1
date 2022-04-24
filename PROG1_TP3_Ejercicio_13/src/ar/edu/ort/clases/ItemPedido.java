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
}
