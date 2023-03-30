package TSHSAL;

import java.util.Objects;

public class Arma {

	enum Tipo {FUEGO, ELECTRICO, AGUA, VENENO}
	
	private String nombre;
	private Tipo tipo;
	private boolean esMagico;
	private int danioFisico;
	private int danioMagico;
	
	public Arma(String nombre, Tipo tipo, boolean esMagico, int danioFisico, int danioMagico) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.esMagico = esMagico;
		this.danioFisico = danioFisico;
		this.danioMagico = danioMagico;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public boolean isEsMagico() {
		return esMagico;
	}

	public void setEsMagico(boolean esMagico) {
		this.esMagico = esMagico;
	}

	public int getDanioFisico() {
		return danioFisico;
	}

	public void setDanioFisico(int danioFisico) {
		this.danioFisico = danioFisico;
	}

	public int getDanioMagico() {
		return danioMagico;
	}

	public void setDanioMagico(int danioMagico) {
		this.danioMagico = danioMagico;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Arma [nombre=");
		builder.append(nombre);
		builder.append(", tipo=");
		builder.append(tipo);
		builder.append(", esMagico=");
		builder.append(esMagico);
		builder.append(", danioFisico=");
		builder.append(danioFisico);
		builder.append(", danioMagico=");
		builder.append(danioMagico);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Arma other = (Arma) obj;
		return Objects.equals(nombre, other.nombre);
	}
	
	
	
}
