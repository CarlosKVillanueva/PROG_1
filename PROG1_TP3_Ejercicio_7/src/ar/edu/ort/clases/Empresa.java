package ar.edu.ort.clases;

public class Empresa {
    private String razonSocial;
    private Aplicacion aplicacion;

    public Empresa(String razonSocial) {
        this.razonSocial = razonSocial;
        this.aplicacion = aplicacion;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "razonSocial='" + razonSocial + '\'' +
                '}';
    }
}
