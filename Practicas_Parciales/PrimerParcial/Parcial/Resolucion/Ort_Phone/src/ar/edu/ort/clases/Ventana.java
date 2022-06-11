package ar.edu.ort.clases;

import java.util.ArrayList;

/**
 * YA_12C_VILLANUEVA_CARLOS @author CKVillanueva el 5/3/2022 | 9:48 AM
 */
public class Ventana extends Componente {
    private ArrayList<Componente> componenentes;
    private Estado estado;
    private boolean hayCursorActivado;

    public Ventana() {
        super();

    }
    public Ventana(String texto, String color, int ancho, int alto, int posicionX, int posicionY, boolean habilitado, Estado estado) {
        super(texto, color, ancho, alto, posicionX, posicionY, habilitado);
        this.estado = estado;
        this.componenentes = new ArrayList<>();
    }

    public boolean agregar(Componente componente) {
        boolean agregado = false;
        if (!(componente instanceof Ventana)) {
            validarSiTieneCursorActivado(componente);
            agregado = componenentes.add(componente);
        }
        return agregado;
    }

    private void validarSiTieneCursorActivado(Componente componente) {
        if (!hayCursorActivado && componente instanceof CampoTexto) {
            hayCursorActivado = ((CampoTexto) componente).estaCursorActivo();
        }
    }

    @Override
    public void dibujar() {
        System.out.printf("Dibujando %s con los siguientes componentes:", getClass().getSimpleName());
        for (Componente componente : componenentes) {
            componente.dibujar();
            activarCursor(componente);
        }
    }

    private void activarCursor(Componente componente) {
        if (!hayCursorActivado && componente instanceof CampoTexto) {
            ((CampoTexto) componente).activarCursor();
        }
    }
}
