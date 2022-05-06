package ar.edu.ort.clases;

import java.util.ArrayList;

public class Aplicacion {
    private String nombre;
    private ArrayList<Empleado> empleados;

    public Aplicacion(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleados(Empleado empleado) {
        empleados.add(empleado);
    }


    public void mostrarSalarios() {

        for (Empleado emp : empleados) {
            System.out.println(emp.getNombreCompleto() + ": $" + emp.getSueldo());
        }
    }

    public Empleado empleadoConMasClientes() {
        Empleado retorno = null;
        int maxClientes = 0;
        retorno = obtenerClientes(retorno, maxClientes);
        return retorno;
    }

    public void getEmpleados(){
        for (Empleado emp : empleados) {
            System.out.println(emp);
        }
    }
    private Empleado obtenerClientes(Empleado retorno, int maxClientes) {
        int cantActual;
        for (Empleado emp : empleados) {
            if (emp instanceof EmpleadoComision) {
                cantActual = emp.cantClientes();
                if (cantActual > maxClientes){
                    maxClientes = cantActual;
                    retorno = emp;
                }
            }
        }
        return retorno;
    }
}