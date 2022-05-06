package ar.edu.ort.clases;

/**
 * @author CKVillanueva el 4/10/2022
 * @project PROG1_TP3_Ejercicio_5
 */
public class Bicicleta implements Aceptable {

    private static final int CANT_KM_MAX = 2000;
    private String modelo;
    private String marca;
    private int cantKm;

    public Bicicleta(String modelo, String marca, int cantKm) {
        this.modelo = modelo;
        this.marca = marca;
        this.cantKm = cantKm;
    }


    @Override
    public boolean esApta() {
        return cantKm < CANT_KM_MAX;
    }

}
