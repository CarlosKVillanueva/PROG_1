package ar.edu.ort.clases;

/**
 * Ejercicio_8@author CKVillanueva el 6/7/2022 | 6:18 PM
 */
public class Persona implements Vacunable {

    public static final int EDAD_MAX_RIESGO = 60;
    public static final int EDAD_MIN_RIESGO = 30;
    private String dni;
    private String nombre;
    private int edad;
    private boolean pacienteRiesgo;
    private int ordenAsignado;
    private ClavePersona clavePersona;

    public Persona(String dni, String nombre, int edad, boolean pacienteRiesgo) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.pacienteRiesgo = pacienteRiesgo;
    }

    public void generarClave(int orden) {
        this.ordenAsignado = orden;
        this.clavePersona = new ClavePersona(obtenerPrioridad(), orden);
    }

    public int getOrden() {
        return this.clavePersona.getOrden();
    }

    @Override
    public int obtenerPrioridad() {
        return this.edad >= EDAD_MAX_RIESGO ? PRIORIDAD_MAX : this.edad <= EDAD_MIN_RIESGO ? PRIORIDAD_MIN : PRIORIDAD_MEDIA;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", pacienteRiesgo=" + pacienteRiesgo +
                ", ordenAsignado=" + ordenAsignado +
                '}';
    }
}
