package ar.edu.ort.clases;


public class Asiento {

    private int numero;
    private Estado estado;


    public Asiento(int numero, Estado estado) {
        this.numero = numero;
        this.estado = estado;
    }

    public boolean estaLibre() {
        return this.estado.equals(Estado.LIBRE);
    }

    public void reservar() {
        this.estado = Estado.RESERVADO;
    }

    @Override
    public String toString() {
        return "Asiento{" +
                "numero=" + numero +
                ", estado=" + estado +
                '}';
    }
}
