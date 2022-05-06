package ar.edu.ort.clases;

/**
 * PROG1_TP3_Ejercicio_13 @author CKVillanueva el 4/22/2022 | 4:56 PM
 */
public class Plato extends Producto {
    public static final double DESCUENTO = 0.93;
    private String descripcion;
    private boolean esVegano;
    private boolean aptoCeliaco;

    public Plato(String nombre, double precio, String descripcion, boolean isVegano, boolean aptoCeliaco) {
        super(nombre, precio);
        this.descripcion = descripcion;
        this.esVegano = isVegano;
        this.aptoCeliaco = aptoCeliaco;
    }

    @Override
    public double getDescuento() {
        return (!esVegano && aptoCeliaco) ? DESCUENTO : 0;
    }
}
