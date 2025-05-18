package Sesion2Reto1;

public class SimuladorFarmacia{
    String medicamento;
    double precio, total_sd, total, descuento;
    int cantidad;
    boolean cristiano;

    public void mostrarInfo(){
        
        System.out.println("Medicamento: "+medicamento);

        System.out.println("Cantidad: "+cantidad);

        System.out.println("Precio unitario: "+precio);

        System.out.println("Total sin descuento: "+total_sd);

        System.out.println("¿Aplica el descuento?: "+cristiano);

        System.out.println("Descuento: "+descuento);

        System.out.print("Total a pagar: "+total);  
    }
    
    
}