package P2_2;

import java.util.ArrayList;

public class Temporada {

	private int numero;
	private ArrayList<Episodio> episodios;
	private Series serie;
	/**
	 * @param numero
	 */
	public Temporada(int numero) {
		super();
		this.numero = numero;
		this.episodios = new ArrayList<>();
	}
	public Temporada() {
		super();
		this.numero = 0;
		
	}
	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}
	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}
	/**
	 * @return the episodios
	 */
	public ArrayList<Episodio> getEpisodios() {
		return episodios;
	}
	/**
	 * @param episodios the episodios to set
	 */
	public void setEpisodios(ArrayList<Episodio> episodios) {
		this.episodios = episodios;
	}
	/**
	 * @return the serie
	 */
	public Series getSerie() {
		return serie;
	}
	/**
	 * @param serie the serie to set
	 */
	public void setSerie(Series serie) {
		this.serie = serie;
	}
	
	public int getNumeroEpisodios() {
		return this.episodios.size();
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Temporada [numero=");
		builder.append(numero);
		builder.append(", episodios=");
		builder.append(episodios);
		builder.append(", serie=");
		builder.append(serie);
		builder.append("]");
		return builder.toString();
	}
	
	public void addEpisodio(Episodio ep) {
		boolean aniadir = true;
		for(Episodio e : this.episodios) {
			if(e.equals(ep)) {
				aniadir = false;
			}
		}
		if(aniadir) {
			ep.setTemporada(this);
			this.episodios.add(ep);
		}
			
	}
	
	public void delTemporada(Episodio ep) {
		boolean borrar = true;
		for(Episodio e: this.episodios) {
			if(e.equals(ep))
				borrar = true;
		}
		if(borrar)
			this.episodios.remove(ep);
	
	}
	
}
