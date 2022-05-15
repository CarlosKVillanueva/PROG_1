package ar.edu.ort.clases;

import java.util.ArrayList;
import java.util.Random;

/**
 * Ejercicio_6 @author CKVillanueva el 5/15/2022 | 11:07 AM
 */
public class Pedido {
    private int idVendedor;
    private String cuitCliente;
    private ArrayList<Producto> productos;

    public Pedido(int idVendedor, String cuitCliente) {
        this.idVendedor = idVendedor;
        this.cuitCliente = cuitCliente;
        this.productos = new ArrayList<>();
        generarProductos();
    }

    private void generarProductos() {
        Random r = new Random();
        double randomValue = 50 + (200 - 50) * r.nextDouble();
        for (int i = 0; i < 50; i++) {
            productos.add(new Producto(i, "Producto" + i, randomValue));
        }
    }

    public String getCuitCliente() {
        return cuitCliente;
    }

    public boolean mismoVendedor(int id) {
        return this.idVendedor == id;
    }

    public double getTotalPedido() {
        double acum = 0;
        for (Producto producto : productos) {
            acum += producto.getPrecio();
        }
        return acum;
    }
}
