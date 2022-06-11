package ar.edu.ort.clases;

/**
 * TodoLibre@author CKVillanueva el 6/10/2022 | 10:23 PM
 */
public class Empresa {
    private static final int CANT_COMUNAS = 15;
    private String nombre;
    private ColaOrdenes colaOrdenes;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.colaOrdenes = new ColaOrdenes();
    }


    public int[][] cantEnviosEntreComunas() {
        int[][] resultado = new int[CANT_COMUNAS- 1][CANT_COMUNAS-1];
        colaOrdenes.add(null);
        Orden orden = colaOrdenes.remove();
        int posEnvio = 0;
        int posEntrega = 0;

        while (orden != null) {
            posEnvio = orden.getOrigen();
            posEntrega = getPosEntrega(orden, posEntrega);
            resultado[posEnvio][posEntrega]++;
                colaOrdenes.add(orden);
                orden = colaOrdenes.remove();
        }
        return resultado;
    }


    private int getPosEntrega(Orden orden, int posEntrega) {
        if (orden instanceof OrdePaP) {
            posEntrega = orden.informar();
        } else if (orden instanceof OrdenASucursal) {
            posEntrega = orden.informar();
        }
        return posEntrega;
    }

    public OrdenesGratisPorMontoDesc ordenesPuertaPuertaGratisPorMonto() {
        OrdenesGratisPorMontoDesc lista0 = new OrdenesGratisPorMontoDesc();
        colaOrdenes.add(null);
        Orden orden = colaOrdenes.remove();
        while (orden != null) {
            lista0.add(orden);
            colaOrdenes.add(orden);
            orden = colaOrdenes.remove();
        }
        return lista0;
    }


}
