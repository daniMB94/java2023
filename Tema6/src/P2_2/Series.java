package P2_2;

import java.util.ArrayList;

public class Series extends Multimedia {
	
	private ArrayList<Temporada> temporadas;

	/**
	 * 
	 */
	public Series() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param titulo
	 * @param plus
	 * @param precio
	 */
	public Series(String titulo, Boolean plus, double precio, Genero.GeneroMulti generoMulti) {
		super(titulo, plus, precio, generoMulti);
		this.temporadas = new ArrayList<>();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Series [temporadas=");
		builder.append(temporadas);
		builder.append("]");
		return builder.toString();
	}
	
	public int getNumeroTemporadas() {
		return this.temporadas.size();
	}
	public void addTemporada(Temporada ta) {
		boolean aniadir = true;
		for(Temporada t : this.temporadas) {
			if(t.equals(ta)) {
				aniadir = false;
			}
		}
		if(aniadir) {
			ta.setSerie(this);
			this.temporadas.add(ta);
		}
			
	}
	
	public void delTemporada(Temporada ta) {
		boolean borrar = true;
		for(Temporada t: this.temporadas) {
			if(t.equals(ta))
				borrar = true;
		}
		if(borrar)
			this.temporadas.remove(ta);
	
	}
	

}
