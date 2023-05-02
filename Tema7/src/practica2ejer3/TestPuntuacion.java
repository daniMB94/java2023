package practica2ejer3;

import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class TestPuntuacion {
	
	public static void main(String[] args) {
		
		
		Juego j1 = new Juego("Valorant", "Steam");
		Juego j2 = new Juego("Fortnite", "PSnow");
		Juego j3 = new Juego("CallOfDuty", "GamePass");
		Juego j4 = new Juego("Mario Kart", "Nintendo Online");
		Juego j5 = new Juego("Super SmashBros", "Nintendo Online");
		Juego j6 = new Juego("Battlefield 2042", "GamePass");
		Juego j7 = new Juego("F-Zero", "Nintendo Online");
		Juego j8 = new Juego("Doom", "PSnow");
		Juego j9 = new Juego("Skyrim", "Steam");
		Juego j10 = new Juego("Zelda BOTW", "Nintendo Online");
		
		Usuario dani = new Usuario("dani", "dani_dani@hotmail.com", "dmarber");
		Usuario elena = new Usuario("elena", "elena_elena@hotmail.com", "elly");
		Usuario p3 = new Usuario("jugador3", "jugador3@hotmail.com", "cick3");
		Usuario p4 = new Usuario("jugador4", "jugador4@hotmail.com", "rick4");
		Usuario p5 = new Usuario("jugador5", "jugador5@hotmail.com", "tick5");
		Usuario p6 = new Usuario("jugador6", "jugador6@hotmail.com", "yick6");
		Usuario p7 = new Usuario("jugador7", "jugador7@hotmail.com", "uick7");
		Usuario p8 = new Usuario("jugador8", "jugador8@hotmail.com", "iick8");
		Usuario p9 = new Usuario("jugador9", "jugador9@hotmail.com", "pick9");
		Usuario p10 = new Usuario("jugador10", "jugador10@hotmail.com", "kick10");
		
		dani.addPuntuacion(j1, true, 200);
		dani.addPuntuacion(j1, false, 100);
		dani.addPuntuacion(j1, true, 300);
		p4.addPuntuacion(j1, true, 250);
		p3.addPuntuacion(j1, false, 100);
		p5.addPuntuacion(j2, true, 500);
		p4.addPuntuacion(j2, true, 400);
		p7.addPuntuacion(j3, false, 10);
		p7.addPuntuacion(j4, true, 200);
		p7.addPuntuacion(j5, false, 100);
		p8.addPuntuacion(j6, true, 300);
		p6.addPuntuacion(j7, true, 250);
		p8.addPuntuacion(j8, false, 100);
		p10.addPuntuacion(j9, true, 500);
		p9.addPuntuacion(j10, true, 400);
		p9.addPuntuacion(j10, false, 10);
		
		elena.addPuntuacion(j3, true, 200);
		elena.addPuntuacion(j3, false, 120);
		elena.addPuntuacion(j1, true, 350);
		p3.addPuntuacion(j2, true, 30);
		p4.addPuntuacion(j1, false, 1020);
		p5.addPuntuacion(j3, true, 50);
		p6.addPuntuacion(j4, true, 423);
		p7.addPuntuacion(j5, false, 50);
		p7.addPuntuacion(j5, true, 200);
		p8.addPuntuacion(j6, false, 120);
		p9.addPuntuacion(j7, true, 350);
		p10.addPuntuacion(j8, true, 30);
		p10.addPuntuacion(j9, false, 1020);
		p3.addPuntuacion(j9, true, 50);
		p5.addPuntuacion(j10, true, 423);
		p6.addPuntuacion(j4, false, 50);
		
		Stim st = new Stim();
		
		st.addJuego(j1);
		st.addJuego(j2);
		st.addJuego(j3);
		st.addJuego(j4);
		st.addJuego(j5);
		st.addJuego(j6);
		st.addJuego(j7);
		st.addJuego(j8);
		st.addJuego(j9);
		st.addJuego(j10);
		
		st.addJugador(elena);
		st.addJugador(dani);
		st.addJugador(p3);
		st.addJugador(p4);
		st.addJugador(p5);
		st.addJugador(p6);
		st.addJugador(p7);
		st.addJugador(p8);
		st.addJugador(p9);
		st.addJugador(p10);
		
		System.out.println(st.obtenerPuntuaciones(j2));
		
		/*
		ArrayList<Usuario> usuarios = new ArrayList<>();
		usuarios.add(elena);
		usuarios.add(dani);
		

		
		usuarios.stream()
			.map(c -> c.getPuntuaciones().keySet().toString())
			.distinct()
			.forEach(System.out::println);
		
		System.out.println("--------------------------\n");
		
		usuarios.stream()
			.map(c -> c.getNick())
			.distinct()
			.forEach(System.out::println);
*/
		System.out.println("Muestra por pantalla todos los usuarios ordenados por Nick, muestra email y Nick");
		st.getJugadores().stream()
			.distinct()
			.sorted((o1, o2) -> o1.compareTo(o2))
			.forEach(System.out::println);
		
		System.out.println("Método que muestre cada usuario (Nick) y para cada uno la puntuación de los juegos a los \r\n"
				+ "que juega");
		
		st.getJugadores().stream()
			.distinct()
			.sorted((o1, o2) -> o1.compareTo(o2))
			.map(j -> j.getPuntuaciones())
			.forEach(System.out::println);
		
		System.out.println("Método que reciba como parámetro un Usuario y muestre todas sus puntuaciones (puntos, \r\n"
				+ "partidas jugadas, …) ordenadas por puntos");
		
		
	}
}
