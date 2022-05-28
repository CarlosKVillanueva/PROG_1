package ar.edu.ort.clases;

import java.util.ArrayList;


public class Aerolinea {
    private String razonSocial;
    private ArrayList<Reserva> reservas;
    private Avion avion;

    public Aerolinea(String razonSocial, Avion avion) {
        this.razonSocial = razonSocial;
        this.reservas = new ArrayList<>();
        this.avion = avion;
        llenarReservas();
    }

    public void llenarReservas() {
        for (int i = 1; i < 60; i++) {
            reservas.add(new Reserva("ID" + i, "dni" + i, i));
        }
    }

    public void asignar() {
        for (Reserva reserva : reservas) {
            avion.reservarAsiento(reserva.getNumeroAsiento());
        }
    }

    public int asientosLibresConVentanilla() {
        return avion.asientosLibresConVentanilla();
    }

    public void mostrarCapacidad() {
        this.avion.mostrarAsientos();
    }

	@Override
	public String toString() {
		return "Aerolinea{" +
				"razonSocial='" + razonSocial + '\'' +
				", reservas=" + reservas +
				", avion=" + avion +
				'}';
	}
}
