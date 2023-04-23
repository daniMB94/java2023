package TE7E7;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class EquipoBasket {
	
	private HashMap<Integer, JugadorBasket> equipoBasket;
	
	public EquipoBasket () {
		this.equipoBasket = new HashMap<>();
	}

	public HashMap<Integer, JugadorBasket> getEquipoBasket() {
		return equipoBasket;
	}
	
	public JugadorBasket buscarJugador(JugadorBasket j) {
		
		List<JugadorBasket> jugadores = new LinkedList<>();
		
		jugadores.addAll(this.equipoBasket.values());
		
		Collections.sort(jugadores);
		
		int posicion = Collections.binarySearch(jugadores, j);
		
		if(posicion >= 0)
			return j;
		else
			return null;
	}
	
	public JugadorBasket buscarJugador(int dorsal) {
		
		return this.getEquipoBasket().get(dorsal);
		
	}
	
	public JugadorBasket addJugador(int dorsal, JugadorBasket j) {
		return this.getEquipoBasket().putIfAbsent(dorsal, j);
	}

	public JugadorBasket removeJugador(JugadorBasket j) {
		return this.getEquipoBasket().remove(j);
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EquipoBasket [equipoBasket=");
		builder.append(equipoBasket);
		builder.append("]");
		return builder.toString();
	}
	
	

}
