package ar.edu.ort.clases;

public class Sube extends PagoElectronico {
    private static final double DESCUENTO = 0.9;

    public Sube(String descripcion) {
        super(descripcion);
    }

    @Override
    public double obtenerDescuento() {
        return DESCUENTO;
    }
}
