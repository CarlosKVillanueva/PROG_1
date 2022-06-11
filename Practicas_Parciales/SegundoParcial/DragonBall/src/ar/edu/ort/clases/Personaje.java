package ar.edu.ort.clases;

/**
 * DragonBall@author CKVillanueva el 6/10/2022 | 3:35 PM
 */
public abstract class Personaje {
    private int ki;

    public Personaje(int ki) {
        this.ki = ki;
    }

    protected int getKi() {
        return ki;
    }

    public void comer(){
        this.ki += sumarKi();
    }

    public abstract int sumarKi();

    @Override
    public String toString() {
        return String.format("%-20s %-10d",getClass().getSimpleName(),this.ki);
    }
}
