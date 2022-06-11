package ar.edu.ort;

import ar.edu.ort.clases.FabricaProducto;
import java.util.Arrays;

/**
 * FabricaProductos@author CKVillanueva el 6/10/2022 | 9:34 AM
 */
public class Main_Ejercicio_FabricaProductos {
    public static void main(String[] args) {

        FabricaProducto fabricaProducto = new FabricaProducto();
        System.out.println("Cant Km: " + fabricaProducto.promedioKmsHastaMantenimiento());;
        fabricaProducto.obtenerResultadosEvaluacion();
        System.out.println(Arrays.deepToString(fabricaProducto.obtenerCantPorProdPorEstado()));
    }
}
