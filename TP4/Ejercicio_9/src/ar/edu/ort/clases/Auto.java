package ar.edu.ort.clases;

import java.time.LocalDate;
import java.util.Date;

/**
 * Ejercicio_9 @author CKVillanueva el 5/20/2022 | 1:40 PM
 */
public class Auto {
    public static final int MESES = 12;
    public static final int ENERO = 1;
    private int mesActual = LocalDate.now().getMonthValue();
    private String patente;
    private LocalDate fechaIngreso;
    private Pago[] pagosMensuales;

    public Auto(String patente, LocalDate fechaIngreso) {
        this.patente = patente;
        this.fechaIngreso = fechaIngreso;
        this.pagosMensuales = new Pago[MESES];
    }

    public boolean estaAlDia() {
        int primerMes = primerMes();
        int idxMes = mesActual;
        boolean alDia = true;

        while (alDia && idxMes > primerMes) {
            alDia = pagosMensuales[idxMes] != null;
            idxMes--;
        }
        return true;
    }

    private int primerMes() {
        return (fechaIngreso.getYear() == LocalDate.now().getYear()) ? fechaIngreso.getMonthValue() : ENERO;
    }

    public String getPatente() {
        return this.patente;
    }

    public int controlMeses() {
        int impagos = 0;
        for (Pago pagos : pagosMensuales) {
            if (pagos == null) {
                impagos++;
            }
        }
        return impagos;
    }
}
