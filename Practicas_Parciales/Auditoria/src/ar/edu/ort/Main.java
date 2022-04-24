package ar.edu.ort;

import ar.edu.ort.clases.Area;
import ar.edu.ort.clases.Compania;
import ar.edu.ort.clases.Empleado;

/**
 * ${PROJECT_NAME} @author CKVillanueva el ${DATE} | ${TIME}
 */
public class Main {
    public static void main(String[] args) {
        Area area1 = new Area("Area 51", 50, new Empleado("Kaio", "Villa", "18"));
        Area area2 = new Area("Area 69", 100, new Empleado("Facu", "Ali", "43"));

        Compania compania = new Compania("TuVi");
        compania.agregarArea(area1);
        compania.agregarArea(area2);

        System.out.printf("Observaciones Externas %d\n", compania.obtenerCantObservaciones());
        area1.mostrarObservacionesCriticas();
        area2.mostrarObservacionesCriticas();
        System.out.println(area1.obtenerObservacionesVencidas());
        System.out.println(area2.obtenerObservacionesVencidas());

    }
}