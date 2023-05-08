package practica3ejer1;

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
	
	
	
}
