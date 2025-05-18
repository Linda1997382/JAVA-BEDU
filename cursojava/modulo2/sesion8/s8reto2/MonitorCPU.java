package Sesion8Reto2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MonitorCPU {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> consumos = new HashSet<>();  // Para evitar duplicados

        try {
            System.out.println("MONITOR DE CONSUMO DE CPU");
            System.out.print("¿Cuántos registros vas a ingresar? ");
            int cantidad = Integer.parseInt(scanner.nextLine());

            for (int i = 0; i < cantidad; i++) {
                System.out.print("Ingresa el consumo de CPU (%): ");
                String entrada = scanner.nextLine();

                try {
                    int valor = Integer.parseInt(entrada);

                    if (valor < 0 || valor > 100) {
                        System.out.println("El valor debe estar entre 0 y 100.");
                        i--; // Repetir esta entrada
                        continue;
                    }

                    if (!consumos.add(valor)) {
                        System.out.println("Valor duplicado, no se registrará.");
                        i--; // Repetir esta entrada
                        continue;
                    }

                    if (valor > 95) {
                        throw new ConsumoCriticoException("CONSUMO CRÍTICO DETECTADO: " + valor + "%");
                    }

                    System.out.println("Registro aceptado: " + valor + "%");

                } catch (NumberFormatException e) {
                    System.out.println("Entrada inválida. Ingresa un número entero.");
                    i--; // Repetir esta entrada
                } catch (ConsumoCriticoException e) {
                    System.out.println(e.getMessage());
                }
            }

        } catch (NumberFormatException e) {
            System.out.println("Número inválido de registros.");
        } finally {
            System.out.println("Finalizando monitoreo...");
            scanner.close(); // Siempre cerramos el Scanner
        }
    }
}
