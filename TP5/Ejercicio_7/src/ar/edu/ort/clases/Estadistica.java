package ar.edu.ort.clases;

/**
 * Ejercicio_7@author CKVillanueva el 6/5/2022 | 8:22 PM
 */
public class Estadistica {
    private String nombreCurso;
    private double promedioEdad;

    public Estadistica(String nombreCurso, double promedioEdad) {
        this.nombreCurso = nombreCurso;
        this.promedioEdad = promedioEdad;
    }

    @Override
    public String toString() {
        return "Estadistica{" +
                "nombreCurso='" + nombreCurso + '\'' +
                ", promedioEdad=" + promedioEdad +
                '}';
    }
}
