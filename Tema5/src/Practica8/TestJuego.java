package Practica8;

import Practica8.Jugador.Clase;

public class TestJuego {

	public static void main(String[] args) {

		Jugador j1 = new Jugador("Dani", 500, Clase.ENANO);

		Partida p1 = new Partida(j1);

		p1.iniciarPartida();

		for (int i = 0; i < 100; i++) {
			if (i % 2 == 0) {
				p1.turnoEnemigo();
				if (p1.turnoEnemigo()) {
					System.out.println("Gana el enenigo. Fin");
					i = 50; // salimos del for porque ha terminado la partida

				}

			} else {
				p1.turnoJugador();
				if (p1.turnoJugador()) {
					System.out.println("Gana el jugador. Fin");
					i = 100; // salimos del for porque ha terminado la partida
				}

			}

		}

	}
}
