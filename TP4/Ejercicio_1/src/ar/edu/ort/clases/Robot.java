package ar.edu.ort.clases;

/**
 * Ejercicio_1 @author CKVillanueva el 5/6/2022 | 11:07 AM
 */
public class Robot {
    private long codigo;
    private int nivelBateria;

    public Robot(long codigo, int nivelBateria) {
        this.codigo = codigo;
        this.nivelBateria = nivelBateria;
    }

    public long getCodigo() {
        return codigo;
    }

    public int getNivelBateria() {
        return nivelBateria;
    }
}
