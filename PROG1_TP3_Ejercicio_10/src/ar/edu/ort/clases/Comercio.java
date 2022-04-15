package ar.edu.ort.clases;

import java.util.ArrayList;

/**
 * PROG1_TP3_Ejercicio_10@author CKVillanueva el 15/04/2022 | 12:15
 */
public class Comercio {
    private String razonSocial;
    private ArrayList<Facturable> historial;

    public Comercio(String razonSocial) {
        this.razonSocial = razonSocial;
        this.historial = new ArrayList<>();
    }


    @Override
    public String toString() {
        return "Comercio{" +
                "razonSocial='" + razonSocial + '\'' +
                ", historial=" + historial +
                '}';
    }

    public void agregarOperacion(Facturable operacion) {
        historial.add(operacion);
    }

    public void mostrar() {
        double acumFacturacion = 0;
        for (Facturable f : historial) {
            acumFacturacion += f.facturacionConIva();
        }
        System.out.printf("La facturacion total es de : $%.2f", acumFacturacion );
    }
}
