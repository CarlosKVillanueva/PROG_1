package ar.edu.ort.clases;

import java.util.ArrayList;

/**
 * SedeDeLicencias @author CKVillanueva el 4/24/2022 | 11:24 AM
 */
public class SedeLicencias {
    private String nombre;
    private ArrayList<Examen> examenes;

    public SedeLicencias(String nombre) {
        this.nombre = nombre;
        this.examenes = new ArrayList<>();
    }
    public Informe obtenerInforme() {
        return new Informe(porcentajeReprobados(), promTiempoAutosAprobados());
    }

    private double porcentajeReprobados() {
        double acumReprobados = 0;

        for (Examen examen : examenes) {
            if (!examen.aprobado()) {
                acumReprobados++;
            }
        }

        return (examenes.size() > 0 ) ? (acumReprobados / examenes.size() * 100) : 0;
    }

    private double promTiempoAutosAprobados() {
        double acumTiempo = 0, contTiempos= 0;
        for (Examen examen : examenes) {
            if (examen instanceof ExamenAuto && examen.aprobado()) {
                acumTiempo += ((ExamenAuto)examen).getTiempo();
                contTiempos++;
            }
        }
        return (contTiempos > 0 ) ? acumTiempo / contTiempos : 0;
    }

    @Override
    public String toString() {
        return "SedeLicencias{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
