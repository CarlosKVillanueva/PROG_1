package ar.edu.ort.clases;

import ar.edu.ort.tdas.implementaciones.ListaOrdenadaNodos;

/**
 * Ejercicio_7@author CKVillanueva el 6/5/2022 | 8:13 PM
 */
public class CursosOrdenadosPorCodAsc extends ListaOrdenadaNodos<String, Curso> {
    @Override
    public int compare(Curso dato1, Curso dato2) {
        return dato1.getCodigo().compareTo(dato2.getCodigo());
    }

    @Override
    public int compareByKey(String clave, Curso elemento) {
        return clave.compareTo(elemento.getCodigo());
    }
}
