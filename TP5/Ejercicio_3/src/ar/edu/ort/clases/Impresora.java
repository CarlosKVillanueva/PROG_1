package ar.edu.ort.clases;

import ar.edu.ort.tdas.implementaciones.ColaNodos;
import ar.edu.ort.tdas.interfaces.Cola;

/**
 * Ejercicio_3@author CKVillanueva el 6/4/2022 | 10:38 AM
 */
public class Impresora {
    private int hojas;
    private boolean encendida;
    private Cola<Documento> documentoCola;

    public Impresora(int hojas, boolean encendida) {
        this.hojas = hojas;
        this.encendida = encendida;
        this.documentoCola = new ColaNodos<>();
    }

    public void agregarDocumento(Documento documento) {
        documentoCola.add(documento);
    }

    public void imprimir() {
        if (encendida && hayHojasSuficientes()) {
            Documento doc;

            documentoCola.add(null);
            doc = documentoCola.remove();
            while (doc != null) {
                imprimirDocumento(doc);
                documentoCola.add(doc);
                doc = documentoCola.remove();
            }
        } else
            System.out.println("Agregue mas hojas para imprimir");
    }

    private void imprimirDocumento(Documento documento) {
        System.out.println(documento + "\tHojas Requeridas: " + documento.getHojas());
    }

    private boolean hayHojasSuficientes() {
        Documento centinela = null, documento;
        int acum = 0;
        documentoCola.add(centinela);
        documento = documentoCola.remove();
        while (documento != centinela) {
            acum += documento.getHojas();
            documentoCola.add(documento);
            documento = documentoCola.remove();
        }
        return this.hojas > acum;
    }
}
