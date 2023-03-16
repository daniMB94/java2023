package ExamenEvaluacion;

public class Ropa extends Producto {

	enum Talla {
		XS, S, M, L, XL, XXL
	};

	enum Color {
		BLANCO, ROJO, AMARILLO, AZUL, VERDE, NEGRO, GRIS, ROSA
	};

	enum Tipo {
		PANTALON, CAMISETA, SUDADERA
	};

	private Talla talla;
	private Color color;
	private Tipo tipo;

	public Ropa(int codigo, String nombre, String descripcion, double precio, int unidadesStock, Talla talla,
			Color color, Tipo tipo) {
		super(codigo, nombre, descripcion, precio, unidadesStock);
		this.talla = talla;
		this.color = color;
		this.tipo = tipo;

	}

	public Ropa(Ropa otroR) {
		super(otroR);
		this.codigo = otroR.codigo;
		this.nombre = otroR.nombre;
		this.descripcion = otroR.descripcion;
		this.precio = otroR.precio;
		this.unidadesStock = otroR.unidadesStock;
		this.talla = otroR.talla;
		this.color = otroR.color;
		this.tipo = otroR.tipo;

	}

	/**
	 * @return the talla
	 */
	public Talla getTalla() {
		return talla;
	}

	/**
	 * @param talla the talla to set
	 */
	public void setTalla(Talla talla) {
		this.talla = talla;
	}

	/**
	 * @return the color
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(Color color) {
		this.color = color;
	}

	/**
	 * @return the tipo
	 */
	public Tipo getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Ropa [codigo=");
		builder.append(codigo);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", unidadesStock=");
		builder.append(unidadesStock);
		builder.append(", talla=");
		builder.append(talla);
		builder.append(", color=");
		builder.append(color);
		builder.append(", tipo=");
		builder.append(tipo);
		builder.append("]");
		return builder.toString();
	}

	// Método descuento
	public double descuento() {
		double descuento = super.descuento();
		if (this.talla.equals(talla.XS) || this.talla.equals(talla.XXL))
			descuento = 0.05;
		return descuento;

	}

}
