package ar.edu.ort.clases;

import ar.edu.ort.tdas.implementaciones.ListaOrdenadaNodos;

/**
 * Ejercicio_7@author CKVillanueva el 6/5/2022 | 8:19 PM
 */
public class AlumnosOrdenadosXMayorEdadDesc extends ListaOrdenadaNodos<Integer, Alumno> {
    @Override
    public int compare(Alumno dato1, Alumno dato2) {
        return dato2.getEdad() - dato1.getEdad();
    }

    @Override
    public int compareByKey(Integer clave, Alumno elemento) {
        return elemento.getEdad() - clave;
    }
}
