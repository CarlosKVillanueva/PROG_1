package ar.edu.ort.clases;

/**
 * Ejercicio_2 @author CKVillanueva el 5/7/2022 | 8:15 PM
 */
public class Baraja {
    public static final int CARTA_MAXIMA = 12;
    Carta[] baraja;

    public Baraja() {
        baraja = new Carta[48];
        generarBaraja();
    }

    private void generarBaraja() {
        int cont = 0;
        for (Palo palo : Palo.values()) {
            for (int i = 0; i < CARTA_MAXIMA; i++) {
                baraja[cont] = new Carta(i + 1, palo.getPalo());
                cont++;
            }
        }

    }

    public boolean estaOrdenada(Baraja barajaAChequear) {
        int i = 0;
        boolean mismaCarta = false;
        while (i < baraja.length && !mismaCarta) {
            mismaCarta = esMismaCarta(barajaAChequear, i);
            i++;
        }
        return mismaCarta;
    }

    private boolean esMismaCarta(Baraja barajaAChequear, int i) {
        return baraja[i].getNumero() == barajaAChequear.baraja[i].getNumero() && baraja[i].getPaloEmoji().equals(barajaAChequear.baraja[i].getPaloEmoji());
    }


    public void mostrarBaraja() {
        for (Carta carta : baraja) {
            System.out.println(carta);
        }
    }
}
