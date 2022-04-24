package ar.edu.ort.clases;

/**
 * SedeDeLicencias @author CKVillanueva el 4/24/2022 | 11:38 AM
 */
public class Auto extends Vehiculo {
    private int cantPuertas;

    public Auto(String patente, String marca, int cilindrada, int cantPuertas) {
        super(patente, marca, cilindrada);
        this.cantPuertas = cantPuertas;
    }
}
