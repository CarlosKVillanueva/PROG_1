package ar.edu.ort.clases;

/**
 * Ejercicio_7@author CKVillanueva el 6/5/2022 | 8:20 PM
 */
public class Alumno {
    private String dni;
    private String nombre;
    private int edad;

    public Alumno(String dni, String nombre, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
