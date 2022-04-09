public class Audio extends Multimedia {

    private String artista;
    private String album;
    private FormatoAudio formato;

    public Audio(String nombre, double peso, String localizacion, boolean abierto, double segundos,
            boolean reproduccion, String artista, String album, FormatoAudio formato) {
        super(nombre, peso, localizacion, abierto, segundos, reproduccion);
        this.artista = artista;
        this.album = album;
        this.formato = formato;
    }

    @Override
    public String toString() {
        return "Audio [album=" + super.toString() + album + ", artista=" + artista + ", formato=" + formato + "]";
    }

}
