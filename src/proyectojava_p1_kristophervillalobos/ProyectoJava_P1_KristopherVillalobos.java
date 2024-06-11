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

    public static void main(String[] args) {

        Menu menu = new Menu();
        Pedidos pedidos = new Pedidos();
        Pedidos.SistemaPedidos sistemaPedidos = pedidos.new SistemaPedidos();
        
        menu.agregarPlato(menu.new Plato("Hamburguesa", "Plato Fuerte", 250.00, true));
        menu.agregarPlato(menu.new Plato("Ensalada Cesar", "Entrada", 70.49, true));
        menu.agregarPlato(menu.new Plato("Pizza de Pepperoni", "Plato Fuerte", 125.99, true));
        menu.agregarPlato(menu.new Plato("Sopa de Tomate", "Entrada", 140.99, true));
        menu.agregarPlato(menu.new Plato("Pasta Alfredo", "Plato Fuerte", 190.00, true));
        menu.agregarPlato(menu.new Plato("Mozarrella Sticks", "Entrada", 60.00, true));
        menu.agregarPlato(menu.new Plato("Anafre", "Entrada ", 110.00, true));

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
            System.out.print("Ingrese una Opcion: ");
            opc = scanner.nextInt();

            switch (opc) {
                case 1:
                    menuplatos(menu, scanner);
                    break;
                case 2:
                    gestionarPedidos(sistemaPedidos, menu, scanner);
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Opcion no Valida");
                    break;
            }
        } while (opc != 7);
    }

    private static void menuplatos(Menu menu, Scanner scanner) {
        int menuopc;
        Scanner lea = new Scanner(System.in);
        Scanner lear = new Scanner(System.in);

        do {
            System.out.println("------------MENU PLATOS------------");
            System.out.println("1. Agregar Plato");
            System.out.println("2. Eliminar Plato");
            System.out.println("3. Actualizar Plato");
            System.out.println("4. Listar Platos");
            System.out.println("5. Volver al Menu Principal");
            System.out.print("Ingrese una Opcion: ");
            System.out.println("");
            menuopc = scanner.nextInt();

            switch (menuopc) {
                case 1:
                    System.out.print("Introduce el nombre del plato: ");
                    String nombre = lea.nextLine();
                    System.out.print("Introduce la categoría: ");
                    String categoria = lea.nextLine();
                    System.out.print("Introduce el precio: ");
                    double precio = lea.nextDouble();
                    System.out.print("Disponibilidad (true/false): ");
                    boolean disponible = lea.nextBoolean();
                    Menu.Plato plato = menu.new Plato(nombre, categoria, precio, disponible);
                    menu.agregarPlato(plato);
                    break;
                case 2:
                    System.out.print("Introduce el nombre del plato a eliminar: ");
                    String nombrePlatoEliminar = lear.nextLine();
                    menu.eliminarPlato(nombrePlatoEliminar);
                    break;
                case 3:
                    System.out.print("Introduce el nombre del plato a actualizar: ");
                    String nombrePlatoActualizar = lea.nextLine();
                    System.out.print("Introduce el nuevo nombre: ");
                    String nuevoNombre = lea.nextLine();
                    System.out.print("Introduce la nueva categoria: ");
                    String nuevaCategoria = lea.nextLine();
                    System.out.print("Introduce el nuevo precio: ");
                    double nuevoPrecio = lea.nextDouble();
                    System.out.print("Disponibilidad (true/false): ");
                    boolean nuevaDisponibilidad = lea.nextBoolean();
                    Menu.Plato nuevoPlato = menu.new Plato(nuevoNombre, nuevaCategoria, nuevoPrecio, nuevaDisponibilidad);
                    menu.actualizarPlato(nombrePlatoActualizar, nuevoPlato);
                    break;
                case 4:
                    System.out.println("------------------MENU------------------");
                    menu.listarPlatos();
                    break;
                case 5:
                    System.out.println("Volviendo al menu principal...");
                    break;
                default:
                    System.out.println("Opcion No Valida");
            }
        } while (menuopc != 5);
    }

    private static void gestionarPedidos(Pedidos.SistemaPedidos sistemaPedidos, Menu menu, Scanner scanner) {
        int eleccion;

        do {
            System.out.println("------------GESTIONAR PEDIDOS------------");
            System.out.println("1. Agregar Pedido");
            System.out.println("2. Listar Pedidos");
            System.out.println("3. Cambiar Estado de Pedido");
            System.out.println("4. Generar Factura");
            System.out.println("5. Volver al Menu Principal");
            System.out.print("Ingrese una Opcion: ");
            System.out.println("");
            eleccion = scanner.nextInt();

            switch (eleccion) {
                case 1:
                    System.out.print("Introduce el numero de la mesa: ");
                    int numeroMesa = scanner.nextInt();
                    Pedidos.SistemaPedidos.Pedido pedido = sistemaPedidos.new Pedido(sistemaPedidos.getPedidos().size() + 1, numeroMesa);
                    System.out.print("Introduce el numero de platos: ");
                    int numeroPlatos = scanner.nextInt();
                    for (int i = 0; i < numeroPlatos; i++) {
                        System.out.print("Introduce el nombre del plato: ");
                        String nombrePlato = scanner.next();
                        for (Menu.Plato plato : menu.getPlatos()) {
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
                    System.out.print("Introduce el nuevo estado (PENDIENTE, ENPROCESO, LISTO, ENTREGADO): ");
                    String nuevoEstado = scanner.next();
                    for (Pedidos.SistemaPedidos.Pedido p : sistemaPedidos.getPedidos()) {
                        if (p.getIdPedido() == idPedido) {
                            p.setEstado(Pedidos.SistemaPedidos.EstadoPedido.valueOf(nuevoEstado));
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
                    System.out.println("Volviendo al menu principal...");
                    break;
                default:
                    System.out.println("Opcion No Valida");
            }
        } while (eleccion != 5);
    }
}
