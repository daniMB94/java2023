package TSHSAL;

import java.util.Objects;

public class TipoArmadura {
	
	private String nombre;
	private String zona;
	private int defensaFisica;
	private int defensaMagica;
	
	
	public TipoArmadura(String nombre, String zona, int defensaFisica, int defensaMagica) {
		super();
		this.nombre = nombre;
		this.zona = zona;
		this.defensaFisica = defensaFisica;
		this.defensaMagica = defensaMagica;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getZona() {
		return zona;
	}


	public void setZona(String zona) {
		this.zona = zona;
	}


	public int getDefensaFisica() {
		return defensaFisica;
	}


	public void setDefensaFisica(int defensaFisica) {
		this.defensaFisica = defensaFisica;
	}


	public int getDefensaMagica() {
		return defensaMagica;
	}


	public void setDefensaMagica(int defensaMagica) {
		this.defensaMagica = defensaMagica;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TipoArmadura [nombre=");
		builder.append(nombre);
		builder.append(", zona=");
		builder.append(zona);
		builder.append(", defensaFisica=");
		builder.append(defensaFisica);
		builder.append(", defensaMagica=");
		builder.append(defensaMagica);
		builder.append("]");
		return builder.toString();
	}


	@Override
	public int hashCode() {
		return Objects.hash(zona);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TipoArmadura other = (TipoArmadura) obj;
		return Objects.equals(zona, other.zona);
	}
	
	

}
