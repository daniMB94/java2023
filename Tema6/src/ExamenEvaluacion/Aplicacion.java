package ExamenEvaluacion;

import java.time.LocalDate;
import java.util.Scanner;

import ExamenEvaluacion.Ropa.Color;
import ExamenEvaluacion.Ropa.Talla;
import ExamenEvaluacion.Ropa.Tipo;
import ExamenEvaluacion.Zapatillas.Categoria;
import ExamenEvaluacion.Zapatillas.Numero;

public class Aplicacion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Tienda t1 = new Tienda();
		
		//(int codigo, String nombre, String descripcion, double precio, int unidadesStock, Talla talla,
		//Color color, Tipo tipo)
		Ropa r1 = new Ropa(1, "ropa1", "descripcion1", 80, 8, Talla.M, Color.BLANCO, Tipo.SUDADERA);
		Ropa r2 = new Ropa(2, "ropa2", "descripcion2", 80, 200, Talla.S, Color.GRIS, Tipo.PANTALON);
		Ropa r3 = new Ropa(3, "ropa3", "descripcion3", 80, 15, Talla.L, Color.ROJO, Tipo.CAMISETA);
		Ropa r4 = new Ropa(4, "ropa4", "descripcion4", 80, 1, Talla.M, Color.BLANCO, Tipo.PANTALON);
		Ropa r5 = new Ropa(5, "ropa5", "descripcion5", 80, 8, Talla.XXL, Color.AMARILLO, Tipo.SUDADERA);
		
		
		//(int codigo, String nombre, String descripcion, double precio, int unidadesStock, Numero numero,
		//Categoria categoria)
		Zapatillas z1 = new Zapatillas(6,"zapas1", "descripcionZ1", 190, 50, Numero.n37, Categoria.BALONCESTO);
		Zapatillas z2 = new Zapatillas(7,"zapas2", "descripcionZ2", 90, 50, Numero.n40, Categoria.GOLF);
		Zapatillas z3 = new Zapatillas(8,"zapas3", "descripcionZ3", 120, 50, Numero.n44, Categoria.TRAIL);
		Zapatillas z4 = new Zapatillas(9,"zapas4", "descripcionZ4", 130, 50, Numero.n50, Categoria.GOLF);
		Zapatillas z5 = new Zapatillas(10,"zapas5", "descripcionZ5", 150, 50, Numero.n39, Categoria.WALKING);
		Zapatillas z6 = new Zapatillas(11,"zapas6", "descripcionZ6", 88, 50, Numero.n50, Categoria.BALONCESTO);
		
		t1.addProducto(r1);
		t1.addProducto(r2);
		t1.addProducto(r3);
		t1.addProducto(r4);
		t1.addProducto(r5);
		t1.addProducto(z1);
		t1.addProducto(z2);
		t1.addProducto(z3);
		t1.addProducto(z4);
		t1.addProducto(z5);
		t1.addProducto(z6);

		
		
		//(int orden, Producto productoCarrito, int cantidad)
		
		LineaCompra lc1_1 = new LineaCompra(1, z1, 2);
		LineaCompra lc1_2 = new LineaCompra(2, r1, 1);
		LineaCompra lc1_3 = new LineaCompra(3, r2, 2);
		
		LineaCompra lc2_1 = new LineaCompra(1, r4, 2);
		LineaCompra lc2_2 = new LineaCompra(2, r1, 1);
		LineaCompra lc2_3 = new LineaCompra(3, r2, 2);
		
		//(LocalDate fechaCompra)
		LocalDate fechaC1 = LocalDate.now();
		Compra c1 = new Compra(fechaC1);

		
		//Introducimos las 3 líneas creadas a la compra para que ver la salida al seleccionar la opcion 5 del menú
		c1.addLinea(lc1_1);
		c1.addLinea(lc1_2);
		c1.addLinea(lc1_3);
		

		
		
		int selector = 0;
		
		do {
			
			
			System.out.println("1. Mostrar Inventario");
			System.out.println("2. Buscar Producto");
			System.out.println("3. Mostrar Compras");
			System.out.println("4. Mostrar Compras por mes");
			System.out.println("5. Hacer Compra");
			System.out.println("6. Salir");
			
			selector = Integer.parseInt(sc.nextLine());
			
			switch (selector) {
			case 1:
				System.out.println(t1.mostrarInventario());
				break;
			case 2:
				
				break;
			case 3:
				System.out.println(t1.mostrarCompras());
				break;
			case 4:
				t1.addCompra(c1);
				break;
			case 5:
				System.out.println(t1.addCompra(c1));
				break;
			}

		} while (selector != 6);
	}

}
