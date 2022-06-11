package ar.edu.ort.clases;

/**
 * Ejercicio_8@author CKVillanueva el 6/7/2022 | 6:16 PM
 */
public class Vacunatorio {
    private ColaPersonas[] colaPersonas;
    private ColaPersonas retorno;

    public Vacunatorio() {
        this.colaPersonas = new ColaPersonas[3];
        inicializarColas();
    }

    private void inicializarColas() {
        for (int i = 0; i <3; i++) {
            colaPersonas[i] = new ColaPersonas();
        }
    }

    public void obtenerColaPorPrioridadYOrden() {
        PersonasOrdenadasXPriYOrdAsc lista = new PersonasOrdenadasXPriYOrdAsc();
        Persona persona;
        for (int i = 0; i < 3; i++) {
            int orden = 0;

            while (!colaPersonas[i].isEmpty()) {
                persona = colaPersonas[i].remove();
                persona.generarClave(orden);
                orden++;
                lista.add(persona);
            }

        }
        encolarPorPriYOrd(lista);
    }

    private void encolarPorPriYOrd(PersonasOrdenadasXPriYOrdAsc lista) {
        retorno = new ColaPersonas();

        for (Persona persona : lista) {
            retorno.add(persona);
        }
    }

    public void imprimirCola() {
        retorno.add(null);
        Persona persona = retorno.remove();
        while (persona != null) {
            System.out.println(persona);
            retorno.add(persona);
            persona = retorno.remove();
        }
    }

    public void agregarPersonas(int col, Persona persona) {
        colaPersonas[col].add(persona);
    }
}
