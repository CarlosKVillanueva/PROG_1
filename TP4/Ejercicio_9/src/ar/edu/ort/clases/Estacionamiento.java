package ar.edu.ort.clases;

import java.util.ArrayList;
import java.time.LocalDate;

/**
 * Ejercicio_9 @author CKVillanueva el 5/20/2022 | 1:39 PM
 */
public class Estacionamiento {
    public static final int PISOS = 8;
    public static final int ESPACIOS = 6;
    LocalDate fechaActual = LocalDate.now();
    private Auto[][] autos;
    private ArrayList<Registro> registros;

    public Estacionamiento() {
        this.autos = new Auto[PISOS][ESPACIOS];
        this.registros = new ArrayList<>();
    }

    public Auto retirar(int posicion) {
        int piso = (posicion / 10) - 1;
        int espacio = (posicion % 10) - 1;
        boolean coordenadaValida = validar(piso, espacio);
        Auto autoRetorno = null;
        if (coordenadaValida) {
            autoRetorno = this.autos[piso][espacio];
            if (autoRetorno != null) {
                if (autoRetorno.estaAlDia()) {
                    this.autos[piso][espacio] = null;
                    this.registros.add(new Registro(autoRetorno.getPatente(), fechaActual));
                } else {
                    autoRetorno = null;
                }
            }
        }
        return autoRetorno;
    }

    public Auto[] autosMasMorososPorPiso() {
        Auto[] autosMorosos = new Auto[PISOS];
        for (int fila = 0; fila < PISOS; fila++) {
            autosMorosos[fila] = buscarMasMoroso(autos[fila]);
        }
        return autosMorosos;
    }

    private Auto buscarMasMoroso(Auto[] autosPorPiso) {
        Auto moroso = null;
        int mayor = -1;
        for (Auto auto : autosPorPiso) {
            int mesesDeuda = auto.controlMeses();

            if (mesesDeuda > mayor) {
                mayor = mesesDeuda;
                moroso = auto;
            }
        }
        return moroso;
    }

    private boolean validar(int piso, int espacio) {
        return (piso >= 0 && piso < PISOS) && (espacio >= 0 && espacio < ESPACIOS);
    }
}
