package ar.edu.ort.clases;



public class Circuito  implements Evaluable{
	
	private  final int MIN_FALTAS = 2;
	private int tiempo;
	private int faltas;
	
	
	public Circuito(int tiempo, int faltas) {
		this.tiempo = tiempo;
		this.faltas = faltas;
	}


	@Override
	public String toString() {
		return "Circuito [tiempo=" + tiempo + ", faltas=" + faltas + "]";
	}


	public int getTiempo() {
		return tiempo;
	}


	public int getFaltas() {
		return faltas;
	}


	@Override
	public boolean aprobo() {
		return this.faltas <= MIN_FALTAS;
	}
	
	
	

	
	

}
