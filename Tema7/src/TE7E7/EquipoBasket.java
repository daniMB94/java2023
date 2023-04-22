package TE7E7;

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
		
		if(jugadores.contains(j))
			return
	}

}
