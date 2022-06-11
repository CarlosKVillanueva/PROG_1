package ar.edu.ort.clases;

/**
 * YA_12C_VILLANUEVA_CARLOS @author CKVillanueva el 5/3/2022 | 9:47 AM
 */
public class CampoTexto extends Componente{

    private boolean multiTexto;
    private boolean cursorActivo;

    public CampoTexto(String texto, String color, int ancho, int alto, int posicionX, int posicionY, boolean habilitado, boolean multiTexto, boolean cursorActivo) {
        super(texto, color, ancho, alto, posicionX, posicionY, habilitado);
        this.multiTexto = multiTexto;
        this.cursorActivo = cursorActivo;
    }

    @Override
    public void dibujar() {
        System.out.printf("Dibujando Campo de Texto %s que tiene el cursor %s",
                ((multiTexto) ? "Multitexto" : "Simple"),
                (estaHabilitado()) ? "Activado" : "Desactivado");
    }

    public boolean isCursorActivo() {
        return cursorActivo;
    }

}
