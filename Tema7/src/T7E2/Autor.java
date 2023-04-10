package T7E2;

import java.util.Objects;

public class Autor implements Comparable<Autor>{
	
	public String nombre;
	public String apellidos;
	public int edad;
	public String ciudad;
	public String direccion;
	public String email;
	/**
	 * @param nombre
	 * @param apellidos
	 * @param edad
	 * @param ciudad
	 * @param direccion
	 * @param email
	 */
	public Autor(String nombre, String apellidos, int edad, String ciudad, String direccion, String email) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.ciudad = ciudad;
		this.direccion = direccion;
		this.email = email;
	}
	
	public Autor(String nombre, String apellidos) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;

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
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}
	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	/**
	 * @return the ciudad
	 */
	public String getCiudad() {
		return ciudad;
	}
	/**
	 * @param ciudad the ciudad to set
	 */
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}
	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Autor [nombre=");
		builder.append(nombre);
		builder.append(", apellidos=");
		builder.append(apellidos);
		builder.append(", edad=");
		builder.append(edad);
		builder.append(", ciudad=");
		builder.append(ciudad);
		builder.append(", direccion=");
		builder.append(direccion);
		builder.append(", email=");
		builder.append(email);
		builder.append("]");
		return builder.toString();
	}
	@Override
	public int hashCode() {
		return Objects.hash(apellidos);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Autor other = (Autor) obj;
		return Objects.equals(apellidos, other.apellidos);
	}

	@Override
	public int compareTo(Autor a) {
		
		return this.apellidos.compareTo(a.getApellidos());
	}
	
	

}
