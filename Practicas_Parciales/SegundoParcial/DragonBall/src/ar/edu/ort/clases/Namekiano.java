package ar.edu.ort.clases;

/**
 * DragonBall@author CKVillanueva el 6/10/2022 | 3:44 PM
 */
public class Namekiano extends Extraterrestre {

    public static final int INCREMENTO_NAMEK = 100;


    public Namekiano(int ki, int cantAliados) {
        super(ki, cantAliados);
    }

    @Override
    public int getKiEspecifico() {
        return getKi() > CORTE_EXTRAS ? INCREMENTO_NAMEK + (getCantAliados() * MULT_ALIADOS) : INCREMENTO_NAMEK;
    }

}
