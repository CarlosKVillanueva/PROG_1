package ar.edu.ort.clases;

public class Pase extends PagoElectronico {
    private static final double DESCUENTO_1 = 0.85;
    private static final double DESCUENTO_2 = 0.88;
    private static final int DIAS_DESCUENTO = 5;

    public Pase(String descripcion) {
        super(descripcion);
    }

    @Override
    public double obtenerDescuento() {
       return (super.getDiasDemora() < DIAS_DESCUENTO) ? DESCUENTO_1 : DESCUENTO_2;
    }
}
