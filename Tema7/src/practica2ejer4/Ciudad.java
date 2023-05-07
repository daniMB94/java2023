package practica2ejer4;

import java.util.Objects;

public class Ciudad {

	private static int codigo = 0;
	
	private int codigoCiudad;
	private String nombre;
	private Pais pais;
	public Ciudad(String nombre, Pais pais) {
		super();
		this.codigoCiudad = Ciudad.codigo++;
		this.nombre = nombre;
		this.pais = pais;
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
	 * @return the pais
	 */
	public Pais getPais() {
		return pais;
	}
	/**
	 * @param pais the pais to set
	 */
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	/**
	 * @return the codigoCiudad
	 */
	public int getCodigoCiudad() {
		return codigoCiudad;
	}
	


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Ciudad [nombre=");
		builder.append(nombre);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigoCiudad);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ciudad other = (Ciudad) obj;
		return codigoCiudad == other.codigoCiudad;
	}
	
	
}
