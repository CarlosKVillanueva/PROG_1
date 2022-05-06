package ar.edu.ort.clases;

/**
 * TPROG1_TP3_Ejercicio_11 @author CKVillanueva el 4/16/2022 | 10:10 AM
 */
public interface Notificable {
    void notificar(String mensaje);

    boolean esDeRiesgo();

    int getEdad();

    int getPrioridad();
}
