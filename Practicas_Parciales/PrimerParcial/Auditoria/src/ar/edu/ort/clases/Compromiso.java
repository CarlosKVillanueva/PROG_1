package ar.edu.ort.clases;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Auditoria @author CKVillanueva el 4/22/2022 | 8:27 PM
 */
public class Compromiso {
    private String descripcion;
    private LocalDate fechaCompromiso;
    private LocalDate now = LocalDate.now();

    public Compromiso(String descripcion, LocalDate fechaCompromiso) {
        this.descripcion = descripcion;
        this.fechaCompromiso = fechaCompromiso;
    }

    public boolean estaVencido(int cantDiasMax) {
        return ChronoUnit.DAYS.between(fechaCompromiso, now) > cantDiasMax;
    }
}
