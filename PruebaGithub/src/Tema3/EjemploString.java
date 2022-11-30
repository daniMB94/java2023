package Tema3;

public class EjemploString {

	public static void main(String[] args) {
		
		String vocales = "aeiouáéíóúAEIOUÁÉÍÓÚ";
		String cadena = "Esto de la programación es más difícil de lo que parece";
		//Primero recorremos la cadena caracter a caracter -> .charAt(i)
		int contador = 0;
		
		for(int i = 0; i < cadena.length(); i++) {
			//System.out.println(cadena.charAt(i));
			
			/*if(cadena.charAt(i) == 'a' || cadena.charAt(i) == 'e' || cadena.charAt(i) == 'i' 
					|| cadena.charAt(i) == 'o' || cadena.charAt(i) == 'u' ||
					cadena.charAt(i) == 'á' || cadena.charAt(i) == 'é' || cadena.charAt(i) == 'í' 
					|| cadena.charAt(i) == 'ó' || cadena.charAt(i) == 'ú') {
					contador++;
			}*/
			
			//CON SWITCH
			/*switch (cadena.charAt(i)) {
			case 'a', 'e', 'i', 'o', 'u', 'á', 'é', 'í', 'ó', 'ú', 'Á', 'É', 'Í', 'Ó', 'Ú', 'A', 'E', 'I', 'O', 'U' :
				contador++;
			
			}*/
			//CON INDEXOF
			if(vocales.indexOf( cadena.charAt(i) ) >= 0) { //El mejor metodo. Buscar cada caracter de la cadena en la cadena que contiene las vocales
				contador++;
			}
		}
		
		
		System.out.println("El número de vocales es: " + contador);
		
	}

}
