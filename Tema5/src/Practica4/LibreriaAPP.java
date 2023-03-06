package Practica4;

public class LibreriaAPP {

	public static void main(String[] args) {

		Libreria tienda = new Libreria();
		
		tienda.comprarLibro(new Libro("titulo", "juan", 379));
		tienda.comprarLibro(new Libro("titulo2", "pedro", 382));
		tienda.comprarLibro(new Libro("titulo3", "Julia", 290));
		tienda.comprarLibro(new Libro("titulo4", "jesus", 180));
		tienda.comprarLibro(new Libro("titulo5", "luisa", 390));
		tienda.comprarLibro(new Libro("titulo6", "Toñi", 293));
		tienda.comprarLibro(new Libro("titulo7", "antonio", 592));
		tienda.comprarLibro(new Libro("titulo8", "dani", 420));
		tienda.comprarLibro(new Libro("titulo9", "elena", 363));
		tienda.comprarLibro(new Libro("titulo10", "aitana", 110));
		
		//EJEMPLO DE VENDER 6 LIBROS
		for(int i = 0; i < tienda.tamañoArrayList()-4; i++) {
			tienda.venderLibro(tienda.getLibros(i));
		}
		
		//EJEMPLO DE IMPRIMIR LA INFORMACIÓN DEL TITULO2
		System.out.println(tienda.getLibros(1));
		
		
		//EJEMPLO DE GANANCIAS
		System.out.println("La ganancia de la librería ha sido de: " + tienda.ganancias());
	}

}
