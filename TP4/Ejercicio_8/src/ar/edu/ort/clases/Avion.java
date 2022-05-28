package ar.edu.ort.clases;

import java.util.Arrays;

public class Avion {

    private String marca;
    private Asiento[][] asientos;

    public Avion(String marca) {
        this.marca = marca;
        this.asientos = new Asiento[16][6];
        rellenarAsientos();
    }

    public void rellenarAsientos() {
        int cont = 0;
        for (int iFil = 0; iFil < asientos.length; iFil++) {
            for (int iCol = 0; iCol < asientos[iFil].length; iCol++) {
                cont++;
                asientos[iFil][iCol] = new Asiento(cont, (Math.random() > 0.5) ? Estado.LIBRE : Estado.RESERVADO);
            }
        }
    }

    public void reservarAsiento(int numAsiento) {
        int tamanioMatriz = asientos[0].length;
        int posCol = ((numAsiento % tamanioMatriz) == 0) ? (tamanioMatriz - 1) : ((numAsiento % tamanioMatriz) - 1);
        int posFil = ((numAsiento % tamanioMatriz) == 0) ? (numAsiento / tamanioMatriz) - 1 : numAsiento / tamanioMatriz;
        if (asientos[posFil][posCol].estaLibre()) {
            asientos[posFil][posCol].reservar();
        }
    }

    public int asientosLibresConVentanilla() {
        int ventLibre = 0;
        for (int iFil = 0; iFil < asientos.length; iFil++) {
            if (asientos[iFil][0].estaLibre()) {
                ventLibre++;
            }
            if (asientos[iFil][5].estaLibre()) {
                ventLibre++;
            }
        }
        return ventLibre;
    }

    public void mostrarAsientos() {
        for (int iFil = 0; iFil < asientos.length; iFil++) {
            for (int iCol = 0; iCol < asientos[iFil].length; iCol++) {
                System.out.println(asientos[iFil][iCol]);
            }
        }
    }


}
