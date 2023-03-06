package Practica4;

public class Libro {

	private String ISBN;
	private String titulo;
	private String autor;
	private int nPaginas;
	private double precioCompra;
	private double precioVenta;
	private boolean vendido;
	/**
	 * @param iSBN
	 * @param titulo
	 * @param autor
	 * @param nPaginas
	 * @param precioCompra
	 * @param precioVenta
	 * @param vendido
	 */
	public Libro(String titulo, String autor, int nPaginas) {
		super();
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < 10; i++) {
			
			sb.append(sb.toString().valueOf((int)(Math.random()*((10+1)-0)+0)));
		}
		this.ISBN = sb.toString();
		this.titulo = titulo;
		this.autor = autor;
		this.nPaginas = nPaginas;
		this.vendido = false;
		this.precioCompra = 0;
		this.precioVenta = 0;
	}
	/**
	 * @return the iSBN
	 */
	public String getISBN() {
		return ISBN;
	}
	/**
	 * @param iSBN the iSBN to set
	 */
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}
	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	/**
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}
	/**
	 * @param autor the autor to set
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}
	/**
	 * @return the nPaginas
	 */
	public int getnPaginas() {
		return nPaginas;
	}
	/**
	 * @param nPaginas the nPaginas to set
	 */
	public void setnPaginas(int nPaginas) {
		this.nPaginas = nPaginas;
	}
	/**
	 * @return the precioCompra
	 */
	public double getPrecioCompra() {
		return precioCompra;
	}
	/**
	 * @param precioCompra the precioCompra to set
	 */
	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}
	/**
	 * @return the precioVenta
	 */
	public double getPrecioVenta() {
		return precioVenta;
	}
	/**
	 * @param precioVenta the precioVenta to set
	 */
	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}
	/**
	 * @return the vendido
	 */
	public boolean isVendido() {
		return vendido;
	}
	/**
	 * @param vendido the vendido to set
	 */
	public void setVendido(boolean vendido) {
		this.vendido = vendido;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("El libro ");
		builder.append(titulo);
		builder.append(" con ISBN ");
		builder.append(ISBN);
		builder.append(" creado por el autor ");
		builder.append(autor);
		builder.append(" tiene ");
		builder.append(nPaginas);
		builder.append(" páginas.");
		return builder.toString();
	}
	
	
	
	
}
