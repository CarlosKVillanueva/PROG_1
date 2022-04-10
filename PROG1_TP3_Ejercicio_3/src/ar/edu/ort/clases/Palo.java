package ar.edu.ort.clases;

public enum Palo {
    DIAMANTE(Color.ROJO, "♦️"),
    CORAZON(Color.NEGRO,"❤️"),
    PICA(Color.NEGRO, "♠️"),
    TREBOL(Color.ROJO,"♣️");

    public Color getColor() {
        return color;
    }

    public String getEmoji() {
        return emoji;
    }

    private Color color;
    private String emoji;

    Palo(Color color, String emoji) {
        this.color = color;
        this.emoji = emoji;
    }
}
