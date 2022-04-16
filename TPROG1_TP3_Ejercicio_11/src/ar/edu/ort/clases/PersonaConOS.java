package ar.edu.ort.clases;

/**
 * TPROG1_TP3_Ejercicio_11 @author CKVillanueva el 4/16/2022 | 10:13 AM
 */
public class PersonaConOS extends Persona {
    private String nombrePrestador;
    private String numeroAfiliado;

    public PersonaConOS(String dni, String nombreApellido, int edad, Motivo motivo, String nombrePrestador, String numeroAfiliado) {
        super(dni, nombreApellido, edad, motivo);
        this.nombrePrestador = nombrePrestador;
        this.numeroAfiliado = numeroAfiliado;
    }

    @Override
    public String toString() {
        return "PersonaConOS{" +
                "nombrePrestador='" + nombrePrestador + '\'' +
                ", numeroAfiliado='" + numeroAfiliado + '\'' +
                '}';
    }
}
