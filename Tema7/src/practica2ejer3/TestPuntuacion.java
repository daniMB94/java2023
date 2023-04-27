package practica2ejer3;

import java.util.ArrayList;
import java.util.Arrays;

public class TestPuntuacion {
	
	public static void main(String[] args) {
		Juego j1 = new Juego("Valorant", "Steam");
		Juego j2 = new Juego("Fortnite", "PSnow");
		Juego j3 = new Juego("CallOfDuty", "GamePass");
		
		Usuario dani = new Usuario("dani", "dani_dani@hotmail.com", "dmarber");
		Usuario elena = new Usuario("elena", "elena_elena@hotmail.com", "elly");
		
		dani.addPuntuacion(j1, true, 200);
		dani.addPuntuacion(j1, false, 100);
		dani.addPuntuacion(j1, true, 300);
		dani.addPuntuacion(j1, true, 250);
		dani.addPuntuacion(j1, false, 100);
		dani.addPuntuacion(j2, true, 500);
		dani.addPuntuacion(j2, true, 400);
		dani.addPuntuacion(j3, false, 10);
		
		elena.addPuntuacion(j3, true, 200);
		elena.addPuntuacion(j3, false, 120);
		elena.addPuntuacion(j1, true, 350);
		elena.addPuntuacion(j2, true, 30);
		elena.addPuntuacion(j1, false, 1020);
		elena.addPuntuacion(j3, true, 50);
		elena.addPuntuacion(j1, true, 423);
		elena.addPuntuacion(j2, false, 50);
		
		Stim st = new Stim();
		
		st.addJuego(j1);
		st.addJuego(j2);
		st.addJuego(j3);
		
		st.addJugador(elena);
		st.addJugador(dani);
		
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
		
	}
}
