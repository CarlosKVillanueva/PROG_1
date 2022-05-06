package ar.edu.ort;

import ar.edu.ort.clases.*;

public class Main {

    public static void main(String[] args) {
        Barco depor1 = new Deportivo("123", 10, 2012, "Kaio", 200, 8, 200, 1);
        Barco depor2 = new Deportivo("123", 12, 2012, "Anto", 200, 8, 300, 1);
        Barco depor3 = new Deportivo("123", 13, 2012, "Facu", 200, 8, 400, 1);
        Barco deporL1 = new DeportivoLujo("123", 8, 2012, "KaioLujo", 250, 12, 1000, 1);
        Barco deporL2 = new DeportivoLujo("123", 15, 2012, "AntoLujo", 250, 12, 700, 1);
        Barco deporL3= new DeportivoLujo("123", 6, 2012, "FacuLujo", 250, 12, 800, 1);


        Puerto puerto = new Puerto("Coso");
        puerto.agregarAmarras(new Amarra(1, new Coordenada("40", "50")), depor1);
        puerto.agregarAmarras(new Amarra(2, new Coordenada("40", "50")), depor2);
        puerto.agregarAmarras(new Amarra(3, new Coordenada("40", "50")), depor3);
        puerto.agregarAmarras(new Amarra(4, new Coordenada("40", "50")), deporL1);
        puerto.agregarAmarras(new Amarra(5, new Coordenada("40", "50")), deporL2);
        puerto.agregarAmarras(new Amarra(6, new Coordenada("40", "50")), deporL3);

        System.out.println(puerto.barcosConAlquilerMayorA(4500));
        System.out.println(puerto.barcoConMayorConsumo());
    }
}
