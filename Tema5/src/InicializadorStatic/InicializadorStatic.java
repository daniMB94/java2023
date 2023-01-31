package InicializadorStatic;

public class InicializadorStatic {

	//COGER DE GITHUB EL CODIGO
	
	private static String bbdd;
	private static String usuario;
	private static String password;
	
	private String consulta;
	
	//Esto se ejectua antes de crear ningún objeto
	//Se conecta la primera vez que alguien cree el objeto
	//Se suele usar para configuración
	static {
		//Lo ideal es que saliera de un fichero
		InicializadorStatic.bbdd = "empleados";
		InicializadorStatic.usuario = "Usuario";
		InicializadorStatic.password = "12345678";
		
		
		
		
	}
	
	public InicializadorStatic(String unaConsulta) {
		this.consulta=InicializadorStatic.usuario + "@" + InicializadorStatic.password + " / " + "127.0.0.1/" + InicializadorStatic.bbdd + " 7 " + unaConsulta;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("InicializadorStatic [consulta=");
		builder.append(consulta);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
