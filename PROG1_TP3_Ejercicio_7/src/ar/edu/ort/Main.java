package ar.edu.ort;

import ar.edu.ort.clases.Aplicacion;
import ar.edu.ort.clases.EmpleadoComision;
import ar.edu.ort.clases.EmpleadoFijo;

public class Main {

    public static void main(String[] args) {
        Aplicacion aplicacion = new Aplicacion("Tuvieja");
        EmpleadoComision ec0 = new EmpleadoComision("875865", "Carlos", "Villanueva", 1987);
        EmpleadoComision ec1 = new EmpleadoComision("78353223", "Anto", "Mico", 1998);
        EmpleadoComision ec2 = new EmpleadoComision("234r3423", "Facu", "Ali", 1943);

        EmpleadoFijo ec3 = new EmpleadoFijo("875865", "Alberto", "Villanueva", 1987);
        EmpleadoFijo ec4 = new EmpleadoFijo("78353223", "Victoria", "Mico", 1998);
        EmpleadoFijo ec5 = new EmpleadoFijo("234r3423", "Daniel", "Ali", 2021);

        aplicacion.agregarEmpleados(ec0);
        aplicacion.agregarEmpleados(ec1);
        aplicacion.agregarEmpleados(ec2);
        aplicacion.agregarEmpleados(ec3);
        aplicacion.agregarEmpleados(ec4);
        aplicacion.agregarEmpleados(ec5);


        aplicacion.empleadoConMasClientes();
        aplicacion.mostrarSalarios();
        System.out.println("");
        aplicacion.getEmpleados();

    }
}
