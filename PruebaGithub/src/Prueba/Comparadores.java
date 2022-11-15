package Prueba;

public class Comparadores {

	public static void main(String[] args) {
		
		int a=2, b=4;
		
		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println(a <= b);
		
		if (a != b) {
			System.out.println("No son iguales a y b");
			
			
		} else {
			System.out.println("Sí son iguales a y b");
		}

		int x=2, y=5;
		boolean res;
		
		res = ( x>y && x>y ); //false
		res = ( x<y && x<=y ); //true
		res = !( x>y || x!=y ); //false
		
	}

}
