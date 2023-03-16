package P2_2;

public class Episodio {
	
	private String titulo;
	private int duracion;
	private Temporada temporada;
	/**
	 * @param titulo
	 * @param duracion
	 * @param temporada
	 */
	public Episodio(String titulo, int duracion, Temporada temporada) {
		super();
		this.titulo = titulo;
		this.duracion = duracion;
		this.temporada = temporada;
	}
	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}
	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
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
	/**
	 * @return the temporada
	 */
	public Temporada getTemporada() {
		return temporada;
	}
	/**
	 * @param temporada the temporada to set
	 */
	public void setTemporada(Temporada temporada) {
		this.temporada = temporada;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Episodio [titulo=");
		builder.append(titulo);
		builder.append(", duracion=");
		builder.append(duracion);
		builder.append(", temporada=");
		builder.append(temporada);
		builder.append("]");
		return builder.toString();
	}
	

}
