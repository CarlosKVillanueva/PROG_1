package ar.edu.ort.clases;

/**
 * PROG1_TP3_Ejercicio_10 @author CKVillanueva el 15/04/2022 | 12:21
 */
public abstract class Servicio implements Facturable {
    private static final double IVA = 1.15;
    private int cantHorasService;

    public Servicio(int cantHorasService) {
        this.cantHorasService = cantHorasService;
    }

    public int getCantHorasService() {
        return cantHorasService;
    }

    @Override
    public double facturacionConIva() {
        return calcularFacturacion() * IVA;
    }
}
