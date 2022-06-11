package ar.edu.ort.clases;

/**
 * YA_12C_VILLANUEVA_CARLOS @author CKVillanueva el 5/3/2022 | 9:48 AM
 */
public class Etiqueta extends Componente {
    private String fuenteTexto;
    private String mensajeError;

    public Etiqueta(String texto, String color, int ancho, int alto, int posicionX, int posicionY, boolean habilitado, String fuenteTexto, String mensajeError) {
        super(texto, color, ancho, alto, posicionX, posicionY, habilitado);
        this.fuenteTexto = fuenteTexto;
        this.mensajeError = mensajeError;
    }

    public void mostrarError(String mensaje){
        this.mensajeError = mensaje;
    }
    @Override
    public void dibujar() {
        System.out.printf("Dibujando Etiqueta con el texto %s con fuente %s", getTexto(), this.fuenteTexto);
    }
}
