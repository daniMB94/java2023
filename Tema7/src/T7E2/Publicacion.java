package T7E2;

import java.util.ArrayList;
import java.util.Objects;
import java.util.TreeSet;

public class Publicacion implements Prestable, Comparable<Publicacion> {

	protected TreeSet<Autor> autores;

	protected String isbn;
	protected String titulo;
	protected int anio;
	protected int paginas;
	protected boolean prestado;



	/**
	 * @param isbn
	 * @param titulo
	 * @param anio
	 * @param paginas
	 */
	public Publicacion(String isbn, String titulo, int anio, int paginas) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.anio = anio;
		this.paginas = paginas;
		this.prestado = false;
		this.autores = new TreeSet<>();
	}

	/**
	 * @return the isbn
	 */
	public String getIsbn() {
		return isbn;
	}

	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
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
	 * @return the anio
	 */
	public int getAnio() {
		return anio;
	}

	/**
	 * @param anio the anio to set
	 */
	public void setAnio(int anio) {
		this.anio = anio;
	}

	/**
	 * @return the paginas
	 */
	public int getPaginas() {
		return paginas;
	}

	/**
	 * @param paginas the paginas to set
	 */
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	/**
	 * @return the prestado
	 */
	public boolean isPrestado() {
		return prestado;
	}

	/**
	 * @param prestado the prestado to set
	 */
	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}

	/**
	 * @return the autores
	 */
	public TreeSet<Autor> getAutores() {
		return autores;
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Publicacion [autores=");
		builder.append(autores);
		builder.append(", isbn=");
		builder.append(isbn);
		builder.append(", titulo=");
		builder.append(titulo);
		builder.append(", anio=");
		builder.append(anio);
		builder.append(", paginas=");
		builder.append(paginas);
		builder.append(", prestado=");
		builder.append(prestado);
		builder.append("]");
		return builder.toString();
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
		Publicacion other = (Publicacion) obj;
		return Objects.equals(titulo, other.titulo);
	}
	@Override
	public void presta() {
		this.prestado = true;
	}
	@Override
	public void devuelve() {
		this.prestado = false;
	}
	@Override
	public boolean estaPrestado() {
		return this.isPrestado();

	}
	
	@Override
	public int compareTo(Publicacion p) {
			
		return this.getTitulo().compareTo(p.getTitulo());
	}
	
	
	public void addAutor(Autor a) {
		this.autores.add(a);
	}
	public boolean delAutor(Autor a) {
		return this.autores.remove(a);
	}
	
	

}
