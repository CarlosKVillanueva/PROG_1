package ar.edu.ort.clases;

public class Cabina {
    private long id;
    private MedioPago mp ;

    private static final double RECARGO_PICO = 1.08;
    private static final int COTA_MAX1 = 10;
    private static final int COTA_MAX2 = 20;
    private static final int COTA_MIN = 6;
    private static final int COTA_MIN2 = 17;

    public Cabina(long id, MedioPago mp) {
        this.id = id;
        this.mp = mp;
    }

    public double cobrar(Vehiculo vehiculo) {
        double tarifa = vehiculo.getTarifa();

        if (esHoraPico(Estacion.getHoraActual())){
            tarifa *= RECARGO_PICO;
        }
        tarifa *= mp.obtenerDescuento();
        return tarifa;
    }

    public boolean esEfectivo() {
        return this.mp instanceof Efectivo;
    }



    private boolean esHoraPico(int hora) {
        return (hora >= COTA_MIN && hora <= COTA_MAX1) || (hora >= COTA_MIN2 && hora <= COTA_MAX2);
    }


    public int demora() {

        return ((PagoElectronico) mp).getDiasDemora();
    }
}
