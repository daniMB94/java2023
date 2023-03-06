package Practica8;

import java.util.ArrayList;
import java.util.Iterator;

public class Partida {

	private static ArrayList<Enemigo> legion;
	private static Jugador unJugador;

	public Partida(Jugador unJugador) {
		super();
		this.legion = new ArrayList<>(100);
		this.unJugador = unJugador;
	}

	public void iniciarPartida() {
		for (int i = 0; i < 100; i++) {
			legion.add(new Enemigo());
		}
		Arma armaEquipar = new Arma();
		unJugador.equiparArma(armaEquipar);
	}

	public boolean turnoJugador() {
		int dejarDeAtacar = 0;
		//TUVE QUE BUSCAR POR INTERNET COMO ELIMINAR DEL ARRAYLIST SIN QUE DIERA ERROR
		for (Iterator<Enemigo> iterador = legion.iterator(); iterador.hasNext();) {
			Enemigo e = iterador.next();
			if (e.getSalud() > 0 && dejarDeAtacar == 0) {
				this.unJugador.golpear(e);
				dejarDeAtacar++;
			}
			if (e.getSalud() < 0)
				iterador.remove();
		}

		if (legion.size() == 0)
			return true; // Ha ganado el jugador porque no quedan enenigos
		else
			return false; // El juego continua porque quedan enemigos vivos
	}
	
	//ESTE METODO DABA ERROR AL ELIMINAR DEL ARRAYLIST AL ENEMIGO MUERTO
	/*
	 * public boolean turnoJugador() { int dejarDeAtacar = 0;
	 * 
	 * for (Enemigo e : legion) {
	 * 
	 * if (e.getSalud() > 0 && dejarDeAtacar == 0) { this.unJugador.golpear(e);
	 * dejarDeAtacar++; } if (e.getSalud() < 0) legion.remove(legion.indexOf(e));
	 * 
	 * } if (legion.size() == 0) return true; // Ha ganado el jugador porque no
	 * quedan enenigos else return false; // El juego continua porque quedan
	 * enemigos vivos }
	 */

	public boolean turnoEnemigo() {
		int dejarDeAtacar = 0;
		for (Enemigo e : legion) {
			if (e.getSalud() > 0 && dejarDeAtacar == 0) {
				e.golpear(this.unJugador);
				dejarDeAtacar++;
			}

		}
		if (this.unJugador.getSalud() <= 0)
			return true; // significa que ha muerto se pierde la partida
		else
			return false; // significa que sigue vivo y sigue la partida
	}
	
}
