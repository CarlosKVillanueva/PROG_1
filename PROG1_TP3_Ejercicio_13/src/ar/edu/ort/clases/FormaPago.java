package ar.edu.ort.clases;

/**
 * PROG1_TP3_Ejercicio_13 @author CKVillanueva el 4/22/2022 | 4:59 PM
 */
public enum FormaPago {
    EFECTIVO(5), DEBITO(10), CREDITO(8);
    private final int descuento;


    private FormaPago(int descuento) {
        this.descuento = descuento;
    }

    public int getDescuentoFormaPago() {
        return descuento;
    }
}
