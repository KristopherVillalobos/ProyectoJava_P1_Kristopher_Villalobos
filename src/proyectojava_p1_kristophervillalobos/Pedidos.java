/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectojava_p1_kristophervillalobos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author krist
 */

public class Pedidos {

    public class SistemaPedidos {
        public enum EstadoPedido {
            PENDIENTE, ENPROCESO, LISTO, ENTREGADO
        }

        public class Pedido {

            private int idPedido;
            private int numeroMesa;
            private EstadoPedido estado;
            private List<Menu.Plato> platos;

            public Pedido(int idPedido, int numeroMesa) {
                this.idPedido = idPedido;
                this.numeroMesa = numeroMesa;
                this.estado = EstadoPedido.PENDIENTE;
                this.platos = new ArrayList<>();
            }

            public void agregarPlato(Menu.Plato plato) {
                platos.add(plato);
            }

            public int getIdPedido() {
                return idPedido;
            }

            public int getNumeroMesa() {
                return numeroMesa;
            }

            public EstadoPedido getEstado() {
                return estado;
            }

            public void setEstado(EstadoPedido estado) {
                this.estado = estado;
            }

            public List<Menu.Plato> getPlatos() {
                return platos;
            }

            public double calcularTotal() {
                double total = 0;
                for (Menu.Plato plato : platos) {
                    total += plato.getPrecio();
                }
                return total;
            }
        }

        List<Pedido> pedidos;

        public SistemaPedidos() {
            this.pedidos = new ArrayList<>();
        }

        public void agregarPedido(Pedido pedido) {
            pedidos.add(pedido);
        }

        public void listarPedidos() {
            for (Pedido pedido : pedidos) {
                System.out.println("ID Pedido: " + pedido.getIdPedido() + ", Mesa: " + pedido.getNumeroMesa() + ", Estado: " + pedido.getEstado() + ", Total: $" + pedido.calcularTotal());
                for (Menu.Plato plato : pedido.getPlatos()) {
                    System.out.println("- Plato: " + plato.getNombre() + ", Precio: " + plato.getPrecio());
                }
            }
        }

        public List<Pedido> obtenerPedidosPorEstado(EstadoPedido estado) {
            List<Pedido> pedidosEstado = new ArrayList<>();
            for (Pedido pedido : pedidos) {
                if (pedido.getEstado() == estado) {
                    pedidosEstado.add(pedido);
                }
            }
            return pedidosEstado;
        }

        public void generarFactura(int idPedido) {
            for (Pedido pedido : pedidos) {
                if (pedido.getIdPedido() == idPedido) {
                    System.out.println("Factura ID: " + pedido.getIdPedido());
                    System.out.println("Mesa: " + pedido.getNumeroMesa());
                    System.out.println("Platos:");
                    for (Menu.Plato plato : pedido.getPlatos()) {
                        System.out.println("- " + plato.getNombre() + ": " + plato.getPrecio());
                    }
                    System.out.println("Total: " + pedido.calcularTotal());
                    break;
                }
            }
        }

        public List<Pedido> getPedidos() {
            return pedidos;
        }
    }
}
