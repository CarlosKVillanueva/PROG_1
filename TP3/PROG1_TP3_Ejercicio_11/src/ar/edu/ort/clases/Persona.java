package ar.edu.ort.clases;

/**
 * TPROG1_TP3_Ejercicio_11 @author CKVillanueva el 4/16/2022 | 10:09 AM
 */
public class Persona implements Notificable, Priorizable {
    public static final int EDAD_RIESGO = 60;
    private String dni;
    private String nombreApellido;
    private int edad;
    private Motivo motivo;
    private int prioridad;

    public Persona(String dni, String nombreApellido, int edad, Motivo motivo) {
        this.dni = dni;
        this.nombreApellido = nombreApellido;
        this.edad = edad;
        this.motivo = motivo;
        this.prioridad = tienePrioridad();
    }

    public int getPrioridad() {
        return prioridad;
    }

    public int getEdad() {
        return this.edad;
    }

    @Override
    public void notificar(String mensaje) {
        System.out.println(mensaje);
    }

    @Override
    public int tienePrioridad() {
        return (notieneOS() || mayorEdad() || contactoEstrecho()) ? Priorizable.MAX_PRIORIDAD : Priorizable.MIN_PRIORIDAD;
    }

    private boolean notieneOS() {
        return !(this instanceof PersonaConOS);
    }

    private boolean mayorEdad() {
        return this.edad >= EDAD_RIESGO;
    }

    private boolean contactoEstrecho() {
        return this.motivo == Motivo.CONTACTO_ESTRECHO;
    }

    public boolean esDeRiesgo() {
        return this.prioridad == Priorizable.MAX_PRIORIDAD;
    }
    @Override
    public String toString() {
        return "Persona{" +
                "dni='" + dni + '\'' +
                ", nombreApellido='" + nombreApellido + '\'' +
                ", edad=" + edad +
                ", motivo=" + motivo +
                ", prioridad=" + prioridad +
                '}';
    }
}
