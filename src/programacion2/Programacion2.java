package programacion2;

import ejercicios.TrabajoPractico1;
import ejercicios.TrabajoPractico2;
import ejercicios.TrabajoPractico3;
import ejercicios.TrabajoPractico4;
import java.util.List;
import modelos.DetallePedido;
import modelos.Mercaderia;
import modelos.Pedido;

public class Programacion2 {

    public static void main(String[] args) throws Exception {
        /*TrabajoPractico1 practico1 = new TrabajoPractico1();
        practico1.ejercicio4();*/
        
        /*TrabajoPractico2 practico2 = new TrabajoPractico2();
        practico2.ejercicio6();*/
        
        /*TrabajoPractico3 practico3 = new TrabajoPractico3();
        practico3.ejercicio3();*/
        
        TrabajoPractico4 practico4 = new TrabajoPractico4();
        practico4.ejercicio3();
        
        /*
        Pedido pedido;
        
        pedido = practico.ejercicio2();
        
        System.out.println("Nombre Cliente");
        System.out.println(pedido.getCliente().getNombre());
        
        System.out.println("Mercaderia 2");
        System.out.println(pedido.getDetalles().get(1).getMercaderia().getNombre());
        
        List<DetallePedido> listaDetalles = pedido.getDetalles();
        DetallePedido detallePedido2 = listaDetalles.get(1);
        Mercaderia mercaderia = detallePedido2.getMercaderia();
        
        System.out.println("Mercaderia 2 - Ordenada");
        System.out.println(mercaderia.getNombre());
        
        System.out.println("Cantidad de Botellas");
        System.out.println(pedido.getDetalles().get(1).getCantidad());
        */
    }

}
