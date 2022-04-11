package ar.edu.ort.clases;

/**
 * PROG1_TP3_Ejercicio_9
 *
 * @author CKVillanueva el 4/10/2022 | 6:58 PM
 */
public class Velero extends Barco {
    private int cantMastiles;


    public Velero(String matricula, int eslora, int anioFabricacion, String nombreDuenio, double valorBase, double valorAdicional, int cantMastiles) {
        super(matricula, eslora, anioFabricacion, nombreDuenio, valorBase, valorAdicional);
        this.cantMastiles = cantMastiles;
    }

    @Override
    public double calcularAlquiler() {
        return (super.getValorBase() * super.getEslora()) + adicional();
    }

    @Override
    public double adicional() {
        return super.getValorAdicional() * cantMastiles;
    }
}
