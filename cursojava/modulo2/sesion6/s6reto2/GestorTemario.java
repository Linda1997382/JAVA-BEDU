package Sesion6Reto2;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Comparator;

public class GestorTemario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CopyOnWriteArrayList<Tema> temasActivos = new CopyOnWriteArrayList<>();
        ConcurrentHashMap<String, String> recursosPorTema = new ConcurrentHashMap<>();

        System.out.println("📋 Ingrese temas (escribe 'fin' para terminar):");

        while (true) {
            System.out.print("Título del tema (escribe 'fin' cuando ya no quieras agregar más): ");
            String titulo = scanner.nextLine();

            if (titulo.equalsIgnoreCase("fin")) {
                break;
            }

            System.out.print("Prioridad (1 = urgente, 2 = importante, 3 = opcional): ");
            int prioridad = Integer.parseInt(scanner.nextLine());

            temasActivos.add(new Tema(titulo, prioridad));

            System.out.print("Recurso o enlace asociado: ");
            String recurso = scanner.nextLine();
            recursosPorTema.put(titulo, recurso);

            System.out.println();
        }

        // Orden alfabético
        System.out.println("\n📘 Temas ordenados alfabéticamente:");
        Collections.sort(temasActivos);
        for (Tema t : temasActivos) {
            System.out.println(t);
        }

        // Orden por prioridad
        System.out.println("\n🔥 Temas ordenados por prioridad:");
        temasActivos.sort(Comparator.comparingInt(Tema::getPrioridad));
        for (Tema t : temasActivos) {
            System.out.println(t);
        }

        // Mostrar recursos
        System.out.println("\n📚 Repositorio de recursos:");
        for (String titulo : recursosPorTema.keySet()) {
            System.out.println(titulo + " → " + recursosPorTema.get(titulo));
        }

        // Búsqueda por título
        System.out.print("\n🔍 Buscar recurso por título de tema: ");
        String buscar = scanner.nextLine();
        if (recursosPorTema.containsKey(buscar)) {
            System.out.println("📎 Recurso: " + recursosPorTema.get(buscar));
        } else {
            System.out.println("⚠️ Tema no encontrado.");
        }

        scanner.close();
    }
}
