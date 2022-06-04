package ar.edu.ort;

import ar.edu.ort.clases.Documento;
import ar.edu.ort.clases.Impresora;

/**
 * Ejercicio_3@author CKVillanueva el 6/4/2022 | 10:38 AM
 */
public class Main_Ejercicio_3 {
    public static void main(String[] args) {
        Impresora impresora = new Impresora(50, true);
        Documento documento = new Documento(10, true);
        Documento documento2 = new Documento(10, false);
        Documento documento3 = new Documento(10, false);


        impresora.agregarDocumento(documento);
        impresora.agregarDocumento(documento2);
        impresora.agregarDocumento(documento3);

        impresora.imprimir();
    }
}
