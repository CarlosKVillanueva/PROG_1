package ar.edu.ort.clases;

/**
 * YA_12C_VILLANUEVA_CARLOS @author CKVillanueva el 5/3/2022 | 9:42 AM
 */
public abstract class Componente implements Dibujable{
    private String texto;
    private String color;
    private int ancho;
    private int alto;
    private int posicionX;
    private int posicionY;
    private boolean habilitado;

    public Componente(String texto, String color, int ancho, int alto, int posicionX, int posicionY, boolean habilitado) {
        this.texto = texto;
        this.color = color;
        this.ancho = ancho;
        this.alto = alto;
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.habilitado = habilitado;
    }

    public String getTexto() {
        return texto;
    }

    public int getAncho() {
        return ancho;
    }

    public int getAlto() {
        return alto;
    }

    protected boolean estaHabilitado() {
        return habilitado;
    }

    protected boolean habilitarCampo() {
        this.habilitado = true;
        return true;
    }
}
