package ar.edu.ort.clases;

/**
 * DragonBall@author CKVillanueva el 6/10/2022 | 4:19 PM
 */
public class Banquete {
    private ColaPersonajes enEspera;

    public Banquete() {
        enEspera = new ColaPersonajes();
    }

    public void alimentarPersonajes() {
        enEspera.add(null);
        Personaje personaje = enEspera.remove();
        while (personaje != null) {
            personaje.comer();
            enEspera.add(personaje);
            personaje = enEspera.remove();
        }
    }

    public void listarCincoMasDebiles() {
        PersonajesPorKiDesc listaOrd = new PersonajesPorKiDesc();
        enEspera.add(null);
        Personaje personaje = enEspera.remove();
        while (personaje != null) {
            listaOrd.add(personaje);
            enEspera.add(personaje);
            personaje = enEspera.remove();
        }
        listarCinco(listaOrd);
    }

    private void listarCinco(PersonajesPorKiDesc listaOrd) {
        int i = 0;
        while (i < listaOrd.size() && i < 5) {
            System.out.println(listaOrd.get(i));
            i++;
        }
    }

    public void agregarPersonaje(Personaje personaje) {
        enEspera.add(personaje);
    }

    public void listar() {
        enEspera.add(null);
        Personaje personaje = enEspera.remove();

        System.out.printf("%-15s %10s\n","ESPECIE","PODER");
        while (personaje != null) {
            System.out.println(personaje);
            enEspera.add(personaje);
            personaje = enEspera.remove();
        }
    }
}
