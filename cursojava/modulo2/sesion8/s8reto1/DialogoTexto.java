package Sesion8Reto1;
public class DialogoTexto implements GestorDialogo {
    @Override
    public void mostrarDialogo(String personaje, String mensaje) {
        System.out.println(personaje + ": \"" + mensaje + "\"");
    }
}
