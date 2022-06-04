package ar.edu.ort;

import ar.edu.ort.clases.CicloCharlas;
import ar.edu.ort.clases.Espectador;
import java.time.LocalDate;

/**
 * Ejercicio_10@author CKVillanueva el 5/27/2022 | 6:40 PM
 */
public class Main_Ejercicio_10 {
    public static void main(String[] args) {
        String[] peliculas = {"Harry Potter 1", "Harry Potter 2", "Harry Potter 3", "Harry Potter 4", "Harry Potter 5"};
        LocalDate localDate = LocalDate.of(2022, 4, 28);
        CicloCharlas cicloCharlas = new CicloCharlas("Visitantes", peliculas, localDate, 50);
        Espectador espectador = new Espectador("Kaio", 5);

        cicloCharlas.registrarEspectadorEnCharla(espectador, 5);
        cicloCharlas.registrarEspectadorEnCharla(new Espectador("Anto", 1), 1);
        cicloCharlas.registrarEspectadorEnCharla(new Espectador("Facu", 2), 2);
        cicloCharlas.registrarEspectadorEnCharla(new Espectador("Sherman", 2), 2);
        cicloCharlas.mostrarCicloCharlas();
    }
}
