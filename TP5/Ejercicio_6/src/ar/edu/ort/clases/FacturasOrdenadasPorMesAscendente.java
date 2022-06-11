package ar.edu.ort.clases;

import ar.edu.ort.tdas.implementaciones.ListaOrdenadaNodos;

/**
 * Ejercicio_6@author CKVillanueva el 6/5/2022 | 11:40 PM
 */
public class FacturasOrdenadasPorMesAscendente extends ListaOrdenadaNodos<Integer, Factura> {
    @Override
    public int compare(Factura dato1, Factura dato2) {
        return dato1.getNumeroMes() - dato2.getNumeroMes();
    }

    @Override
    public int compareByKey(Integer clave, Factura elemento) {
        return clave - elemento.getNumeroMes();
    }
}
