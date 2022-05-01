package ar.edu.ort.ejercicio_1.clases;

import java.util.ArrayList;

public class Categoria {
    private int id;
    private String nombre;
    private ArrayList<Curso> cursos;

    public Categoria(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.cursos = new ArrayList<Curso>();
    }

    public Resultado inscribir(Usuario usuario, int idCurso) {
        Resultado resultado = Resultado.CURSO_INEXISTENTE;
        Curso cursoBuscado = buscarCurso(idCurso);

        if (cursoBuscado != null) {
            resultado = cursoBuscado.inscribir(usuario);
        }

        return resultado;
    }

    private Curso buscarCurso(int idCurso) {
        Curso elementoBuscado = null;
        int i = 0, cantElementos = cursos.size();

        while (i < cantElementos && elementoBuscado == null) {
            if (cursos.get(i).mismoCurso(idCurso)) {
                elementoBuscado = cursos.get(i);
            } else {
                i++;
            }
        }
        return elementoBuscado;
    }

    @Override
    public String toString() {
        return "Categoria [cursos=" + cursos + ", id=" + id + ", nombre=" + nombre + "]";
    }

}
