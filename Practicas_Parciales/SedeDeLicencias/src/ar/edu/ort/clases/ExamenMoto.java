package ar.edu.ort.clases;

import java.util.ArrayList;

/**
 * SedeDeLicencias @author CKVillanueva el 4/24/2022 | 11:32 AM
 */
public class ExamenMoto extends Examen {
    public static final int TOPE_CILINDRADA = 150;
    public static final int TOPE_SEGUNDOS = 120;
    private Moto moto;
    private ArrayList<Circuito> circuitos;

    public ExamenMoto(String fecha, Persona persona, Moto moto) {
        super(fecha, persona);
        this.moto = moto;
        this.circuitos = new ArrayList<>();

    }

    @Override
    public boolean aprobado() {
        return (this.moto.getCilindrada() > TOPE_CILINDRADA) ? (cantCircuitosAprobados() == circuitos.size()) : apruebaMotorMenorCC();
    }

    private boolean apruebaMotorMenorCC() {
        return cantCircuitosAprobados() >= this.circuitos.size() - 1 && cumpleTiempoTotal() ;
    }

    private boolean cumpleTiempoTotal() {
        double tiempoTotal = 0;
        int i = 0;
        while (i < circuitos.size() && tiempoTotal < TOPE_SEGUNDOS) {
            tiempoTotal += circuitos.get(i).getTiempoEnSeg();
            i++;
        }
        return tiempoTotal <= TOPE_SEGUNDOS;
    }

    private int cantCircuitosAprobados() {
        int cantAprobados = 0;
        for (Circuito circuito : circuitos) {
            if (circuito.aprobado()) {
                cantAprobados++;
            }
        }
        return cantAprobados;
    }
}
