package ar.edu.ort.clases;

import java.time.LocalDate;

/**
 * Logistica@author CKVillanueva el 6/11/2022 | 1:41 PM
 */
public abstract class Camion implements Mostrable,Renovable {

    private int nroPatente;
    private LocalDate anioFabricacion;
    private int kmRecorridos;

    public Camion(int nroPatente, LocalDate anioFabricacion, int kmRecorridos) {
        this.nroPatente = nroPatente;
        this.anioFabricacion = anioFabricacion;
        this.kmRecorridos = kmRecorridos;
    }


    protected int getKmRecorridos() {
        return kmRecorridos;
    }

    @Override
    public int mostrarId() {
        return this.nroPatente;
    }

    protected int getAntiguedad() {
        return LocalDate.now().getYear() - anioFabricacion.getYear();
    }
}
