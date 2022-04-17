package ar.edu.ort.clases;

/**
 * PROG1_TP3_Ejercicio_12 @author CKVillanueva el 4/16/2022 | 7:17 PM
 */
public class FuenteMarcado extends Fuente {
    public static final double VALOR_CONTROL = 450;
    public static final int ZERO = 0;
    private int tamanioKb;
    private TipoMarcado tipo;

    public FuenteMarcado(String nombre, String path,TipoMarcado tipo, int tamanioKb) {
        super(nombre, path);
        this.tipo = tipo;
        this.tamanioKb = tamanioKb;
    }


    @Override
    public double indiceCalidad() {
        return (tamanioKb > ZERO) ? VALOR_CONTROL / tamanioKb : ZERO;
    }
}
