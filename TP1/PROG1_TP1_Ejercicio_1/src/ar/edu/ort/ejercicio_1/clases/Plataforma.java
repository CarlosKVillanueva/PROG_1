package ar.edu.ort.ejercicio_1.clases;

import java.util.ArrayList;

public class Plataforma {
    private String nombre;
    private ArrayList<Usuario> usuarios;
    private ArrayList<Categoria> categorias;

    public Plataforma(String nombre) {
        this.nombre = nombre;
        this.usuarios = new ArrayList<Usuario>();
        this.categorias = new ArrayList<Categoria>();
    }

    public Resultado suscribirseACurso(int idUser, int idCurso) {
        Resultado resultado = Resultado.USUARIO_INEXISTENTE;
        Usuario usuario = buscarUsuario(idUser);
        if (usuario != null) {
            resultado = inscribir(usuario, idCurso);
        }

        return resultado;
    }

    private Resultado inscribir(Usuario usuario, int idCurso) {
        Resultado resultado = Resultado.CURSO_INEXISTENTE;
        int i = 0;
        while (i < categorias.size() && resultado == Resultado.CURSO_INEXISTENTE) {
            resultado = categorias.get(i).inscribir(usuario, idCurso);
        }

        return resultado;
    }

    private Usuario buscarUsuario(int idUser) {
        Usuario elementoBuscado = null;
        int i = 0, cantElementos = usuarios.size();

        while (i < cantElementos && elementoBuscado == null) {
            if (usuarios.get(i).mismoUsuario(idUser)) {
                elementoBuscado = usuarios.get(i);
            } else {
                i++;
            }
        }
        return elementoBuscado;
    }

    @Override
    public String toString() {
        return "Plataforma [categorias=" + categorias + ", nombre=" + nombre + ", usuarios=" + usuarios + "]";
    }

}
