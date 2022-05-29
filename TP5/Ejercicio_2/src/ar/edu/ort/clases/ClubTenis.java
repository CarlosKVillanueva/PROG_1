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
        this.tubos = new ArrayList<>();
    }

    public void agregarTubos() {
        for (int i = 0; i < 50; i++) {
            Pila<Pelota> tubo = new PilaNodos<>(3);
            while (!tubo.isFull()) {
                tubo.push(new Pelota());
            }
            this.tubos.add(tubo);
        }
    }

    public void procesarPelotas() {
        this.usados = new ArrayList<>();
        int i = 0;

        while (i < this.tubos.size()) {
            if (esUsado(this.tubos.get(i))) {
                this.usados.add(this.tubos.remove(i));
            } else {
                i++;
            }
        }
    }

    public boolean esUsado(Pila<Pelota> tubo) {
        boolean usado = false;
        Pila<Pelota> aux = new PilaNodos<>();
        Pelota pelota;

        while (!tubo.isEmpty() && !usado) {
            pelota = tubo.pop();
            usado = pelota.getUsos() != 0;
            aux.push(pelota);
        }
        while (!aux.isEmpty()) {
            tubo.push(aux.pop());
        }

        return usado;
    }

    public void mostrarLista(String lista) {
        if (lista.equals("tubos")) {
            mostrar(this.tubos);
        } else if (lista.equals("usados")) {
            mostrar(this.usados);
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
