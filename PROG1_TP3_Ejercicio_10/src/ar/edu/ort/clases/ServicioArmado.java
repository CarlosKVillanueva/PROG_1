package ar.edu.ort.clases;

/**
 * PROG1_TP3_Ejercicio_10 @author CKVillanueva el 15/04/2022 | 12:23
 */
public class ServicioArmado extends Servicio {

    private final double VALOR_HORA = 180;

    public ServicioArmado(int cantHorasService) {
        super(cantHorasService);
    }

    @Override
    public double calcularFacturacion() {
        return super.getCantHorasService() * VALOR_HORA;
    }




}
