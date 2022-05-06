package ar.edu.ort.clases;

import java.util.ArrayList;
import java.util.Random;

public class EmpleadoComision extends Empleado{
    private ArrayList<Cliente> clientes;
    private double sueldo;

    public double getSueldo() {
        return sueldo;
    }



    public EmpleadoComision(String dni, String nombre, String apellido, int ingreso) {
        super(dni, nombre, apellido, ingreso);
        clientes = new ArrayList<>();
        generarClientes();
        this.sueldo = calcularSueldo();
    }

    private void generarClientes() {
        Random random = new Random();
        int rand = random.nextInt(60 + 1 - 30) + 30;
        double monto = 3000 + (5000 - 3000) * random.nextDouble();

        for (int i = 0; i < rand; i++) {
            clientes.add(new Cliente("Cliente_" + i, monto));
        }
    }

    @Override
    public double calcularSueldo() {
        double sueldo;
        double acumSueldo = 0;
        sueldo = SALARIO_MINIMO;
        if (clientes.size() >= 0) {
            for (Cliente cliente : clientes){
                acumSueldo += cliente.getMontoCobrar();
            }
            if (acumSueldo > SALARIO_MINIMO) {
                sueldo = acumSueldo;
            }
        }
        return sueldo;
    }

    @Override
    public int cantClientes() {
        return clientes.size();
    }

    @Override
    public String toString() {
        return "EmpleadoComision{" +
                "clientes=" + clientes +
                '}';
    }
}
