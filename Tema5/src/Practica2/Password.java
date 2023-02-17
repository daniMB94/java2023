package Practica2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {

	//ATRIBUTOS
	private int longitud = 8;
	private StringBuilder contrasenia;
	
	//CONSTRUCTORES
	
	public Password() {
		super();
		this.contrasenia = generarContrasenia(this.longitud);
	}
	
	/**
	 * @param longitud
	 */
	public Password(int longitud) {
		super();
		
		this.contrasenia = generarContrasenia(longitud);
	}
	//Constructor copia
	public Password(Password otroPassword) {
		this.longitud = otroPassword.longitud;
		this.contrasenia = otroPassword.contrasenia;
	}
	
	/**
	 * @return the longitud
	 */
	public int getLongitud() {
		return longitud;
	}

	/**
	 * @param longitud the longitud to set
	 */
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	//METODOS
	private StringBuilder generarContrasenia(int longitud) {
		StringBuilder contrasenia = new StringBuilder();
		int posicion;
		String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890!@%$/()='¡¿?";
		char caracterAleatorio = 'a';
		for(int i = 0; i < longitud; i++) {
			posicion = (int) (Math.random() * caracteres.length());
			caracterAleatorio = caracteres.charAt(posicion);
			contrasenia.append(caracterAleatorio);
		}
		return contrasenia;
	}
	
	public boolean esFuerte() {
		Pattern minusculas = Pattern.compile("[a-z]");
		Pattern mayusculas = Pattern.compile("[A-Z]");
		Pattern numeros = Pattern.compile("[0-9]");
		Pattern simbolos = Pattern.compile("\\p{Punct}");
		int nMinusculas = 0;
		int nMayusculas = 0;
		int nNumeros = 0;
		int nSimbolos = 0;
		
		for(int i = 0; i < contrasenia.length(); i++) {
			Matcher minus = minusculas.matcher(contrasenia.toString().valueOf(contrasenia.charAt(i)));
			if(minus.matches())
				nMinusculas ++;
			
			Matcher mayus = mayusculas.matcher(contrasenia.toString().valueOf(contrasenia.charAt(i)));
			if(mayus.matches())
				nMayusculas ++;
			
			Matcher simbol = simbolos.matcher(contrasenia.toString().valueOf(contrasenia.charAt(i)));
			if(simbol.matches())
				nSimbolos ++;
			
			Matcher num = numeros.matcher(contrasenia.toString().valueOf(contrasenia.charAt(i)));
			if(num.matches())
				nNumeros ++;
		}
		
		if(this.contrasenia.length() >= 8 && nMinusculas >= 2 && nMayusculas >= 1 && nNumeros >= 2 && nSimbolos >= 2)
			return true;
		else
			return false;
		

	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Password [longitud=");
		builder.append(longitud);
		builder.append(", contrasenia=");
		builder.append(contrasenia);
		builder.append("]");
		return builder.toString();
	}
	
		
}
