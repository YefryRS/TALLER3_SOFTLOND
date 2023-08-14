import java.util.ArrayList;
import java.util.List;

public class Main {
    /* 4. Juego de cartas: Crea un juego de cartas en el que puedas representar diferentes tipos de cartas (por ejemplo, cartas de póker) utilizando una jerarquía de clases y una interfaz. La interfaz podría definir métodos como mostrarCarta y valorNumerico. Luego, implementa clases para los diferentes tipos de cartas y para la baraja. */
    
    public static void main(String[] args) {
        Baraja baraja = new Baraja();
        baraja.barajar();

        List<Carta> jugador1 = new ArrayList<>();
        List<Carta> jugador2 = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            jugador1.add(baraja.repartirCarta());
            jugador2.add(baraja.repartirCarta());
        }

        System.out.println("Cartas del Jugador 1:");
        for (Carta carta : jugador1) {
            System.out.println(carta.mostrarCarta());
        }

        System.out.println("---------------------------------------------");

        System.out.println("Cartas del Jugador 2:");
        for (Carta carta : jugador2) {
            System.out.println(carta.mostrarCarta());
        }
    }

}