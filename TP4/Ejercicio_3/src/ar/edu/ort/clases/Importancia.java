package ar.edu.ort.clases;

/**
 * Ejercicio_3 @author CKVillanueva el 5/7/2022 | 10:39 PM
 */
public enum Importancia {
    TITULAR(11, "Titular"),
    SUPLENTE(7, "Suplente"),
    RESERVA(5, "Reserva"),
    ;

    private int cant;
    private String importancia;

    Importancia(int cant, String importancia) {
        this.cant = cant;
        this.importancia = importancia;
    }

    public int getCant() {
        return cant;
    }

    public String getImportancia() {
        return importancia;
    }
}
