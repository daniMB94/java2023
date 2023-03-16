package P1_5;

public class Revista extends Publicacion {

	private int numero;
	
	public Revista(String isbn, String titulo, int anio, int paginas, int numero) {
		super(isbn, titulo, anio, paginas);
		this.numero = numero;
	}

	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	
}
