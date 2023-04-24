package practica2ejer2;

import java.util.Objects;

public class Genero {
	
	private static int idGeneral = 0;
	private int id;
	private String nombre;
	public Genero(String nombre) {
		super();
		idGeneral++;
		this.id = this.idGeneral;
		this.nombre = nombre;
	}
	
	public int getIdGeneral() {
		return idGeneral;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Genero [nombre=");
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
		Genero other = (Genero) obj;
		return id == other.id;
	}
	
	
}
