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

    public boolean mismaFormaP(FormaPago formaPago) {
        return this.formaPago == formaPago;
    }

    public int getCantBebidas() {
        int acumBebidas = 0;
        for (ItemPedido item : items) {
            acumBebidas += item.cantBebidas();
        }
        return acumBebidas;
    }

    public void mostrarPedido() {
        System.out.printf("Cocinero: %s\nMesa: %s\nMozo: %s\nItems Pedidos: %s\nFormaPago: %s\n", cocinero,mesa,mozo,items,formaPago);
    }

    public boolean mismoPedido(int nroMesa) {
        return this.mesa.getNroMesa() == nroMesa;
    }

    public double getImporteConDescuento() {
        double importe = 0;
        for (ItemPedido item : items) {
            importe += item.getImporteConDescuento();
        }
        return importe;
    }

    public boolean pagoEfectivo() {
        return this.formaPago == FormaPago.EFECTIVO;
    }

    public double getImporteSinDescuento() {
        double importe = 0;
        for (ItemPedido item : items) {
            importe += item.getImporte();
        }
        return importe;
    }

    public void liberarMesa() {
        this.mesa.liberar();
    }
}
