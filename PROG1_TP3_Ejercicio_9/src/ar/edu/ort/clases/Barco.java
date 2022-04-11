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

    public abstract double  adicional();

    public int getEslora() {
        return eslora;
    }

    public double getValorBase() {
        return valorBase;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }
}
