package ar.edu.ort.clases;

/**
 * SedeDeLicencias @author CKVillanueva el 4/24/2022 | 11:37 AM
 */
public class Moto extends Vehiculo {
    private boolean tieneEspejos;

    public Moto(String patente, String marca, int cilindrada, boolean tieneEspejos) {
        super(patente, marca, cilindrada);
        this.tieneEspejos = tieneEspejos;
    }

}
