package practica2ejer3;

import java.util.HashMap;
import java.util.Objects;

public class Usuario implements Comparable<Usuario> {

	private static int idGeneral = 0;

	private int id;
	private String nombre;
	private String email;
	private String nick;
	private HashMap<Juego, Puntuacion> puntuaciones;

	public Usuario(String nombre, String email, String nick) {
		super();
		this.id = Usuario.idGeneral++;
		this.nombre = nombre;
		this.email = email;
		this.nick = nick;
		this.puntuaciones = new HashMap<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public HashMap<Juego, Puntuacion> getPuntuaciones() {
		return puntuaciones;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Nick: ");
		builder.append(nick);
		builder.append(" - Email: ");
		builder.append(email);
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(nick);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(nick, other.nick);
	}

	// Métodos
	public void addPuntuacion(Juego idJuego, boolean haGanado, int puntos) {

		if (!this.puntuaciones.containsKey(idJuego)) {
			Puntuacion p = new Puntuacion();
			if (haGanado) {
				p.setPartidasGanadas(1);
				p.setPartidasJugadas(1);
			} else
				p.setPartidasPerdidas(1);
			p.setPartidasJugadas(1);
			p.setPuntos(puntos);
			this.puntuaciones.put(idJuego, p);

		} else {
			this.puntuaciones.get(idJuego).setPuntos(this.puntuaciones.get(idJuego).getPuntos() + puntos);
			this.puntuaciones.get(idJuego).setPartidasJugadas(this.puntuaciones.get(idJuego).getPartidasJugadas() + 1);
			if (haGanado)
				this.puntuaciones.get(idJuego)
						.setPartidasGanadas(this.puntuaciones.get(idJuego).getPartidasGanadas() + 1);
			else
				this.puntuaciones.get(idJuego)
						.setPartidasPerdidas(this.puntuaciones.get(idJuego).getPartidasPerdidas() + 1);

		}

	}

	/**
	 *
	 * @param idJuego
	 * @return la puntuacion total para ese juego en concreto
	 */
	public int puntuacion(Integer idJuego) {

		int puntos = this.puntuaciones.get(idJuego).getPuntos();
		return puntos;
	}

	@Override
	public int compareTo(Usuario o) {
		return this.nick.compareTo(o.getNick());
	}

}
