package ar.edu.ort.clases;

/**
 * PROG1_TP3_Ejercicio_9
 *
 * @author CKVillanueva el 4/10/2022 | 6:56 PM
 */
public abstract class Barco implements Calculadora{
    private String matricula;
    private int eslora;
    private int anioFabricacion;
    private String nombreDuenio;
    private double valorBase;
    private double valorAdicional;

    public Barco(String matricula, int eslora, int anioFabricacion, String nombreDuenio, double valorBase, double valorAdicional) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
        this.nombreDuenio = nombreDuenio;
        this.valorBase = valorBase;
        this.valorAdicional = valorAdicional;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public double calcularAlquiler() {
        return (valorBase * eslora) + adicional();
    }

    public abstract double adicional();

    @Override
    public String toString() {
        return String.format("Propietario: %s | Matricula: %s | Eslora: %d",nombreDuenio, matricula,eslora);
    }
}
