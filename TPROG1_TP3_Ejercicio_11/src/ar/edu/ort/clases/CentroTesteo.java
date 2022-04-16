package ar.edu.ort.clases;

import java.util.ArrayList;

/**
 * TPROG1_TP3_Ejercicio_11 @author CKVillanueva el 4/16/2022 | 10:06 AM
 */
public class CentroTesteo {
    private static final int MAX_TEST_DIARIOS = 50;
    private String nombre;
    private ArrayList<Dia> dias;

    public CentroTesteo(String nombre) {
        this.nombre = nombre;
        this.dias = new ArrayList<>();
    }

    public void agregarDias(Dia dia) {
        dias.add(dia);
    }

    public double revisar() {
        double porcentaje = 0;
        for (Dia dia : dias) {
            porcentaje = dia.revisar(MAX_TEST_DIARIOS);
        }
        return porcentaje;
    }

    public void mostrarDiaConMasPrioritarios() {
        int diaMaxPersonas = Integer.MIN_VALUE;
        Dia diaConMaxP = null;
        for (Dia dia : dias) {
            if (dia.cantMaxPrioridad() > diaMaxPersonas){
                diaMaxPersonas = dia.cantMaxPrioridad();
                diaConMaxP = dia;
            }
        }
        System.out.printf("El %s fue el dia con mas Personas anotadas con Prioridad Maxima, con un total de %d personas\n", diaConMaxP.getFecha(), diaMaxPersonas);
    }

    public void promedioEdadPersonasSinOS(){
        for (Dia dia : dias) {
            System.out.printf("La edad promedio de las personas sin Obra Social es de %.2f %s\n",dia.promedioEdadPersonasSinOS(), "anios");
        }
    }

    @Override
    public String toString() {
        return "CentroTesteo{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
