package ar.edu.ort;

import ar.edu.ort.clases.*;

public class Main {

    public static void main(String[] args) {
        Figura circulo = new Circunferencia("Verde", 8);
        Figura rectangulo = new Rectangulo("Verde", 8, 6);
        Figura triangulo = new TrianguloEquilatero("Verde", 8);

        GrupoFiguras grupo = new GrupoFiguras();
        grupo.agregar(circulo);
        grupo.agregar(rectangulo);
        grupo.agregar(triangulo);

        grupo.mostrarInfo();
    }
}
