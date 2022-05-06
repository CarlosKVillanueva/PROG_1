package ar.edu.ort.clases;

/**
 * YA_12C_VILLANUEVA_CARLOS @author CKVillanueva el 5/3/2022 | 9:55 AM
 */
public class VentanaError extends Ventana {
    private Etiqueta etiqueta;
    private Boton boton;

    public VentanaError(String textoError) {
        super();
        etiqueta = new Etiqueta();
        boton = new Boton();
        etiqueta.mostrarError(textoError);
        boton.mostrarTexto("Aceptar");
    }
    public VentanaError(String texto, String color, int ancho, int alto, int posicionX, int posicionY, boolean habilitado, Estado estado, Etiqueta etiqueta, Boton boton, String mensajeError) {
        super(texto, color, ancho, alto, posicionX, posicionY, habilitado, estado);
        etiqueta.mostrarError(mensajeError);
        boton.mostrarTexto("Aceptar");
    }
}
