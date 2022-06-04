package ar.edu.ort.clases;

/**
 * Ejercicio_4@author CKVillanueva el 6/4/2022 | 11:36 AM
 */
public class Pelota {
    private int codigo;
    private TipoPelota tipoPelota;

    public Pelota(int codigo, TipoPelota tipoPelota) {
        this.codigo = codigo;
        this.tipoPelota = tipoPelota;
    }

    public boolean mismoElemento(int codigo) {
        return this.codigo == codigo;
    }

    public TipoPelota getTipoPelota() {
        return this.tipoPelota;
    }


    @Override
    public String toString() {
        return "Pelota{" +
                "codigo=" + codigo +
                ", tipoPelota=" + tipoPelota +
                '}';
    }

}
