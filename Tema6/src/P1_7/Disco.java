package P1_7;

import java.time.LocalDate;
import java.util.ArrayList;

public class Disco {
	
	private Autor autor;
	private String titulo;
	private LocalDate fecha;
	private String grupo;
	private String discográfica;
	private ArrayList<Cancion> canciones;
	/**
	 * @param titulo
	 * @param fecha
	 * @param grupo
	 * @param discográfica
	 */
	public Disco(String titulo, LocalDate fecha, String grupo, String discográfica) {
		super();
		this.titulo = titulo;
		this.fecha = fecha;
		this.grupo = grupo;
		this.discográfica = discográfica;
		this.canciones = new ArrayList<>();
	}
	
	public void addCancion(Cancion c) {
		c.setDisco(this);
		this.canciones.add(c);
	}
	
	

}
