package ar.edu.ort.clases;


import java.util.ArrayList;

public class BarajaInglesa {
    private static final int MAX_NUM = 10;
    private static final int MIN_NUM = 2;
    private ArrayList<Carta> cartas;

    public BarajaInglesa() {
        cartas = new ArrayList<>();
        generarCartas();
    }


    private void generarCartas() {
        Character[] figuras = {'J', 'Q', 'K', 'A'};
        Palo[] palos = Palo.values();
        for (Palo palo : palos) {

            for (int n = MIN_NUM; n <= MAX_NUM; n++) {
                cartas.add(new CartaNumeral(n, palo));
            }

            for (Character figura : figuras) {
                cartas.add(new CartaFigura(figura, palo));
            }

        }
        cartas.add(new CartaJoker(true));
        cartas.add(new CartaJoker(false));
    }

    public void mostrar(){
        for (Carta carta : cartas) {
            System.out.println(carta.mostrarCarta());
        }
    }
}
