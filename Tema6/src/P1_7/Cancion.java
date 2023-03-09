package P1_7;

public class Cancion extends Multimedia {



	enum genero {Rock, Pop, Disco, HipHop, Trap, Soul, Jazz, Electronica, Metal, Clasica, Latino}
	
	private int posicion;
	private Disco disco;
	private genero generoC;
	
	public Cancion(String nombre, int duracion, int posicion, genero generoC) {
		super(nombre, duracion);
		
		this.posicion = posicion;
		this.generoC = generoC;
		
	}

	/**
	 * @return the posicion
	 */
	public int getPosicion() {
		return posicion;
	}

	/**
	 * @param posicion the posicion to set
	 */
	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}

	/**
	 * @return the disco
	 */
	public Disco getDisco() {
		return disco;
	}

	/**
	 * @param disco the disco to set
	 */
	public void setDisco(Disco disco) {
		this.disco = disco;
	}
	
	
	
	
	
	
	
	
}
