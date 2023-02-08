package Practica5;

import java.util.Objects;

public class Producto {

	// ATRIBUTOS

	private int id;
	private String descripcion;
	private double precioUnitario;
	private int unidadesDisponibles;
	private int stockMaximo;
	private double descuento; // porcentaje

	// CONSTRUCTOR
	/**
	 * @param id
	 * @param descripcion
	 * @param precioUnitario
	 * @param unidadesDisponibles
	 * @param stock
	 * @param descuento
	 */
	public Producto(int id, String descripcion, double precioUnitario, int unidadesDisponibles, int stockMaximo,
			double descuento) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.precioUnitario = precioUnitario;
		this.unidadesDisponibles = unidadesDisponibles;
		this.stockMaximo = stockMaximo;
		this.descuento = descuento;
	}

	public Producto() {
		super();
		this.id = 0;
		this.descripcion = "Producto prueba";
		this.precioUnitario = 0;
		this.unidadesDisponibles = 10;
		this.stockMaximo = 100;
		this.descuento = 0.1;

	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the precioUnitario
	 */
	public double getPrecioUnitario() {
		return precioUnitario;
	}

	/**
	 * @param precioUnitario the precioUnitario to set
	 */
	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	/**
	 * @return the unidadesDisponibles
	 */
	public int getUnidadesDisponibles() {
		return unidadesDisponibles;
	}

	/**
	 * @param unidadesDisponibles the unidadesDisponibles to set
	 */
	public void setUnidadesDisponibles(int unidadesDisponibles) {
		this.unidadesDisponibles = unidadesDisponibles;
	}

	/**
	 * @return the stockMaximo
	 */
	public int getStockMaximo() {
		return stockMaximo;
	}

	/**
	 * @param stockMaximo the stockMaximo to set
	 */
	public void setStockMaximo(int stockMaximo) {
		this.stockMaximo = stockMaximo;
	}

	/**
	 * @return the descuento
	 */
	public double getDescuento() {
		return descuento;
	}

	/**
	 * @param descuento the descuento to set
	 */
	public void setDescuento(double descuento) {
		this.descuento = descuento;
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
		Producto other = (Producto) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Producto [id=");
		builder.append(id);
		builder.append(", descripcion=");
		builder.append(descripcion);
		builder.append(", precioUnitario=");
		builder.append(precioUnitario);
		builder.append(", unidadesDisponibles=");
		builder.append(unidadesDisponibles);
		builder.append(", stockMaximo=");
		builder.append(stockMaximo);
		builder.append(", descuento=");
		builder.append(descuento);
		builder.append("]");
		return builder.toString();
	}

	// METODOS
	/**
	 * Si la cantidad es positiva y menor que las unidades disponibles, se resta de
	 * las unidades disponibles y devuelve true. En caso contrario devuelve false
	 * 
	 * @param cantidad
	 * @return
	 */
	public boolean vender(int cantidad) {

		if ((cantidad <= 0) || (this.unidadesDisponibles < cantidad)) {

			return false;
		} else {
			this.unidadesDisponibles -= cantidad;
			return true;
		}

	}

	/**
	 * Rellena las unidades disponibles de un producto, igualando al stock máximo.
	 * Devuelve la diferencia previa, es decir, en cuánto hemos aumentado las
	 * unidades disponibles.
	 * 
	 * @return
	 */
	public int reponer() {
		int diferencia;

		diferencia = this.stockMaximo - this.unidadesDisponibles;

		this.unidadesDisponibles = this.stockMaximo;
		return diferencia;
	}

}
