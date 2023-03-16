package P2_2;

public class ClientePrimePro extends Cliente {

	private static final double precioMensual = 5;
	
	
	public ClientePrimePro() {
		super();
		
	}
	
	public ClientePrimePro(String dni, String nombre) {
		super(dni, nombre, precioMensual);
		
	}
	
	@Override
	public double getPrecioMensual() {
		// TODO Auto-generated method stub
		return this.precioMensual;
	}

	@Override
	public boolean esPro() {
		// TODO Auto-generated method stub
		return true;
	}

}
