package ExamenEvaluacion;

import java.util.Objects;

public class LineaCompra {

	private int orden;
	private Producto productoCarrito;
	private int cantidad;

	/**
	 * @param orden
	 * @param productoCarrito
	 * @param cantidad
	 */
	public LineaCompra(int orden, Producto productoCarrito, int cantidad) {
		super();
		this.orden = orden;
		this.productoCarrito = productoCarrito;
		this.cantidad = cantidad;
	}

	/**
	 * @return the orden
	 */
	public int getOrden() {
		return orden;
	}

	/**
	 * @param orden the orden to set
	 */
	public void setOrden(int orden) {
		this.orden = orden;
	}

	/**
	 * @return the productoCarrito
	 */
	public Producto getProductoCarrito() {
		return productoCarrito;
	}

	/**
	 * @param productoCarrito the productoCarrito to set
	 */
	public void setProductoCarrito(Producto productoCarrito) {
		this.productoCarrito = productoCarrito;
	}

	/**
	 * @return the cantidad
	 */
	public int getCantidad() {
		return cantidad;
	}

	/**
	 * @param cantidad the cantidad to set
	 */
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LineaCompra [orden=");
		builder.append(orden);
		builder.append(", productoCarrito=");
		builder.append(productoCarrito);
		builder.append(", cantidad=");
		builder.append(cantidad);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(productoCarrito);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LineaCompra other = (LineaCompra) obj;
		return Objects.equals(productoCarrito, other.productoCarrito);
	}

	// Método subtotal
	public double subtotal() {
		double subtotal = 0;
		subtotal = this.cantidad * this.productoCarrito.getPrecio() * (1-productoCarrito.descuento());
		return subtotal;
	}
	
	

}
