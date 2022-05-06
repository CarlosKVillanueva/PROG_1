package ar.edu.ort.clases;

import java.util.ArrayList;

/**
 * PROG1_TP3_Ejercicio_10 @author CKVillanueva el 15/04/2022 | 12:15
 */
public class Comercio {
    private String razonSocial;
    private ArrayList<Facturable> historial;

    public Comercio(String razonSocial) {
        this.razonSocial = razonSocial;
        this.historial = new ArrayList<>();
    }

    public void agregarOperacion(Facturable operacion) {
        historial.add(operacion);
    }

    public void montoIndivualFacturado() {
        System.out.println("Listado de Operaciones:\n");
        for (Facturable f : historial) {
            System.out.printf("%.2f\n", f.facturacionConIva());
        }
    }

    public double montoTotalFacturado() {
        double acumFacturacion = 0;
        for (Facturable f : historial) {
            acumFacturacion += f.facturacionConIva();
        }
        return acumFacturacion;
    }

    public int cantServiciosSimples(){
        int acumServicios = 0;
        for (Facturable f : historial) {
            if (f instanceof ServicioReparacion && ((ServicioReparacion) f).dificultadBaja()){
                acumServicios++;
            }
        }

        return acumServicios;
    }
}
