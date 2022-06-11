package ar.edu.ort.clases;

/**
 * TodoLibre@author CKVillanueva el 6/10/2022 | 10:28 PM
 */
public class Usuario {
    private int nroUsuario;
    private String dni;
    private String nombre;
    private Domicilio domicilio;

    public int getComuna() {
        return this.domicilio.getNroComuna();
    }
}
