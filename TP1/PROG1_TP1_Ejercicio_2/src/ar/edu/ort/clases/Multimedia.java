package ar.edu.ort.clases;

/**
 * PROG1_TP1_Ejercicio_2 @author CKVillanueva el 4/19/2022 | 4:15 PM
 */
public class Multimedia extends Archivo {

    private double segundos;
    private boolean reproduccion;

    public Multimedia(String nombre, double peso, String localizacion, boolean abierto, double segundos,
                      boolean reproduccion) {
        super(nombre, peso, localizacion, abierto);
        this.segundos = segundos;
        this.reproduccion = reproduccion;
    }

    public void reproducir() {
        System.out.println("Reproduciendo");
    }

    public void parar() {
        System.out.println("Parado");
    }

    @Override
    public String toString() {
        return "Multimedia [reproduccion=" + super.toString() + reproduccion + ", segundos=" + segundos + "]";
    }

}
