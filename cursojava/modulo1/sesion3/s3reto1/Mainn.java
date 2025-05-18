package Sesion3Reto1;

public class Mainn {
   public Mainn() {
   }

   public static void main(String[] var0) {
      Pasajeros var1 = new Pasajeros("Ana Martínez", "P12345");
      Vuelos var2 = new Vuelos("UX123", "París", "14:30");
      var2.reservarAsiento(var1);
      System.out.println(var2.obtenerItinerario());
      var2.cancelarReserva();
      System.out.println(var2.obtenerItinerario());
      var2.reservarAsiento("Mario Gonzalez", "P54321");
      System.out.println(var2.obtenerItinerario());
   }
}