package ar.edu.ort.clases;

/**
 * Ejercicio_2 @author CKVillanueva el 5/7/2022 | 8:15 PM
 */
public enum Palo {
    ORO("Oro"),BASTO("Basto"),ESPADA("Espada"),COPA("Copa");

    private String palo;

    Palo(String palo) {
        this.palo = palo;
    }

    public String getPalo() {
        return palo;
    }
}
