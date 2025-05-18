package Sesion2Reto2;

import java.util.Scanner;

public class Cajero {
    double saldo = 1000, depo_an, depo_de, reti_an;
    int x;

    Scanner scanner = new Scanner(System.in);

    public void mostrarInfo(){
        do{
            System.out.println("Bienvenido al cajero automático");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar saldo");
            System.out.println("3. Retirar saldo");
            System.out.println("4. Cancelar/n");
            
            x = scanner.nextInt();

            switch (x){
                case 1: 
                System.out.println("Su saldo actual es: "+saldo);
                System.out.println("Gracias ");
                break;
    
                case 2:
                System.out.println("¿Cuánto desea depositar? ");
                depo_an = scanner.nextDouble();

                saldo = saldo + depo_an;
    
                System.out.println("Su nuevo saldo es: "+saldo);
                break;
    
                case 3:
                System.out.println("¿Cuánto desea retirar? ");
                reti_an = scanner.nextDouble();
    
                saldo = saldo - reti_an;

                System.out.println("Su saldo nuevo es: "+saldo);
                break;  
                
                default:
                
                System.out.println("La opción que usted amable, cordial, gentil, inigualable, incomparable, imparable, dueño de las montañas, oceanos, mares, piramides, tierras, etc. seleccionó, es una opción invalida, incorrecta, no aceptable, desvaloralizada, intocable, despreciable, sin importancia y sobre todo sin una posible respuesta. ");
                break;
    
    
            }
        }
        while(x!=4);
    
        System.out.println("Gracias por su honorable servicio al usar este cajero, nuestros más cordiales saludos y bendiciones para usted, sus ancestros y sus futuras generaciones que se complaceran de usar tan valioso, exquisito, invaluable, inigualable, incomparable e increíble servicio");
    }
}