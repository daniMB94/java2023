package practica2ejer3;

public class Puntuacion {

	private int partidasJugadas;
	private int puntos;
	private int partidasGanadas;
	private int partidasPerdidas;
	
	public Puntuacion() {
		super();
	}

	public int getPartidasJugadas() {
		return partidasJugadas;
	}

	public void setPartidasJugadas(int partidasJugadas) {
		this.partidasJugadas = partidasJugadas;
	}

	public int getPuntos() {
		return puntos;
	}
	
	public Integer getPuntosInteger() {
		Integer puntosInteger = this.puntos;
		return puntosInteger;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public int getPartidasGanadas() {
		return partidasGanadas;
	}

	public void setPartidasGanadas(int partidasGanadas) {
		this.partidasGanadas = partidasGanadas;
	}

	public int getPartidasPerdidas() {
		return partidasPerdidas;
	}

	public void setPartidasPerdidas(int partidasPerdidas) {
		this.partidasPerdidas = partidasPerdidas;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Puntos: ");
		builder.append(puntos);
		builder.append(" - PJ: ");
		builder.append(partidasJugadas);
		builder.append(" - PG: ");
		builder.append(partidasGanadas);
		builder.append(" - PP: ");
		builder.append(partidasPerdidas);
		builder.append("\n");
		return builder.toString();
	}
	
	

}
