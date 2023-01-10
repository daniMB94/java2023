package Ejemplo2;

public class Aplicacion {

	public static void main(String[] args) {

		Bicicleta bici1 = new Bicicleta();
		
		System.out.println(bici1.marca);
		System.out.println(bici1.precio);
		System.out.println(bici1.material);
		System.out.println(bici1.precioConDescuento());
		
		//Cuando se pasan los valores hay que hacerlo siempre en el mismo orden que tengan en el constructor
		Bicicleta bici2 = new Bicicleta(true, "Orbea", "Shimano", "Shimano Deore", "Fox", "Fibra de carbono", 4500);
		
		System.out.println(bici2.marca);
		System.out.println(bici2.precio);
		System.out.println(bici2.material);
		
		//El estado del objeto bici2 ha cambiado porque le he cambiado el valor precio
		bici2.precio = 3000;
		
		System.out.println(bici2.precioConDescuento());
		
	}

}
