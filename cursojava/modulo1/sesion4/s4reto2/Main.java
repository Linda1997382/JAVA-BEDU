package Sesion4Reto2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el RFC del contribuyente: ");
        String rfcDeclaracion = scanner.nextLine();
        System.out.println("Ingresa  el monto declarado: ");
        double montoDeclarado = scanner.nextDouble();

        DeclaracionImpuestos declaracion = new DeclaracionImpuestos(rfcDeclaracion, montoDeclarado);

        scanner.nextLine();
        System.out.println("Ingresar el RFC de la cuenta fiscal: ");
        String rfcCuenta = scanner.nextLine();
        System.out.println("Ingresa el saldo disponible de la cuentafiscal: ");
        double saldoDisponible = scanner.nextDouble();

        CuentaFiscal cuenta = new CuentaFiscal(rfcCuenta, saldoDisponible);

        System.out.println("Declaración de impuestos: " + declaracion);
        System.out.println("Cuenta fiscal: RFC = " + cuenta.getRfc() + ", Saldo disponible: $" + cuenta.getSaldoDisponible());

        boolean rfcValido = cuenta.validarRFC(declaracion);
        System.out.println("¿El RFC coincide?: " + (rfcValido ? "Sí" : "No"));

        scanner.close();
    }
    
}
