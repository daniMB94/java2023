package EjerciciosPOO;

public class Sat�liteAPP {

	public static void main(String[] args) {

		Satelite CD3 = new Satelite();
		
		System.out.println(CD3);
		
		System.out.println("");
		
		System.out.println("Est� el sat�lite en �rbira?");
		System.out.println(CD3.enOrbita());
		
		CD3.variaAltura(-1);
		CD3.variaPosicion(160, 200);
		
		System.out.println(CD3);
		
		CD3.printPosicion();
		
	}

}
