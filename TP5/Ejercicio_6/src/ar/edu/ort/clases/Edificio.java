package ar.edu.ort.clases;

import ar.edu.ort.tdas.implementaciones.ColaNodos;
import ar.edu.ort.tdas.interfaces.*;

/**
 * Ejercicio_6@author CKVillanueva el 6/5/2022 | 12:06 PM
 */
public class Edificio {

    private ColaFacturas[] colaFacturas;


    public Edificio() {
        colaFacturas = new ColaFacturas[Servicio.values().length];
        llenarColas();
    }

    private void llenarColas() {
        for (int i = 0; i < Servicio.values().length; i++) {
            colaFacturas[i] = new ColaFacturas();
        }
    }

    public void comparar(Pila<Factura> facturaPila) {
        FacturasOrdenadasPorMesAscendente listaO = new FacturasOrdenadasPorMesAscendente();
        Factura factura;
        while (!facturaPila.isEmpty()) {
            factura = facturaPila.pop();
            listaO.add(factura);
        }
        separarPorServicio(listaO);
    }

    private void separarPorServicio(FacturasOrdenadasPorMesAscendente listaO) {
        int posVector;
        for (Factura factura : listaO) {
            posVector = factura.getServicio().ordinal();
            colaFacturas[posVector].add(factura);
        }
    }


    public double[] montoAAbonarPorTipo() {
        double[] montoServicio = new double[Servicio.values().length];
        for (int i = 0; i < colaFacturas.length; i++) {
            montoServicio[i] = calcularmontos(colaFacturas[i]);
        }
        return montoServicio;
    }

    private double calcularmontos(Cola<Factura> colaFactura) {
        double acum = 0;
        Factura factura;

        colaFactura.add(null);
        factura = colaFactura.remove();
        while (factura != null) {
            acum += factura.getMonto();
            colaFactura.add(factura);
            factura = colaFactura.remove();
        }
        return acum;
    }

    public void mostrarServicios() {
        for (int i = 0; i < Servicio.values().length; i++) {
            System.out.println(Servicio.values()[i]);
            imprimirCola(i);
        }
    }

    private void imprimirCola(int i) {
        Factura factura;
        colaFacturas[i].add(null);
        factura = colaFacturas[i].remove();
        while (factura != null) {
            System.out.println(factura);
            colaFacturas[i].add(factura);
            factura = colaFacturas[i].remove();
        }
    }
}
