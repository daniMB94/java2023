package P2_2;

public class ClientePrime extends Cliente {

	
	private static final double precioMensual = 3;
	
	public ClientePrime() {
		super();
		
	}
	public ClientePrime(String dni, String nombre) {
		super(dni, nombre, precioMensual);
	
		
	}
	


	
	@Override
	public double getPrecioMensual() {


		return this.precioMensual;
	}
	
	@Override
	public boolean esPro() {


		return false;
	}

}
