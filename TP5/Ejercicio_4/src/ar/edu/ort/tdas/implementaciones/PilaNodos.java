package ar.edu.ort.tdas.implementaciones;

import ar.edu.ort.tdas.interfaces.Pila;

public class PilaNodos<T> extends TdaNodos<T> implements Pila<T> {

	public PilaNodos() {
		super();
	}

	public PilaNodos(int tope) {
		super(tope);
	}


	/**
	 * Retorna el primer elemento en la Pila, pero no lo saca de la misma
	 * @return
	 */
	@Override
	public T peek() {
		checkEmptiness();
		return first.getElement();
	}

	@Override
	public T pop() {
		checkEmptiness();
		Nodo<T> aux = first;
		first = first.next();
		decrementSize();
		return aux.getElement();
	}

	@Override
	public void push(T elemento) {
		checkFullness();
		Nodo<T> nuevoNodo = new Nodo<>(elemento);
		nuevoNodo.next(first);
		first = nuevoNodo;
		incrementSize();
	}
	
	@Override
	public int size() {
		throw new RuntimeException("Forbiden!");
	}
}