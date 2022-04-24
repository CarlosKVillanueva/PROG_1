package ar.edu.ort.clases;

/**
 * SedeDeLicencias @author CKVillanueva el 4/24/2022 | 12:08 PM
 */
public class ExamenAuto extends Examen{

    public static final int MAX_TIEMPO = 90;
    private Auto auto;
    private Circuito circuito;

    public ExamenAuto(String fecha, Persona persona, Auto auto, Circuito circuito) {
        super(fecha, persona);
        this.auto = auto;
        this.circuito = circuito;
    }

    public double getTiempo() {
        return this.circuito.getTiempoEnSeg();
    }
    @Override
    public boolean aprobado() {
        return getTiempo() < MAX_TIEMPO && circuito.aprobado();
    }

}
