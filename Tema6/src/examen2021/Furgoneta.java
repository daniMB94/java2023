package examen2021;


public class Furgoneta extends Vehiculo implements Descontable {

	private float longitud;
	
	
	
	public Furgoneta() {
		super();
		this.longitud = 0;
	}

	public Furgoneta(String matricula, String marca, float longitud) {
		super(matricula, marca);
		this.longitud = longitud;
	}

	public Furgoneta(Furgoneta otro) {
		super(otro);
		this.longitud = otro.longitud;
	}
	
	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Furgoneta [matricula=");
		builder.append(matricula);
		builder.append(", marca=");
		builder.append(marca);
		builder.append(", fechaEntrada=");
		builder.append(fechaEntrada);
		builder.append(", minutos=");
		builder.append(minutos);
		builder.append(", plaza=");
		builder.append(plaza);
		builder.append(", longitud=");
		builder.append(longitud);
		builder.append("]");
		return builder.toString();
	}

	/**
	 * @return the longitud
	 */
	public float getLongitud() {
		return longitud;
	}

	/**
	 * @param longitud the longitud to set
	 */
	public void setLongitud(float longitud) {
		this.longitud = longitud;
	}

	

	@Override
	public double calcularImporte() {
		
		return (1 - this.descuento()) * 
				( Parking.PRECIO_BASE_POR_MINUTO * this.calcularMinutos() + Parking.PRECIO_BASE_POR_METRO * this.longitud); 
	}

}