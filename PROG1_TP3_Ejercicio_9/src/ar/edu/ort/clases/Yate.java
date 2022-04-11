package ar.edu.ort.clases;

/**
 * PROG1_TP3_Ejercicio_9
 *
 * @author CKVillanueva el 4/10/2022 | 7:02 PM
 */
public class Yate extends Barco{
    private int cantCamarotes;

    public Yate(String matricula, int eslora, int anioFabricacion, String nombreDuenio, double valorBase, double valorAdicional, int cantCamarotes) {
        super(matricula, eslora, anioFabricacion, nombreDuenio, valorBase, valorAdicional);
        this.cantCamarotes = cantCamarotes;
    }

    @Override
    public double adicional() {
        return super.getValorAdicional() * cantCamarotes;
    }
}
