package ar.edu.ort.clases;

import ar.edu.ort.tdas.implementaciones.ListaOrdenadaNodos;
import ar.edu.ort.tdas.interfaces.ListaOrdenada;

/**
 * Ejercicio_8@author CKVillanueva el 6/7/2022 | 6:33 PM
 */
public class PersonasOrdenadasXPriYOrdAsc extends ListaOrdenadaNodos<ClavePersona, Persona> {
    @Override
    public int compare(Persona dato1, Persona dato2) {
        return dato1.obtenerPrioridad() - dato2.obtenerPrioridad() == 0 ?
                dato1.getOrden() - dato2.getOrden():
                dato1.obtenerPrioridad() - dato2.obtenerPrioridad();
    }

    @Override
    public int compareByKey(ClavePersona clave, Persona elemento) {
        return clave.getPrioridad() - elemento.obtenerPrioridad() == 0 ?
                clave.getOrden() - elemento.getOrden() :
                clave.getPrioridad() - elemento.obtenerPrioridad();
    }
}
