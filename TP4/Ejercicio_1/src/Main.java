import ar.edu.ort.clases.Pedido;
import ar.edu.ort.clases.Sistema;
import java.util.Arrays;

/**
 * Ejercicio_1 @author CKVillanueva el 5/6/2022 | 11:05 AM
 */
public class Main {
    public static void main(String[] args) {

        Sistema resto = new Sistema("Ratattouille");

        Pedido pedido0 = new Pedido("Kaio", 0, 0, 300);
        Pedido pedido1 = new Pedido("Anto", 1, 1, 300);
        Pedido pedido2 = new Pedido("Facu", 2, 2, 300);
        Pedido pedido3 = new Pedido("Jose", 3, 3, 300);
        Pedido pedido4 = new Pedido("Juan", 4, 4, 300);
        Pedido pedido5 = new Pedido("Andrea", 3, 5, 300);
        Pedido pedido6 = new Pedido("Romulo", 2, 6, 300);
        Pedido pedido7 = new Pedido("Remo", 1, 7, 300);

        resto.agregarPedidos(pedido0);
        resto.agregarPedidos(pedido1);
        resto.agregarPedidos(pedido2);
        resto.agregarPedidos(pedido3);
        resto.agregarPedidos(pedido4);
        resto.agregarPedidos(pedido5);
        resto.agregarPedidos(pedido6);
        resto.agregarPedidos(pedido7);

        System.out.println(Arrays.toString(resto.montosPorCajero()));
        System.out.println(Arrays.toString(resto.informeDePedidos()));
        resto.mostrarPedidosConMasRiesgo(10);


    }

}