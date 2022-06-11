package ar.edu.ort;

import ar.edu.ort.clases.*;
import java.util.Random;

/**
 * DragonBall@author CKVillanueva el 6/10/2022 | 4:47 PM
 */
public class Main_Ejercicio_DB {
    public static void main(String[] args) {
        Banquete banquete = new Banquete();

        agregarPJ(banquete);
        System.out.println("***---- LISTA PERSONAJES ----***");
        banquete.listar();
        banquete.alimentarPersonajes();
        System.out.println("***---- LISTA ALIMENTADOS ----***");
        banquete.listar();
        System.out.println("***---- MAS DEBILES ----***");
        banquete.listarCincoMasDebiles();

    }

    private static void agregarPJ(Banquete banquete) {
        for (int i = 0; i < 30; i++) {
            int randPersonaje = new Random().nextInt(0, 5);
            switch (randPersonaje) {
                case 0 -> banquete.agregarPersonaje(new Terricola(new Random().nextInt(1, 600)));
                case 1 -> banquete.agregarPersonaje(new Demonio(new Random().nextInt(1, 600), new Random().nextInt(1, 200)));
                case 2 -> banquete.agregarPersonaje(new Saiyajin(new Random().nextInt(1, 600), new Random().nextInt(1, 200), new Random().nextBoolean()));
                case 3 -> banquete.agregarPersonaje(new Namekiano(new Random().nextInt(1, 600), new Random().nextInt(1, 200)));
            }
        }
    }
}
