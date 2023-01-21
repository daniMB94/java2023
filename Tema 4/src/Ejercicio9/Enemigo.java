package Ejercicio9;

public class Enemigo {
	

	//ATRIBUTO
	private String nombre;
	private String clase;
	private int nivel;
	private int salud;
	private int danioArma;
	//CONSTRUCTOR PARAMETRIZADO
	/**
	 * @param nombre
	 * @param clase
	 * @param nivel
	 * @param salud
	 * @param dañoArma
	 */
	public Enemigo (String nombre, String clase, int danioArma) {
		super();
		this.nombre = nombre;
		this.clase = clase;
		this.nivel = 1;
		this.salud = 200;
		this.danioArma = danioArma;
	}
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
	 * @return the clase
	 */
	public String getClase() {
		return clase;
	}
	/**
	 * @param clase the clase to set
	 */
	public void setClase(String clase) {
		this.clase = clase;
	}
	/**
	 * @return the nivel
	 */
	public int getNivel() {
		return nivel;
	}
	/**
	 * @param nivel the nivel to set
	 */
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	/**
	 * @return the salud
	 */
	public int getSalud() {
		return salud;
	}
	/**
	 * @param salud the salud to set
	 */
	public void setSalud(int salud) {
		this.salud = salud;
	}
	/**
	 * @return the dañoArma
	 */
	public int getDanioArma() {
		return danioArma;
	}
	/**
	 * @param dañoArma the dañoArma to set
	 */
	public void setDañoArma(int dañoArma) {
		this.danioArma = dañoArma;
	}
	
	public void subirNivel() {
		this.nivel++;
		this.salud = (int) (this.salud + (Math.pow(2.5, this.nivel)));
	}
	
	public void recibirDanio(int danio) {
		
		if(this.danioArma <= 0)
			danio = 10;
		else danio = this.danioArma;
		this.salud = this.salud - danio;
	}
	
	public void golpear(Jugador enemigo) {
		enemigo.recibirDanio(this.getDanioArma());
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Enemigo [nombre=");
		builder.append(nombre);
		builder.append(", clase=");
		builder.append(clase);
		builder.append(", nivel=");
		builder.append(nivel);
		builder.append(", salud=");
		builder.append(salud);
		builder.append(", danioArma=");
		builder.append(danioArma);
		builder.append("]");
		return builder.toString();
	}
	
}
