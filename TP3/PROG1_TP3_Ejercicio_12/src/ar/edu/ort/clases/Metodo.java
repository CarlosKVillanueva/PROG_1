package ar.edu.ort.clases;

/**
 * PROG1_TP3_Ejercicio_12 @author CKVillanueva el 4/16/2022 | 7:16 PM
 */
public class Metodo implements Calificable {
    public static final double CINCO = 5, UNO = 1, TRES = 3, VEINTE = 20;
    private String nombre;
    private int cantParametros;
    private int cantRamificaciones;
    private int cantInstrucciones;

    public Metodo(String nombre, int cantParametros, int cantRamificaciones, int cantInstrucciones) {
        this.nombre = nombre;
        this.cantParametros = cantParametros;
        this.cantRamificaciones = cantRamificaciones;
        this.cantInstrucciones = cantInstrucciones;
    }

    @Override
    public double indiceCalidad() {
        return (CINCO / (cantParametros + UNO)) +  VEINTE / cantInstrucciones +  TRES / (cantRamificaciones + UNO);
    }

    public boolean mismoMetodo(String nombre) {
        return this.nombre.equals(nombre);
    }

    public void mostrarDetalles() {
        System.out.printf("""
                Metodo: %s
                Parametros: %d
                Instrucciones: %d
                Ramificaciones: %d
                Indice de Calidad: %.2f
                """, nombre,cantParametros,cantInstrucciones,cantRamificaciones,indiceCalidad());
    }
}
