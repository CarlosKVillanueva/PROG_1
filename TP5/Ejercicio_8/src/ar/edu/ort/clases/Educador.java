package ar.edu.ort.clases;

/**
 * Ejercicio_8@author CKVillanueva el 6/7/2022 | 6:28 PM
 */
public class Educador extends Persona {
    private Nivel nivel;

    public Educador(String dni, String nombre, int edad, boolean pacienteRiesgo, Nivel nivel) {
        super(dni, nombre, edad, pacienteRiesgo);
        this.nivel = nivel;
    }

    @Override
    public int obtenerPrioridad() {
        return this.nivel == Nivel.INICIAL ? PRIORIDAD_MAX : PRIORIDAD_MEDIA;
    }
}
