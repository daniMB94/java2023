package Practica6;

import java.util.ArrayList;

import Practica5.Producto;

public class Tienda {

	private ArrayList<Producto> productos;
	private double ventasTotales; // €

	public Tienda() {
		this.productos = new ArrayList<>();
		this.ventasTotales = 0;
	}

	// METODOS
	public void adquirirProducto(Producto prod) {

		// Utiliza el equals por ID de modo que si existe el producto no lo añade
		// indexOf -> negativo si no lo encuentra, positivo o cero si sí lo encuentra
		if (this.productos.indexOf(prod) < 0)

			this.productos.add(prod);
	}

	public void venderProducto(int identificador, int cantidad) {

		// Me creo un objeto producto con el identificador a localizar
		Producto aBuscar = new Producto();
		aBuscar.setId(identificador);
		int posicion = this.productos.indexOf(aBuscar);
		// Se entra en el if si el producto está
		if (posicion >= 0) {
			Producto pr = this.productos.get(posicion);
			if (pr.getUnidadesDisponibles() >= cantidad) {
				pr.vender(cantidad);
				
				//Actualizar ventas
				this.ventasTotales += pr.getPrecioUnitario() * cantidad * (1- pr.getDescuento());
			}

		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Tienda [ventasTotales=");
		builder.append(ventasTotales);
		builder.append(", productos=");
		builder.append(productos);
		builder.append("]");
		return builder.toString();
	}

}
