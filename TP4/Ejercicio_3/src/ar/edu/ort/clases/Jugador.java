package ar.edu.ort.clases;

/**
 * Ejercicio_3 @author CKVillanueva el 5/7/2022 | 10:39 PM
 */
public class Jugador {
    private String apellido;
    private int numeroCamiseta;
    private Importancia importancia;
    private Posicion posicion;
    private String impor;
    private String puesto;


    public Jugador(String apellido, int numeroCamiseta, Importancia importancia, Posicion posicion) {
        this.apellido = apellido;
        this.numeroCamiseta = numeroCamiseta;
        this.importancia = importancia;
        this.posicion = posicion;
    }

    public Jugador(String apellido, int numeroCamiseta, String impor, String puesto) {
        this.apellido = apellido;
        this.numeroCamiseta = numeroCamiseta;
        this.impor = impor;
        this.puesto = puesto
        ;
    }

    public String getImpor() {
        return impor;
    }

    public String getPuesto() {
        return puesto;
    }

    public String getApellido() {
        return apellido;
    }

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }


    @Override
    public String toString() {
        return String.format("%s \t%d \t%s \t%s", apellido, numeroCamiseta, impor, puesto);
    }

    public boolean mismoJugador(int camiseta) {
        return this.numeroCamiseta == camiseta;
    }

    public boolean mismoJugador(String apellido) {
        return this.apellido.equals(apellido);
    }
}
