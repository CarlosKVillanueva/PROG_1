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

    public Pedido pedidoConMasBebidas(FormaPago formaPago) {
        Pedido pedidoMaxBeb = null;
        int maxBedidas = -1;
        for (Pedido pedido : pedidos) {
            if (pedido.mismaFormaP(formaPago)) {
                int cant = pedido.getCantBebidas();
                if (cant > maxBedidas) {
                    maxBedidas = cant;
                    pedidoMaxBeb = pedido;
                }
            }
        }
        return pedidoMaxBeb;
    }

    public void pedidosPorCocinero(String legajo) {
        for (Pedido pedido : pedidos) {
            if (pedido.aCargoDeCocinero(legajo)) {
                pedido.mostrarPedido();
            }
        }
    }

    public double liberarMesa(int nroMesa) {
        double importe = -1;
        Pedido pedidoBuscado = buscarPedido(nroMesa);
        if (pedidoBuscado != null) {
            if (pedidoBuscado.pagoEfectivo()) {
                importe = pedidoBuscado.getImporteConDescuento();
            } else {
                importe = pedidoBuscado.getImporteSinDescuento();
            }
            pedidoBuscado.liberarMesa();
        }

        return importe;
    }

    public Pedido buscarPedido(int nroMesa) {
        int i = 0, cantidadElementos = pedidos.size();
        Pedido elementoBuscado = null;

        while (i < cantidadElementos && elementoBuscado == null) {
            Pedido elemento = pedidos.get(i);
            if (elemento.mismoPedido(nroMesa)) {
                elementoBuscado = elemento;
            } else {
                i++;
            }
        }
        return elementoBuscado;
    }
}