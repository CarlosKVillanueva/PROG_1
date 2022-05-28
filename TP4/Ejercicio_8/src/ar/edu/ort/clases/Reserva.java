package ar.edu.ort.clases;

public class Reserva {

    private String id;
    private int numeroAsiento;
    private String dniCliente;


    public Reserva(String id, String dniCliente, int numeroAsiento) {

        this.id = id;
        this.numeroAsiento = numeroAsiento;
        this.dniCliente = dniCliente;
    }

    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "id='" + id + '\'' +
                ", numeroAsiento=" + numeroAsiento +
                ", dniCliente='" + dniCliente + '\'' +
                '}';
    }
}
