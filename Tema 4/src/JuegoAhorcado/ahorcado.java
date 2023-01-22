package JuegoAhorcado;

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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ahorcado [palabraSecreta=");
		builder.append(palabraSecreta);
		builder.append(", letra=");
		builder.append(", resultado=");
		builder.append(resultado);
		builder.append("]");
		return builder.toString();
	}

	// METODOS
	public void intentar(char letra) {
		int nLetras;
		boolean contabiliza = true;
		nLetras = this.palabraSecreta.length();

		letrasSecretas = new char[nLetras];
		for (int i = 0; i < nLetras; i++) {
			if (letra == palabraSecreta.charAt(i)) {
				this.letrasSecretas[i] = letra;
				contabiliza = false;
			}

			else
				this.letrasSecretas[i] = '_';

		}
		if (contabiliza == true)
			contador++;

	}

	public void resolver(String intentoPalabra) {
		if (intentoPalabra == this.palabraSecreta)
			this.resultado = true;
		else
			this.resultado = false;
	}

}
