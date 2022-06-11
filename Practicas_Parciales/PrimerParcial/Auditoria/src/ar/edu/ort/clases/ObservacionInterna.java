package ar.edu.ort.clases;

import java.time.LocalDate;

/**
 * Auditoria @author CKVillanueva el 4/22/2022 | 8:33 PM
 */
public class ObservacionInterna extends Observacion {
    private static final int VENCIMIENTO = 90;
    private boolean enRevision;

    public ObservacionInterna(String titulo, String descripcion, LocalDate fechaAlta, Auditable auditable, Empleado auditor, boolean enRevision) {
        super(titulo, descripcion, fechaAlta, auditable, auditor);
        this.enRevision = enRevision;
    }

    public boolean estaVencida() {
        return tieneUnoVencido(VENCIMIENTO) && !enRevision;
    }
}