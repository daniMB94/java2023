package Practica2;

public class Password {

	//ATRIBUTOS
	private int longitud = 8;
	private StringBuffer contrasenia;
	
	//CONSTRUCTORES
	
	public Password() {
		super();
		this.contrasenia = generarContrasenia();
	}
	
	/**
	 * @param longitud
	 */
	public Password(int longitud) {
		super();
		this.longitud = longitud;
	}
	
	//METODOS
	private StringBuffer generarContrasenia() {
		int contraseña = 0;
		int contador = 0;
		StringBuffer codigoUnicode = null;
		do {
			
			for(int i = 0; i < 6; i++) {
				if (i == 1)
					codigoUnicode.append('x');
				else {
					contraseña = (int) Math.random();
					codigoUnicode.append(contraseña);
				}
				
			}
			
		} while (contador < this.longitud);
		//return codigoUnicode.c
		return codigoUnicode;
	}
		
}
