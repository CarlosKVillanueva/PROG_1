package ar.edu.ort.clases;

import ar.edu.ort.tdas.implementaciones.ListaOrdenadaNodos;

/**
 * Ejercicio_7@author CKVillanueva el 6/5/2022 | 8:16 PM
 */
public class CursosOrdenadosPorNivel extends ListaOrdenadaNodos<Integer, Curso> {
    @Override
    public int compare(Curso dato1, Curso dato2) {
        return dato1.getNivel() - dato2.getNivel();
    }

    @Override
    public int compareByKey(Integer clave, Curso elemento) {
        return clave - elemento.getNivel();
    }
}
