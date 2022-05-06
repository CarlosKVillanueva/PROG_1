package ar.edu.ort.clases;

/**
 * @author CKVillanueva el 4/10/2022
 * @project PROG1_TP3_Ejercicio_5
 */
public class BicicletaElectrica extends Bicicleta{
    private static final int POTENCIA_MAX = 250;
    private int potencia;

    public BicicletaElectrica(String modelo, String marca, int cantKm, int potencia) {
        super(modelo, marca, cantKm);
        this.potencia = potencia;
    }

    @Override
    public boolean esApta() {
        return potencia <= POTENCIA_MAX && super.esApta();
    }
    
}
