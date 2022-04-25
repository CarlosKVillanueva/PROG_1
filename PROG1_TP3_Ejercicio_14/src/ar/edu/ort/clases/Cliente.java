package ar.edu.ort.clases;

/**
 * PROG1_TP3_Ejercicio_14 @author CKVillanueva el 4/24/2022 | 11:22 PM
 */
public class Cliente implements Notificable {
    private String apellido;
    private String nombre;
    private String telefono;
    private String email;

    public Cliente(String apellido, String nombre, String telefono, String email) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }

    @Override
    public void notificar(String mensaje) {
        System.out.printf("He recibido un SMS en mi teléfono %s con el mensaje: %s\n", telefono, mensaje);
    }
}
