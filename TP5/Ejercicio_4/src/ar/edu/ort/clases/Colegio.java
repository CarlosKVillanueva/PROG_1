package ar.edu.ort.clases;

import ar.edu.ort.tdas.implementaciones.PilaNodos;

/**
 * Ejercicio_4@author CKVillanueva el 6/4/2022 | 11:30 AM
 */
public class Colegio {
    private static final int TOPE_PILAS = 5;
    private static final int CANT_PILAS = 3;
    private PilaNodos<Pelota>[] canasto;

    public Colegio() {
        canasto = new PilaNodos[3];
        generarPilas();
    }

    private void generarPilas() {
        for (int i = 0; i < 3; i++) {
            canasto[i] =  new PilaNodos<>(TOPE_PILAS);
        }
    }

    public void verPelotasEnTopes() {
        for (int i = 0; i < CANT_PILAS; i++) {
            System.out.println(canasto[i].peek());
        }
    }

    public boolean agregarPelota(Pelota pelota) {
        boolean seAgrego = false;
        int i = 0;
        while (i < canasto.length && !seAgrego) {
            if (!canasto[i].isFull()) {
                canasto[i].push(pelota);
                seAgrego = true;
            }
            i++;
        }
        return seAgrego;
    }
    
    public Pelota buscarPelota(int codigo) {
        int i = 0;
        Pelota pelotaBuscada = null;
    
        while (i < canasto.length && pelotaBuscada == null) {
            pelotaBuscada = buscarEnPila(canasto[i], codigo);
            i++;
        }

        return pelotaBuscada;
    }

    private Pelota buscarEnPila(PilaNodos<Pelota> pilaPelotas, int codigo) {
        Pelota p, pelotaBuscada = null;
        PilaNodos<Pelota> aux = new PilaNodos<>();
        while (!pilaPelotas.isEmpty()) {
            p = pilaPelotas.pop();
            if (p.mismoElemento(codigo)) {
                pelotaBuscada = p;
            }
            aux.push(p);
        }
        while (!aux.isEmpty()) {
            pilaPelotas.push(aux.pop());
        }
        return pelotaBuscada;
    }


    public int[] pelotasPorTipo() {

        int[] cantTipo = new int[TipoPelota.values().length];
        for (int i = 0; i < CANT_PILAS; i++) {
            contarTipo(canasto[i], cantTipo);
        }

        return cantTipo;
    }

    private void contarTipo(PilaNodos<Pelota> pilaPelotas, int[] cantTipo) {

        Pelota p;
        PilaNodos<Pelota> aux = new PilaNodos<>();

        while (!pilaPelotas.isEmpty()) {
            p = pilaPelotas.pop();
            switch (p.getTipoPelota()) {
                case FUTBOL -> cantTipo[TipoPelota.FUTBOL.ordinal()]++;
                case VOLEY -> cantTipo[TipoPelota.VOLEY.ordinal()]++;
                case BASKET -> cantTipo[TipoPelota.BASKET.ordinal()]++;
            }
            aux.push(p);
        }
        while (!aux.isEmpty()) {
            pilaPelotas.push(aux.pop());
        }
    }


}
