package ar.edu.ort.clases;

/**
 * Ejercicio_5 @author CKVillanueva el 5/14/2022 | 12:28 PM
 */
public class Camion {
    private int id;
    private double costoPorKm;

    public Camion(int id, double costoPorKm) {
        this.id = id;
        this.costoPorKm = costoPorKm;
    }


    public int getId() {
        return id;
    }

    public double getCostoPorKm() {
        return costoPorKm;
    }

    public boolean mismoId(int id) {
        return this.id == id;
    }
    @Override
    public String toString() {
        return "Camion{" +
                "id=" + id +
                ", costoPorKm=" + costoPorKm +
                '}';
    }

}
