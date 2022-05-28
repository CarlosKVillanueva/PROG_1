package ar.edu.ort.clases;

import ar.edu.ort.tdas.implementaciones.*;
import ar.edu.ort.tdas.interfaces.*;

public class Tubo {
	private Pila<Pelota> pelotas;

	public Tubo() {
		pelotas = new PilaNodos<>();
	}

	public Tubo(int cantidadDeElementos) {
		pelotas = new PilaNodos<>(cantidadDeElementos);
	}

	public boolean estaLleno() {
		return pelotas.isFull();
	}

	public boolean estaVacio() {
		return pelotas.isEmpty();
	}

	public Pelota extraer() {
		return pelotas.pop();
	}

	public void guardar(Pelota pelota) {
		pelotas.push(pelota);
	}


}
