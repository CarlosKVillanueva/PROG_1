package ar.edu.ort.clases;

import ar.edu.ort.tdas.implementaciones.ListaOrdenadaNodos;

/**
 * DragonBall@author CKVillanueva el 6/10/2022 | 4:42 PM
 */
public class PersonajesPorKiDesc extends ListaOrdenadaNodos<Integer,Personaje> {
    @Override
    public int compare(Personaje dato1, Personaje dato2) {
        return dato1.getKi() - dato2.getKi();
    }

    @Override
    public int compareByKey(Integer clave, Personaje elemento) {
        return clave - elemento.getKi();
        // NO NECESITA IMPLEMENTARSE
    }

}
