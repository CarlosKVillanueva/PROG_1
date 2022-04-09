package ar.edu.ort.clases;

public abstract class MedioPago implements Descuento {
    private String descripcion;

    public MedioPago(String descripcion) {
        this.descripcion = descripcion;
    }

}
