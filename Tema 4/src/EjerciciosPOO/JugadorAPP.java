package EjerciciosPOO;

import java.util.Scanner;

public class JugadorAPP {
	


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int subirNivel;
		int golpear;

		Jugador j1 = new Jugador ("Legolas", "caballero", 25);
		Enemigo E1 = new Enemigo ("Frodo", "bárbaro", 55);
		
		System.out.println("Estado inicial: ");
		System.out.println(j1);
		System.out.println(E1);
		
		
		
		do {
			System.out.println("Quieres que " + j1.getNombre() + " suba de nivel? (1 es que sí y 0 es que no)");

			subirNivel = Integer.parseInt(sc.nextLine());
			
			if(subirNivel == 1)
				j1.subirNivel();
			
			System.out.println("Quieres que " + E1.getNombre() + " suba de nivel? (1 es que sí y 0 es que no)");

			subirNivel = Integer.parseInt(sc.nextLine());
			
			if(subirNivel == 1)
				E1.subirNivel();
			
			System.out.println("Quieres que " + j1.getNombre() + " ataque a " + E1.getNombre() + " (1 es que sí y 0 es que no)");
			
			golpear = Integer.parseInt(sc.nextLine());
			
			if(golpear == 1)
				j1.golpear(E1);
			
			System.out.println("Quieres que " + E1.getNombre() + " ataque a " + j1.getNombre() + " (1 es que sí y 0 es que no)");
			
			golpear = Integer.parseInt(sc.nextLine());
			
			if(golpear == 1)
				E1.golpear(j1);
			
			System.out.println(j1);
			System.out.println(E1);
			
			
		} while (j1.getSalud() > 0 && E1.getSalud() > 0);
		
		sc.close();
		System.out.println("FIN DEL JUEGO");
	}

}
