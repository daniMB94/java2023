package ExamenEvaluacion;

public class Zapatillas extends Producto {

	enum Numero {
		n35, n36, n37, n38, n39, n40, n41, n42, n43, n44, n45, n46, n47, n48, n49, n50
	};

	enum Categoria {
		RUNNING, WALKING, FUTBOL, GIMNASIO, CHANCLAS, TRAIL, BALONCESTO, GOLF
	};

	private Numero numero;
	private Categoria categoria;

	public Zapatillas(int codigo, String nombre, String descripcion, double precio, int unidadesStock, Numero numero,
			Categoria categoria) {
		super(codigo, nombre, descripcion, precio, unidadesStock);
		this.numero = numero;
		this.categoria = categoria;
	}

	public Zapatillas(Zapatillas otraZ) {
		super(otraZ);
		this.codigo = otraZ.codigo;
		this.nombre = otraZ.nombre;
		this.descripcion = otraZ.descripcion;
		this.precio = otraZ.precio;
		this.unidadesStock = otraZ.unidadesStock;
		this.numero = otraZ.numero;
		this.categoria = otraZ.categoria;
	}

	/**
	 * @return the numero
	 */
	public Numero getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(Numero numero) {
		this.numero = numero;
	}

	/**
	 * @return the categoria
	 */
	public Categoria getCategoria() {
		return categoria;
	}

	/**
	 * @param categoria the categoria to set
	 */
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Zapatillas [codigo=");
		builder.append(codigo);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", unidadesStock=");
		builder.append(unidadesStock);
		builder.append(", numero=");
		builder.append(numero);
		builder.append(", categoria=");
		builder.append(categoria);
		builder.append("]");
		return builder.toString();
	}

	// Método descuento
	public double descuento() {
		double descuento = super.descuento();
		if (this.numero.equals(numero.n35) || this.numero.equals(numero.n47) || this.numero.equals(numero.n48)
				|| this.numero.equals(numero.n49) || this.numero.equals(numero.n50))
			descuento = 0.05;
		return descuento;
	}

}
