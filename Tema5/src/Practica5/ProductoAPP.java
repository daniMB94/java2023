package Practica5;

public class ProductoAPP {

	public static void main(String[] args) {

		Producto pr1 = new Producto(1, "Teclado logitech", 45, 5, 20, 0.25);
		Producto pr2 = new Producto(2, "Raton logitech", 15, 2, 15, 0.2);

		System.out.println(pr1);
		System.out.println(pr2);

		pr1.vender(5);
		System.out.println(pr1);

		System.out.println(pr1.reponer());
		System.out.println(pr1);

	}

}
