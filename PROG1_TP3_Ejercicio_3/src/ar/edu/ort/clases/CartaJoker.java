package ar.edu.ort.clases;

public class CartaJoker extends Carta {
    private boolean color;

    public CartaJoker(boolean color) {
        this.color = color;
    }

    @Override
    public String mostrarCarta() {
        return color ? "Joker de Color" : "Joker Blanco y Negro";
    }
}
