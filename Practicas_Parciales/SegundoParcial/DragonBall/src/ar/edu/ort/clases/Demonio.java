package ar.edu.ort.clases;

/**
 * DragonBall@author CKVillanueva el 6/10/2022 | 3:36 PM
 */
public class Demonio extends Personaje {
    private static final int INCREMENTO_DEMONIO = 200;
    private static final int MULT_VICTIMAS = 10;
    private int cantVictimas;

    public Demonio(int ki, int cantVictimas) {
        super(ki);
        this.cantVictimas = cantVictimas;
    }


    @Override
    public int sumarKi() {
        return INCREMENTO_DEMONIO + (this.cantVictimas * MULT_VICTIMAS);
    }
}
