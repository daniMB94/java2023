package Tema3;

public class EjemploString4 {

	public static void main(String[] args) {

		//Deja solo un espacio en la cadena
		
		
		//NO FUNCIONA!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		
		String mensaje = "Necesito     el    puente   como   agua de     Mayo";
		StringBuffer nuevoMensaje = new StringBuffer();
		
		for(int i = 0; i < mensaje.length(); i++) {
			if((mensaje.charAt(i) != ' ') || ((mensaje.charAt(i) != ' ' && mensaje.charAt(i+1) != ' ')) ) {
				nuevoMensaje.append(mensaje.charAt(i));
			}
		}
		
		System.out.println(nuevoMensaje);
		
	}

}
