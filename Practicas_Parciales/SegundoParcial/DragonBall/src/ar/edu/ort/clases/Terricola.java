package ar.edu.ort.clases;

/**
 * DragonBall@author CKVillanueva el 6/10/2022 | 3:36 PM
 */
public class Terricola extends Personaje {

    private static final int INCREMENTO_TERRICOLA = 200;

    public Terricola(int ki) {
        super(ki);
    }

    @Override
    public int sumarKi() {
        return INCREMENTO_TERRICOLA;
    }


    /*@Override
    public String toString() {
        return String.format("%s",super.toString());
    }*/
}
