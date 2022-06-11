package ar.edu.ort.clases;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

/**
 * Auditoria @author CKVillanueva el 4/22/2022 | 8:18 PM
 */
public abstract class Observacion implements Vencible{
    private String titulo;
    private String descripcion;
    private ArrayList<Compromiso> compromisos;
    private LocalDate fechaAlta;
    private Auditable auditable;
    private Empleado auditor;

    public Observacion(String titulo, String descripcion, LocalDate fechaAlta, Auditable auditable, Empleado auditor) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaAlta = fechaAlta;
        this.auditable = auditable;
        this.auditor = auditor;
        this.compromisos = new ArrayList<>();
        generarCompromisos();
    }

    private void generarCompromisos() {
        Random random = new Random();
        int cantCompromisos = (int) ( Math.random() * 30 + 20);

        for (int i = 0; i <cantCompromisos; i++) {
            compromisos.add(new Compromiso("Desc" + i, LocalDate.parse("2022-02-18")));
        }
    }

    public boolean tieneUnoVencido(int cantDias) {
        int i = 0;
        boolean vencida = false;
        while (i < compromisos.size() && !vencida) {
            vencida = compromisos.get(i).estaVencido(cantDias);
            i++;
        }
        return vencida;
    }

    public boolean tieneCriticidadMayorA(int nivelCriticidad) {
        return auditable.getNivelCriticidad() > nivelCriticidad;
    }

    public void mostrar() {
        System.out.printf("%S %S %S\t", getClass().getSimpleName(), titulo, descripcion);
        auditor.mostrar();
    }

    @Override
    public String toString() {
        return "Observacion{" +
                "titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", compromisos=" + compromisos +
                ", fechaAlta=" + fechaAlta +
                ", auditable=" + auditable +
                ", auditor=" + auditor +
                '}';
    }
}
