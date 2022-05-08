package ar.edu.ort.clases;

/**
 * Ejercicio_2 @author CKVillanueva el 5/7/2022 | 8:15 PM
 */
public class Baraja {
    public static final int CARTA_MAXIMA = 12;
    Carta[] cartas;

    public Baraja() {
        cartas = new Carta[48];
        generarBaraja();
    }

    private void generarBaraja() {
        int cont = 0;
        for (Palo palo : Palo.values()) {
            for (int i = 0; i < CARTA_MAXIMA; i++) {
                cartas[cont] = new Carta(i + 1, palo.getPalo());
                cont++;
            }
        }

    }

    public boolean estaOrdenada(Baraja barajaAChequear) {
        int i = 0;
        boolean mismaCarta = true;
        while (i < cartas.length && mismaCarta) {
            mismaCarta = esMismaCarta(barajaAChequear, i);
            i++;
        }
        return mismaCarta;
    }

    private boolean esMismaCarta(Baraja barajaAChequear, int i) {
        return cartas[i].getNumero() == barajaAChequear.cartas[i].getNumero() && cartas[i].getPaloEmoji().equals(barajaAChequear.cartas[i].getPaloEmoji());
    }


    public void mostrarBaraja() {
        for (Carta carta : cartas) {
            System.out.println(carta);
        }
    }
}
