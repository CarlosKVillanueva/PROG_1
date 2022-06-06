package ar.edu.ort.clases;

import java.util.Random;

/**
 * Ejercicio_7@author CKVillanueva el 6/5/2022 | 8:12 PM
 */
public class Curso {
    private static final int CINCO_MAYORES = 5;
    private String codigo;
    private String titulo;
    private Nivel nivel;
    private int horasDuracion;
    private AlumnosOrdenadosXMayorEdadDesc alumnosXEdadDesc;

    public Curso(String codigo, String titulo, int horasDuracion, Nivel nivel) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.nivel = nivel;
        this.horasDuracion = horasDuracion;
        this.alumnosXEdadDesc = new AlumnosOrdenadosXMayorEdadDesc();
        generarAlumnos();
    }

    private void generarAlumnos() {
        int randCant = new Random().nextInt(10, 20);
        for (int i = 0; i < randCant; i++) {
            alumnosXEdadDesc.add(new Alumno("DNI_"+i,"Nombre_"+i,new Random().nextInt(18, 41)));
        }
    }

    public Alumno[] top5AlumnosMasLongevos() {
        Alumno[] masLongevos = new Alumno[CINCO_MAYORES];
        int i = 0;
        while (i < masLongevos.length && !alumnosXEdadDesc.isEmpty()) {
            masLongevos[i] = alumnosXEdadDesc.get(i);
            i++;
        }
        return masLongevos;
    }

    public double getPromEdad() {
        double acum = 0;
        for (Alumno alumno : alumnosXEdadDesc) {
            acum += alumno.getEdad();
        }
        return (alumnosXEdadDesc.size() > 0) ? acum / alumnosXEdadDesc.size() : 0;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getNivel() {
        return this.nivel.ordinal();
    }
}
