package ar.edu.ort.clases;

import java.util.ArrayList;

/**
 * YA_12C_VILLANUEVA_CARLOS @author CKVillanueva el 5/3/2022 | 9:48 AM
 */
public class Ventana extends Componente {
    private ArrayList<Componente> componenentesVentana;
    private Estado estado;

    public Ventana(String texto, String color, int ancho, int alto, int posicionX, int posicionY, boolean habilitado, Estado estado) {
        super(texto, color, ancho, alto, posicionX, posicionY, habilitado);
        this.estado = estado;
    }

    public boolean agregar(Componente componente) {
        boolean agregado = false;
        if (!(componente instanceof Ventana)) {
            if (componente instanceof CampoTexto && !componente.estaHabilitado() && !((CampoTexto) componente).isCursorActivo()) {
                if (!((CampoTexto) componente).isCursorActivo()) {
                    activarCampoTexto();
                } else {
                    agregado = componenentesVentana.add(componente);
                }
            }
        }
        return agregado;
    }

    private void activarCampoTexto() {
        int i = 0;
        boolean seActivo = false;
        while (i < componenentesVentana.size() && !seActivo) {
            if (componenentesVentana.get(i) instanceof CampoTexto) {
                seActivo = componenentesVentana.get(i).habilitarCampo();
            }
        }
    }

    @Override
    public void dibujar() {
        System.out.printf("Dibujando %s con los siguientes componentes:", getClass().getSimpleName());
        for (Componente componente : componenentesVentana) {
            componente.dibujar();
        }
    }
}
