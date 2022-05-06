package ar.edu.ort.clases;

/**
 * PROG1_TP3_Ejercicio_13 @author CKVillanueva el 4/22/2022 | 4:53 PM
 */
public abstract class Producto {
    private String nombre;
    private double precio;



    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }
    public abstract double getDescuento();

    public double getPrecioConDescuento() {
        return this.precio * getDescuento();
    }

    @Override
    public String toString() {
        return String.format("%s %.2f", nombre, precio);
    }
}


