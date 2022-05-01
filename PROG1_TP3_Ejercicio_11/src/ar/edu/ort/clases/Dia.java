package ar.edu.ort.clases;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * TPROG1_TP3_Ejercicio_11 @author CKVillanueva el 4/16/2022 | 10:07 AM
 */

public class Dia {
    private static final String MENSAJE_FIN_TEST = "No hay cupos para hoy";
    private static final double CERO_PORCIENTO = 0;
    private static final double CIEN_PORCIENTO = 100;
    private String fecha;
    private boolean habil;
    private ArrayList<Notificable> personas;

    public Dia(String fecha, boolean habil) {
        this.fecha = fecha;
        this.habil = habil;
        this.personas = new ArrayList<>();
        generarPersonas();
    }
    public String getFecha() {
        return this.fecha;
    }

    private void generarPersonas() {
        int randCant = (int) (Math.floor(Math.random() * (150 - 40 + 1)) + 40);

        for (int i = 0; i < randCant; i++) {
            int randEdad = (int) (Math.floor(Math.random() * (90 - 18 + 1)) + 18);
            int randOS = (int) (Math.floor(Math.random() * (2 - 1 + 1)) + 1);
            switch (randOS) {
                case 1 -> personas.add(new Persona("000" + i, "Nombre " + i, randEdad, randMotivo()));
                case 2 -> personas.add(new PersonaConOS("000" + i, "Nombre " + i, randEdad, randMotivo(),"OS","OS_0000" + i));
            }

        }
        /*
        List<Persona> personasOrdenadas = personas.stream()
                                                    .sorted(Comparator.comparing(Persona::getPrioridad))
                                                    .collect(Collectors.toList());

        personasOrdenadas.forEach(System.out::println);
        */
        ordenarListaPersonas();
    }

    private void ordenarListaPersonas() {
        personas.sort((p1, p2) -> {
            int orden = 0;
            if (p1.getPrioridad() > p2.getPrioridad()) {
                orden = 1;
            } else if (p2.getPrioridad() > p1.getPrioridad()) {
                orden = -1;
            }
            return orden;
        });
    }

    /**
     * ORDENA LA LISTA CON UN COMPARATOR, ARRIBA REALIZAD CON UN EXPRESION LAMBDA
    private void ordenarListaPersonas() {
        personas.sort(new Comparator<>() {
            //@Override
            public int compare(Persona p1, Persona p2) {
                int orden = 0;
                if (p1.getPrioridad() > p2.getPrioridad()) {
                    orden = 1;
                } else if (p2.getPrioridad() > p1.getPrioridad()) {
                    orden = -1;
                }
                return orden;
            }
        });
    }
    */

    private Motivo randMotivo() {
        int randMotivo = (int) (Math.floor(Math.random() * (3 - 1 + 1)) + 1);
        Motivo motivo = null;

        switch (randMotivo) {
            case 1 -> motivo = Motivo.VIAJE;
            case 2 -> motivo = Motivo.REPETICION_X_ERROR;
            case 3 -> motivo = Motivo.CONTACTO_ESTRECHO;
        }
        return motivo;
    }

    public double revisar(int MAX_TEST_DIARIOS) {
        double sinLugar = personas.size() - MAX_TEST_DIARIOS;
        double personasANotadas = personas.size();

        for (int i = MAX_TEST_DIARIOS; i < personasANotadas; i++) {
            this.personas.get(i).notificar(MENSAJE_FIN_TEST);
        }

        return personasANotadas < MAX_TEST_DIARIOS ? CERO_PORCIENTO : ((sinLugar / personasANotadas) * CIEN_PORCIENTO) ;
    }

    public int cantMaxPrioridad() {
        int cont = 0;
        for (Notificable persona : personas) {
            if (persona.esDeRiesgo()) {
                cont++;
            }
        }
        return cont;
    }

    public double promedioEdadPersonasSinOS() {
        int acumEdad = 0, cont = 0;
        for (Notificable persona : personas) {
            if (!(persona instanceof PersonaConOS)) {
                acumEdad += persona.getEdad();
                cont++;
            }
        }
        return (double) acumEdad / cont;
    }

    @Override
    public String toString() {
        return "Dia{" +
                "fecha='" + fecha + '\'' +
                ", habil=" + habil +
                ", personas=" + personas +
                '}';
    }
}
