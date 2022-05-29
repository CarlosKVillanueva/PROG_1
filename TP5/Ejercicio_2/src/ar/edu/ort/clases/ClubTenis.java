package ar.edu.ort.clases;

import ar.edu.ort.tdas.implementaciones.PilaNodos;
import ar.edu.ort.tdas.interfaces.Pila;
import java.util.ArrayList;

/**
 * Ejercicio_1@author CKVillanueva el 5/28/2022 | 2:35 PM
 */
public class ClubTenis {
    private ArrayList<Pila<Pelota>> tubos;
    private ArrayList<Pila<Pelota>> usados;

    public ClubTenis() {
        tubos = new ArrayList<>();
    }

    public void agregarTubos() {
        for (int i = 0; i < 50; i++) {
            Pila<Pelota> tubo = new PilaNodos<>(3);
            while (!tubo.isFull()) {
                tubo.push(new Pelota());
            }
            tubos.add(tubo);
        }
    }

    public void procesarPelotas() {
        usados = new ArrayList<>();
        int i = 0;

        while (i < tubos.size()) {
            if (esUsado(tubos.get(i))) {
                this.usados.add(tubos.remove(i));
            }
            i++;
        }
    }

    public boolean esUsado(Pila<Pelota> tubo) {
        boolean usado = false;
        Pila<Pelota> aux = new PilaNodos<>();
        Pelota pelota;

        while (!tubo.isEmpty()) {
            pelota = tubo.pop();
            usado = pelota.getUsos() > 0;
            aux.push(pelota);
        }
        while (!aux.isEmpty()) {
            tubo.push(aux.pop());
        }

        return usado;
    }

    public void mostrarLista(String lista) {
        if (lista.equals("tubos")) {
            mostrar(tubos);
        } else if (lista.equals("usados")) {
            mostrar(usados);
        } else
            System.out.println("Lista incorrecta");
    }

    public void mostrar(ArrayList<Pila<Pelota>> lista) {
        System.out.println("Tubos en buen Estado: " + lista.size());
        for (Pila<Pelota> tubo : lista) {
            System.out.println("Tubo: ");
            mostrarPelotas(tubo);
        }
    }

    private void mostrarPelotas(Pila<Pelota> tubo) {
        Pila<Pelota> aux = new PilaNodos<>();
        Pelota pelota;

        while (!tubo.isEmpty()) {
            pelota = tubo.pop();
            System.out.println(pelota);
            aux.push(pelota);
        }
        while (!aux.isEmpty()) {
            tubo.push(aux.pop());
        }
    }
}
