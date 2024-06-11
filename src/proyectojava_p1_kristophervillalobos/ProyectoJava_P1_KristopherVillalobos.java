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
}
