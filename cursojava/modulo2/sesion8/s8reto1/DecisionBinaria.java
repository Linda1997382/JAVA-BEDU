package Sesion8Reto1;
import java.util.Scanner;

public class DecisionBinaria implements LogicaDecision {
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public String tomarDecision() {
        System.out.println("¿Qué quieres hacer?");
        System.out.println("1. Entrar al bosque");
        System.out.println("2. Volver al pueblo");
        System.out.print("Elige (1 o 2): ");
        return scanner.nextLine();
    }
}
