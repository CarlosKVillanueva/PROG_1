package ar.edu.ort.clases;

/**
 * Ejercicio_5 @author CKVillanueva el 5/14/2022 | 12:30 PM
 */
public class Viaje {
    private int idCamion;
    private String idChofer;
    private double kmViaje;

    public Viaje(int idCamion, String idChofer, double kmViaje) {
        this.idCamion = idCamion;
        this.idChofer = idChofer;
        this.kmViaje = kmViaje;
    }

    @Override
    public String toString() {
        return "Viaje{" +
                "idCamion=" + idCamion +
                ", idChofer='" + idChofer + '\'' +
                ", kmViaje=" + kmViaje +
                '}';
    }

    public int getIdCamion() {
        return idCamion;
    }

    public String getIdChofer() {
        return idChofer;
    }

    public double getKmViaje() {
        return kmViaje;
    }


    public boolean mismoCamionChofer(int id, String idChofer) {
        return this.idCamion == id && this.idChofer.equals(idChofer);
    }
}

