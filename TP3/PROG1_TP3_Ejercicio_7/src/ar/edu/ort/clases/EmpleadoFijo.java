package ar.edu.ort.clases;


public class EmpleadoFijo extends Empleado{

    private static final int MENOS_2 = 2;
    private static final int CINCO = 5;
    private static final int DIEZ =10;
    private Antiguedad antiguedad;
    private double sueldo;



    public EmpleadoFijo(String dni, String nombre, String apellido, int ingreso) {
        super(dni, nombre, apellido, ingreso);
        this.sueldo = calcularSueldo();
    }


    public double getSueldo() {
        return sueldo;
    }


    @Override
    public double calcularSueldo() {
        double sueldo = SALARIO_MINIMO;
        int aniosAntiguedad = obtenerAntiguedad();
        float multiplicador;

        switch(antiguedad){
            case MENOS_DOS :
                multiplicador = MENOS_2;
        break;
        }

        if (aniosAntiguedad > MENOS_2) {
            if (aniosAntiguedad < CINCO){
                sueldo = SALARIO_MINIMO * 1.05;
            } else if (aniosAntiguedad < DIEZ) {
                sueldo = SALARIO_MINIMO * 1.10;
            } else {
                sueldo = SALARIO_MINIMO * 1.15;
            }
        }
        return sueldo;
    }

    @Override
    public int cantClientes() {
        return 0;
    }


}
