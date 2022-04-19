package ar.edu.ort;

import ar.edu.ort.clases.*;

/**
 * ${PROJECT_NAME} @author CKVillanueva el ${DATE} | ${TIME}
 */
public class Main {
    public static void main(String[] args) {
        Multimedia multi = new Multimedia("Times like these", 3056, "C:/", false, 300, false);

        multi.abrir();

        System.out.println(multi);
    }
}