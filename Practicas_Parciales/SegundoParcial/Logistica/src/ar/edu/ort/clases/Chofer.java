package ar.edu.ort.clases;

/**
 * Logistica@author CKVillanueva el 6/11/2022 | 1:40 PM
 */
public class Chofer implements Mostrable{
    private int nroLegajo;
    private String nomrbre;
    private int edad;

    @Override
    public int mostrarId() {
        return this.nroLegajo;
    }
}
