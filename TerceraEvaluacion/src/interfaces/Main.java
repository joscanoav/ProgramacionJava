package interfaces;

public class Main {

    public static void main(String[] args) {
        Jugable juego = new JuegoMoneda(); // Create a Jugable object using JuegoMoneda

        juego.iniciarJuego();
        for (int i = 0; i < 5; i++) { // Play 5 rounds
            juego.jugarRonda();
        }
        juego.mostrarResultados();
        juego.terminar();
    }
}