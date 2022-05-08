package ar.edu.ort.clases;

/**
 * Ejercicio_2 @author CKVillanueva el 5/7/2022 | 8:13 PM
 */
public class Carta {
    private int numero;
    private Palo palo;
    private String paloEmoji;


    public Carta(int numero, Palo palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public Carta(int numero, String paloEmoji) {
        this.numero = numero;
        this.paloEmoji = paloEmoji;
    }

    public int getNumero() {
        return numero;
    }

    public String getPaloEmoji() {
        return this.paloEmoji;
    }


    @Override
    public String toString() {
        return String.format("%d\t%s", numero, paloEmoji);
    }
}
