package ar.edu.ort.clases;

/**
 * SedeDeLicencias @author CKVillanueva el 4/24/2022 | 11:34 AM
 */
public class Circuito implements Evaluable{
    private static final int MAX_FALTAS = 2;
    private int tiempoEnSeg;
    private int nroFaltas;

    public Circuito(int tiempoEnSeg, int nroFaltas) {
        this.tiempoEnSeg = tiempoEnSeg;
        this.nroFaltas = nroFaltas;
    }

    public int getTiempoEnSeg() {
        return tiempoEnSeg;
    }

    @Override
    public boolean aprobado() {
        return nroFaltas >= MAX_FALTAS;
    }
}
