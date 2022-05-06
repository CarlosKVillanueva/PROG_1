package ar.edu.ort.clases;

import java.util.ArrayList;

/**
 * PROG1_TP3_Ejercicio_12 @author CKVillanueva el 4/16/2022 | 7:12 PM
 */
public class Programa implements Calificable{
    public static final int ZERO = 0;
    private String id;
    private String nombre;
    private String responsable;
    private boolean pasoPrueba;
    private ArrayList<Fuente> fuentes;

    public Programa(String id, String nombre, String responsable, boolean pasoPrueba) {
        this.id = id;
        this.nombre = nombre;
        this.responsable = responsable;
        this.pasoPrueba = pasoPrueba;
        this.fuentes = new ArrayList<>();
    }

    public void mostrarDetallesDeMetodo(String nombreMetodo) {
        Metodo metodoBuscado = buscarMetodo(nombreMetodo);
        if (metodoBuscado != null) {
            metodoBuscado.mostrarDetalles();
        } else {
            System.out.printf("El metodo %s no fue encontrado", nombreMetodo);
        }
    }

    private Metodo buscarMetodo(String nombreMetodo) {
        int i = ZERO;
        Metodo metodoEncontrado = null;
        while (i < fuentes.size() && metodoEncontrado == null){
            Fuente fuente = this.fuentes.get(i);
            if (fuente instanceof FuenteProgramacion) {
                metodoEncontrado = ((FuenteProgramacion)fuente).buscarMetodo(nombreMetodo);
            }
            i++;
        }
        return metodoEncontrado;
    }

    @Override
    public double indiceCalidad() {
        return pasoPrueba ? PromediadorCalidad.promedioIndiceCalidad(fuentes) : ZERO;
    }
    /*

        private double calcularPromedioFuentes(){
            double acumFuentes = ZERO;
            for (Fuente fuente : fuentes) {
                acumFuentes += fuente.indiceCalidad();
            }
            return (fuentes.size() > ZERO) ? (acumFuentes / fuentes.size()) : ZERO;
        }
    */

    public ArrayList<Fuente> listadoFuentesMayoresAlPromedio() {
        ArrayList<Fuente> fuentesSuperiores = new ArrayList<>();

        for (Fuente fuente : fuentes) {
            if (fuente.indiceCalidad() > PromediadorCalidad.promedioIndiceCalidad(fuentes)) {
                fuentesSuperiores.add(fuente);
            }
        }

        return fuentesSuperiores;
    }

}
