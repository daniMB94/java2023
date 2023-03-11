package P1_7;

import java.time.LocalDate;

public class Podcast extends Multimedia {


	private LocalDate fecha;
	private int capitulo;
	
	public Podcast(String nombre, int duracion, LocalDate fecha, int capitulo) {
		super(nombre, duracion);
		
		this.fecha = fecha;
		this.capitulo = capitulo;
		
	}

	/**
	 * @return the fecha
	 */
	public LocalDate getFecha() {
		return fecha;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	/**
	 * @return the capitulo
	 */
	public int getCapitulo() {
		return capitulo;
	}

	/**
	 * @param capitulo the capitulo to set
	 */
	public void setCapitulo(int capitulo) {
		this.capitulo = capitulo;
	}

	@Override
	public void reproducir() {
		super.reproducir();
		System.out.println("Reproduciendo " + this.getNombre() + " en " + this.getFecha() + ", capítulo " + this.getCapitulo());
	}
	
	

	
	
}
