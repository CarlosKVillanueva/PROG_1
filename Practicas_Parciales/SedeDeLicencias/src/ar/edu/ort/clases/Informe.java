package ar.edu.ort.clases;

/**
 * SedeDeLicencias @author CKVillanueva el 4/24/2022 | 11:26 AM
 */
public class Informe {
    private double porcReprobados;
    private double promTiempoAutosAprobados;

    public Informe(double porcReprobados, double promTiempoAutosAprobados) {
        this.porcReprobados = porcReprobados;
        this.promTiempoAutosAprobados = promTiempoAutosAprobados;
    }

    @Override
    public String toString() {
        return "Informe{" +
                "porcReprobados=" + porcReprobados +
                ", promTiempoAutosAprobados=" + promTiempoAutosAprobados +
                '}';
    }
}
