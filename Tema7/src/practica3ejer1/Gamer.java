package practica3ejer1;

import java.util.Objects;

public class Gamer {

	enum Nivel {
		DIOS, MAQUINA, BUENO, NORMAL, REGULAR, MALILLO, PAQUETE
	}

	private String nick;
	private String email;
	private String juego;
	private Nivel nivel;

	public Gamer(String nick, String email, String juego, Nivel nivel) {
		super();
		this.nick = nick;
		this.email = email;
		this.juego = juego;
		this.nivel = nivel;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getJuego() {
		return juego;
	}

	public void setJuego(String juego) {
		this.juego = juego;
	}

	public Nivel getNivel() {
		return nivel;
	}

	public void setNivel(Nivel nivel) {
		this.nivel = nivel;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("nick: " + "\t");
		builder.append(nick);
		builder.append("\n" + "email: " + "\t");
		builder.append(email);
		builder.append("\n" + "juego: " + "\t");
		builder.append(juego);
		builder.append("\n" + "nivel: " + "\t");
		builder.append(nivel);
		builder.append("\n\n");
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
		Gamer other = (Gamer) obj;
		return Objects.equals(nick, other.nick);
	}

}
