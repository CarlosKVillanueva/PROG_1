package ar.edu.ort.clases;

import java.time.LocalDate;

/**
 * Logistica@author CKVillanueva el 6/11/2022 | 1:44 PM
 */
public class CamionSolidos extends Camion{

    private static final int LARGO_MAX = 6;
    private int largo;
    private int ancho;
    private int alto;

    public CamionSolidos(int nroPatente, LocalDate anioFabricacion, int kmRecorridos, int largo, int ancho, int alto) {
        super(nroPatente, anioFabricacion, kmRecorridos);
        this.largo = largo;
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public boolean esRenovable() {
        return this.largo > LARGO_MAX ? ;
    }
}
