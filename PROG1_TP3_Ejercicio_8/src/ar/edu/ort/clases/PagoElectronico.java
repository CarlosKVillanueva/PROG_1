package ar.edu.ort.clases;

public abstract class PagoElectronico extends MedioPago {
    private int diasDemora;

    public PagoElectronico(String descripcion) {
        super(descripcion);
    }

    public int getDiasDemora() {
        return diasDemora;
    }
}
