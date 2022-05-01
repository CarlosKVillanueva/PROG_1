package ar.edu.ort.clases;



public abstract class Examen implements Evaluable{
	private String fecha;
	private String patente;
	private String marca;
	private int cilindrada;
	private Persona persona;
	
	
	public Examen(String fecha, String patente, String marca, int cilindrada, Persona personita) {
		this.fecha = fecha;
		this.patente = patente;
		this.marca = marca;
		this.cilindrada = cilindrada;
		this.persona = personita;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void rellenar(Examen examen, Circuito c) {
		if (examen instanceof ExamenMoto) {
			((ExamenMoto) examen).rellenarLista(c);
		}
	}

	@Override
	public abstract boolean aprobo();


	@Override
	public String toString() {
		return "Examen [fecha=" + fecha + ", patente=" + patente + ", marca=" + marca + ", cilindrada=" + cilindrada
				+ ", personita=" + persona + "]";
	}
	
	









	
	
	
}
