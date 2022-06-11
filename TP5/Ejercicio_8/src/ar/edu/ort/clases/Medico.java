package ar.edu.ort.clases;

/**
 * Ejercicio_8@author CKVillanueva el 6/7/2022 | 6:25 PM
 */
public class Medico extends Persona{
    private int matricula;

    public Medico(String dni, String nombre, int edad, boolean pacienteRiesgo, int matricula) {
        super(dni, nombre, edad, pacienteRiesgo);
        this.matricula = matricula;
    }

    @Override
    public int obtenerPrioridad() {
        return PRIORIDAD_MAX;
    }
}
