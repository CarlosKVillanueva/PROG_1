package ar.edu.ort.clases;

/**
 * PROG1_TP3_Ejercicio_13 @author CKVillanueva el 4/22/2022 | 4:54 PM
 */
public class Mesa {
    private int numero;
    private int cantPersonas;
    private boolean estaLibre;

    public Mesa(int numero, int cantPersonas, boolean estaLibre) {
        this.numero = numero;
        this.cantPersonas = cantPersonas;
        this.estaLibre = estaLibre;
    }
}
