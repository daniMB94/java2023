package ExamenEvaluacion;

import java.util.Objects;

public class Producto implements Descontable {

	protected int codigo;
	protected String nombre;
	protected String descripcion;
	protected double precio;
	protected int unidadesStock;

	/**
	 * @param codigo
	 * @param nombre
	 * @param descripcion
	 * @param precio
	 * @param unidadesStock
	 */
	public Producto(int codigo, String nombre, String descripcion, double precio, int unidadesStock) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.unidadesStock = unidadesStock;
	}

	public Producto(Producto otroP) {
		super();
		this.codigo = otroP.codigo;
		this.nombre = otroP.nombre;
		this.descripcion = otroP.descripcion;
		this.precio = otroP.precio;
		this.unidadesStock = otroP.unidadesStock;
	}

	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
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
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/**
	 * @return the unidadesStock
	 */
	public int getUnidadesStock() {
		return unidadesStock;
	}

	/**
	 * @param unidadesStock the unidadesStock to set
	 */
	public void setUnidadesStock(int unidadesStock) {
		this.unidadesStock = unidadesStock;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
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
		return Objects.equals(codigo, other.codigo);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Producto [codigo=");
		builder.append(codigo);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", descripcion=");
		builder.append(descripcion);
		builder.append(", precio=");
		builder.append(precio);
		builder.append(", unidadesStock=");
		builder.append(unidadesStock);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public double descuento() {
		double descuento = 0.03;
		return descuento;
	}

}
