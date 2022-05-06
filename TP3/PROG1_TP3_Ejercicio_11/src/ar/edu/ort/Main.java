package ar.edu.ort;

import ar.edu.ort.clases.CentroTesteo;
import ar.edu.ort.clases.Dia;

/**
 * ${PROJECT_NAME} @author CKVillanueva el ${DATE} | ${TIME}
 */
public class Main {
    public static void main(String[] args) {
        Dia sabado16 = new Dia("16/04/2022", false);
        Dia domingo17 = new Dia("17/04/2022", false);
        Dia lunes18 = new Dia("18/04/2022", true);

        CentroTesteo detectar = new CentroTesteo("DetectAr 2.0");
        detectar.agregarDias(sabado16);
        detectar.agregarDias(domingo17);
        detectar.agregarDias(lunes18);

        System.out.printf("Porcentaje:%.2f%s",detectar.revisar(),"%\n");
        detectar.mostrarDiaConMasPrioritarios();
        detectar.promedioEdadPersonasSinOS();

    }
}