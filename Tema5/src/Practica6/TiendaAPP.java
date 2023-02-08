package Practica6;

import Practica5.Producto;

public class TiendaAPP {

	public static void main(String[] args) {

		
		Tienda miTienda = new Tienda();
		miTienda.adquirirProducto(new Producto(1, "Teclado logitech", 45, 5, 20, 0.25));
		//Como el producto ya está no se añade por el control del metodo adquirirProducto
		miTienda.adquirirProducto(new Producto(1, "Teclado logitech", 45, 5, 20, 0.25));
	
		System.out.println(miTienda);
		
		miTienda.venderProducto(1, 3);
		miTienda.venderProducto(2, 5);
		System.out.println(miTienda);
		
	}

}
