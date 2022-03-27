public class Multimedia extends Archivo {

    private double segundos;
    private boolean reproduccion;

    public Multimedia(String nombre, double peso, String localizacion, boolean abierto, double segundos,
            boolean reproduccion) {
        super(nombre, peso, localizacion, abierto);
        this.segundos = segundos;
        this.reproduccion = reproduccion;
    }

    // @Override
    // public void abrir() {
    // System.out.println("Abriendo desde Multimedia");
    // }

    public void reproducir() {
        System.out.println("Reproduciendo");
    }

    public void parar() {
        System.out.println("Parado");
    }

    @Override
    public String toString() {
        return "Multimedia [reproduccion=" + super.toString() + reproduccion + ", segundos=" + segundos + "]";
    }

}
