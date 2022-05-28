package ar.edu.ort.clases;

import java.util.Random;

public class Pelota {

	public enum EstadoPelota {
		NUEVA, USADA, GASTADA
	}

	private static final int TOPE_USO = 7;

	private int usos;

	public Pelota() {
		double usosRand = Math.random();
		usos = (usosRand < 0.8) ? 0 : (usosRand > 0.8 && usosRand < 0.9) ? new Random().nextInt(1, 7) : new Random().nextInt(7, 10);
	}

	public int getUsos() {
		return usos;
	}

	public EstadoPelota getEstado() {
		return (usos == 0) ? EstadoPelota.NUEVA : (usos <= TOPE_USO) ? EstadoPelota.USADA : EstadoPelota.GASTADA;
	}

	@Override
	public String toString() {
		return "Pelota [usos=" + usos + ", estado=" + getEstado() + "]";
	}
}

