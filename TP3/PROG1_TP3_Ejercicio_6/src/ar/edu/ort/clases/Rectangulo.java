package ar.edu.ort.clases;

/**
 * PROG1_TP3_Ejercicio_6
 *
 * @author CKVillanueva el 4/10/2022 | 11:55 AM
 */
public class Rectangulo extends Figura{
    private double base;
    private double altura;

    public Rectangulo(String color, double base, double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return base * altura;
    }

    @Override
    public double perimetro() {
        return 2 * (base + altura);
    }
}
