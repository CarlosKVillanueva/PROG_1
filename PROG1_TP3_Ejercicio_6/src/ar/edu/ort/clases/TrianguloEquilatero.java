package ar.edu.ort.clases;

/**
 * PROG1_TP3_Ejercicio_6
 *
 * @author CKVillanueva el 4/10/2022 | 11:58 AM
 */
public class TrianguloEquilatero extends Figura{
    private double lado;

    public TrianguloEquilatero(String color, double lado) {
        super(color);
        this.lado = lado;
    }

    @Override
    public double area() {
        return ((Math.pow(lado, 2)) * Math.sqrt(3)) / 4;
    }

    @Override
    public double perimetro() {
        return 3 * lado;
    }
}
