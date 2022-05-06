package ar.edu.ort.clases;

public class Vehiculo {
    private String patente;
    private Categoria categoria;

    public Vehiculo(String patente, Categoria categoria) {
        this.patente = patente;
        this.categoria = categoria;
    }

    public double getTarifa() {
        return categoria.getTarifaBase();
    }
}
