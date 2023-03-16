package ExamenEvaluacion;

import java.time.LocalDate;
import java.util.ArrayList;

import P1_5.Autor;

public class Compra implements Enviable {

	private ArrayList<LineaCompra> lineasCompra;
	private LocalDate fechaCompra;
	private double precioTotal;

	/**
	 * @param fechaCompra
	 */
	public Compra(LocalDate fechaCompra) {
		super();
		this.fechaCompra = fechaCompra;
		this.lineasCompra = new ArrayList<>();
	}

	/**
	 * @return the fechaCompra
	 */
	public LocalDate getFechaCompra() {
		return fechaCompra;
	}

	/**
	 * @param fechaCompra the fechaCompra to set
	 */
	public void setFechaCompra(LocalDate fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	/**
	 * @return the lineasCompra
	 */
	public ArrayList<LineaCompra> getLineasCompra() {
		return lineasCompra;
	}

	/**
	 * @return the precioTotal
	 */
	public double getPrecioTotal() {
		return precioTotal;
	}

	// Hemos modificado el ToString() para poder usarlo en el método crearEmail();
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		for (LineaCompra lcSB : this.lineasCompra) {
			builder.append(lcSB.toString());
			builder.append("\n");
		}

		builder.append(", fechaCompra=");
		builder.append(fechaCompra);
		builder.append("\n");
		builder.append(", precioTotal=");
		builder.append(precioTotal);
		return builder.toString();
	}

	// Método addlinea
	public void addLinea(LineaCompra lc) {

		// Booleano para saber si se añade la linea o no
		boolean aniadir = true;
		// Recorremos el ArrayList y comprobamos si coincide por producto con "lc". De
		// ser así
		// nos metemos en el if y ponemos la variable de añadir a "false" y sumamos a la
		// cantidad
		// del objeto que ha igualado a "lc" la cantidad que tiene "lc"
		for (LineaCompra aEncontrar : this.lineasCompra) {
			if (aEncontrar.equals(lc)) {
				aniadir = false;
				aEncontrar.setCantidad(aEncontrar.getCantidad() + lc.getCantidad());
			}

		}
		// Si en ningún momento existiera la LineaCompra que estamos comparando pues
		// simplemente la añadimos y actualizamos el precioTotal de Compra.
		if (aniadir) {
			this.lineasCompra.add(lc);
			this.precioTotal = this.getPrecioTotal() + lc.subtotal();
		}

	}

	public void delLinea(LineaCompra lc) {
		// Creamos variable indice para borrar fuera del for each
		int indiceLineaCompraABorrar = 0;
		// Creamos varaible booleana para borrar solo si se encuentra esa "lc"
		boolean borrar = false;
		for (LineaCompra aEncontrar : this.lineasCompra) {
			if (aEncontrar.equals(lc)) {
				borrar = true;
				indiceLineaCompraABorrar = this.lineasCompra.indexOf(aEncontrar);
			}

		}
		if (borrar)
			this.lineasCompra.remove(indiceLineaCompraABorrar);
		else
			System.out.println("No se puede borrar porque no existe en el ArrayList");
	}

	@Override
	public String crearEmail() {

		String emailConfirmacion = null;
		StringBuilder sb = new StringBuilder();
		sb.append("Usted ha realizado una Compra en Deportes Martos S.L. \n");
		sb.append("***************************************************** \n");
		sb.append("El detalle del pedido se especifíca abajo: \n");
		sb.append(this.toString());
		sb.append("Gracias por realizar su pedido");

		return sb.toString();
	}

}
