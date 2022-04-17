package ar.edu.ort.clases;

import java.util.ArrayList;

/**
 * PROG1_TP3_Ejercicio_12 @author CKVillanueva el 4/16/2022 | 7:15 PM
 */
public class FuenteProgramacion extends Fuente{
    public static final int ZERO = 0;
    private TipoLenguaje tipo;
    private ArrayList<Metodo> metodos;

    public FuenteProgramacion(String nombre, String path, TipoLenguaje tipo) {
        super(nombre, path);
        this.tipo = tipo;
        this.metodos = new ArrayList<>();
    }

    public Metodo buscarMetodo(String nombre) {
        int i = 0, cantidadElementos = metodos.size();
        Metodo elementoBuscado = null;
    
        while (i < cantidadElementos && elementoBuscado == null) {
            Metodo elemento = metodos.get(i);
            if (elemento.mismoMetodo(nombre)) {
                elementoBuscado = elemento;
            } else {
                i++;
            }
        }
        return elementoBuscado;
    }
   
    @Override
    public double indiceCalidad() {
        return calcularPromedioMetodos();
    }

    private double calcularPromedioMetodos() {
        double acumMetodo = ZERO;
        for (Metodo metodo : metodos) {
            acumMetodo += metodo.indiceCalidad();
        }
        return (metodos.size() != ZERO) ? acumMetodo / metodos.size() : ZERO;
    }
}
