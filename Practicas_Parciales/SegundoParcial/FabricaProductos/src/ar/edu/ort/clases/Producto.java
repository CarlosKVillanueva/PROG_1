package ar.edu.ort.clases;

/**
 * FabricaProductos@author CKVillanueva el 6/10/2022 | 9:44 AM
 */
public abstract class Producto implements Evaluable {
    private String nombre;
    private String descripcion;

    public Producto(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public abstract TipoProducto getTipoProducto();

    @Override
    public String toString() {
        return String.format("Nombre: %s\t|\tDescripcion: %s ", this.nombre, this.descripcion);
    }
}
