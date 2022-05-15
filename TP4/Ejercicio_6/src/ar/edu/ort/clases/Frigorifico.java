package ar.edu.ort.clases;

import java.util.ArrayList;
import java.util.Random;

/**
 * Ejercicio_6 @author CKVillanueva el 5/14/2022 | 11:20 PM
 */
public class Frigorifico {
    public static final int CANT_VENDEDORES = 20;
    private String razonSocial;
    private ArrayList<Cliente> clientes;
    private ArrayList<Pedido> pedidos;
    private ArrayList<Producto> productos;
    private Vendedor[] vendedores;
    private int contArg = 0, contBra = 0, contChi = 0, contUru = 0;
    private double acumArg = 0, acumBra = 0,acumChi = 0,acumUru = 0;

    public Frigorifico(String razonSocial) {
        this.razonSocial = razonSocial;
        this.productos = new ArrayList<>();
        this.pedidos = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.vendedores = new Vendedor[CANT_VENDEDORES];
        generarCliente();
        generarPedidos();
        generarVendedores();
    }

    private void generarVendedores() {
        for (int i = 0; i < CANT_VENDEDORES; i++) {
            vendedores[i] = new Vendedor(i, "Vendedor" + i);
        }
    }

    private void generarPedidos() {
        for (int i = 0; i < 1000; i++) {
            pedidos.add(new Pedido(new Random().nextInt(20), "Cuit" + new Random().nextInt(100)));
        }
    }

    private void generarCliente() {
        for (int i = 0; i < 100; i++) {
            clientes.add(new Cliente("Cli" + i, "Cuit"+i,"Tel"+i, randPais()));
        }
    }

    private Pais randPais() {
        return Pais.values()[new Random().nextInt(Pais.values().length)];
    }

    public void informarCantPedidos() {
        for (int vend = 0; vend < vendedores.length; vend++) {
            System.out.println("Vendedor: " + vendedores[vend].getNombre());
            int[] cantidades = new int[Pais.values().length];
            for (Pedido pedido : pedidos) {
                if (pedido.mismoVendedor(vendedores[vend].getId())) {
                    Cliente cliente = buscarCliente(pedido.getCuitCliente());
                    cantidades = obtenerCantidades(cliente.getPais());
                }
            }
            reiniciarContadores();
            System.out.printf("Argentina: %d pedidos \t Brasil: %d pedidos \t Chile: %d pedidos \t Uruguay: %d pedidos\n",
                                 cantidades[0], cantidades[1],  cantidades[2], cantidades[3]);
        }
    }

    private void reiniciarContadores() {
        this.contArg = 0; this.contBra = 0; this.contChi = 0; this.contUru = 0;
    }

    public int[] clientesPorPais() {
        int[] clientesPorPais = new int[Pais.values().length];
        for (Cliente cliente : clientes) {
            clientesPorPais = obtenerCantidades(cliente.getPais());
        }
        return clientesPorPais;
    }

    public String paisMasRentable() {
        String mayorRecaudador = null;
        for (Pedido pedido : pedidos) {
            Cliente cliente = buscarCliente(pedido.getCuitCliente());
            double totalPedido = pedido.getTotalPedido();
            double[] recaudacionPais = obtenerRecaudaciones(cliente.getPais(), totalPedido);
            mayorRecaudador = obtenerMayorRecaudador(recaudacionPais);
        }
        return mayorRecaudador;
    }

    private String obtenerMayorRecaudador(double[] recaudacionPais) {
        double control = Double.MIN_VALUE;
        int posicionPais = -1;
        for (int i = 0; i < recaudacionPais.length; i++) {
            if (recaudacionPais[i] > control) {
                control = recaudacionPais[i];
                posicionPais = i;
            }
        }
        return Pais.values()[posicionPais].name();
    }

    private double[] obtenerRecaudaciones(Pais pais, double pedido) {
        switch (pais) {
            case ARGENTINA -> acumArg += pedido;
            case BRASIL -> acumBra += pedido;
            case CHILE -> acumChi += pedido;
            case URUGUAY -> acumUru += pedido;
        }
        return new double[]{acumArg, acumBra, acumChi, acumUru};
    }

    private int[] obtenerCantidades(Pais pais) {
        switch (pais) {
            case ARGENTINA -> contArg++;
            case BRASIL -> contBra++;
            case CHILE -> contChi++;
            case URUGUAY -> contUru++;
        }
        return new int[]{contArg, contBra, contChi, contUru};
    }

    private Cliente buscarCliente(String cuit) {
        int i = 0, cantidadClientes = clientes.size();
        Cliente clienteBuscado = null;

        while (i < cantidadClientes && clienteBuscado == null) {
            Cliente elemento = clientes.get(i);
            if (elemento.mismoCliente(cuit)) {
                clienteBuscado = elemento;
            } else {
                i++;
            }
        }
        return clienteBuscado;
    }

    @Override
    public String toString() {
        return "Frigorifico{" +
                "razonSocial='" + razonSocial + '\'' +
                '}';
    }
}
