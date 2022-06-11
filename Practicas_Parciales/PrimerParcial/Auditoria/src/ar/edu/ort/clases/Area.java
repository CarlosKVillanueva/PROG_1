package ar.edu.ort.clases;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

/**
 * Auditoria @author CKVillanueva el 4/22/2022 | 8:14 PM
 */
public class Area {
    private static final int MINIMO_ACEPTABLE = 1;
    private String nombre;
    private int cantEmpleados;
    private ArrayList<Observacion> observaciones;
    private Empleado responsable;

    public Area(String nombre, int cantEmpleados, Empleado responsable) {
        this.nombre = nombre;
        this.cantEmpleados = cantEmpleados;
        this.responsable = responsable;
        this.observaciones = new ArrayList<>();
        generarObservaciones();
    }

    private void generarObservaciones() {
        Random random = new Random();
        Empleado auditor = new Empleado("Anto","Mico","8437");
        int cantObserv = (int) ( Math.random() * 20 + 10);

        for (int i = 0; i < cantObserv; i++) {
            int tipoObserv = (int) ( Math.random() * 2 + 1);
            int tipoAuditable = (int) ( Math.random() * 2 + 1);
            int randBooleanos = (int) ( Math.random() * 2 + 1);

            auditable(random, i, tipoAuditable);

            Observacion observacionInt = new ObservacionInterna("Titulo"+i,"Desc"+i, LocalDate.parse("2020-03-27"),auditable(random, i, tipoAuditable),auditor, (randBooleanos == 1));
            Observacion observacionExt = new ObservacionExterna("Titulo"+i,"Desc"+i, LocalDate.parse("2020-03-27"),auditable(random, i, tipoAuditable),auditor, "Consul"+i);
            switch (tipoObserv) {
                case 1 -> observaciones.add(observacionInt);
                case 2 -> observaciones.add(observacionExt);
            }
        }
    }

    private Auditable auditable(Random random, int i, int tipoAuditable) {
        Auditable instancia = null;
        int randBooleanos = (int) ( Math.random() * 2 + 1);
        switch (tipoAuditable) {
            case 1 -> instancia = new Proceso(i, (random.nextInt(10 - 4 + 1) + 4), (randBooleanos == 1), (randBooleanos == 1));
            case 2 -> instancia = new Sistema("Sistema" + i, (randBooleanos == 1), (random.nextInt(700 - 400 + 1) + 400));
        }
        return instancia;
    }

    public int obtenerCantObservacionesExternas() {
        int cantObservaciones = 0;
        for (Observacion observacion : observaciones) {
            if (observacion instanceof ObservacionExterna) {
                cantObservaciones++;
            }
        }
        return cantObservaciones;
    }

    public void mostrarObservacionesCriticas() {
        for (Observacion observacion : observaciones) {
            if (observacion.tieneCriticidadMayorA(MINIMO_ACEPTABLE)) {
                observacion.mostrar();
            }
        }
    }

    public ArrayList<Observacion> obtenerObservacionesVencidas(){
        ArrayList<Observacion> vencidas = new ArrayList<>();

        for (Observacion observacion : observaciones) {
            if (observacion.estaVencida()) {
                vencidas.add(observacion);
            }
        }
        return vencidas;
    }

    @Override
    public String toString() {
        return "Area{" +
                "nombre='" + nombre + '\'' +
                ", cantEmpleados=" + cantEmpleados +
                ", responsable=" + responsable +
                '}';
    }
}
