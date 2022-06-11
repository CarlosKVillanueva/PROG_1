package ar.edu.ort.clases;

import java.util.ArrayList;

public class ExamenMoto extends Examen {

	private static final int CILINMAX = 150;
	public static final int CORTE_CILINDRADA_MAX = 0;
	public static final int TIEMPO_CILINDRADA_MAX = Integer.MAX_VALUE;
	public static final int CORTE_CILINDRADA_MIN = 1;
	public static final int TIEMPO_CILINDRA_MIN = 2;
	private boolean todosEspejos;
	private ArrayList<Circuito> circuitos;
	
	
	public ExamenMoto(String fecha, String patente, String marca, int cilindrada, Persona personita,
			boolean todosEspejos) {
		super(fecha, patente, marca, cilindrada, personita);
		this.todosEspejos = todosEspejos;
		this.circuitos = new ArrayList<>();
		
	}
	
	@Override
	public boolean aprobo() {
		boolean resultado = false;
		if (super.getCilindrada() > CILINMAX) {
			resultado = aproboCircuitos(CORTE_CILINDRADA_MAX, TIEMPO_CILINDRADA_MAX);
		} else {
			resultado = aproboCircuitos(CORTE_CILINDRADA_MIN, TIEMPO_CILINDRA_MIN);
		}
		
		return resultado;
	}


	private boolean aproboCircuitos(int corte, int tiempo) {
		int i = 0, acumTiempo = 0, contadorCorte  = 0;
		
		while  (i < circuitos.size() && contadorCorte <= corte &&  acumTiempo < tiempo) {
			acumTiempo += circuitos.get(i).getTiempo();
			if (!circuitos.get(i).aprobo()) {
				contadorCorte++;
			} 
			i++;
		}
		return contadorCorte < corte && acumTiempo < tiempo;
	}

	@Override
	public String toString() {
		return "ExamenMoto [todosEspejos=" + todosEspejos + ", listaCircuitos=" + circuitos + "]";
	}

	public void rellenarLista(Circuito perdona) {
		circuitos.add(perdona);
		}

}
