package ar.edu.ort.clases;

/**
 * @author CKVillanueva el 4/10/2022
 * @project PROG1_TP3_Ejercicio_6
 */
public abstract class Figura implements Mostrable{
    private String color;

    public Figura(String color) {
        this.color = color;
    }

    public abstract double area();
    public abstract double perimetro();

    @Override
    public void mostrar() {
        System.out.printf("La Figura es un %s, es de color %s, tiene un perimetro de %.2f y un area de %.2f\n", getClass().getSimpleName(), color, perimetro(), area());
    }
}
