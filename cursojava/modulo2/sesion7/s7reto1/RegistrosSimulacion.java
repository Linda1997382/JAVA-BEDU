package Sesion7Reto1;
import java.io.IOException;
import java.nio.file.*;

public class RegistrosSimulacion {

    public static void main(String[] args) {
        try {
            guardarParametros();
            leerParametros();
        } catch (IOException e) {
            System.out.println("❌ Error al manejar el archivo: " + e.getMessage());
        }
    }

    // Método para escribir parámetros en un archivo
    public static void guardarParametros() throws IOException {
        Path directorio = Paths.get("config");
        Path archivo = directorio.resolve("parametros.txt");

        // Crear carpeta "config" si no existe
        if (!Files.exists(directorio)) {
            Files.createDirectories(directorio);
            System.out.println("📁 Carpeta 'config' creada.");
        }

        // Parámetros de simulación
        String parametros = """
            Tiempo de ciclo: 55.8 segundos
            Velocidad de línea: 1.2 m/s
            Número de estaciones: 8
            """;

        // Escribir parámetros en el archivo
        Files.writeString(archivo, parametros);
        System.out.println("✅ Parámetros guardados en: " + archivo.toAbsolutePath());
    }

    // Método para leer los parámetros del archivo
    public static void leerParametros() throws IOException {
        Path archivo = Paths.get("config", "parametros.txt");

        if (Files.exists(archivo)) {
            System.out.println("\n📄 Leyendo contenido de 'parametros.txt':\n");
            String contenido = Files.readString(archivo);
            System.out.println(contenido);
        } else {
            System.out.println("⚠️ El archivo 'parametros.txt' no fue encontrado.");
        }
    }
}
