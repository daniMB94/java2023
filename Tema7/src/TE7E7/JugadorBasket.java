package TE7E7;

public class JugadorBasket {

	private String nombre;
	private String posicion;
	
	public JugadorBasket(String nombre, String posicion) {
		super();
		this.nombre = nombre;
		this.posicion = posicion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("JugadorBasket [nombre=");
		builder.append(nombre);
		builder.append(", posicion=");
		builder.append(posicion);
		builder.append("]");
		return builder.toString();
	}
	

	
	
}
