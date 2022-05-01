package ar.edu.ort.ejercicio_1.clases;

public class Leccion {
    private String nombre;
    private double duracion;
    private Tipo tipo;

    public Leccion(String nombre, double duracion, Tipo tipo) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Leccion [duracion=" + duracion + ", nombre=" + nombre + ", tipo=" + tipo + "]";
    }

}
