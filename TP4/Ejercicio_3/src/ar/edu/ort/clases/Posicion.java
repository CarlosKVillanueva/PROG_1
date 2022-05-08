package ar.edu.ort.clases;

/**
 * Ejercicio_3 @author CKVillanueva el 5/7/2022 | 10:40 PM
 */
public enum Posicion {
    ARQUERO(3, "Arquero"),
    DEFENSOR(6, "Defensor" ),
    MEDIO(7, "Medio" ),
    DELANTERO(7, "Delantero");

    private int cantidad;
    private String pos;

    Posicion(int cantidad, String pos) {
        this.cantidad = cantidad;
        this.pos = pos;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getPos() {
        return pos;
    }
}
