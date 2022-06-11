package ar.edu.ort.clases;

import ar.edu.ort.tdas.implementaciones.PilaNodos;

/**
 * FabricaProductos@author CKVillanueva el 6/10/2022 | 9:43 AM
 */
public class PilaProducto extends PilaNodos<Producto> {


    public void listar() {
        PilaProducto aux = new PilaProducto();
        Producto producto;
        while (!this.isEmpty()) {
            producto = this.pop();
            System.out.println(producto);
            aux.push(producto);
        }
        while (!aux.isEmpty()) {
            this.push(aux.pop());
        }
    }
}
