package Sesion7Reto2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AnalizadorDeLogs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del archivo de logs a analizar: ");
        String archivoLogs = scanner.nextLine();
        scanner.close();

        analizarArchivo(archivoLogs);
    }

    public static void analizarArchivo(String archivo) {
        int totalLineas = 0;
        int errores = 0;
        int advertencias = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                totalLineas++;
                if (linea.contains("ERROR")) {
                    errores++;
                }
                if (linea.contains("WARNING")) {
                    advertencias++;
                }
            }

            System.out.println("Resumen del análisis:");
            System.out.println("Total de líneas leídas: " + totalLineas);
            System.out.println("Cantidad de errores: " + errores);
            System.out.println("Cantidad de advertencias: " + advertencias);
            double porcentaje = 0;
            if (totalLineas > 0) {
                porcentaje = ((double)(errores + advertencias) / totalLineas) * 100;
            }
            System.out.printf("Porcentaje de líneas con errores y advertencias: %.2f%%\n", porcentaje);

        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
            guardarError(e.getMessage());
        }
    }

    private static void guardarError(String mensaje) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("registro_fallos.txt", true))) {
            bw.write(mensaje);
            bw.newLine();
        } catch (IOException e) {
            System.err.println("No se pudo escribir en el archivo de registro de fallos: " + e.getMessage());
        }
    }
}
