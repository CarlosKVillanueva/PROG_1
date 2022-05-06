package ar.edu.ort.clases;

/**
 * PROG1_TP3_Ejercicio_9
 *
 * @author CKVillanueva el 4/10/2022 | 6:54 PM
 */
public class Coordenada {
    private String Latitud;
    private String Longitud;

    public Coordenada(String latitud, String longitud) {
        Latitud = latitud;
        Longitud = longitud;
    }

    @Override
    public String toString() {
        return "Coordenada{" +
                "Latitud='" + Latitud + '\'' +
                ", Longitud='" + Longitud + '\'' +
                '}';
    }
}
