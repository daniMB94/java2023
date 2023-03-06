package Practica8;

public class Enemigo {
	
	//ATRIBTUTOS

	enum ClaseEnemigo {
		ORCO, ESPECTRO, TROLL, BASTARDO, DRAGON, GUARDIAN
	}
	
	private String nombre;
	private ClaseEnemigo claseEnemigo;
	private double salud;
	
	//CONSTRUCTOR
	/**
	 * @param nombre
	 * @param claseEnemigo
	 * @param salud
	 */
	public Enemigo(String nombre, ClaseEnemigo claseEnemigo, double salud) {
		super();
		this.nombre = nombre;
		this.claseEnemigo = claseEnemigo;
		this.salud = salud;
		this.claseEnemigo = ClaseEnemigo.BASTARDO;
	}
	public Enemigo() {
		super();
		this.nombre = "Brutus";
		this.claseEnemigo = ClaseEnemigo.GUARDIAN;
		this.salud = 7;
	}
	//GETTERS Y SETTERS
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the claseEnemigo
	 */
	public ClaseEnemigo getClaseEnemigo() {
		return claseEnemigo;
	}
	/**
	 * @param claseEnemigo the claseEnemigo to set
	 */
	public void setClaseEnemigo(ClaseEnemigo claseEnemigo) {
		this.claseEnemigo = claseEnemigo;
	}
	/**
	 * @return the salud
	 */
	public double getSalud() {
		return salud;
	}
	/**
	 * @param salud the salud to set
	 */
	public void setSalud(double salud) {
		this.salud = salud;
	}
	//METODOS
	public void quitarVida(double danio) {
			if(this.salud > 0) 
			this.salud = this.salud - danio;
	}
	
	
	public void golpear(Jugador unJugador) {
		if(unJugador.getSalud() > 0)
		unJugador.setSalud(unJugador.getSalud()-30);
	}
}

