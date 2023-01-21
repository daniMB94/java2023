package Ejercicio2;

public class Coche {

	private int velocidad; //Atributo
	Coche() {velocidad = 0;} //Constructor
	
	public int getVelocidad() {
		int vel;
		vel = this.velocidad;
		return vel;
	}
	public void acelera(int mas) {
		
		this.velocidad = this.velocidad + mas;

	}
	public void frena(int menos) {
		
		this.velocidad = this.velocidad - menos;
		
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Coche [velocidad=").append(velocidad).append("]");
		return builder.toString();
	}
	
	
}
