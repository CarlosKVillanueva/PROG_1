package ar.edu.ort.clases;

/**
 * Ejercicio_1 @author CKVillanueva el 5/6/2022 | 11:21 AM
 */
public class Informe {
    private double monto;
    private String apellido;
    private int nivelBateria;

    public Informe(double monto, String apellido, int nivelBateria) {
        this.monto = monto;
        this.apellido = apellido;
        this.nivelBateria = nivelBateria;
    }

    @Override
    public String toString() {
        return String.format("$%.2f | %s | %d%s\n", monto, apellido, nivelBateria, "%");

    }
}
