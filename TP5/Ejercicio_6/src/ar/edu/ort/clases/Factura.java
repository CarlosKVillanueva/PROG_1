package ar.edu.ort.clases;

/**
 * Ejercicio_6@author CKVillanueva el 6/5/2022 | 12:08 PM
 */
public class Factura {
    private int codBarras;
    private int numeroMes;
    private double monto;
    private Servicio servicio;



    public Factura(int codBarras, int numeroMes, double monto, Servicio servicio) {
        this.codBarras = codBarras;
        setNumeroMes(numeroMes);
        this.monto = monto;
        this.servicio = servicio;
    }

    public void setNumeroMes(int numeroMes) {
        if (numeroMes > 12 || numeroMes < 1) {
            throw new RuntimeException();
        }
        this.numeroMes = numeroMes;
    }

    public int getNumeroMes() {
        return numeroMes;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public double getMonto() {
        return monto;
    }

    @Override
    public String toString() {
        return String.format("ID: %d\tMes: %d\t Monto: $%.2f\t Servicio %s",codBarras,this.numeroMes+1,monto,this.servicio);
    }
}
