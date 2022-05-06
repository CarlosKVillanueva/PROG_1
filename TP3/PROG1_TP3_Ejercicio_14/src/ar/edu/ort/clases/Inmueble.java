package ar.edu.ort.clases;

import java.util.ArrayList;

/**
 * PROG1_TP3_Ejercicio_14 @author CKVillanueva el 4/24/2022 | 11:19 PM
 */
public class Inmueble {
    private String domicilio;
    private int superficieEnM2;
    private int cantAmb;
    private double precio;
    private ArrayList<Notificable> interesados;

    public Inmueble(String domicilio, int superficieEnM2, int cantAmb, double precio) {
        this.domicilio = domicilio;
        this.superficieEnM2 = superficieEnM2;
        this.cantAmb = cantAmb;
        this.precio = precio;
        this.interesados = new ArrayList<>();
    }

    public void agregarInteresados(Notificable notificable) {
        interesados.add(notificable);
    }

    public void setPrecio(double nuevoMonto) {
        String mensaje = armarMensaje(this.precio, nuevoMonto);
        this.precio = nuevoMonto;
        for (Notificable interesado : interesados) {
            interesado.notificar(mensaje);
        }
    }

    private String armarMensaje(double precio, double nuevoMonto) {
        return String.format("El inmueble %s por el que ha demostrado interés cambió su precio de $%.2f a $%.2f", mostrar(), precio, nuevoMonto);
    }

    private String mostrar() {
        return String.format("Domicilio: %s, Superficie en M2: %dm2, Cantidad de Ambientes: %d,", domicilio, superficieEnM2, cantAmb);
    }

}
