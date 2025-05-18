package Sesion2Reto1;

import java.util.Scanner;

public class Medicamentos{
    public static void main(String[] args){
        
        //Pido información al cliente
        SimuladorFarmacia datos= new SimuladorFarmacia();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el nombre del medicamento: ");
        datos.medicamento = scanner.nextLine();

        System.out.println("Ingresa el precio del medicamento: ");
        datos.precio = scanner.nextDouble();

        System.out.println("Ingresa la cantidad que portas: ");
        datos.cantidad = scanner.nextInt();

        //Realizo las operaciones        
        datos.total_sd = datos.precio*datos.cantidad;

        datos.descuento=datos.total_sd*.15;

        datos.total = (datos.total_sd <= 500) ? datos.total_sd : datos.total_sd - datos.descuento;

        datos.cristiano = (datos.total_sd <= 500) ? false : true;

        datos.mostrarInfo();
    }
}