package practica2ejer3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.TreeMap;

public class Stim {

	private ArrayList<Juego> juegos;
	private LinkedList<Usuario> jugadores;

	public Stim() {
		super();
		this.juegos = new ArrayList<>();
		this.jugadores = new LinkedList<>();
	}

	public ArrayList<Juego> getJuegos() {
		return juegos;
	}

	public LinkedList<Usuario> getJugadores() {
		return jugadores;
	}

	// Métodos
	public void addJuego(Juego j) {

		if (this.juegos.indexOf(j) < 0)
			this.juegos.add(j);

	}

	public void delJuego(Juego j) {
		if (this.juegos.indexOf(j) > 0)
			this.juegos.remove(j);
	}

	public void addJugador(Usuario u) {
		if (this.jugadores.indexOf(u) < 0)
			this.jugadores.add(u);
	}

	public StringBuilder listarJugadores() {
		StringBuilder sb = new StringBuilder();

		for (Usuario jugador : this.jugadores) {
			sb.append("* " + jugador.getNombre());
			sb.append("\n");
		}

		return sb;
	}

	public StringBuilder listarJuegos() {
		StringBuilder sb = new StringBuilder();

		for (Juego juego : this.juegos) {
			sb.append("* " + juego.getNombre());
			sb.append("\n");
		}

		return sb;
	}

	public TreeMap<Usuario, Puntuacion> obtenerPuntuaciones(Juego j) {
		TreeMap<Usuario, Puntuacion> puntuaciones = new TreeMap<>();
		Puntuacion p = new Puntuacion();

		for (Juego juego : this.juegos) {
			if (juego.equals(j))
				for (Usuario usuario : this.jugadores) {
					if (usuario.getPuntuaciones() != null)
						puntuaciones.put(usuario, obtenerPuntu(juego, usuario));

				}

		}

		return puntuaciones;
	}

	private Puntuacion obtenerPuntu(Juego j, Usuario u) {
		return u.getPuntuaciones().get(j);
	}
	
	

}
