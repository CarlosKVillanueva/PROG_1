package ar.edu.ort.clases;

public class CartaFigura extends CartaConPalo{
    private char letra;


    public CartaFigura(char letra, Palo palo) {
        super(palo);
        this.letra = letra;
    }

    @Override
    public String mostrarCarta() {
        return String.format("%s\t%s",this.letra, super.getPalo().getEmoji());
    }
}
