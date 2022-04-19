package ar.edu.ort.clases;

/**
 * PROG1_TP1_Ejercicio_2 @author CKVillanueva el 4/19/2022 | 4:12 PM
 */
public class Archivo {
    private String nombre;
    private double peso;
    private String localizacion;
    private boolean abierto;

    public Archivo(String nombre, double peso, String localizacion, boolean abierto) {
        this.nombre = nombre;
        this.peso = peso;
        this.localizacion = localizacion;
        this.abierto = abierto;
    }

    public void abrir() {
        System.out.println("Abriendo desde archivo");
    }

    public void cerrar() {
        System.out.println("Cerrando");
    }

    public void mover() {
        System.out.println("Moviendo");
    }

    @Override
    public String toString() {
        return "Archivo [abierto=" + abierto + ", localizacion=" + localizacion + ", nombre=" + nombre + ", peso="
                + peso + "]";
    }

}