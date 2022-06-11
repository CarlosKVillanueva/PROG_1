package ar.edu.ort;

import ar.edu.ort.clases.*;

/**
 * ${PROJECT_NAME} @author CKVillanueva el ${DATE} | ${TIME}
 */
public class Main {
    public static void main(String[] args) {
        SedeLicencias sede = new SedeLicencias("Licencias 2022");
        Persona p1 = new Persona("1", "kai", "villa");
        Persona p2 = new Persona("1", "kai", "novilla");
        Persona p3 = new Persona("1", "kai", "mediovilla");
        Persona p4 = new Persona("1", "anto", "mica");
        Persona p5 = new Persona("1", "anto", "mica2");
        Persona p6 = new Persona("1", "facu", "vezona");
        Persona p7 = new Persona("1", "facu", "ali");
        Circuito c1 = new Circuito(91, 0); //NO
        Circuito c2 = new Circuito(89, 2); //SI
        Circuito c3 = new Circuito(20, 0); //SI
        Circuito c4 = new Circuito(0, 10); //NO
        Circuito c5 = new Circuito(1, 0);  //SI
        Circuito c6 = new Circuito(91, 0); //NO
        Examen examen1 = new ExamenAuto("1", "p1", "m1", 1, p1, 4, c1);
        Examen examen2 = new ExamenAuto("2", "p2", "m2", 1, p2, 4, c2);
        Examen examen3 = new ExamenAuto("3", "p3", "m3", 1, p3, 4, c3);
        Examen examen4 = new ExamenAuto("4", "p4", "m4", 1, p1, 4, c4);
        Examen examen5 = new ExamenAuto("4", "p4", "m4", 1, p1, 4, c5);
        Examen examenMoto= new ExamenMoto("fechita", "1234", "motito", 151, p7, false);

        sede.rellernarExamen(examen1);
        sede.rellernarExamen(examen2);
        sede.rellernarExamen(examen3);
        sede.rellernarExamen(examen4);
        sede.rellernarExamen(examen5);
        sede.rellernarExamen(examenMoto);

        examenMoto.rellenar(examenMoto,c5);
        examenMoto.rellenar(examenMoto,c2);
        examenMoto.rellenar(examenMoto,c6);

        System.out.println(sede.obtenerInforme());
    }
}