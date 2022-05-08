package ar.edu.ort.clases;

/**
 * Ejercicio_1 @author CKVillanueva el 5/6/2022 | 11:08 AM
 */
public class Pedido {
    private String nombreCliente;
    private long idCajero;
    private long codigoRobot;
    private double monto;

    public Pedido(String nombreCliente, long idCajero, long codigoRobot, double monto) {
        this.nombreCliente = nombreCliente;
        this.idCajero = idCajero;
        this.codigoRobot = codigoRobot;
        this.monto = monto;
    }

    public double getMonto() {
        return monto;
    }

    public long getIdCajero() {
        return idCajero;
    }

    public long getCodigoRobot() {
        return codigoRobot;
    }

    @Override
    public String toString() {
        return String.format("%s | C: %d | R: %d | $%.2f", nombreCliente, idCajero, codigoRobot, monto);
    }
}
