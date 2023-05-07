package practica2ejer4;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Pais implements Comparable<Pais> {
	private static int codigo = 0;
	enum Continente {
		ASIA, AFRICA, EUROPA, OCEANIA, AMERICA
	}
	private Continente continente;
	private int codigoPais;
	private String nombre;
	private int superficie;
	private int poblacion;
	private String capital;
	private List<Ciudad> ciudades;
	
	public Pais(String nombre, Continente continente, int superficie, int poblacion, String capital) {
		super();
		this.nombre = nombre;
		this.continente = continente;
		this.superficie = superficie;
		this.poblacion = poblacion;
		this.capital = capital;
		this.ciudades = new ArrayList<>();
		this.codigoPais = Pais.codigo++;
		
	}

	/**
	 * @return the continente
	 */
	public Continente getContinente() {
		return continente;
	}

	/**
	 * @param continente the continente to set
	 */
	public void setContinente(Continente continente) {
		this.continente = continente;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the superficie
	 */
	public int getSuperficie() {
		return superficie;
	}
	
	public Integer getSuperficieInt() {
		return superficie;
	}
	

	/**
	 * @return the poblacion
	 */
	public int getPoblacion() {
		return poblacion;
	}
	
	public Integer getPoblacionInt()	{
		return poblacion;
	}

	/**
	 * @param poblacion the poblacion to set
	 */
	public void setPoblacion(int poblacion) {
		this.poblacion = poblacion;
	}

	/**
	 * @param superficie the superficie to set
	 */
	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}

	/**
	 * @return the capital
	 */
	public String getCapital() {
		return capital;
	}

	/**
	 * @param capital the capital to set
	 */
	public void setCapital(String capital) {
		this.capital = capital;
	}


	/**
	 * @return the codigoPais
	 */
	public int getCodigoPais() {
		return codigoPais;
	}



	/**
	 * @return the ciudades
	 */
	public List<Ciudad> getCiudades() {
		return ciudades;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pais [continente=");
		builder.append(continente);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", superficie=");
		builder.append(superficie);
		builder.append(", poblacion=");
		builder.append(poblacion);
		builder.append(", capital=");
		builder.append(capital);
		builder.append(", ciudades=");
		builder.append(ciudades);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigoPais);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pais other = (Pais) obj;
		return codigoPais == other.codigoPais;
	}

	public void addCiudad(Ciudad c) {
		if(this.ciudades.indexOf(c) < 0) {
			this.ciudades.add(c);
		}
	}
	public void delCiudad(Ciudad c) {
		if(this.ciudades.indexOf(c) >= 0)
			this.ciudades.remove(c);
	}
	
	public double densidadPoblacion() {
		double densidad = this.poblacion / this.superficie;
		return densidad;
	}

	@Override
	public int compareTo(Pais o) {
		
		return this.getSuperficieInt().compareTo(o.getSuperficieInt());
	}
	
	 
}
