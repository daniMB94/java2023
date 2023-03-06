package Practica8;

public class Arma {

	private String nombre;
	private double puntos;
	private int disparos;
	/**
	 * @param nombre
	 * @param puntos
	 * @param disparos
	 */
	public Arma(String nombre, double puntos, int disparos) {
		super();
		this.nombre = nombre;
		this.puntos = puntos;
		this.disparos = disparos;
	}
	public Arma() {
		this.nombre = "Sin arma";
		this.puntos = 20;
		this.disparos = 0;
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
	 * @return the puntos
	 */
	public double getPuntos() {
		return puntos;
	}
	/**
	 * @param puntos the puntos to set
	 */
	public void setPuntos(double puntos) {
		this.puntos = puntos;
	}
	/**
	 * @return the disparos
	 */
	public int getDisparos() {
		return disparos;
	}
	/**
	 * @param disparos the disparos to set
	 */
	public void setDisparos(int disparos) {
		this.disparos = disparos;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Arma [nombre=");
		builder.append(nombre);
		builder.append(", puntos=");
		builder.append(puntos);
		builder.append(", disparos=");
		builder.append(disparos);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
