package ar.edu.ort.clases;

import java.time.LocalDate;

/**
 * Ejercicio_3@author CKVillanueva el 6/4/2022 | 10:38 AM
 */
public class Documento {
    private LocalDate fecha;
    private String tituloDoc;
    private int cantCarillas;
    private boolean dobleFaz;

    public Documento(int cantCarillas, boolean dobleFaz) {
        this.fecha = LocalDate.now();
        this.cantCarillas = cantCarillas;
        this.dobleFaz = dobleFaz;
        this.tituloDoc = "Lorem Ipsum";
    }

    public int getHojas() {
        return dobleFaz ? cantCarillas / 2 : cantCarillas;
    }


    @Override
    public String toString() {
        return String.format("%s\t%s", fecha, tituloDoc);
    }
}
