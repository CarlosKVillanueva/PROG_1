package ar.edu.ort.clases;

/**
 * FabricaProductos@author CKVillanueva el 6/10/2022 | 9:47 AM
 */
public class Electrodomestico extends Producto {
    private static final int SETENTA = 70;
    private static final int CUARENTA_CINCO = 45;
    private int indicadorUso;

    public Electrodomestico(String nombre, String descripcion, int indicadorUso) {
        super(nombre, descripcion);
        this.indicadorUso = indicadorUso;
    }

    @Override
    public Estado evaluar() {
        return indicadorUso >= SETENTA ? Estado.BUENO : indicadorUso > CUARENTA_CINCO ? Estado.REGULAR : Estado.MALO;
    }

    @Override
    public TipoProducto getTipoProducto() {
        return TipoProducto.ELECTRODOMESTICO;
    }


    @Override
    public String toString() {
        return super.toString() + "\t|\tUso: " + this.indicadorUso;
    }

}
