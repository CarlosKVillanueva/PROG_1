package ar.edu.ort.clases;

/**
 * PROG1_TP3_Ejercicio_13 @author CKVillanueva el 4/22/2022 | 4:54 PM
 */
public class Mesa {
    private int numero;
    private int cantPersonas;
    private boolean estaLibre;

    public Mesa(int numero, int cantPersonas, boolean estaLibre) {
        this.numero = numero;
        setCantPersonas(cantPersonas);
        setEstaLibre(estaLibre);
    }

    private void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    private void setEstaLibre(boolean estaLibre) {
        this.estaLibre = estaLibre;
    }

    public int getNroMesa() {
        return numero;
    }

    public void liberar() {
        setCantPersonas(0);
        setEstaLibre(true);
    }
}
