package Sesion6Reto1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;

public class RegistroMuestras {
    public static void main(String[] args){
        ArrayList<String> listaEspecies = new ArrayList<>();
        listaEspecies.add("Homo sapiens");
        listaEspecies.add("Mus musculus");
        listaEspecies.add("Arabidopsis thaliana");
    

    HashSet<String> especiesUnicas = new HashSet<>(listaEspecies);

    HashMap<String, String> mapaMuestras = new HashMap<>();
    mapaMuestras.put("M-001", " Dra. López");
    mapaMuestras.put("M-002", " Dr. Hernandez");
    mapaMuestras.put("M-003", " Dra. Ramírez");

    System.out.println("Lista completa de especies en orden de llegada: ");
    for (String especie : especiesUnicas) {
        System.out.println("- " + especie);
    }

    System.out.println("\n Relación de ID de muestra e investigador: ");
    for (String id : mapaMuestras.keySet()) {
        System.out.println("- " + id + mapaMuestras.get(id));
    }

    String idBusqueda = "M-002";
    System.out.println("\n Búsqueda del investigador responsable de la muestra " + idBusqueda + ":");
    if (mapaMuestras.containsKey(idBusqueda)) {
        System.out.println("Investigador: " + mapaMuestras.get(idBusqueda));
    } else {
        System.out.println("No se encontró información para el ID: " + idBusqueda);
    }

    }
}
