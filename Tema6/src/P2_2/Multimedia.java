package P2_2;

import java.util.Objects;

import P2_2.Genero.GeneroMulti;

public class Multimedia {
	
	private static long incremento = 1;

	protected long codigo = 0;
	protected String titulo;
	protected Boolean plus;
	protected double precio;
	protected GeneroMulti generoMulti;
	/**
	 * @param titulo
	 * @param plus
	 * @param precio
	 */
	public Multimedia(String titulo, Boolean plus, double precio, Genero.GeneroMulti generoMulti) {
		super();
		this.titulo = titulo;
		this.plus = plus;
		this.precio = precio;
		this.generoMulti = generoMulti;
		this.codigo = this.incrementoCod();
		
	}
	
	public Multimedia() {
		super();
		this.titulo = "";
		this.plus = false;
		
	}

	/**
	 * @return the codigo
	 */
	public long getCodigo() {
		return codigo;
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
	 * @return the plus
	 */
	public Boolean getPlus() {
		return plus;
	}

	/**
	 * @param plus the plus to set
	 */
	public void setPlus(Boolean plus) {
		this.plus = plus;
	}

	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/**
	 * @return the generoMulti
	 */
	public GeneroMulti getGeneroMulti() {
		return generoMulti;
	}

	/**
	 * @param generoMulti the generoMulti to set
	 */
	public void setGeneroMulti(GeneroMulti generoMulti) {
		this.generoMulti = generoMulti;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Multimedia other = (Multimedia) obj;
		return codigo == other.codigo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Multimedia [codigo=");
		builder.append(codigo);
		builder.append(", titulo=");
		builder.append(titulo);
		builder.append(", plus=");
		builder.append(plus);
		builder.append(", precio=");
		builder.append(precio);
		builder.append(", generoMulti=");
		builder.append(generoMulti);
		builder.append("]");
		return builder.toString();
	}
	
	private long incrementoCod() {
		return this.getCodigo()+this.incremento;
	}
	
	
}
