package ar.edu.ort.clases;

/**
 * Auditoria @author CKVillanueva el 4/22/2022 | 8:32 PM
 */
public class Sistema implements Auditable {
    private static final int CANT_LIMITE = 500;
    private String nombre;
    private boolean poseeDatosClientes;
    private int cantUsuarios;

    public Sistema(String nombre, boolean poseeDatosClientes, int cantUsuarios) {
        this.nombre = nombre;
        this.poseeDatosClientes = poseeDatosClientes;
        this.cantUsuarios = cantUsuarios;
    }

    @Override
    public int getNivelCriticidad() {
        int criticidad = 0;
        if (poseeDatosClientes) {
            if (cantUsuarios > CANT_LIMITE) {
                criticidad = 2;
            } else {
                criticidad = 1;
            }
        }
        return criticidad;
    }


    @Override
    public String toString() {
        return "Sistema{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
