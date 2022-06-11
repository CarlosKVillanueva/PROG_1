package ar.edu.ort;

import ar.edu.ort.clases.Academia;
import ar.edu.ort.clases.Curso;
import ar.edu.ort.clases.Nivel;
import java.util.Arrays;
import java.util.Random;

/**
 * Ejercicio_7@author CKVillanueva el 6/5/2022 | 8:10 PM
 */
public class MainEjercicio_7 {
    public static void main(String[] args) {
        Academia academia = new Academia();
        Curso curso1 = new Curso("PR1", "Programacion 1", 6, Nivel.AVANZADO);
        Curso curso2 = new Curso("TPR", "Taller Programacion 1", 6,Nivel.AVANZADO);
        Curso curso3 = new Curso("PNT1", "Programacion en NT 1", 6,Nivel.BASICO);
        Curso curso4 = new Curso("BD1", "Base de Datos 1", 6,Nivel.INTERMEDIO);
        Curso curso5 = new Curso("ASO1", "Sistemas Operativos 1", 6,Nivel.BASICO);
        Curso curso6 = new Curso("SAD", "Sistemas dministrativos", 6,Nivel.BASICO);

        academia.agregarCursos(curso1);
        academia.agregarCursos(curso2);
        academia.agregarCursos(curso3);
        academia.agregarCursos(curso4);
        academia.agregarCursos(curso5);
        academia.agregarCursos(curso6);

        obtenerEstadisticas(academia, null);
        obtenerEstadisticas(academia, "");
        obtenerEstadisticas(academia, "PNT1");

        academia.listadoDeCursosPorNivel();

        try {
            System.out.println(Arrays.toString(academia.mostrarTop5PorCurso("PR1")));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println();
    }

    private static void obtenerEstadisticas(Academia academia, String codigo) {
        try {
            academia.obtenerEstadistica(codigo);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
