package ar.edu.ort.clases;

public class Informe {
	
	private double porcentajeReprobados;
	private double promedio;
	
	
	public Informe(double porcentajeReprobados, double promedio) {
	
		this.porcentajeReprobados = porcentajeReprobados;
		this.promedio = promedio;
	}


	public Informe(int porcentajeReprobados2, int promedio2) {
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Informe [porcentajeReprobados=" + porcentajeReprobados + ", promedio=" + promedio + "]";
	}
	
	
	

}
