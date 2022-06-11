package ar.edu.ort.clases;

/**
 * TodoLibre@author CKVillanueva el 6/10/2022 | 10:29 PM
 */
public class OrdePaP extends Orden {
    private boolean gratis;

    public OrdePaP(String fecha, double monto, Usuario comprador, Usuario vendedor, boolean gratis) {
        super(fecha, monto, comprador, vendedor);
        this.gratis = gratis;
    }

    @Override
    public int informar() {
        return super.getComprador().getComuna();
    }
}
