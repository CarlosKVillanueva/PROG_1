package ar.edu.ort.clases;

/**
 * Logistica@author CKVillanueva el 6/11/2022 | 1:38 PM
 */
public class Viaje {
    private Camion camion;
    private Chofer chofer;
    private PilaDestinos pilaDestinos;

    public Viaje(Camion camion, Chofer chofer) {
        this.camion = camion;
        this.chofer = chofer;
        this.pilaDestinos = new PilaDestinos();
    }

    public boolean tienDestino(String destino) {
        PilaDestinos aux = new PilaDestinos();
        Destino destinoBuscado;
        boolean encontrado = false;
        while (!pilaDestinos.isEmpty() && !encontrado) {
            destinoBuscado = pilaDestinos.pop();
            encontrado = destinoBuscado.mismoDestino(destino);
            aux.push(destinoBuscado);
        }
        reordenarPila(aux);
        return encontrado;
    }

    private void reordenarPila(PilaDestinos aux) {
        while (!aux.isEmpty()) {
           pilaDestinos.push(aux.pop());
        }
    }

    public int getIdCamion() {
        return this.camion.mostrarId();
    }

    public int getIdChofer() {
        return this.chofer.mostrarId();
    }
}


