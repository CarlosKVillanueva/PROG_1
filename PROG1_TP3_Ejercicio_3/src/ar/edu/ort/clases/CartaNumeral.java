package ar.edu.ort.clases;

public class CartaNumeral extends CartaConPalo{
    private int numero;

    public CartaNumeral(int numero, Palo palo) {
        super(palo);
        this.numero = numero;
    }

    @Override
    public String mostrarCarta() {
        return String.format("%d\t%s",this.numero, super.getPalo().getEmoji());
    }
}
