package Tema3;

public class EjemploString3 {

	public static void main(String[] args) {

		//Comprueba que una cadena tenga mayúsculas
		//Pista: usa el método toUpperCase
		//Si al convertir la cadena a minúsculas es igual a la original -> no tenía mayúsculas
		//hola -> hola (NO HABÍA MAYÚSCULAS)
		//hola -> HOLA (SI HABÍA MAYÚSCULAS)
		
		String cadena = "asdfja93djvAKEJFVkdnw193";
		
		if(cadena.equals(cadena.toLowerCase())) {
			System.out.println("Cadena en minúsculas");
		} else {
			System.out.println("La cadena tiene al menos una mayúsculas");
		}
	
		
		
	}

}
