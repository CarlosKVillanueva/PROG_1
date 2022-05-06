package ar.edu.ort.clases;

/**
 * PROG1_TP3_Ejercicio_13 @author CKVillanueva el 4/22/2022 | 5:06 PM
 */
public class Credito implements FormaPago {

    @Override
    public boolean tieneDescuento() {
        return false;
    }
}
