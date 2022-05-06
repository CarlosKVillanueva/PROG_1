package ar.edu.ort.clases;

/**
 * PROG1_TP3_Ejercicio_9
 * @author CKVillanueva el 4/10/2022 | 7:36 PM
 */
public class DeportivoLujo extends Deportivo{

    private static final double MULTIPLICADOR_LUJO = 2;

    public DeportivoLujo(String matricula, int eslora, int anioFabricacion, String nombreDuenio, double valorBase, double valorAdicional, int potencia, int cx) {
        super(matricula, eslora, anioFabricacion, nombreDuenio, valorBase, valorAdicional, potencia, cx);
    }

    public double calcularConsumo(){
        return MULTIPLICADOR_LUJO * super.getPotencia() ;
    }
}
