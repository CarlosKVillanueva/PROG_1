package ar.edu.ort.clases;

/**
 * PROG1_TP3_Ejercicio_10 @author CKVillanueva el 15/04/2022 | 12:17
 */
public class Insumos implements Facturable {
    private static final double IVA = 1.21;
    private String nombre;
    private double porcentajeGanancia;
    private double precioLista;
    private Tipo tipo;

    public Insumos(String nombre, double porcentajeGanancia, double precioLista, Tipo tipo) {
        this.nombre = nombre;
        this.porcentajeGanancia = porcentajeGanancia;
        this.precioLista = precioLista;
        this.tipo = tipo;
    }

    @Override
    public double calcularFacturacion() {
        return Matematica.sumarPorcentaje(precioLista, porcentajeGanancia);
    }

    @Override
    public double facturacionConIva() {
        return calcularFacturacion() * IVA;
    }
}
