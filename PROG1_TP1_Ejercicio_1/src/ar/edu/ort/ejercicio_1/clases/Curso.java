package ar.edu.ort.ejercicio_1.clases;

import java.util.ArrayList;

public class Curso {
    private static final int MAX_BECADOS = 5;
    private int id;
    private String titulo;
    private double precio;
    private int valoracion;
    private ArrayList<Leccion> lecciones;
    private Usuario autor;
    private ArrayList<Usuario> usuariosCurso;
    private int cantBecados = 0;

    public Curso(int id, String titulo, double precio, int valoracion, Usuario autor) {
        this.id = id;
        this.titulo = titulo;
        this.precio = precio;
        this.valoracion = valoracion;
        this.autor = autor;
        this.lecciones = new ArrayList<>();
        this.usuariosCurso = new ArrayList<>();
    }

    public Resultado inscribir(Usuario usuario) {
        Resultado resultado = Resultado.ES_AUTOR;

        if (!this.autor.equals(usuario)) {
            resultado = incribirNoAutor(usuario);
        }

        return resultado;
    }

    private Resultado incribirNoAutor(Usuario usuario) {
        Resultado resultado = Resultado.YA_SUBSCRIPTO;
        Usuario usuarioBuscado = buscarUsuario(usuario);

        if (usuarioBuscado == null) {
            if (hayLugarParaBecado()) {
                usuariosCurso.add(usuario);
                resultado = Resultado.SUBSCRIPTO_OK;
                if (usuario.chequearBeca()) {
                    cantBecados++;
                }
            } else {
                resultado = Resultado.MAX_BECADOS;
            }
        }
        return resultado;
    }

    private boolean hayLugarParaBecado() {
        return cantBecados < MAX_BECADOS;
    }

    private Usuario buscarUsuario(Usuario usuario) {
        Usuario elementoBuscado = null;
        int i = 0, cantElementos = usuariosCurso.size();

        while (i < cantElementos && elementoBuscado == null) {
            if (usuariosCurso.get(i).mismoUsuario(usuario)) {
                elementoBuscado = usuariosCurso.get(i);
            } else {
                i++;
            }
        }
        return elementoBuscado;
    }

    public boolean mismoCurso(int idCurso) {
        return this.id == idCurso;
    }

    @Override
    public String toString() {
        return "Curso [autor=" + autor + ", id=" + id + ", lecciones=" + lecciones + ", precio=" + precio + ", titulo="
                + titulo + ", usuariosCurso=" + usuariosCurso + ", valoracion=" + valoracion + "]";
    }

}
