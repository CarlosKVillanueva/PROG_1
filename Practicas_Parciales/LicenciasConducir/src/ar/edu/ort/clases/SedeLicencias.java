package ar.edu.ort.clases;

import java.util.ArrayList;

public class SedeLicencias {

	private String nombreSistematico;
	private ArrayList<Examen> listaExamens;

	public SedeLicencias(String nombreSistematico) {

		this.nombreSistematico = nombreSistematico;
		this.listaExamens = new ArrayList<>();
	}

	public Informe obtenerInforme() {
		double contadorReprobados = 0,  acumTiempo = 0, conTiempo = 0;
		double porcentaje = 0, promTiempo = 0;

		for (Examen examen : listaExamens) {
			if (!examen.aprobo()) {
				contadorReprobados++;
			} else if (examen instanceof ExamenAuto) {
				acumTiempo += ((ExamenAuto) examen).obtenerTiempo();
				conTiempo++;
			}
			porcentaje = contadorReprobados / listaExamens.size() * 100;
			promTiempo = (conTiempo > 0) ? acumTiempo / conTiempo : 0;
		}
		System.out.println(contadorReprobados);
		System.out.println(acumTiempo);
		System.out.println(conTiempo);
		return new Informe(porcentaje, promTiempo);

	}
	
	public void rellernarExamen (Examen exa)  {
	listaExamens.add(exa);	
	}
	
	
	
}
