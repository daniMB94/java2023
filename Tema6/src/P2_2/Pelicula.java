package P2_2;

public class Pelicula extends Multimedia {

	private int duracion;

	/**
	 * @param titulo
	 * @param plus
	 * @param precio
	 * @param duracion
	 */
	public Pelicula(String titulo, Boolean plus, double precio, int duracion, Genero.GeneroMulti generoMulti) {
		super(titulo, plus, precio, generoMulti);
		this.duracion = duracion;
	}

	/**
	 * @return the duracion
	 */
	public int getDuracion() {
		return duracion;
	}

	/**
	 * @param duracion the duracion to set
	 */
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pelicula [titulo=");
		builder.append(titulo);
		builder.append(", plus=");
		builder.append(plus);
		builder.append(", precio=");
		builder.append(precio);
		builder.append(", generoMulti=");
		builder.append(generoMulti);
		builder.append(", duracion=");
		builder.append(duracion);
		builder.append("]");
		return builder.toString();
	}
	
	
}
