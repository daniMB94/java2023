package EjercicioParaPracticar2;

public class TestEnemigo {

	public static void main(String[] args) {
/*
		Enemigo ene2;
		Enemigo ene1;
		ene1 = new Enemigo();
		ene2 = new Enemigo("Gannondorf", "Oscuro", 100, 3, 5);
		
		ene1.setNombre("Bowser");
		
		
		
		
		ene1.subirNivelSalud();
		ene2.subirNivelSalud();
		*/
		
		Enemigo ene1 = new Enemigo("Bowser", "Mago", 100);
		Enemigo ene2 = new Enemigo("E2", "Tortuga", 120);
		
		for (int i = 0; i < 6; i++) {
			ene1.subirNivelSalud();
		}
		
		for (int i = 0; i < 2; i++) {
			ene2.subirNivelSalud();
		}
		
		ene1.recibirDamage(400);
		ene2.recibirDamage(150);
		
		System.out.println(ene1);
		System.out.println(ene2);
		
		
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TestEnemigo [toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
	

}
