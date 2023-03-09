package P1_7;

import java.util.ArrayList;
import java.util.Objects;

public class Multimedia implements Reproducible{

	private String nombre;
	private int duracion;
	private int año;
	private ArrayList<Autor> autores;
	private int reproducciones;
	/**
	 * @param nombre
	 * @param segundos
	 * @param año
	 * @param autores
	 * @param reproducciones
	 */
	public Multimedia(String nombre, int duracion) {
		super();
		this.nombre = nombre;
		this.duracion = duracion;
		this.año = 2000;
		this.autores = new ArrayList<>();
		this.reproducciones = 0;
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
	 * @return the año
	 */
	public int getAño() {
		return año;
	}
	/**
	 * @param año the año to set
	 */
	public void setAño(int año) {
		this.año = año;
	}
	/**
	 * @return the autores
	 */
	public ArrayList<Autor> getAutores() {
		return autores;
	}
	/**
	 * @param autores the autores to set
	 */
	public void setAutores(ArrayList<Autor> autores) {
		this.autores = autores;
	}
	/**
	 * @return the reproducciones
	 */
	public int getReproducciones() {
		return reproducciones;
	}
	/**
	 * @param reproducciones the reproducciones to set
	 */
	public void setReproducciones(int reproducciones) {
		this.reproducciones = reproducciones;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Multimedia [nombre=");
		builder.append(nombre);
		builder.append(", duracion=");
		builder.append(duracion);
		builder.append(", autores=");
		builder.append(autores);
		builder.append("]");
		return builder.toString();
	}
	@Override
	public int hashCode() {
		return Objects.hash(duracion, nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Multimedia other = (Multimedia) obj;
		return duracion == other.duracion && Objects.equals(nombre, other.nombre);
	}
	
	//Metodos
	
	public void addAutor(Autor nombreAutor) {
		autores.add(nombreAutor);
	}
	
	public void delAutor(int posicion) {
		autores.remove(posicion);
	}
	
	
	@Override
	public void reproducir() {
		
		System.out.println("Reproduciendo " + this.nombre);
		this.setReproducciones(this.reproducciones++);
		
	}
	
	
	
}
