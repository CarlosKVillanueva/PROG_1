package ar.edu.ort.clases;

/**
 * PROG1_TP3_Ejercicio_9
 *
 * @author CKVillanueva el 4/10/2022 | 7:01 PM
 */
public class Deportivo extends Barco{
    private static final double INDICE_POTENCIA = 0.35;
    private int potencia;
    private int cx;

    public Deportivo(String matricula, int eslora, int anioFabricacion, String nombreDuenio, double valorBase, double valorAdicional, int potencia, int cx) {
        super(matricula, eslora, anioFabricacion, nombreDuenio, valorBase, valorAdicional);
        this.potencia = potencia;
        this.cx = cx;
    }

    @Override
    public double calcularAlquiler() {
        return (super.getValorBase() * super.getEslora()) + adicional();
    }

    @Override
    public double adicional() {
        return super.getValorAdicional() * (potencia * 0.5);
    }

    protected double getPotencia() {
        return potencia * INDICE_POTENCIA;
    }

    public double calcularConsumo(){
        return ((double) potencia / cx) * INDICE_POTENCIA;
    }
}
