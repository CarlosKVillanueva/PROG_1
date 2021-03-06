package ar.edu.ort.clases;

/**
 * PROG1_TP1_Ejercicio_2 @author CKVillanueva el 4/19/2022 | 4:17 PM
 */
public class Texto extends Archivo {
    private String codificacion;

    public Texto(String nombre, double peso, String localizacion, boolean abierto, String codificacion) {
        super(nombre, peso, localizacion, abierto);
        this.codificacion = codificacion;
    }

    public void cifrar() {
        System.out.println("Cifrando...");
    }

    @Override
    public String toString() {
        return "Texto [codificacion=" + super.toString() + codificacion + "]";
    }

}
