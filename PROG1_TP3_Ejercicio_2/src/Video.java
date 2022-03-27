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
        return "Video [alto=" + super.toString() + ", ancho=" + ancho + ", formato=" + formato + "]";
    }

}
