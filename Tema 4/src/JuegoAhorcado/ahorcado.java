package JuegoAhorcado;

public class ahorcado {
	
	private String palabraSecreta;
	private char letra;
	private boolean resultado;
	
	private static String palabras[];

	/**
	 * @param palabraSecreta
	 * @param letra
	 * @param resultado
	 */
	public ahorcado(String palabraSecreta, char letra, boolean resultado) {
		super();
		this.palabraSecreta = palabraSecreta;
		this.letra = letra;
		this.resultado = resultado;
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
	 * @return the letra
	 */
	public char getLetra() {
		return letra;
	}

	/**
	 * @param letra the letra to set
	 */
	public void setLetra(char letra) {
		this.letra = letra;
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ahorcado [palabraSecreta=");
		builder.append(palabraSecreta);
		builder.append(", letra=");
		builder.append(letra);
		builder.append(", resultado=");
		builder.append(resultado);
		builder.append("]");
		return builder.toString();
	}
	//METODOS
	public void encontrarLetra(String palabra, char palabraSecreta[], char letra) {
		int nLetras;
		
		nLetras = palabra.length();
		for(int i = 0; i < nLetras; i++) {
			if(letra == palabra.charAt(i)) {
				
				palabraSecreta[i] = letra;
			
			}
			else
				palabraSecreta[i] = '_';
				
		}
	}
	

}
