package ar.edu.ort.clases;

/**
 * DragonBall@author CKVillanueva el 6/10/2022 | 3:38 PM
 */
public abstract class Extraterrestre extends Personaje {
    protected static final int MULT_ALIADOS = 10;
    protected static final int CORTE_EXTRAS = 500;

    private int cantAliados;

    public Extraterrestre(int ki, int cantAliados) {
        super(ki);
        this.cantAliados = cantAliados;
    }

    protected int getCantAliados() {
        return cantAliados;
    }

    public int sumarKi(){
        return getKi() > CORTE_EXTRAS ? getKiEspecifico() + (this.cantAliados * MULT_ALIADOS) : getKiEspecifico();
    }

    public abstract int getKiEspecifico();
}
