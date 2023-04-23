package practica2ejer2;

import java.util.ArrayList;
import java.util.Objects;

public class Pelicula {

	private static int idGeneral = 0;
	private int id;
	private String titulo;
	private int anio;
	private ArrayList<Genero> generos;
	private ArrayList<Director> directores;
	
	public Pelicula(String titulo, int anio) {
		super();
		idGeneral++;
		this.id = idGeneral;
		this.titulo = titulo;
		this.anio = anio;
		this.generos = new ArrayList<>();
		this.directores = new ArrayList<>();
	}
	
	public int getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public static int getIdGeneral() {
		return idGeneral;
	}

	public ArrayList<Genero> getGeneros() {
		return generos;
	}

	public ArrayList<Director> getDirectores() {
		return directores;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pelicula [titulo=");
		builder.append(titulo);
		builder.append(", anio=");
		builder.append(anio);
		builder.append(", generos=");
		builder.append(generos);
		builder.append(", directores=");
		builder.append(directores);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pelicula other = (Pelicula) obj;
		return id == other.id;
	}
	
	public void addGenero(Genero g) {
		if(this.generos.indexOf(g) > 0) {
			this.generos.add(g);
			System.out.println("Añadido");;
		} else
			System.out.println("Ese elemento ya existe en la lista");;
	}
	
	public void deleteGenero(Genero g) {
		int posicion = this.generos.indexOf(g);
		if(posicion > 0)
			System.out.println("No se puede eliminar porque no existe");
		else
			this.generos.remove(posicion);
		
	}
	public void addDirector(Director d) {
		if(this.directores.indexOf(d) > 0) {
			this.directores.add(d);
			System.out.println("Añadido");;
		} else
			System.out.println("Ese elemento ya existe en la lista");;
	}
	
	public void deleteDirector(Director d) {
		int posicion = this.directores.indexOf(d);
		if(posicion > 0)
			System.out.println("No se puede eliminar porque no existe");
		else
			this.directores.remove(posicion);
		
	}
	
}
