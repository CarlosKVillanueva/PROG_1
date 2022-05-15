package ar.edu.ort.clases;

/**
 * Ejercicio_6 @author CKVillanueva el 5/15/2022 | 11:07 AM
 */
public class Producto {
    private int codigo;
    private String nombre;
    private double precio;

    public Producto(int codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public double getPrecio() {
        return this.precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
