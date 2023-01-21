package EjerciciosPOO;

public class SatéliteAPP {

	public static void main(String[] args) {

		Satelite CD3 = new Satelite();
		
		System.out.println(CD3);
		
		System.out.println("");
		
		System.out.println("Está el satélite en órbira?");
		System.out.println(CD3.enOrbita());
		
		CD3.variaAltura(-1);
		CD3.variaPosicion(160, 200);
		
		System.out.println(CD3);
		
		CD3.printPosicion();
		
	}

}
