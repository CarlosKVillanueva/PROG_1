package ar.edu.ort.clases;

/**
 * YA_12C_VILLANUEVA_CARLOS @author CKVillanueva el 5/3/2022 | 9:44 AM
 */
public class Boton extends Componente {
    private String textoBoton;

    public Boton(String texto, String color, int ancho, int alto, int posicionX, int posicionY, boolean habilitado) {
        super(texto, color, ancho, alto, posicionX, posicionY, habilitado);
    }

    public Boton(String texto, String color, int ancho, int alto, int posicionX, int posicionY, boolean habilitado, String textoBoton) {
        super(texto, color, ancho, alto, posicionX, posicionY, habilitado);
        this.textoBoton = textoBoton;
    }

    public Boton() {

    }

    @Override
    public void dibujar() {
        System.out.printf("Dibujando Botón con el texto: %s con un alto de: %dmm y ancho de: %dmm", getTexto(), getAlto(), getAncho());
    }

    public void mostrarTexto(String aceptar) {
        this.textoBoton = aceptar;
    }
}
