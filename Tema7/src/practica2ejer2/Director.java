package practica2ejer2;

import java.util.ArrayList;
import java.util.Objects;

public class Director implements Comparable<Director> {

	private static int idGeneral = 0;
	private int id;
	private String nombre;
	private ArrayList<Pelicula> peliculas;
	
	public Director(String nombre) {
		super();
		idGeneral++;
		this.id = idGeneral;
		this.nombre = nombre;
		this.peliculas = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static int getIdGeneral() {
		return idGeneral;
	}

	public int getId() {
		return id;
	}

	public ArrayList<Pelicula> getPeliculas() {
		return peliculas;
	}

	//Se tiene que eliminar Peliculas porque si no da error al imprimir Peliculas
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Director [id=");
		builder.append(id);
		builder.append(", nombre=");
		builder.append(nombre);
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
		Director other = (Director) obj;
		return id == other.id;
	}
	
	public void addPelicula(Pelicula p) {
		if(this.peliculas.indexOf(p) <= 0) 
			this.peliculas.add(p);
 else
			System.out.println("Ese elemento ya existe en la lista");
	}
	
	public void deletePelicula(Pelicula p) {
		int posicion = this.peliculas.indexOf(p);
		if(posicion > 0)
			System.out.println("No se puede eliminar porque no existe");
		else
			this.peliculas.remove(posicion);
		
	}

	@Override
	public int compareTo(Director o) {
		
		return this.getNombre().compareTo(o.getNombre());
	}
	
}
