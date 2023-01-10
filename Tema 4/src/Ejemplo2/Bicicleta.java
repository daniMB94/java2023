package Ejemplo2;

public class Bicicleta {

	/*
	 * PROPIEDADES: eléctrica (booleano), frenos, cambio, horquilla, material, precio, marca.
	 */
	
	public boolean esElectrica;
	public String marca;
	public String frenos;
	public String cambios;
	public String horquilla;
	public String material;
	public double precio;
	
	/*
	 * CONSTRUCTOR: para crear objetos de tipo bicicleta
	 * NORMALMENTE VAMOS A TENER 2 CONSTRUCTURES (1 CON LAS PROPIEDADES Y OTRO POR DEFECTO)
	 */
	
	//LOS CONSTRUCTORES SE PUEDE ESCRIBIR USANDO "Source" -> "Generate constructor using fiels"
	
	
	//SE LE SUELE CONOCER COMO CONSTRUCTOR CON PROPIEDADES --> para crear objetos de tipo Bicicleta
	public Bicicleta(boolean esElectrica, String marca, String frenos, String cambios, String horquilla,
			String material, double precio) {
		super();
		//TODOS LOS OBJETOS HEREDAN DE OBJECT (EL OBJETO MÁS PRIMARIO DE JAVA) Y SU CLASE SE LLAMA 'SUPER'
		this.esElectrica = esElectrica;
		this.marca = marca;
		this.frenos = frenos;
		this.cambios = cambios;
		this.horquilla = horquilla;
		this.material = material;
		this.precio = precio;
	}

	
	//SE LE SUELE CONOCER COMO CONSTRUCTOR POR DEFECTO --> inicializamos nosotros los valores de las propiedades que va a tener el objeto
	public Bicicleta() {
		super();
		
		this.esElectrica = false;
		this.marca = "No tiene marca";
		this.precio = 1000;
		this.frenos = "";
		this.cambios = "";
		this.horquilla = "";
		this.material = "Aluminio";
	}
	
	
	/*
	 * METODOS -> es el comportamiento
	 */
	
	/*
	 * si la bici es eléctrica se le aplica un 15% de descuento y sino un 5%
	 */
	
	
	//Se crea una var "precioConDescuento" para no cambiar el precio original de la bici
	public double precioConDescuento()	{
		double precioDescuento = 0;
		
		if (this.esElectrica == true) {
			precioDescuento = this.precio * 0.85;
		} else {
			precioDescuento = this.precio * 0.95;
		}
		return precioDescuento;
	}
	
	
	
	
}
