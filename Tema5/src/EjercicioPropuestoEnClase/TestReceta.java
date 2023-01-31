package EjercicioPropuestoEnClase;

public class TestReceta {

	public static void main(String[] args) {

		Receta rece1 = new Receta("Boloñesa");

		rece1.addIngrediente(new Ingrediente("Cebolla", 200));
		rece1.addIngrediente(new Ingrediente("Tomate frito", 300));
		rece1.addIngrediente(new Ingrediente("Aceite", 20));
		rece1.addIngrediente(new Ingrediente("Spaghetti", 400));
		rece1.addIngrediente(new Ingrediente("Queso", 200));

		System.out.println(rece1.toString());

	}

}
