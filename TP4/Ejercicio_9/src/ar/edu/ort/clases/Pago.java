package ar.edu.ort.clases;

/**
 * Ejercicio_9 @author CKVillanueva el 5/20/2022 | 1:44 PM
 */
public class Pago {
    private double monto;
    private String dniPagador;

    public Pago(double monto, String dniPagador) {
        this.monto = monto;
        this.dniPagador = dniPagador;
    }

    @Override
    public String toString() {
        return "Pago{" +
                "monto=" + monto +
                ", dniPagador='" + dniPagador + '\'' +
                '}';
    }
}
