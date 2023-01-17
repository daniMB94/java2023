package EjemploTieneUnIMPORTANTE;

public class Arma {

	public String nombre;
	public int potencia;
	
	public Arma(String nombre, int potencia) {
		super();
		this.nombre = nombre;
		this.potencia = potencia;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}


	@Override
	public String toString() {
		return "Arma [nombre=" + nombre + ", potencia=" + potencia + "]";
	}

	
	
}
