package ar.edu.ort.clases;

/**
 * Ejercicio_2 @author CKVillanueva el 5/7/2022 | 8:13 PM
 */
public class Carta {
    private int numero;
    private Palo palo;
    private String paloString;


    public Carta(int numero, Palo palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public Carta(int numero, String paloString) {
        this.numero = numero;
        this.paloString = paloString;
    }

    public int getNumero() {
        return numero;
    }

    public String getPaloString() {
        return this.paloString;
    }


    @Override
    public String toString() {
        return String.format("%d\t%s", numero, paloString);
    }
}
