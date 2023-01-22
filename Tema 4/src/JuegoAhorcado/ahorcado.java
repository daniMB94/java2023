package JuegoAhorcado;

import java.util.Arrays;

public class ahorcado {

	private String palabraSecreta;
	private char letrasSecretas[];
	private boolean resultado;

	private static String palabras[];
	private static int contador;

	/**
	 * @param palabraSecreta
	 * @param letra
	 * @param resultado
	 */
	public ahorcado(String palabraSecreta) {
		super();
		this.palabraSecreta = palabraSecreta;
		this.resultado = false;
		contador = 0;
	}

	/**
	 * @return the palabraSecreta
	 */
	public String getPalabraSecreta() {
		return palabraSecreta;
	}

	/**
	 * @param palabraSecreta the palabraSecreta to set
	 */
	public void setPalabraSecreta(String palabraSecreta) {
		this.palabraSecreta = palabraSecreta;
	}

	/**
	 * @return the resultado
	 */
	public boolean isResultado() {
		return resultado;
	}

	/**
	 * @param resultado the resultado to set
	 */
	public void setResultado(boolean resultado) {
		this.resultado = resultado;
	}

	/**
	 * @return the palabras
	 */
	public static String[] getPalabras() {
		return palabras;
	}

	/**
	 * @param palabras the palabras to set
	 */
	public static void setPalabras(String[] palabras) {
		ahorcado.palabras = palabras;
	}

	/**
	 * @return the letrasSecretas
	 */
	public char[] getLetrasSecretas() {
		return letrasSecretas;
	}

	/**
	 * @param letrasSecretas the letrasSecretas to set
	 */
	public void setLetrasSecretas(char[] letrasSecretas) {
		this.letrasSecretas = letrasSecretas;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ahorcado [letrasSecretas=");
		builder.append(Arrays.toString(letrasSecretas));
		builder.append("]");
		return builder.toString();
	}

	// METODOS
	public void intentar(char letra, char[] letrasSecretas) {
		int nLetras;
		boolean contabiliza = true;
		nLetras = this.palabraSecreta.length();

		for (int i = 0; i < nLetras; i++) {
			if (letra == palabraSecreta.charAt(i)) {
				this.letrasSecretas[i] = letra;
				contabiliza = false;
			}

		}
		if (contabiliza == true)
			contador++;

	}

	public void resolver(String intentoPalabra) {
		if (intentoPalabra.matches(this.palabraSecreta)) {
			this.resultado = true;
			for(int i = 0; i < this.letrasSecretas.length; i++) {
				letrasSecretas[i] = intentoPalabra.charAt(i);
			}
		}
			
		else
			this.resultado = false;

	}

}
