/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1_banco;

import java.util.Scanner;
/**
 *
 * @author tekke
 */
public class Ejercicio1_banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        while (true){
            System.out.println("Bienvenido a nuestro banco");
            
            
            System.out.print("Ingrese su nombre porfavor para procesar la información: ");
            String nombre = teclado.nextLine();
            
            System.out.print("Ingrese la cantidad de dinero a depositar: ");
            int monto = teclado.nextInt();
            
            System.out.println("\nEspecifique a que cuenta vas a realizar el depósito: \n1.- Cuenta Ahorro | 1% Anual\n2.- Cuenta corriente | 0.5% Anual\n3.- Cuenta a plazo fijo | 1.2% Mensual\n4.- Salir\n");
            int tipoC = teclado.nextInt();
            
            if (tipoC == 4){
                System.out.println("Hasta luego");
                break;
            }
            
            int plazoF = 0;
            if (tipoC == 3){
                System.out.println("A Cuantos meses deseas hacer tu depósito?\n1.- 3 Meses\n2.- 6 Meses\n");
                plazoF = teclado.nextInt();
            }
                     
            Usuarios usuario_1 = new Usuarios(nombre, monto, tipoC);
            
            System.out.println("Tu monto inicial era de: " + monto);
            System.out.println("Tu nuevo monto será de: " + usuario_1.tipoDeCuenta(monto, tipoC, plazoF) + " en base a tu cuenta seleccionada\n");
            
            System.out.println("Deseas ver otra cuenta?\n1.-Sí\n2.-No");
            int opcion = teclado.nextInt();
            if (opcion == 2){
                System.out.println("Hasta luego");
                break;
            }
            teclado.nextLine();
    }
    }
    
}
