package ar.edu.ort.ejercicio_1.clases;

public class Usuario {
    private int id;
    private String nombre;
    private String mail;
    private boolean becado;
    private boolean autor;

    public Usuario(int id, String nombre, String mail, boolean becado) {
        this.id = id;
        this.nombre = nombre;
        this.mail = mail;
        this.becado = becado;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Usuario [becado=" + becado + ", id=" + id + ", mail=" + mail + ", nombre=" + nombre + "]";
    }

    public boolean mismoUsuario(Usuario usuario) {
        return this.equals(usuario);
    }

    public boolean esAutor() {
        return autor;
    }

    public boolean mismoUsuario(int idUser) {
        return this.id == idUser;
    }

    public boolean chequearBeca() {
        return becado;
    }

}
