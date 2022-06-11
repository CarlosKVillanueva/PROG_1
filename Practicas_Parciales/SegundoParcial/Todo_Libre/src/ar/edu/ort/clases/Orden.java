package ar.edu.ort.clases;

/**
 * TodoLibre@author CKVillanueva el 6/10/2022 | 10:22 PM
 */
public abstract class Orden implements Informable{
    private String fecha;
    private double monto;
    private Usuario comprador;
    private Usuario vendedor;

    public Orden(String fecha, double monto, Usuario comprador, Usuario vendedor) {
        this.fecha = fecha;
        this.monto = monto;
        this.comprador = comprador;
    }

    protected Usuario getComprador() {
        return comprador;
    }

    public int getOrigen() {
        return this.vendedor.getComuna();
    }

    public double getMonto() {
        return monto;
    }


    public abstract int informar();
}
