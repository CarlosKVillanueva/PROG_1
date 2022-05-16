package ar.edu.ort;

import ar.edu.ort.clases.Comision;
import java.util.Arrays;

/**
 * Ejercicio_7 @author CKVillanueva el 5/16/2022 | 8:03 AM
 */
public class Main_Ejercicio_7 {
    public static void main(String[] args) {
        Comision comision = new Comision("A47", 9);
        comision.mostrarApellidosAptos();
        System.out.println();
        System.out.println(comision.obtenerLlegadasTarde());
        System.out.println(comision.diasConAsistenciaPerfecta());
        System.out.println(Arrays.toString(comision.porcentajePresentismo()));
        comision.mostrarDesertores();
    }
}
