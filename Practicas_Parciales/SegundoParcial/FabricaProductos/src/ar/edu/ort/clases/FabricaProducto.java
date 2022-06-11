package ar.edu.ort.clases;

import java.util.Random;

/**
 * FabricaProductos@author CKVillanueva el 6/10/2022 | 9:40 AM
 */
public class FabricaProducto {
    private PilaProducto productosEvaluar;

    public FabricaProducto() {
        productosEvaluar = new PilaProducto();
        llenarPila();
    }

    private void llenarPila() {
        for (int i = 0; i < 10; i++) {
        int randTipo = new Random().nextInt(0, 3);
            switch (randTipo) {
                case 0 -> productosEvaluar.push(new Electrodomestico("Electro"+i,"Electro",new Random().nextInt(0,101)));
                case 1 -> productosEvaluar.push(new JuegoMesa("JuegoMesa" + i, "JuegoMesa", new Random().nextInt(1,8), new Random().nextInt(1,54)));
                case 2 -> productosEvaluar.push(new Vehiculo("Vehiculo"+i,"Vehiculo", new Random().nextInt(100)));
            }
        }
    }

    public double promedioKmsHastaMantenimiento(){
        double acum = 0;
        int cont = 0;
        PilaProducto aux = new PilaProducto();
        Producto producto;

        while (!productosEvaluar.isEmpty()) {
            producto = productosEvaluar.pop();
            if (producto instanceof Vehiculo) {
                cont++;
                acum += ((Vehiculo) producto).getCantKm();
            }
            aux.push(producto);
        }
        reconstituirPila(productosEvaluar, aux);


        return cont > 0 ? acum / cont : 0;
    }

    private void reconstituirPila(PilaProducto productosEvaluar, PilaProducto aux) {
        while (!aux.isEmpty()) {
            productosEvaluar.push(aux.pop());
        }
    }

    public PilaProducto[] obtenerResultadosEvaluacion() {
        Producto producto;
        int posicion;
        PilaProducto[] resultado = new PilaProducto[Estado.values().length];
        inicializarVector(resultado);

        while (!productosEvaluar.isEmpty()) {
            producto = productosEvaluar.pop();
            posicion = producto.evaluar().ordinal();
            resultado[posicion].push(producto);
        }
        imprimirEstados(resultado);
        return resultado;
    }

    public int[][] obtenerCantPorProdPorEstado() {
        int[][] resultado = new int[TipoProducto.values().length][Estado.values().length];
        PilaProducto[] pila = obtenerResultadosEvaluacion();
        for (int i = 0; i < pila.length; i++) {
            procesarPila(resultado, i, pila[i]);
        }
        return resultado;
    }

    private void procesarPila(int[][] resultado, int i, PilaProducto pilaProducto) {
        PilaProducto aux = new PilaProducto();
        Producto producto;
        int posTipoProd;

        while (!pilaProducto.isEmpty()) {
            producto = pilaProducto.pop();
            posTipoProd = producto.getTipoProducto().ordinal();
            resultado[posTipoProd][i]++;
            aux.push(producto);
        }
        reconstituirPila(pilaProducto,aux);
    }

    private void inicializarVector(PilaProducto[] resultado) {
        for (int i = 0; i < resultado.length; i++) {
            resultado[i] = new PilaProducto();
        }
    }

    public void imprimirEstados(PilaProducto[] vector) {
        for (int i = 0; i < Estado.values().length; i++) {
            System.out.println(Estado.values()[i]);
            vector[i].listar();
        }
    }
}
