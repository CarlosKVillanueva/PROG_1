package ar.edu.ort.clases;

/**
 * SedeDeLicencias @author CKVillanueva el 4/24/2022 | 11:36 AM
 */
public abstract class Vehiculo {
    private String patente;
    private String marca;
    private int cilindrada;

    public Vehiculo(String patente, String marca, int cilindrada) {
        this.patente = patente;
        this.marca = marca;
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "patente='" + patente + '\'' +
                ", marca='" + marca + '\'' +
                ", cilindrada=" + cilindrada +
                '}';
    }

    public int getCilindrada() {
        return cilindrada;
    }
}
