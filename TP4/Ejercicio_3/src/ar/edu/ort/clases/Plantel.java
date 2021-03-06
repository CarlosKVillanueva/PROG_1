package ar.edu.ort.clases;

/**
 * Ejercicio_3 @author CKVillanueva el 5/7/2022 | 10:38 PM
 */
public class Plantel {
    Jugador[] jugadores;

    public Plantel() {
        jugadores = new Jugador[23];
        generarJugadores();
    }

    private void generarJugadores() {
        int contjugadores = 1;

        for (int j = 0; j < jugadores.length; j++) {
            jugadores[j] = new Jugador("Apellido" + (j+1), contjugadores, obtenerImportancia(j), obtenerPosicion(j));
            contjugadores++;

        }
    }

    private String obtenerPosicion(int j) {
        String pos = "";
        int arqueros = Posicion.ARQUERO.getCantidad();
        int defensores = arqueros + Posicion.DEFENSOR.getCantidad();
        int medios = defensores + Posicion.MEDIO.getCantidad();
        int delanteros = medios + Posicion.MEDIO.getCantidad();

        if (j < arqueros) {
            pos = Posicion.ARQUERO.getPos();
        } else if (j < defensores) {
            pos = Posicion.DEFENSOR.getPos();
        } else if (j < medios) {
            pos = Posicion.MEDIO.getPos();
        } else if (j < delanteros) {
            pos = Posicion.DELANTERO.getPos();
        }
        return pos;
    }

    private String obtenerImportancia(int j) {
        String impor = "";
        int titulares = Importancia.TITULAR.getCant();
        int suplentes = titulares + Importancia.SUPLENTE.getCant();
        int reservas = suplentes + titulares;
        if (j < titulares) {
            impor = Importancia.TITULAR.getImportancia();
        } else if (j < suplentes) {
            impor = Importancia.SUPLENTE.getImportancia();
        } else if (j < reservas) {
            impor = Importancia.RESERVA.getImportancia();
        }
        return impor;
    }

    public void cambio(int camisetaA, int camisetaB) {
        if (camisetaA != camisetaB) {
            int ubicacionA = getPosicion(camisetaA);
            int ubicacionB = getPosicion(camisetaB);
            Jugador sale = jugadores[ubicacionA];
            Jugador entra = jugadores[ubicacionB];
            if ((ubicacionA != -1) && (ubicacionB != -1)) {
                jugadores[ubicacionA] = entra;
                jugadores[ubicacionB] = sale;
            }
        }
    }

    public void cambioPorLesion(int nroCamiseta, String apellido) {
        Jugador lesionado = buscarJugador(nroCamiseta);
        Jugador reemplazo = buscarJugador(apellido);
        if (lesionado != null && reemplazo != null) {
            int posLesionado = getPosicion(lesionado.getNumeroCamiseta());
            int posReemplazo = getPosicion(reemplazo.getNumeroCamiseta());

            jugadores[posLesionado] = new Jugador(reemplazo.getApellido(), lesionado.getNumeroCamiseta(), lesionado.getImpor(), lesionado.getPuesto());
            jugadores[posReemplazo] = new Jugador(lesionado.getApellido(), reemplazo.getNumeroCamiseta(), reemplazo.getImpor(), reemplazo.getPuesto());
        }
    }

    private int getPosicion(int camiseta) {
        int i = 0, posicion = -1;
        while (i < jugadores.length && posicion == -1) {
            if (jugadores[i].mismoJugador(camiseta)) {
                posicion = i;
            }
            i++;
        }
        return posicion;
    }

    private Jugador buscarJugador(int camiseta) {
        int i = 0;
        int cantidadJug = jugadores.length;
        Jugador jugador = null;

        while (i < cantidadJug && jugador == null) {
            Jugador jugadorBuscado = jugadores[i];
            if (jugadorBuscado.mismoJugador(camiseta)) {
                jugador = jugadorBuscado;
            } else {
                i++;
            }
        }
        return jugador;
    }

    private Jugador buscarJugador(String apellido) {
        int i = 0, cantidadJug = jugadores.length;
        Jugador jugador = null;

        while (i < cantidadJug && jugador == null) {
            Jugador jugadorBuscado = jugadores[i];
            if (jugadorBuscado.mismoJugador(apellido)) {
                jugador = jugadorBuscado;
            } else {
                i++;
            }
        }
        return jugador;
    }

    public void mostrar() {
        for (Jugador jugadore : jugadores) {
            System.out.println(jugadore);
        }
    }

    public Jugador[] obtenerReservas() {
        Jugador[] reservas = new Jugador[5];
        int cont = 0;
        for (int i = 0; i < jugadores.length; i++) {
            if (jugadores[i].getImpor().equals(Importancia.RESERVA.getImportancia())) {
                reservas[cont] = jugadores[i];
                cont++;
            }
        }
        return reservas;
    }

    public int[] cantJugadoresPorPosicion() {
        return new int[]{Posicion.ARQUERO.getCantidad(), Posicion.DEFENSOR.getCantidad(), Posicion.MEDIO.getCantidad(), Posicion.DELANTERO.getCantidad()};
    }


}
