package ar.edu.ort;

import ar.edu.ort.clases.Bicicleta;
import ar.edu.ort.clases.BicicletaElectrica;
import ar.edu.ort.clases.Taller;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Bicicleta bici1 = new Bicicleta("Moun", "Scott", 1050);
        Bicicleta bici2 = new Bicicleta("Moun2", "Scott", 2500);
        Bicicleta bici3 = new Bicicleta("Moun3", "Scott", 800);
        Bicicleta bici4 = new Bicicleta("Moun4", "Scott", 1200);

        Bicicleta bici5 = new BicicletaElectrica("Moun4", "Scott", 1200, 220);
        Bicicleta bici6 = new BicicletaElectrica("Moun4", "Scott", 2000, 380);
        Bicicleta bici7 = new BicicletaElectrica("Moun4", "Scott", 300, 220);
        Bicicleta bici8 = new BicicletaElectrica("Moun4", "Scott", 300, 250);

        ArrayList<Bicicleta> bicicletas = new ArrayList<>();
        bicicletas.add(bici1);
        bicicletas.add(bici2);
        bicicletas.add(bici3);
        bicicletas.add(bici4);
        bicicletas.add(bici5);
        bicicletas.add(bici6);
        bicicletas.add(bici7);
        bicicletas.add(bici8);

        Taller taller = new Taller("Pepe");
        System.out.println(taller.cantServiciosPosibles(bicicletas));
    }
}
