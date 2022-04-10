package ar.edu.ort.clases;

import java.util.ArrayList;

/**
 * PROG1_TP3_Ejercicio_6
 *
 * @author CKVillanueva el 4/10/2022 | 12:13 PM
 */
public class GrupoFiguras {
    private ArrayList<Figura> figuras;

    public GrupoFiguras() {
        this.figuras = new ArrayList<>();
    }

    public void agregar(Figura figura) {
        figuras.add(figura);
    }

    public void mostrarInfo() {
        for (Figura figura : figuras) {
            figura.mostrar();
        }
    }
}
