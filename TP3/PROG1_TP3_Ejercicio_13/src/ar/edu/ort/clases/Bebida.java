package ar.edu.ort.clases;

/**
 * PROG1_TP3_Ejercicio_13 @author CKVillanueva el 4/22/2022 | 4:58 PM
 */
public class Bebida extends Producto {
    public static final double SIN_ALCOHOL = 0.90;
    public static final double CON_ALCOHOL = 0.97;
    private int tamanio;
    private boolean tieneAlcohol;

    public Bebida(String nombre, double precio, int tamanio, boolean tieneAlcohol) {
        super(nombre, precio);
        this.tamanio = tamanio;
        this.tieneAlcohol = tieneAlcohol;
    }

    @Override
    public double getDescuento() {
        return (tieneAlcohol) ? CON_ALCOHOL : SIN_ALCOHOL;
    }
}
