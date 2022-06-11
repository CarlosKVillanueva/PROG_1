package ar.edu.ort.clases;

/**
 * SedeDeLicencias @author CKVillanueva el 4/24/2022 | 11:26 AM
 */
public abstract class Examen implements Evaluable {
    private String fecha;
    private Persona persona;

    public Examen(String fecha, Persona persona) {
        this.fecha = fecha;
        this.persona = persona;
    }

    public abstract boolean aprobado();

    @Override
    public String toString() {
        return "Examen{Fecha='" + fecha + '\'' +
                ", persona=" + persona +
                '}';
    }
}
