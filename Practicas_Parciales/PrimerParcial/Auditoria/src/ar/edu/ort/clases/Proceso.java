package ar.edu.ort.clases;

/**
 * Auditoria @author CKVillanueva el 4/22/2022 | 8:31 PM
 */
public class Proceso implements Auditable {
    private static final int LIMITE_ACTIVIDADES = 7;
    private int codigo;
    private int cantActividades;
    private boolean impactaClientes;
    private boolean afectaPatrimonio;

    public Proceso(int codigo, int cantActividades, boolean impactaClientes, boolean afectaPatrimonio) {
        this.codigo = codigo;
        this.cantActividades = cantActividades;
        this.impactaClientes = impactaClientes;
        this.afectaPatrimonio = afectaPatrimonio;
    }

    @Override
    public int getNivelCriticidad() {
        int criticidad = 0;

        if (impactaClientes) {
            if (cantActividades > LIMITE_ACTIVIDADES && afectaPatrimonio) {
                criticidad = 2;
            } else {
                criticidad = 1;
            }
        }
        return criticidad;
    }
}
