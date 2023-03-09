package P1_6;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
	
	public static void main(String[] args) {
		TrianguloRectangulo tr1 = new TrianguloRectangulo(2,2,2);
		
		TrianguloIsosceles ti1 = new TrianguloIsosceles(4, 4, 3);
		
		TrianguloEscaleno tesc1 = new TrianguloEscaleno(10,12,7);
		
		ArrayList<Triangulo> triangulos = new ArrayList<>();
		
		triangulos.add(tr1);
		triangulos.add(ti1);
		triangulos.add(tesc1);
		
		
		
		
	}

	
	
}
