package ar.edu.ort.clases;

import java.util.ArrayList;

/**
 * PROG1_TP3_Ejercicio_13 @author CKVillanueva el 4/22/2022 | 4:49 PM
 */
public class Pedido {
    private Mesa mesa;
    private Mozo mozo;
    private Cocinero cocinero;
    private ArrayList<ItemPedido> items;
    private FormaPago formaPago;

    public Pedido(Mesa mesa, Mozo mozo, Cocinero cocinero, ArrayList<ItemPedido> items, FormaPago formaPago) {
        this.mesa = mesa;
        this.mozo = mozo;
        this.cocinero = cocinero;
        this.items = items;
        this.formaPago = formaPago;
    }

    public boolean aCargoDeCocinero(String legajo) {
        return this.cocinero.mismoLegajo(legajo);
    }

}
