package Ejercicio7;

public class SteamJuegoAPP {

	public static void main(String[] args) {

		int rankingVentas;

		SteamJuego Borderlands = new SteamJuego("Borderlands", "Juego de supervivencia", "www.borderlands.com",
				150000.78, 39, 69.99, 2);
		SteamJuego Battlefields2042 = new SteamJuego("Battlefields2042", "Juego de disparos",
				"www.Battlefields2042.com", 400372.22, 395, 0, 1);
		SteamJuego HighOnLife = new SteamJuego("HighOnLife", "Juego de aventura", "www.HighOnLife.com", 89238.53, 15,
				59.99, 3);

		for (int i = 1; i <= 3; i++) {
			if (Borderlands.getPuestoMasVendidos() == i)
				System.out.println("El " + i + "º" + " más vendido es: " + Borderlands.getNombre());
			if (Battlefields2042.getPuestoMasVendidos() == i)
				System.out.println("El " + i + "º" + " más vendido es: " + Battlefields2042.getNombre());
			if (HighOnLife.getPuestoMasVendidos() == i)
				System.out.println("El " + i + "º" + " más vendido es: " + HighOnLife.getNombre());
		}
		
		System.out.println();
		
		System.out.println("El número diario de jugadores de cada juego ha sido:");

		System.out.println(Borderlands.getNombre() + ": " + Borderlands.getMediaJugadoresDiarios());
		

		System.out.println(Battlefields2042.getNombre() + ": " + Battlefields2042.getMediaJugadoresDiarios());
		

		System.out.println(HighOnLife.getNombre() + ": " + HighOnLife.getMediaJugadoresDiarios());

		
		System.out.println();
		
		System.out.println("La nueva media a día de hoy es: ");
		
		Borderlands.jugadoresDia(140000);
		System.out.println(Borderlands.getNombre() + ": " + Borderlands.getMediaJugadoresDiarios());
		
		Battlefields2042.jugadoresDia(500000);
		System.out.println(Battlefields2042.getNombre() + ": " + Battlefields2042.getMediaJugadoresDiarios());
		
		HighOnLife.jugadoresDia(80000);
		System.out.println(HighOnLife.getNombre() + ": " + HighOnLife.getMediaJugadoresDiarios());
		
		
	}

}
