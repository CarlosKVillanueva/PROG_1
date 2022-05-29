package ar.edu.ort.clases;

import ar.edu.ort.tdas.implementaciones.*;
import ar.edu.ort.tdas.interfaces.*;

public class Tubo {
	private Pila<Pelota> pelotas;
	private int idTubo;
	private static int contador = 1;

	public Tubo() {
		pelotas = new PilaNodos<>();
		idTubo = contador++;
	}

	public int getIdTubo() {
		return idTubo;
	}
}
