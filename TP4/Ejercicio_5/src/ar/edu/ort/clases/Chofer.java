package ar.edu.ort.clases;

/**
 * Ejercicio_5 @author CKVillanueva el 5/14/2022 | 12:29 PM
 */
public class Chofer {
    private String id;
    private String nombre;
    private double costoPorViaje;

    public Chofer(String id, String nombre, double costoPorViaje) {
        this.id = id;
        this.nombre = nombre;
        this.costoPorViaje = costoPorViaje;
    }

    public double getCostoPorViaje() {
        return costoPorViaje;
    }

    public String getId() {
        return id;
    }

    public boolean mismoId(String id) {
        return this.id.equals(id);
    }

    @Override
    public String toString() {
        return "Chofer{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", costoPorViaje=" + costoPorViaje +
                '}';
    }


}
