package Prueba;

public class IVA {

	public static void main(String[] args) {

	double precio = 295;
	double iva = 1.25;
	double total;
	int cantidad;
	
	cantidad = 6;
	
	total = precio * iva * cantidad;
	
	if	(cantidad > 5) {
		System.out.println(precio * cantidad);
	} else {
		
		System.out.println("total = " + total);
	}
		
	}

}
