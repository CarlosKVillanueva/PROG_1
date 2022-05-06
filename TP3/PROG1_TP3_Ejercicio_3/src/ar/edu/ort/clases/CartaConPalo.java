package ar.edu.ort.clases;

public abstract class CartaConPalo extends Carta {
    private Palo palo;

    public CartaConPalo(Palo palo) {
        this.palo = palo;
    }

    protected Palo getPalo() {
        return this.palo;
    }
}
