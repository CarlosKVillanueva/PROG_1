package ar.edu.ort.clases;

/**
 * PROG1_TP3_Ejercicio_10 @author CKVillanueva el 15/04/2022 | 12:27
 */
public class ServicioReparacion extends Servicio {

    private final static int DIFICULTAD_ALTA = 3;
    private final double ADICIONAL_DIFICULTAD = 1.25;
    private final double VALOR_HORA = 180;
    private int dificultad;

    public boolean dificultadBaja() {
        return dificultad < DIFICULTAD_ALTA;
    }

    public ServicioReparacion(int cantHorasService, int dificultad) {
        super(cantHorasService);
        this.dificultad = dificultad;
    }

    @Override
    public double calcularFacturacion() {
        return (dificultad >= DIFICULTAD_ALTA) ? (super.getCantHorasService() * VALOR_HORA) * ADICIONAL_DIFICULTAD
                : super.getCantHorasService() * VALOR_HORA;
    }


}
