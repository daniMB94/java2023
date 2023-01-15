package EjerciciosPOO;

public class CocheAPP {

	public static void main(String[] args) {

		int mas = 15;
		int menos = 10;
		
		Coche coche1 = new Coche();
		System.out.println(coche1);
		
		System.out.println("");
		
		System.out.println("Coche acelerando");
		coche1.acelera(mas);
		System.out.println(coche1);
		
		System.out.println("");
		
		System.out.println("Coche frenando");
		coche1.frena(menos);
		System.out.println(coche1);
		
		
	}

}
