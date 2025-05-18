package Sesion2Reto2;

 import java.util.Scanner;

    public class Opciones {
        public static void main(String[] args) {
            
            Scanner scanner = new Scanner(System.in);
            Cajero opciones = new Cajero();

            //Saldo cambiante
            switch(opciones.x){
                case 2:
                opciones.saldo = opciones.saldo + opciones.depo_an;
                break;

                case 3:
                opciones.saldo = opciones.saldo - opciones.reti_an;
                break;
            }


            opciones.mostrarInfo();

        }
    }