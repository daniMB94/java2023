package EjercicioPropuestoEnClase;

import java.util.ArrayList;

public class Receta {

	private String nombre;
	private ArrayList<Ingrediente> ingredientes;

	/**
	 * @param nombre
	 */
	public Receta(String nombre) {
		super();
		this.nombre = nombre;
		// Ahora añadimos el ArrayList en el constructor
		ingredientes = new ArrayList<>();

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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Receta: ");
		builder.append(nombre);
		builder.append("\n");

		for (Ingrediente ingre : this.ingredientes) {
			int contador = 0;

			builder.append(++contador);
			builder.append(" " + ingre.getNombre() + " ----> " + ingre.getCantidad() + " gramos");
			builder.append("\n");

		}

		return builder.toString();
	}

	// METODOS
	public void addIngrediente(Ingrediente ingre) {
		ingredientes.add(ingre);

	}

	public boolean eliminar(Ingrediente ingre) {
		int posicion = this.ingredientes.indexOf(ingre);

		if (posicion > 0) {
			ingredientes.remove(posicion);
			return true;
		} else {
			return false;
		}
	}

}
