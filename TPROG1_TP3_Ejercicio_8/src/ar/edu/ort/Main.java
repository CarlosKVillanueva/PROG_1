package ar.edu.ort;

import ar.edu.ort.clases.*;

public class Main {

    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo("ABC123", Categoria.AUTO);
        Vehiculo v2 = new Vehiculo("CBG678", Categoria.CAMION);
        Vehiculo v3 = new Vehiculo("ABC123", Categoria.MOTO);


        Cabina efectivo = new Cabina(1234, new Efectivo("Efectivo"));
        Cabina sube = new Cabina(5678, new Sube("Sube"));
        Cabina pase = new Cabina(5678, new Pase("Pase"));

        Estacion e = new Estacion(74268726, "TuVieja");
        e.agregarCabinas(efectivo);
        e.agregarCabinas(sube);
        e.agregarCabinas(pase);


        System.out.println(efectivo.cobrar(v1));
        System.out.println(efectivo.cobrar(v2));
        System.out.println(efectivo.cobrar(v3));

        System.out.println(sube.cobrar(v1));
        System.out.println(sube.cobrar(v2));
        System.out.println(sube.cobrar(v3));

        System.out.println(pase.cobrar(v1));
        System.out.println(pase.cobrar(v2));
        System.out.println(pase.cobrar(v3));

        System.out.println(e.cabinasConEfectivo());

        System.out.println(e.promedioDemora());



    }
}
