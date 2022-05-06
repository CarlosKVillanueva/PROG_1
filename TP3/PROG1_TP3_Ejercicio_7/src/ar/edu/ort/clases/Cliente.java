package ar.edu.ort.clases;

public class Cliente {
    private String nombre;
    private double montoCobrar;

    public Cliente(String nombre, double montoCobrar) {
        this.nombre = nombre;
        this.montoCobrar = montoCobrar;
    }

    public double getMontoCobrar() {
        return montoCobrar;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", montoCobrar=" + montoCobrar +
                '}';
    }
}
