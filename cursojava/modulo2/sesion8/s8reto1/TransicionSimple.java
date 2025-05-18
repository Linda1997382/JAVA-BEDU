package Sesion8Reto1;
public class TransicionSimple implements TransicionHistoria {
    @Override
    public void cambiarEscena(String nuevaEscena) {
        System.out.println("La historia avanza a la escena: " + nuevaEscena);
    }
}
