package ar.edu.ort;

import ar.edu.ort.clases.Cliente;
import ar.edu.ort.clases.Inmobiliaria;
import ar.edu.ort.clases.Inmueble;

/**
 * ${PROJECT_NAME} @author CKVillanueva el ${DATE} | ${TIME}
 */
public class Main {
    public static void main(String[] args) {
        Inmueble inmueble = new Inmueble("Yatay 123", 200, 40, 4320.90);


        Cliente cliente = new Cliente("Mico", "QL", "1526", "entanga@entanga");
        Cliente cliente2 = new Cliente("Ali", "Facu", "6372", "entanga2@entanga2");
        Cliente cliente3 = new Cliente("Villa", "K", "5241", "entanga3@entanga3");
        Inmobiliaria inmobiliaria = new Inmobiliaria("Tuvi", "tuvi@entanga", 1.0);

        inmueble.agregarInteresados(cliente);
        inmueble.agregarInteresados(cliente2);
        inmueble.agregarInteresados(cliente3);
        inmueble.agregarInteresados(inmobiliaria);

        inmueble.setPrecio(7629.99);

    }
}