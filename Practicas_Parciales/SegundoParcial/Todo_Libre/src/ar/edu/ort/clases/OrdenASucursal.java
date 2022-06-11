package ar.edu.ort.clases;

/**
 * TodoLibre@author CKVillanueva el 6/10/2022 | 10:31 PM
 */
public class OrdenASucursal extends Orden {
    private SucursalCorreo sucursalCorreo;

    public OrdenASucursal(String fecha, double monto, Usuario comprador, Usuario vendedor, SucursalCorreo sucursalCorreo) {
        super(fecha, monto, comprador, vendedor);
        this.sucursalCorreo = sucursalCorreo;
    }

    @Override
    public int informar() {
        return this.sucursalCorreo.getNroComuna();
    }
}
