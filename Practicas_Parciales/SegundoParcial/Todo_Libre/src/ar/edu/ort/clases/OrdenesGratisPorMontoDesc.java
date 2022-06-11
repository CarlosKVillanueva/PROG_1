package ar.edu.ort.clases;

import ar.edu.ort.tdas.implementaciones.ListaOrdenadaNodos;

/**
 * TodoLibre@author CKVillanueva el 6/10/2022 | 11:22 PM
 */
public class OrdenesGratisPorMontoDesc extends ListaOrdenadaNodos<Double, Orden> {
    @Override
    public int compare(Orden dato1, Orden dato2) {
//        Double d1 = dato1.getMonto();
        return dato1.getMonto().compareTo(dato2.getMonto());
    }

    @Override
    public int compareByKey(Double clave, Orden elemento) {
        return clave.compareTo(elemento.getMonto());
    }
}
