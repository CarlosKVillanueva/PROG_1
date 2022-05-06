package ar.edu.ort.clases;

public class Efectivo extends MedioPago {
    private static final double DESCUENTO = 1;

    public Efectivo(String descripcion) {
        super(descripcion);
    }

    @Override
    public double obtenerDescuento() {
        return DESCUENTO;
    }
}
