package ar.edu.ort.clases;

/**
 * PROG1_TP3_Ejercicio_13 @author CKVillanueva el 4/22/2022 | 4:56 PM
 */
public class Plato extends Producto {
    private String descripcion;
    private boolean isVegano;
    private boolean aptoCeliaco;

    @Override
    public double getDescuento() {
        return 0;
    }
}
