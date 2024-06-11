/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectojava_p1_kristophervillalobos;

import java.util.Scanner;

/**
 *
 * @author krist
 */
public class ProyectoJava_P1_KristopherVillalobos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Menu platos = new Menu();
        Pedidos SistemaPedidos = new Pedidos();
        
        Scanner scanner = new Scanner(System.in);
        
        int opc;
        
        do {
            System.out.println("------------MENU------------");
            System.out.println("1. Gestionar Menu");
            System.out.println("2. Gestionar Pedidos");
            System.out.println("3. Gestionar Mesas y Reservaciones");
            System.out.println("4. Gestionar Empleados");
            System.out.println("5. Servicio al Cliente");
            System.out.println("6. Analisis de Ventas");
            System.out.println("7. Salir");
            System.out.print("Introduce una Opcion: ");
            opc = scanner.nextInt();
            
            switch(opc){
                case 1:
                    menuplatos(platos, scanner);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Opcion no Valida");
                    break;
            }
        }
        while( opc!= 6);
    }
    
    private static void menuplatos(Menu platos, Scanner scanner) {
        
        int menuopc;
        
        Scanner lea = new Scanner(System.in);
        
        do {
            System.out.println("------------MENU------------");
            System.out.println("1. Agregar Plato");
            System.out.println("2. Eliminar Plato");
            System.out.println("3. Actualizar Plato");
            System.out.println("4. Listar Platos");
            System.out.println("5. Volver al Menu Principal");
            System.out.print("Ingresa una Opcion: ");
            menuopc = scanner.nextInt();

            switch (menuopc) {
                case 1:
                    System.out.print("Introduce el nombre del plato: ");
                    String nombre = lea.nextLine();
                    System.out.print("Introduce la categoría: ");
                    String categoria = lea.nextLine();
                    System.out.print("Introduce el precio: ");
                    double precio = lea.nextDouble();
                    System.out.print("Disponibilidad: ");
                    boolean disponible = lea.nextBoolean();
                    Menu.Plato plato = platos.new Plato(nombre, categoria, precio, disponible);
                    platos.agregarPlato(plato);
                    break;
                case 2:
                    System.out.print("Introduce el nombre del plato a eliminar: ");
                    String nombrePlatoEliminar = lea.nextLine();
                    platos.eliminarPlato(nombrePlatoEliminar);
                    break;
                case 3:
                    System.out.print("Introduce el nombre del nuevo plato: ");
                    String nombrePlatoActualizar = lea.nextLine();
                    System.out.print("Introduce el nuevo nombre: ");
                    String nuevoNombre = lea.nextLine();
                    System.out.print("Introduce la nueva categoría: ");
                    String nuevaCategoria = lea.nextLine();
                    System.out.print("Introduce el nuevo precio: ");
                    double nuevoPrecio = lea.nextDouble();
                    System.out.print("Disponibilidad: ");
                    boolean nuevaDisponibilidad = lea.nextBoolean();
                    Menu.Plato nuevoPlato = platos.new Plato(nuevoNombre, nuevaCategoria, nuevoPrecio, nuevaDisponibilidad);
                    platos.actualizarPlato(nombrePlatoActualizar, nuevoPlato);
                    break;
                case 4:
                    platos.listarPlatos();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opcion no Valida. Intenta de nuevo.");
            }
        } while (menuopc != 5);
        
        private static void gestionarPedidos(SistemaPedidos sistemaPedidos, Carta carta, Scanner scanner) {
        int eleccion;
        do {
            System.out.println("Gestionar Pedidos");
            System.out.println("1. Agregar Pedido");
            System.out.println("2. Listar Pedidos");
            System.out.println("3. Cambiar Estado de Pedido");
            System.out.println("4. Generar Factura");
            System.out.println("5. Volver al Menú Principal");
            System.out.print("Introduce tu elección: ");
            eleccion = scanner.nextInt();

            switch (eleccion) {
                case 1:
                    System.out.print("Introduce el número de la mesa: ");
                    int numeroMesa = scanner.nextInt();
                    SistemaPedidos.Pedido pedido = sistemaPedidos.new Pedido(sistemaPedidos.obtenerPedidosPorEstado(SistemaPedidos.EstadoPedido.PENDIENTE).size() + 1, numeroMesa);
                    System.out.print("Introduce el número de platos: ");
                    int numeroPlatos = scanner.nextInt();
                    for (int i = 0; i < numeroPlatos; i++) {
                        System.out.print("Introduce el nombre del plato: ");
                        String nombrePlato = scanner.next();
                        for (Carta.Plato plato : carta.platos) {
                            if (plato.getNombre().equals(nombrePlato) && plato.isDisponible()) {
                                pedido.agregarPlato(plato);
                                break;
                            }
                        }
                    }
                    sistemaPedidos.agregarPedido(pedido);
                    break;
                case 2:
                    sistemaPedidos.listarPedidos();
                    break;
                case 3:
                    System.out.print("Introduce el ID del pedido: ");
                    int idPedido = scanner.nextInt();
                    System.out.print("Introduce el nuevo estado (PENDIENTE, EN_PROCESO, LISTO, ENTREGADO): ");
                    String nuevoEstado = scanner.next();
                    for (SistemaPedidos.Pedido p : sistemaPedidos.pedidos) {
                        if (p.getIdPedido() == idPedido) {
                            p.setEstado(SistemaPedidos.EstadoPedido.valueOf(nuevoEstado));
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.print("Introduce el ID del pedido: ");
                    int idPedidoFactura = scanner.nextInt();
                    sistemaPedidos.generarFactura(idPedidoFactura);
                    break;
                case 5:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Elección inválida. Intenta de nuevo.");
            }
        } while (eleccion != 5);
    
    }
}
