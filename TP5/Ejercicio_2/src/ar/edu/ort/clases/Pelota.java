package ar.edu.ort.clases;

import java.util.Random;

public class Pelota {
	private static final int USADA = 7;
	private EstadoPelota estado;
	private int usos;

	public enum EstadoPelota {
		NUEVA, USADA, GASTADA
	}

	public Pelota() {
		setUsos();
		setEstado();
	}

	public int getUsos() {
		return usos;
	}

	private void setUsos() {
		double usosRand = Math.random();
		this.usos = (usosRand < 0.8) ? 0 : (usosRand > 0.8 && usosRand < 0.9) ? new Random().nextInt(1, 7) : new Random().nextInt(7, 10);
	}

	public void setEstado() {
		this.estado = (usos == 0) ? EstadoPelota.NUEVA : (usos > 0 && usos <= USADA) ? EstadoPelota.USADA : EstadoPelota.GASTADA;
	}

	@Override
	public String toString() {
		return "Pelota [usos=" + usos + ", estado=" + estado + "]";
	}
}

