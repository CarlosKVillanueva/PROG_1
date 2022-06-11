package ar.edu.ort.clases;

/**
 * FabricaProductos@author CKVillanueva el 6/10/2022 | 10:00 AM
 */
public class Vehiculo extends Producto{

    private static final int DIEZ = 10;
    private static final int CINCUENTA = 50;
    private int cantKm;

    public Vehiculo(String nombre, String descripcion, int cantKm) {
        super(nombre, descripcion);
        this.cantKm = cantKm;
    }

    public int getCantKm() {
        return cantKm;
    }

    @Override
    public Estado evaluar() {
        return cantKm < DIEZ ? Estado.BUENO : cantKm > CINCUENTA ? Estado.MALO : Estado.REGULAR;
    }

    @Override
    public TipoProducto getTipoProducto() {
        return TipoProducto.VEHICULO;
    }

    @Override
    public String toString() {
        return String.format("%s\t|\tCantidad KM: %d km", super.toString(), cantKm);
    }
}
