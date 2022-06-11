package ar.edu.ort.clases;

/**
 * DragonBall@author CKVillanueva el 6/10/2022 | 3:39 PM
 */
public class Saiyajin extends Extraterrestre{
    private static final int INCREMENTO_SAIYAJIN = 200;
    private static final int MULT_OOZARU = 10;
    private boolean modoOozaru;

    public Saiyajin(int ki, int cantAliados, boolean modoOozaru) {
        super(ki, cantAliados);
        this.modoOozaru = modoOozaru;
    }


    @Override
    public int getKiEspecifico() {
        return modoOozaru ? INCREMENTO_SAIYAJIN * MULT_OOZARU : INCREMENTO_SAIYAJIN;
    }
}
