package practica2ejer3;

import java.util.Objects;

public class Juego {

	private static int idGeneral = 0;
	
	private int id;
	private String nombre;
	private String plataforma;

	public Juego(String nombre, String plataforma) {
		super();
		this.id = Juego.idGeneral++;
		this.nombre = nombre;
		this.plataforma = plataforma;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(nombre);
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
		Juego other = (Juego) obj;
		return id == other.id;
	}
	
	
	
}
