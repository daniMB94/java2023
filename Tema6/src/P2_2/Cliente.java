package P2_2;

import java.util.Objects;

public abstract class Cliente {
	
	

	protected String dni;
	protected String nombre;
	protected double precioMensual;
	/**
	 * @param dni
	 * @param nombre
	 */
	//El ejercicio dice que no le pasemos al constructor precioMensual pero si no lo hago
	//no me crea los objetos hijos con la propiedad precioMensual inicializada a la constante que
	//corresponda (3 si es primevideo o 5 si es primevideopro)
	public Cliente(String dni, String nombre, double precioMensual) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.precioMensual = precioMensual;
	}
	public Cliente() {
		super();
		this.dni = "12345678X";
		this.nombre = "ClienteVacio";
	}
	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}
	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
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
	 * @param precioMensual the precioMensual to set
	 */
	public void setPrecioMensual(double precioMensual) {
		this.precioMensual = precioMensual;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cliente [dni=");
		builder.append(dni);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", precioMensual=");
		builder.append(precioMensual);
		builder.append("]");
		return builder.toString();
	}
	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(dni, other.dni);
	}
	
	public abstract double getPrecioMensual();
	
	public abstract boolean esPro();
	
}
