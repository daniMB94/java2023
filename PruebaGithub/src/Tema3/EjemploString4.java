package Tema3;

public class EjemploString4 {

	public static void main(String[] args) {
		//Elimina los espacios de una cadena
		
		String mensaje = "Necesito    el   puente   como      agua  de           Mayo";
		
		StringBuffer nuevoMensaje = new StringBuffer();
		for(int i=0; i < mensaje.length(); i++) {
			//Meto el caracter si es distinto de espacio O
			//es igual a espacio y el siguiente es distinto de espacio -> meter un espacio solo, el que está antes de la palabra
			if ( ((mensaje.charAt(i) == ' ' && mensaje.charAt(i+1) != ' ')) || (mensaje.charAt(i) != ' ') ) {
				nuevoMensaje.append(mensaje.charAt(i));
			}
		}
		
		System.out.println(nuevoMensaje);

	}

}