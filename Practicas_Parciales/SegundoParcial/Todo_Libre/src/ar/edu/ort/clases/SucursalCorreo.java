package ar.edu.ort.clases;

/**
 * TodoLibre@author CKVillanueva el 6/10/2022 | 10:32 PM
 */
public class SucursalCorreo {
    private Domicilio domicilio;

    public SucursalCorreo(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public int getNroComuna() {
        return this.domicilio.getNroComuna();
    }
}
