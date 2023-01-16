package EjerciciosPOO;

public class Numero {

	//PROPIEDADES
	public int almacena;

	
	//CONSTRUCTOR CON PARAMETROS
	public Numero(int almacena) {
		super();
		this.almacena = almacena;
	}
	
	//CONSTRUCTOR POR DEFECTO
	public Numero() {
		super();
		this.almacena = 0;
	}

	//GETTERS AND SETTERS
	
	public int getAlmacena() {
		return almacena;
	}

	public void setAlmacena(int almacena) {
		this.almacena = almacena;
	}
	
	//METODOS
	private void suma (int numero) {
		this.almacena = this.almacena + numero;
	}
		
	private void resta (int resta) {
		this.almacena = this.almacena - resta;
	}
	private double getDouble () {
		return this.almacena * 2;
	}

	//TO STRING
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Numero [almacena=").append(almacena).append("]");
		return builder.toString();
	}
	
	
	
}
