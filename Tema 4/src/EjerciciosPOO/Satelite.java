package EjerciciosPOO;

public class Satelite {
	private double meridiano;
	private double paralelo;
	private double distancia_tierra;

	Satelite(double m, double p, double d) {
		meridiano = m;
		paralelo = p;
		distancia_tierra = d;
	}

	Satelite() {
		meridiano = paralelo = distancia_tierra = 0;
	}

	public void setPosicion(double m, double p, double d) {
		meridiano = m;
		paralelo = p;
		distancia_tierra = d;
	}

	public void printPosicion() {
		System.out.print("El satélite se encuentra en ");
		System.out.print("el paralelo " + paralelo + " meridiano " + meridiano);
		System.out.print(" a una distancia de la Tierra de " + distancia_tierra + " kms.");
	}

	public void variaAltura(double desplazamiento) {
		
		if (desplazamiento > 0)
			this.distancia_tierra += 10;
		else {
			if(this.distancia_tierra < 10)
				this.distancia_tierra = 0;
			else
				this.distancia_tierra -= 10;
		}
			
	}
	
	public boolean enOrbita() {
		boolean tierra = true;
		if(this.distancia_tierra > 10)
			tierra = true;
		else
			tierra = false;
		return tierra;
	}
	
	public void variaPosicion(double variap, double variam) {
		this.meridiano = variam;
		this.paralelo = variap;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Satelite [meridiano=").append(meridiano).append(", paralelo=").append(paralelo)
				.append(", distancia_tierra=").append(distancia_tierra).append("]");
		return builder.toString();
	}
	
	

}
