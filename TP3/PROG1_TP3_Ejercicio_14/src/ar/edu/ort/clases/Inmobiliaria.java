package ar.edu.ort.clases;

import java.util.ArrayList;

/**
 * PROG1_TP3_Ejercicio_14 @author CKVillanueva el 4/24/2022 | 11:24 PM
 */
public class Inmobiliaria implements Notificable {

    private String nombre;
    private String email;
    private double porcentajeComision;
    private ArrayList<Inmueble> inmuebles;

    public Inmobiliaria(String nombre, String email, double porcentajeComision) {
        this.nombre = nombre;
        this.email = email;
        this.porcentajeComision = porcentajeComision;
        this.inmuebles = new ArrayList<>();
    }

    @Override
    public void notificar(String mensaje) {
        System.out.printf("Hemos recibido un mail a nuestra casilla %s con el mensaje: %s\n", email, mensaje);
    }
}
