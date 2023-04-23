package TE7E7;

public class TestEquipoBasket {

	public static void main(String[] args) {
		
		JugadorBasket j1 = new JugadorBasket("Gregorio", "pibot");
		JugadorBasket j2 = new JugadorBasket("Luis", "escolta");
		JugadorBasket j3 = new JugadorBasket("Mario", "alero");
		JugadorBasket j4 = new JugadorBasket("Sergio", "base");
		JugadorBasket j5 = new JugadorBasket("Dimitri", "ala-pibot");
		
		EquipoBasket madrid = new EquipoBasket();
		
		madrid.addJugador(1, j1);
		madrid.addJugador(13, j2);
		madrid.addJugador(8, j3);
		madrid.addJugador(3, j4);
		madrid.addJugador(2, j5);
		
		System.out.println(madrid.toString());
		
		System.out.println("---------------");
		
		//Probamos un jugador que si está
		System.out.println("El jugador a buscar es: " + j2);
		if(madrid.buscarJugador(new JugadorBasket("Mario", "escolta")) != null)
			System.out.println("Jugador encontrado: " + new JugadorBasket("Mario", "escolta"));
		else
			System.out.println("Jugador no encontrado");
		
		//Probamos un jugador que no está
		System.out.println("El jugador a buscar es: " + new JugadorBasket("Edgar", "escolta").toString());
		if(madrid.buscarJugador(new JugadorBasket("Edgar", "escolta")) != null)
			System.out.println("Jugador encontrado: " + new JugadorBasket("Edgar", "escolta"));
		else
			System.out.println("Jugador no encontrado");
		
		//Probamos la búsca por dorsal
		if(madrid.buscarJugador(2) != null)
			System.out.println("El jugador con dorsal: 2 es: " + madrid.buscarJugador(2));
		else
			System.out.println("El jugador con dorsal 2 no existe");
	}

}
