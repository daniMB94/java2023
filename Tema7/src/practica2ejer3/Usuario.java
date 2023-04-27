package practica2ejer3;

import java.util.HashMap;

public class Usuario {

	private static int idGeneral = 0;
	
	private int id;
	private String nombre;
	private String email;
	private String nick;
	private HashMap<Integer, Puntuacion> puntuaciones;
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
	public HashMap<Integer, Puntuacion> getPuntuaciones() {
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
	
	//Métodos
	public void addPuntuacion(Integer idJuego, boolean haGanado, int puntos) {
		
		int posicio;
	}
	
	
}
