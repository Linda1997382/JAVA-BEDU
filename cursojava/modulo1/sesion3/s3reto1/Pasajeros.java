package Sesion3Reto1;

public class Pasajeros{
    private String nombre;
    private String pasaporte;

    //Constructor para crear un pasajero
    public Pasajeros(String nombre, String pasaporte) {
        this.nombre = nombre;
        this.pasaporte = pasaporte;
    }

    //Para la info del pasajero
    public String getNombre(){
        return nombre;
    }

    public String getPasaporte(){
        return pasaporte;
    }
}