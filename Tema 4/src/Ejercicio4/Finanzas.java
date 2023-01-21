package Ejercicio4;

public class Finanzas {
	
	//ATRIBUTOS
	
	private double cambio;
	
	//CONSTRUCTOR CON PARÁMETROS

	public Finanzas(double cambio) {
		super();
		this.cambio = cambio;
	}
	
	//CONSTRUCTOR POR DEFECTO
	
	public Finanzas() {
		super();
		this.cambio = 1.36;
	}

	//GETTERS AND SETTERS
	public double getCambio() {
		return cambio;
	}

	public void setCambio(double cambio) {
		this.cambio = cambio;
	}
	
	
	//METODOS
	
	public double dolares (double euro) {
		double eur;
		eur = this.cambio * euro;
		return eur;
	}
	
	public double euros (double dolar) {
		double dol;
		dol = (1/this.cambio) * dolar;
		return dol;
	}

	//TO STRING
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Finanzas [cambio=").append(cambio).append("]");
		return builder.toString();
	}
	

	
}
