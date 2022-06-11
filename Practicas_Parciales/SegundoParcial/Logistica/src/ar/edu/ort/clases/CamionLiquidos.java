package ar.edu.ort.clases;

import java.time.LocalDate;

/**
 * Logistica@author CKVillanueva el 6/11/2022 | 1:43 PM
 */
public class CamionLiquidos extends Camion {

    private static final int ANIO_RECAMBIO = 6;
    private static final int MAX_KM_200 = 200000;
    private static final int MAX_KM_250 = 250000;
    private int capacidad;
    private int cantTanques;

    public CamionLiquidos(int nroPatente, LocalDate anioFabricacion, int kmRecorridos, int capacidad, int cantTanques) {
        super(nroPatente, anioFabricacion, kmRecorridos);
        this.capacidad = capacidad;
        this.cantTanques = cantTanques;
    }

    @Override
    public boolean esRenovable() {
        return getAntiguedad() > ANIO_RECAMBIO ? getKmRecorridos() > MAX_KM_200 : getKmRecorridos() > MAX_KM_250;
    }
}

