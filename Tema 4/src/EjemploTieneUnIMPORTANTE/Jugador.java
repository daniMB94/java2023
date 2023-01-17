package EjemploTieneUnIMPORTANTE;

public class Jugador {

	private String nombre;
	private String clase;
	private int salud;
	//EN POO SE PUEDE USAR CLASES QUE ACTUAN COMO PROPIEDADES EN OTRA CLASE (como en este ejemplo)
	private Arma armaDerecha;
	private Arma armaIzquierda;
	
	
	public Jugador(String nombre, String clase) {
		super();
		this.nombre = nombre;
		this.clase = clase;
		this.salud = 500;
		//No se necesario poner this.armaDerecha = null, pero se puede indicar (Lo mismo para arma izquierda)
		this.armaDerecha = null;
		this.armaIzquierda = null;
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
	 * @return the clase
	 */
	public String getClase() {
		return clase;
	}


	/**
	 * @param clase the clase to set
	 */
	public void setClase(String clase) {
		this.clase = clase;
	}


	/**
	 * @return the salud
	 */
	public int getSalud() {
		return salud;
	}


	/**
	 * @param salud the salud to set
	 */
	public void setSalud(int salud) {
		this.salud = salud;
	}


	/**
	 * @return the armaDerecha
	 */
	public Arma getArmaDerecha() {
		return armaDerecha;
	}


	/**
	 * @param armaDerecha the armaDerecha to set
	 */
	public void setArmaDerecha(Arma armaDerecha) {
		this.armaDerecha = armaDerecha;
	}


	/**
	 * @return the armaIzquierda
	 */
	public Arma getArmaIzquierda() {
		return armaIzquierda;
	}


	/**
	 * @param armaIzquierda the armaIzquierda to set
	 */
	public void setArmaIzquierda(Arma armaIzquierda) {
		this.armaIzquierda = armaIzquierda;
	}


	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", clase=" + clase + ", salud=" + salud + ", armaDerecha=" + armaDerecha
				+ ", armaIzquierda=" + armaIzquierda + "]";
	}
	
	//METODOS
	//HAY QUE PASAR COMO PARÁMETRO UN JUGADOR PORQUE HAY QUE GOLPEAR A ALGUIEN PARA QUITAR VIDA
	//SE ESTA PASANDO COMO PARÁMETRO UNA CLASE
	public void golpearDerecha(Jugador otro) {
		
		if(this.armaDerecha == null) {
			
			otro.quitarVida(10); 
		} else {
			otro.quitarVida(this.armaDerecha.getPotencia());
		}
	}
	
	public void golpearIzquierda(Jugador otro) {
		
		if(this.armaIzquierda == null) {
			
			otro.quitarVida(10); 
		} else {
			otro.quitarVida(this.armaIzquierda.getPotencia());
		}
	}
	
	public void quitarVida(int valor) {
		this.salud = this.salud - valor;
		if(this.salud == 0)
		System.out.println("Muerto");
	}
	
}
