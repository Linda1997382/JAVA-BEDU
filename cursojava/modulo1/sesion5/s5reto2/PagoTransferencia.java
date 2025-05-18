package Sesion5Reto2;

public class PagoTransferencia extends MetodoPago implements Autenticable{
    private boolean conexionBanco;

    public PagoTransferencia(double monto, boolean conexionBanco) {
        super(monto);
        this.conexionBanco = conexionBanco;
    }

    @Override
    public boolean autenticar(){
        return conexionBanco;
    }

    @Override 
    public void procesarPago(){
        System.out.println("Procesando transferencia bancaria por $" + monto);
    }
    
}
