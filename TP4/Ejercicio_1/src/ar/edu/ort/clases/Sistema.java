package ar.edu.ort.clases;

import java.util.ArrayList;

/**
 * Ejercicio_1 @author CKVillanueva el 5/6/2022 | 11:05 AM
 */
public class Sistema {
    private String nombre;
    private Cajero[] cajeros;
    private Robot[] robots;
    private ArrayList<Pedido> pedidos;

    public Sistema(String nombre) {
        this.nombre = nombre;
        agregarCajeros();
        agregarRobots();
        this.pedidos = new ArrayList<>();
    }

    private void agregarCajeros() {
        this.cajeros = new Cajero[5];
        for (int i = 0; i < cajeros.length; i++) {
            int mesesRand = (int) ((Math.random() * (12 - 1)) + 1);
            cajeros[i] = new Cajero(i, "Apellido_" + i, mesesRand);
        }
    }

    private void agregarRobots() {
        this.robots = new Robot[8];
        for (int i = 0; i < robots.length; i++) {
            int nivelBatRand = (int) ((Math.random() * (100 - 1)) + 1);
            robots[i] = new Robot(i, nivelBatRand);
        }

    }

    public double[] montosPorCajero(){
        double[] montoPorCajero = new double[5];
        for (int i = 0; i < cajeros.length; i++) {
            long idCajero = cajeros[i].getId();
            for (Pedido pendiente : pedidos) {
                if (pendiente.getIdCajero() == idCajero) {
                    montoPorCajero[i] += pendiente.getMonto();
                }
            }
        }
        return montoPorCajero ;
    }

    public Informe[] informeDePedidos() {
        Informe[] informe = new Informe[pedidos.size()];

        for (int i = 0; i < informe.length; i++) {
            Cajero cajero = (Cajero) buscar(pedidos.get(i).getIdCajero(), cajeros);
            Robot robot = (Robot) buscar(pedidos.get(i).getCodigoRobot(), robots);
            informe[i] = new Informe(pedidos.get(i).getMonto(),cajero.getApellido(), robot.getNivelBateria());
        }
        return informe;
    }

    private Object buscar(long id, Object[] vector) {
        int i = 0, cantidadElementos = vector.length;
        Object elementoBuscado = null;

        while (i < cantidadElementos && elementoBuscado == null) {
            if (vector[i] instanceof Cajero && id == ((Cajero) vector[i]).getId()) {
                elementoBuscado = vector[i];
            }
            if (vector[i] instanceof Robot && id == ((Robot) vector[i]).getCodigo()) {
                elementoBuscado = vector[i];
            }
            i++;
        }
        return elementoBuscado;
    }

    public void mostrarPedidosConMasRiesgo(int nivelBatCritico){
        for (Robot robot : robots) {
            if (robot.getNivelBateria() < nivelBatCritico) {
                System.out.printf("Codigo Robot: %s Nivel Critico Bateria: %d\n",robot.getCodigo(),robot.getNivelBateria());
                for (Pedido pedido : pedidos) {
                    System.out.println(pedido);
                }
            }
        }
    }

    public void agregarPedidos(Pedido pedido) {
        this.pedidos.add(pedido);
    }
}
