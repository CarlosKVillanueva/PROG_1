package ar.edu.ort.clases;

/**
 * Ejercicio_6 @author CKVillanueva el 5/14/2022 | 11:22 PM
 */
public class Cliente {
    private String razonSocial;
    private String cuit;
    private String telefono;
    private Pais pais;

    public Cliente(String razonSocial, String cuit, String telefono, Pais pais) {
        this.razonSocial = razonSocial;
        this.cuit = cuit;
        this.telefono = telefono;
        this.pais = pais;
    }

    public Pais getPais() {
        return pais;
    }

    public boolean mismoCliente(String cuit) {
        return this.cuit.equals(cuit);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "razonSocial='" + razonSocial + '\'' +
                ", cuit='" + cuit + '\'' +
                ", telefono='" + telefono + '\'' +
                ", pais=" + pais +
                '}';
    }
}
