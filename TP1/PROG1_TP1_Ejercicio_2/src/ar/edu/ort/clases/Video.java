package ar.edu.ort.clases;

/**
 * PROG1_TP1_Ejercicio_2 @author CKVillanueva el 4/19/2022 | 4:19 PM
 */
public class Video extends Multimedia {

    private int alto;
    private int ancho;
    private FormatoVideo formato;

    public Video(String nombre, double peso, String localizacion, boolean abierto, double segundos,
                 boolean reproduccion, int alto, int ancho, FormatoVideo formato) {
        super(nombre, peso, localizacion, abierto, segundos, reproduccion);
        this.alto = alto;
        this.ancho = ancho;
        this.formato = formato;
    }

    @Override
    public String toString() {
        return "Video [alto=" + super.toString() + ", ancho=" + ancho + ", alto=" + alto + ", formato=" + formato + "]";
    }

}