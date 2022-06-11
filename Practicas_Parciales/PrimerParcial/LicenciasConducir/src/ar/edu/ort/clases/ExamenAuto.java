package ar.edu.ort.clases;

public class ExamenAuto extends Examen {

	private  final int TIEMPO_MAX = 90;
	private int cantPuertas;
	private Circuito circuito;

	public ExamenAuto(String fecha, String patente, String marca, int cilindrada, Persona personita, int cantPuertas,
			Circuito unCircuito) {
		super(fecha, patente, marca, cilindrada, personita);
		this.cantPuertas = cantPuertas;
		this.circuito = unCircuito;
	}

	public int obtenerTiempo() {

		return circuito.getTiempo();
	}

	@Override
	public boolean aprobo() {

		return circuito.aprobo() && circuito.getTiempo() < TIEMPO_MAX;
	}

	@Override
	public String toString() {
		return "ExamenAuto [cantPuertas=" + cantPuertas + ", unCircuito=" + circuito + "]";
	}
	

}
