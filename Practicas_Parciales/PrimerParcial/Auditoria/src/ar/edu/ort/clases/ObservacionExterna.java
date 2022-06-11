package ar.edu.ort.clases;

import java.time.LocalDate;

/**
 * Auditoria @author CKVillanueva el 4/22/2022 | 8:42 PM
 */
public class ObservacionExterna extends Observacion {
    private static final int VENCIMIENTO = 60;
    private String nombreConsultora;

    public ObservacionExterna(String titulo, String descripcion, LocalDate fechaAlta, Auditable auditable, Empleado auditor, String nombreConsultora) {
        super(titulo, descripcion, fechaAlta, auditable, auditor);
        this.nombreConsultora = nombreConsultora;
    }

    public boolean estaVencida() {
        return tieneUnoVencido(VENCIMIENTO);
    }

    @Override
    public String toString() {
        return "ObservacionExterna{" +
                "nombreConsultora='" + nombreConsultora + '\'' +
                '}';
    }
}
