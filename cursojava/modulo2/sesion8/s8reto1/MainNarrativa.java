package Sesion8Reto1;
public class MainNarrativa {
    private final TransicionHistoria transicion;
    private final GestorDialogo dialogo;
    private final LogicaDecision decision;

    public MainNarrativa(TransicionHistoria transicion, GestorDialogo dialogo, LogicaDecision decision) {
        this.transicion = transicion;
        this.dialogo = dialogo;
        this.decision = decision;
    }

    public void iniciarEscena() {
        dialogo.mostrarDialogo("Narrador", "Estás frente a un bosque oscuro...");
        String eleccion = decision.tomarDecision();

        if (eleccion.equals("1")) {
            transicion.cambiarEscena("Bosque Misterioso");
            dialogo.mostrarDialogo("Narrador", "Te adentras en el bosque y escuchas un crujido.");
        } else if (eleccion.equals("2")) {
            transicion.cambiarEscena("Pueblo Tranquilo");
            dialogo.mostrarDialogo("Narrador", "Decides regresar al pueblo en busca de ayuda.");
        } else {
            dialogo.mostrarDialogo("Narrador", "No entendiste la elección. El mundo se queda en pausa...");
        }
    }

    public static void main(String[] args) {
        TransicionHistoria transicion = new TransicionSimple();
        GestorDialogo dialogo = new DialogoTexto();
        LogicaDecision decision = new DecisionBinaria();

        MainNarrativa juego = new MainNarrativa(transicion, dialogo, decision);
        juego.iniciarEscena();
    }
}
