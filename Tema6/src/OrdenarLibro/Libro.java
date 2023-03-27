package OrdenarLibro;

import java.util.Objects;

public class Libro {

	private String titulo;
	private String ISBN;
	private int paginas;
	public Libro(String titulo, String iSBN, int paginas) {
		super();
		this.titulo = titulo;
		ISBN = iSBN;
		this.paginas = paginas;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public int getPaginas() {
		return paginas;
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	@Override
	public int hashCode() {
		return Objects.hash(titulo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return Objects.equals(titulo, other.titulo);
	}
	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", ISBN=" + ISBN + ", paginas=" + paginas + "]";
	}
	
	
}
