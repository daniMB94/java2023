package ExamenEvaluacion;

import java.util.ArrayList;

public class Tienda {

	private ArrayList<Producto> inventario;
	private ArrayList<Compra> historicoCompras;

	/**
	 * @param inventario
	 * @param historicoCompras
	 */
	public Tienda() {
		super();
		this.inventario = new ArrayList<>();
		this.historicoCompras = new ArrayList<>();
	}

	/**
	 * @return the inventario
	 */
	public ArrayList<Producto> getInventario() {
		return inventario;
	}

	/**
	 * @return the historicoCompras
	 */
	public ArrayList<Compra> getHistoricoCompras() {
		return historicoCompras;
	}

	// Método para pintar el inventario
	public String mostrarInventario() {

		StringBuilder sb = new StringBuilder();
		sb.append("***INVENTARIO***");
		sb.append("\n");
		for (Producto pStock : this.inventario) {
			sb.append(pStock.toString());
			sb.append("\n");
		}
		return sb.toString();

	}

	// Método para pintar las compras que han realizados los clientes y el total de
	// todo
	public String mostrarCompras() {
		double totalFacturado = 0;
		StringBuilder sb = new StringBuilder();
		sb.append("***HISTORIAL DE COMPRAS***");
		sb.append("\n");
		for (Compra cHistorico : this.historicoCompras) {
			sb.append(cHistorico.toString());
			sb.append("\n");
			totalFacturado = cHistorico.getPrecioTotal();
		}
		sb.append("LA FACTURACION TOTAL HA SIDO: ");
		sb.append(totalFacturado);
		sb.append("euros");

		return sb.toString();
	}

	// Método para para añadir un producto
	public void addProducto(Producto p) {
		this.inventario.add(p);
	}

	// Método para eliminar un producto
	public void delProducto(Producto p) {
		// Creamos variable indice para borrar fuera del for each
		int indiceLineaCompraABorrar = 0;
		// Creamos varaible booleana para borrar solo si se encuentra ese "p"
		boolean borrar = false;
		for (Producto aEncontrar : this.inventario) {
			if (aEncontrar.equals(p)) {
				borrar = true;
				indiceLineaCompraABorrar = this.inventario.indexOf(aEncontrar);
			}

		}
		if (borrar)
			this.inventario.remove(indiceLineaCompraABorrar);
		else
			System.out.println("No se puede borrar porque no existe en el ArrayList");
	}

	// Método para añadir una compra
	public String addCompra(Compra c) {
		String mensaje = "";
		int indiceProDecrementar = 0;
		boolean validarCompra = true;
		// Nos recorremos todos los productos del stock
		for (Producto pStock : this.inventario) {
			// Para cada producto del Stock
			// Nos recorremos todas las LineaCompra y vemos si ese producto tiene
			// más cantidad que la restante en Stock y además corresponde con el producto
			// que actualmente tenemos en la variable "PStock" (si no es el mismo producto
			// no nos interesa comparar la cantidad)
			for (int i = 0; i < c.getLineasCompra().size(); i++) {
				if (pStock.getUnidadesStock() < c.getLineasCompra().get(i).getCantidad()
						&& pStock.equals(c.getLineasCompra().get(i).getProductoCarrito())) {
					// En caso de que sean el mismo producto y haya menos en Stock que en
					// el carrito de la compra se invalida la compra y capturamos el índice
					validarCompra = false;

				}

			}

		}
		if (validarCompra) {
			for (Producto pStock : this.inventario) {
				for (int i = 0; i < c.getLineasCompra().size(); i++) {
					if (pStock.equals(c.getLineasCompra().get(i).getProductoCarrito()))
						
					pStock.setUnidadesStock(pStock.getUnidadesStock()-c.getLineasCompra().get(indiceProDecrementar).getCantidad());

				}

			}
			this.historicoCompras.add(c);
			mensaje = "Compra realizada";
		} else
			mensaje = "No se puede realizar la compra por falta de stock";
		return mensaje;
	}

}
