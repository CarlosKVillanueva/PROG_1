package ar.edu.ort.clases;

/**
 * Logistica@author CKVillanueva el 6/11/2022 | 1:37 PM
 */
public class Logistica {
    public static final int CHOFERES = 20;
    public static final int CAMIONES = 80;
    private Chofer[] staff;
    private Camion[] flota;
    private ColaViajes colaViajes;

    public Logistica() {
        this.staff = new Chofer[CHOFERES];
        this.flota = new Camion[CAMIONES];
        this.colaViajes = new ColaViajes();
    }

    public int cantViajesPorDestino(String destino) {
        int cont = 0;
        Viaje viaje = colaViajes.remove();
        colaViajes.add(null);
        while (viaje != null) {
            if (viaje.tienDestino(destino))
                cont++;

            colaViajes.add(viaje);
            viaje = colaViajes.remove();
        }
        return cont;
    }

    public int[][] cantidadDestinosPorCamionChofer() {
        int[][] destinos = new int[CAMIONES][CHOFERES];
        int posCamion, posChofer;

        colaViajes.add(null);
        Viaje viaje = colaViajes.remove();

        while (viaje != null) {
            posCamion = viaje.getIdCamion();
            posChofer = viaje.getIdChofer();
            destinos[posCamion][posChofer]++;
            colaViajes.add(viaje);
            viaje = colaViajes.remove();
        }
        return destinos;
    }

    public CamionesRenovarPorAntiguedadDesc renovarCamionesTranspLiquido() {
        CamionesRenovarPorAntiguedadDesc listaO = new CamionesRenovarPorAntiguedadDesc();
        for (Camion camion : flota) {
            if (camion instanceof CamionLiquidos && camion.esRenovable()) {
                listaO.add(camion);
            }
        }
        return listaO;
    }
}

