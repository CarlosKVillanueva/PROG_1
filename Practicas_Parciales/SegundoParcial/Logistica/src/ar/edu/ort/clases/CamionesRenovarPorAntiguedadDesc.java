package ar.edu.ort.clases;

import ar.edu.ort.tdas.implementaciones.ListaOrdenadaNodos;

/**
 * Logistica@author CKVillanueva el 6/11/2022 | 2:13 PM
 */
public class CamionesRenovarPorAntiguedadDesc extends ListaOrdenadaNodos<Integer, Camion> {
    @Override
    public int compare(Camion dato1, Camion dato2) {
        return dato2.getAntiguedad() - dato1.getAntiguedad();
    }

    @Override
    public int compareByKey(Integer clave, Camion elemento) {
        return elemento.getAntiguedad() - clave;
    }
}
