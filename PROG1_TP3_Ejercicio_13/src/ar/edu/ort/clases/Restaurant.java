package ar.edu.ort.clases;

import java.util.ArrayList;

/**
 * PROG1_TP3_Ejercicio_13 @author CKVillanueva el 4/22/2022 | 4:12 PM
 */
public class Restaurant {
    private String nombre;
    private ArrayList<Empleado> empleados;
    private ArrayList<Pedido> pedidos;
    private ArrayList<Mesa> mesas;
    private Menu menu;

    public Restaurant(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
        this.pedidos = new ArrayList<>();
        this.mesas = new ArrayList<>();
    }

    public void pedidosPorCocinero(String legajo) {
        for (Pedido pedido : pedidos) {
            pedido.aCargoDeCocinero(legajo);
        }
    }
}
