package ar.edu.ort.clases;

public abstract class Empleado {

    protected static final double SALARIO_MINIMO = 20000;
    private static final int ANIO_ACTUAL = 2022;
    private String dni;
    private String nombre;
    private String apellido;
    private int ingreso;
    private double sueldo;


    public Empleado(String dni, String nombre, String apellido, int ingreso) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ingreso = ingreso;
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public abstract double calcularSueldo();

    public abstract int cantClientes();

    public int obtenerAntiguedad(){
        return ANIO_ACTUAL - ingreso;
    }

    public String getNombreCompleto() {
        return this.nombre + " " + this.apellido;
    }
}
